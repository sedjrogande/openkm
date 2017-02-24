package com.openkm.ccm.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;

import com.openkm.api.OKMFolder;
import com.openkm.api.OKMRepository;
import com.openkm.automation.AutomationException;
import com.openkm.bean.Document;
import com.openkm.bean.Folder;
import com.openkm.bean.Repository;
import com.openkm.core.AccessDeniedException;
import com.openkm.core.Config;
import com.openkm.core.DatabaseException;
import com.openkm.core.FileSizeExceededException;
import com.openkm.core.ItemExistsException;
import com.openkm.core.PathNotFoundException;
import com.openkm.core.RepositoryException;
import com.openkm.core.UnsupportedMimeTypeException;
import com.openkm.core.UserQuotaExceededException;
import com.openkm.core.VirusDetectedException;
import com.openkm.dao.AuthDAO;
import com.openkm.dao.NodeFolderDAO;
import com.openkm.dao.bean.Role;
import com.openkm.dao.bean.User;
import com.openkm.extension.core.ExtensionException;
import com.openkm.frontend.client.Main;
import com.openkm.module.db.DbDocumentModule;
import com.openkm.module.db.DbFolderModule;
import com.openkm.module.db.stuff.DbSessionManager;



public class LoadFiles {

	private static Logger log = LoggerFactory.getLogger(LoadFiles.class);
	/**
	 * @param args
	 */
	private static File directory = null;
	private static File backupDirectory = null;
	private static File logDirectory = null;
	private static String filePath;
	private static String token = DbSessionManager.getInstance()
			.getSystemToken();
	private static String backup_path = Config.BACKUP_DIR;
	private static String migration_path = Config.INJECTION_DIR;
	private static String log_path = Config.LOGS_DIR;
	private static File logFile = null;
	private static boolean isLogContent = false;
	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"dd-MM-yyyy_hhmmss");
    private static String tampon = "";
    
    
	public static synchronized void run() throws IOException,
			RepositoryException, DatabaseException, PathNotFoundException,
			 AccessDeniedException, ExtensionException,
			AutomationException, UnsupportedMimeTypeException,
			FileSizeExceededException, UserQuotaExceededException,
			VirusDetectedException {
		System.out.println("Migration en cours !!!!");
	
		System.out.println("Répertoire de logs : " + Config.LOGS_DIR );
	
		
		// check if migration, backup and log directories exist otherwise
		// these directories will be created
		directory = new File(migration_path);
		if (!directory.exists()) {
			directory.mkdir();
		}

		backupDirectory = new File(backup_path);
		if (!backupDirectory.exists()) {
			backupDirectory.mkdir();
		}

		logDirectory = new File(log_path);
		if (!logDirectory.exists()) {
			logDirectory.mkdir();
		}

		NodeFolderDAO fdao = NodeFolderDAO.getInstance();

		// Parcours du contenu du répertoire de migration

		File[] listDirectories = directory.listFiles();
		for (int i = 0; i < listDirectories.length; i++) {

			// Pour la traçabilité, le répertoire de migration doit contenir les
			// répertoires des responsables des postes de numérisation
			// Ainsi, chaque poste de numérisation va générer les documents
			// scannés dans un répertoire portant le nom du responsable du poste
			// Aucun poste de numérisation ne peut générer des fichiers dans un
			// répertoire ne lui appartenant pas

			filePath = "/" + Repository.ROOT;
			System.out.println("Inside the loop of files");
			System.out.println("File path Name :" + filePath);
			File directory = listDirectories[i];


			if (directory.isDirectory()) {

				isLogContent = false;
				// Vérifies si un répertoire de log existe pour chaque poste de
				// numérisation
				// Dans le cas où il n'existe pas il le crée

				logDirectory = new File(log_path + File.separator
						+ directory.getName());
				if (!logDirectory.exists()) {
					logDirectory.mkdir();
				}

				// Création du fichier de log pour le poste de numérisation dont
				// l'injection des fichiers est en cours d'exécution
				// Récupération des informations sur l'utilisateur du poste de
				// numérisation

				String log_file_path = log_path
						+ File.separator
						+ directory.getName()
						+ File.separator
						+ "migration_"
						+ directory.getName()
						+ "_"
						+ dateFormat.format(Calendar.getInstance().getTime())
						+ ".txt";

				
				PrintWriter writer = new PrintWriter(log_file_path, "UTF-8");

				User currentUser = AuthDAO.findUserByPk(directory.getName());

				if (currentUser == null) {
					isLogContent = true;
					writer.println("L'utilisateur "+ directory.getName() + " n'existe pas sur OpenKM.");
					writer.close();
					continue;
				}

				System.out.println("Utilisateur du poste de numérisation : "
						+ currentUser.getName());

				// Parcours des fichiers de chaque post de numérisation

				File[] listFiles = directory.listFiles();
				for (int k = 0; k < listFiles.length; k++) {
					File file = listFiles[k];
					filePath = "/" + Repository.ROOT;
					String docName = file.getName().substring(0,
							file.getName().indexOf("_"));
					String[] structures = docName.split("-");

					for (int j = 0; j < structures.length; j++) {
						String structure = structures[j].toUpperCase();
						
						// createFolderIfNotExists(token, filePath);
						try {
							filePath += "/"
									+ fdao.findByCcmCode(structure).getName();
							System.out.println("Dans la boucle des structures");
							System.out.println("Nom de la Structure :"
									+ structure);
							System.out.println("fichier path :" + filePath);


						} catch (PathNotFoundException e) {
							isLogContent = true;
							writer.println("Fichier : " + file.getName() + " --- Le code du dossier " + structure +" n'existe pas.");
							
							/*File tmp = file;
							System.out
									.println("fichier de destination du Log : "
											+ log_path + File.separator
											+ directory.getName() + File.separator
											+ file.getName());
							tmp.renameTo(new File(log_path + File.separator
									+ directory.getName() + File.separator
									+ file.getName()));*/

							System.out
									.println("Insertion du fichier non migré dans le dossier de log");
							tampon = filePath + "/" + structure;
							filePath = "";
						}

						if (!OKMRepository.getInstance().hasNode(token,
								filePath)) {
							isLogContent = true;
							writer.println("Fichier : " + file.getName() + " --- Le chemin " + tampon +" n'existe pas.");
							System.out
									.println("Dans le cas ou le path du fichier n'existe pas ");
							System.out.println("Nom de la Structure :"
									+ structure);
							System.out.println("Fichier path :" + filePath);
							break;
						}
					}

					System.out.println("Hors de la boucle des structures");
					System.out.println("Fichier path  :" + filePath);
					// Retrieve year
					// Compilation of the regex
					Pattern pattern = Pattern.compile("[0-9]{4}");

					// Creation of search
					Matcher matcher = pattern.matcher(file.getName());

					if (matcher.find() && filePath != "") {
						filePath += "/" + matcher.group(0);
						System.out
								.println("Dans le cas ou le pattern est trouvé");
						System.out.println("Fichier path  :" + filePath);
						System.out.println("token  :" + token);

						// Check if the path of the folder exists otherwise it
						// will be created

						createFolderIfNotExists(token, filePath);

						// Creation of a document

						Document doc = new Document();
						doc.setPath(filePath
								+ "/"
								+ file.getName().substring(
										file.getName().indexOf("_") + 1));

						doc.setAuthor(currentUser.getId());
						doc.setMimeType("application/pdf");
						doc.setUuid(UUID.randomUUID().toString());
						doc.setCreated(Calendar.getInstance());
						System.out.println(doc.toString());
						FileInputStream fis = new FileInputStream(file);
						
						try {
							doc = DbDocumentModule.createByMigration(token, doc,
									fis, file.length());
						} catch (ItemExistsException e) {
							isLogContent = true;
							writer.println("Fichier : " + file.getName() + " --- Le fichier " + file.getName() +" existe déjà dans OpenKM. Renommez le s'il s'agit d'un nouveau fichier.");
							file.delete();
							continue;
						}
						System.out.println(doc.toString());

						backupDirectory = new File(backup_path + File.separator
								+ directory.getName());
						if (!backupDirectory.exists()) {
							backupDirectory.mkdir();
						}

						// Saving the original file and rename it as migrate
						// then deleting of the file uploaded

						File tmp = file;
						tmp.renameTo(new File(backup_path + File.separator
								+ directory.getName() + File.separator + file.getName()));

						System.out
								.println("Insertion du fichier migré dans le dossier backup");

					} else if(!matcher.find()){
						isLogContent = true;
						writer.println("Fichier : " + file.getName() + " --- Le fichier ne précise pas l'année à laquelle appartient le document scanné.");
					}
					
					
					file.delete();
				}
				
				writer.close();
				// Suppression du fichier de log s'il n'y a pas d'erreurs 
				if(!isLogContent){
					logFile = new File(log_file_path);
					logFile.delete();
				}
					
			}
		}
		System.out.println("Migration terminée !!!!");

	}

	public static void createFolderIfNotExists(String token, String filePath) {
		try {
			if (!OKMRepository.getInstance().hasNode(token, filePath)) {
				Folder folder = new Folder();
				folder.setPath(filePath);
				
				OKMFolder.getInstance().createByMigration(token, folder);
			}
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PathNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ItemExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AccessDeniedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExtensionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AutomationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Set<String> getRoleName(Set<Role> roles) {
		Set<String> results = new HashSet<String>();
		for (Role role : roles) {
			results.add(role.getId());
		}
		return results;
	}

}

