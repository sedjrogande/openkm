/**
 * OpenKM, Open Document Management System (http://www.openkm.com)
 * Copyright (c) 2006-2015 Paco Avila & Josep Llort
 * 
 * No bytes were intentionally harmed during the development of this application.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openkm.module.db.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.openkm.automation.AutomationException;
import com.openkm.bean.ContentInfo;
import com.openkm.bean.ExtendedAttributes;
import com.openkm.bean.Folder;
import com.openkm.bean.Note;
import com.openkm.bean.Permission;
import com.openkm.bean.workflow.ProcessDefinition;
import com.openkm.bean.workflow.ProcessInstance;
import com.openkm.core.AccessDeniedException;
import com.openkm.core.Config;
import com.openkm.core.DatabaseException;
import com.openkm.core.ItemExistsException;
import com.openkm.core.PathNotFoundException;
import com.openkm.core.RepositoryException;
import com.openkm.core.UserQuotaExceededException;
import com.openkm.core.WorkflowException;
import com.openkm.dao.NodeBaseDAO;
import com.openkm.dao.NodeDocumentDAO;
import com.openkm.dao.NodeDocumentVersionDAO;
import com.openkm.dao.NodeFolderDAO;
import com.openkm.dao.NodeMailDAO;
import com.openkm.dao.NodeNoteDAO;
import com.openkm.dao.bean.NodeDocument;
import com.openkm.dao.bean.NodeDocumentVersion;
import com.openkm.dao.bean.NodeFolder;
import com.openkm.dao.bean.NodeMail;
import com.openkm.dao.bean.NodeNote;
import com.openkm.dao.bean.NodeProperty;
import com.openkm.module.common.CommonWorkflowModule;
import com.openkm.module.db.stuff.DbAccessManager;
import com.openkm.module.db.stuff.SecurityHelper;
import com.openkm.util.CloneUtils;

public class BaseFolderModule {
	private static Logger log = LoggerFactory.getLogger(BaseFolderModule.class);
	
	/**
	 * Create a new folder
	 */
	public static NodeFolder create(String user, NodeFolder parentFolder, String name, Calendar created, Set<String> keywords,
			Set<String> categories, Set<NodeProperty> propertyGroups, List<NodeNote> notes) throws PathNotFoundException,
			AccessDeniedException, ItemExistsException, DatabaseException {
		
		// Create and add a new folder node
		NodeFolder folderNode = new NodeFolder();
		folderNode.setUuid(UUID.randomUUID().toString());
		folderNode.setContext(parentFolder.getContext());
		folderNode.setParent(parentFolder.getUuid());
		folderNode.setAuthor(user);
		
		// Modified by Herve AHOUANTCHEDE 15/02/2017
		// Check if the folder name entered contains the characters () then 
		// Split the folder name in order to retrieve the keywork
		if (name.contains("(") && name.contains(")")){
			String key = name.substring(name.indexOf("(") + 1, name.indexOf(")"));
			name = name.substring(0, name.indexOf("("));
			folderNode.setCcmCode(key);
		}
		
		folderNode.setName(name);
		folderNode.setCreated(created != null ? created : Calendar.getInstance());
		
		if (Config.STORE_NODE_PATH) {
			folderNode.setPath(parentFolder.getPath() + "/" + name);
		}
		
		// Extended Copy Attributes
		folderNode.setKeywords(CloneUtils.clone(keywords));
		folderNode.setCategories(CloneUtils.clone(categories));
		
		for (NodeProperty nProp : CloneUtils.clone(propertyGroups)) {
			nProp.setNode(folderNode);
			folderNode.getProperties().add(nProp);
		}
		
		// Get parent node auth info
		Map<String, Integer> userPerms = parentFolder.getUserPermissions();
		Map<String, Integer> rolePerms = parentFolder.getRolePermissions();
		
		// Always assign all grants to creator
		if (Config.USER_ASSIGN_DOCUMENT_CREATION) {
			int allGrants = Permission.ALL_GRANTS;
			userPerms.put(user, allGrants);
		}
		
		// Set auth info
		// NOTICE: Pay attention to the need of cloning
		folderNode.setUserPermissions(CloneUtils.clone(userPerms));
		folderNode.setRolePermissions(CloneUtils.clone(rolePerms));
		
		NodeFolderDAO.getInstance().create(folderNode);
		
		// Extended Copy Attributes
		for (NodeNote nNote : CloneUtils.clone(notes)) {
			BaseNoteModule.create(folderNode.getUuid(), nNote.getAuthor(), nNote.getText());
		}
		
		return folderNode;
	}
	
	/**
	 * Get folder properties
	 */
	public static Folder getProperties(String user, NodeFolder nFolder) throws PathNotFoundException, DatabaseException {
		log.debug("getProperties({}, {})", user, nFolder);
		long begin = System.currentTimeMillis();
		Folder fld = new Folder();
		
		// Properties
		String fldPath = NodeBaseDAO.getInstance().getPathFromUuid(nFolder.getUuid());
		fld.setPath(fldPath);
		fld.setCreated(nFolder.getCreated());
		fld.setAuthor(nFolder.getAuthor());
		fld.setUuid(nFolder.getUuid());
		fld.setHasChildren(NodeFolderDAO.getInstance().hasChildren(nFolder.getUuid()));
		// Added 17/02/2017
		fld.setCode(nFolder.getCcmCode());
		
		// Get permissions
		BaseModule.setPermissions(nFolder, fld);
		
		// Get user subscription & keywords
		fld.setSubscriptors(nFolder.getSubscriptors());
		fld.setSubscribed(nFolder.getSubscriptors().contains(user));
		fld.setKeywords(nFolder.getKeywords());
		
		// Get categories
		Set<Folder> categories = new HashSet<Folder>();
		NodeFolderDAO nFldDao = NodeFolderDAO.getInstance();
		Set<NodeFolder> resolvedCategories = nFldDao.resolveCategories(nFolder.getCategories());
		
		for (NodeFolder nfldCat : resolvedCategories) {
			categories.add(BaseFolderModule.getProperties(user, nfldCat));
		}
		
		fld.setCategories(categories);
		
		if (!Config.ROOT_NODE_UUID.equals(nFolder.getUuid())) {
			// Get notes
			List<Note> notes = new ArrayList<Note>();
			List<NodeNote> nNoteList = NodeNoteDAO.getInstance().findByParent(nFolder.getUuid());
			
			for (NodeNote nNote : nNoteList) {
				notes.add(BaseNoteModule.getProperties(nNote, nNote.getUuid()));
			}
			
			fld.setNotes(notes);
		}
		
		log.trace("getProperties.Time: {}", System.currentTimeMillis() - begin);
		log.debug("getProperties: {}", fld);
		return fld;
	}
	
	/**
	 * Duplicates a folder into another one
	 */
	public static NodeFolder copy(String user, NodeFolder srcFldNode, NodeFolder dstFldNode, ExtendedAttributes extAttr)
			throws ItemExistsException, UserQuotaExceededException, PathNotFoundException, AccessDeniedException, AutomationException,
			DatabaseException, IOException {
		log.debug("copy({}, {}, {}, {})", new Object[] { user, srcFldNode, dstFldNode, extAttr });
		InputStream is = null;
		NodeFolder newFolder = null;
		
		try {
			String name = srcFldNode.getName();
			Set<String> keywords = new HashSet<String>();
			Set<String> categories = new HashSet<String>();
			Set<NodeProperty> propertyGroups = new HashSet<NodeProperty>();
			List<NodeNote> notes = new ArrayList<NodeNote>();
			
			if (extAttr != null) {
				if (extAttr.isKeywords()) {
					keywords = srcFldNode.getKeywords();
				}
				
				if (extAttr.isCategories()) {
					categories = srcFldNode.getCategories();
				}
				
				if (extAttr.isPropertyGroups()) {
					propertyGroups = srcFldNode.getProperties();
				}
				
				if (extAttr.isNotes()) {
					notes = NodeNoteDAO.getInstance().findByParent(srcFldNode.getUuid());
				}
			}
			
			newFolder = BaseFolderModule.create(user, dstFldNode, name, Calendar.getInstance(), keywords, categories, propertyGroups, notes);
			String newPath = NodeBaseDAO.getInstance().getPathFromUuid(newFolder.getUuid());
			
			for (NodeFolder nFolder : NodeFolderDAO.getInstance().findByParent(srcFldNode.getUuid())) {
				copy(user, nFolder, newFolder, extAttr);
			}
			
			for (NodeDocument nDocument : NodeDocumentDAO.getInstance().findByParent(srcFldNode.getUuid())) {
				BaseDocumentModule.copy(user, nDocument, newPath, newFolder, nDocument.getName(), extAttr);
			}
			
			for (NodeMail nMail : NodeMailDAO.getInstance().findByParent(srcFldNode.getUuid())) {
				BaseMailModule.copy(user, nMail, newPath, newFolder, extAttr);
			}
		} finally {
			IOUtils.closeQuietly(is);
		}
		
		log.debug("copy: {}", newFolder);
		return newFolder;
	}
	
	/**
	 * Check recursively if the folder contains locked nodes
	 */
	public static boolean hasLockedNodes(String fldUuid) throws PathNotFoundException, DatabaseException, RepositoryException {
		boolean hasLock = false;
		
		for (NodeDocument nDoc : NodeDocumentDAO.getInstance().findByParent(fldUuid)) {
			hasLock |= nDoc.isLocked();
		}
		
		for (NodeFolder nFld : NodeFolderDAO.getInstance().findByParent(fldUuid)) {
			hasLock |= hasLockedNodes(nFld.getUuid());
		}
		
		return hasLock;
	}
	
	/**
	 * Check if a node has removable childs
	 * 
	 * TODO: Is this necessary? The access manager should prevent this and make the core thrown an exception.
	 */
	public static boolean hasWriteAccess(String fldUuid) throws PathNotFoundException, DatabaseException, RepositoryException {
		log.debug("hasWriteAccess({})", fldUuid);
		DbAccessManager am = SecurityHelper.getAccessManager();
		boolean canWrite = true;
		
		for (NodeDocument nDoc : NodeDocumentDAO.getInstance().findByParent(fldUuid)) {
			canWrite &= am.isGranted(nDoc, Permission.WRITE);
		}
		
		for (NodeMail nMail : NodeMailDAO.getInstance().findByParent(fldUuid)) {
			canWrite &= am.isGranted(nMail, Permission.WRITE);
		}
		
		for (NodeFolder nFld : NodeFolderDAO.getInstance().findByParent(fldUuid)) {
			canWrite &= am.isGranted(nFld, Permission.WRITE);
			canWrite &= hasWriteAccess(nFld.getUuid());
		}
		
		log.debug("hasWriteAccess: {}", canWrite);
		return canWrite;
	}
	
	/**
	 * Check if a node is being used in a running workflow
	 */
	public static boolean hasWorkflowNodes(String fldUuid) throws WorkflowException, PathNotFoundException, DatabaseException {
		Set<String> workflowNodes = new HashSet<String>();
		
		for (ProcessDefinition procDef : CommonWorkflowModule.findAllProcessDefinitions()) {
			for (ProcessInstance procIns : CommonWorkflowModule.findProcessInstances(procDef.getId())) {
				if (procIns.getEnd() == null) {
					String uuid = (String) procIns.getVariables().get(Config.WORKFLOW_PROCESS_INSTANCE_VARIABLE_UUID);
					workflowNodes.add(uuid);
				}
			}
		}
		
		return hasWorkflowNodesInDepth(fldUuid, workflowNodes);
	}
	
	/**
	 * Check if a node is being used in a running workflow (Helper)
	 */
	private static boolean hasWorkflowNodesInDepth(String fldUuid, Set<String> workflowNodes) throws WorkflowException,
			PathNotFoundException, DatabaseException {
		for (NodeDocument nDoc : NodeDocumentDAO.getInstance().findByParent(fldUuid)) {
			if (workflowNodes.contains(nDoc.getUuid())) {
				return true;
			}
		}
		
		for (NodeFolder nFld : NodeFolderDAO.getInstance().findByParent(fldUuid)) {
			return hasWorkflowNodesInDepth(nFld.getUuid(), workflowNodes);
		}
		
		return false;
	}
	
	/**
	 * Check if a folder is used as category in other nodes.
	 */
	public static boolean isCategoryInUse(String fldUuid) throws PathNotFoundException, DatabaseException, RepositoryException {
		boolean inUse = NodeBaseDAO.getInstance().isCategoryInUse(fldUuid);
		
		for (NodeFolder nFld : NodeFolderDAO.getInstance().findByParent(fldUuid)) {
			inUse |= isCategoryInUse(nFld.getUuid());
		}
		
		return inUse;
	}
	
	/**
	 * Get content info recursively
	 */
	public static ContentInfo getContentInfo(String folderUuid) throws PathNotFoundException, DatabaseException {
		log.debug("getContentInfo({})", folderUuid);
		ContentInfo contentInfo = new ContentInfo();
		
		for (NodeFolder nFld : NodeFolderDAO.getInstance().findByParent(folderUuid)) {
			ContentInfo ci = getContentInfo(nFld.getUuid());
			contentInfo.setFolders(contentInfo.getFolders() + ci.getFolders() + 1);
			contentInfo.setDocuments(contentInfo.getDocuments() + ci.getDocuments());
			contentInfo.setSize(contentInfo.getSize() + ci.getSize());
		}
		
		for (NodeDocument nDoc : NodeDocumentDAO.getInstance().findByParent(folderUuid)) {
			NodeDocumentVersion nDocVer = NodeDocumentVersionDAO.getInstance().findCurrentVersion(nDoc.getUuid());
			long size = nDocVer.getSize();
			contentInfo.setDocuments(contentInfo.getDocuments() + 1);
			contentInfo.setSize(contentInfo.getSize() + size);
		}
		
		for (NodeMail nMail : NodeMailDAO.getInstance().findByParent(folderUuid)) {
			long size = nMail.getSize();
			contentInfo.setDocuments(contentInfo.getDocuments() + 1);
			contentInfo.setSize(contentInfo.getSize() + size);
		}
		
		log.debug("getContentInfo: {}", contentInfo);
		return contentInfo;
	}
	
	/**
	 * Get content info by user recursively
	 */
	public static Map<String, ContentInfo> getUserContentInfo(String folderUuid) throws PathNotFoundException, DatabaseException {
		log.debug("getUserContentInfo({})", folderUuid);
		Map<String, ContentInfo> userContentInfo = new HashMap<String, ContentInfo>();
		
		for (NodeFolder nFld : NodeFolderDAO.getInstance().findByParent(folderUuid)) {
			Map<String, ContentInfo> usrContInfoRt = getUserContentInfo(nFld.getUuid());
			
			for (String user : usrContInfoRt.keySet()) {
				ContentInfo ciRt = usrContInfoRt.get(user);
				ContentInfo ci = getOrCreate(userContentInfo, user);
				ci.setDocuments(ci.getDocuments() + ciRt.getDocuments());
				ci.setSize(ci.getSize() + ciRt.getSize());
				userContentInfo.put(user, ci);
			}
			
			ContentInfo ci = getOrCreate(userContentInfo, nFld.getAuthor());
			ci.setFolders(ci.getFolders() + ci.getFolders() + 1);
			userContentInfo.put(nFld.getAuthor(), ci);
		}
		
		for (NodeDocument nDoc : NodeDocumentDAO.getInstance().findByParent(folderUuid)) {
			for (NodeDocumentVersion nDocVer : NodeDocumentVersionDAO.getInstance().findByParent(nDoc.getUuid())) {
				ContentInfo ci = getOrCreate(userContentInfo, nDocVer.getAuthor());
				ci.setSize(ci.getSize() + nDocVer.getSize());
				userContentInfo.put(nDocVer.getAuthor(), ci);
			}
			
			ContentInfo ci = getOrCreate(userContentInfo, nDoc.getAuthor());
			ci.setDocuments(ci.getDocuments() + 1);
			userContentInfo.put(nDoc.getAuthor(), ci);
		}
		
		for (NodeMail nMail : NodeMailDAO.getInstance().findByParent(folderUuid)) {
			ContentInfo ci = getOrCreate(userContentInfo, nMail.getAuthor());
			ci.setDocuments(ci.getDocuments() + 1);
			ci.setSize(ci.getSize() + nMail.getSize());
			userContentInfo.put(nMail.getAuthor(), ci);
		}
		
		log.debug("getUserContentInfo: {}", userContentInfo);
		return userContentInfo;
	}
	
	/**
	 * Helper method
	 */
	private static ContentInfo getOrCreate(Map<String, ContentInfo> userContentInfo, String user) {
		ContentInfo ci = userContentInfo.get(user);
		
		if (ci == null) {
			ci = new ContentInfo();
		}
		
		return ci;
	}
}
