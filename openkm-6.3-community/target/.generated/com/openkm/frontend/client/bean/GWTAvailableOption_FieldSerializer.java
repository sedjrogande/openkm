package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTAvailableOption_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAboutOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::aboutOption;
  }-*/;
  
  private static native void setAboutOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::aboutOption = value;
  }-*/;
  
  private static native boolean getAddBookmarkOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addBookmarkOption;
  }-*/;
  
  private static native void setAddBookmarkOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addBookmarkOption = value;
  }-*/;
  
  private static native boolean getAddCategoryOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addCategoryOption;
  }-*/;
  
  private static native void setAddCategoryOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addCategoryOption = value;
  }-*/;
  
  private static native boolean getAddDocumentOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addDocumentOption;
  }-*/;
  
  private static native void setAddDocumentOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addDocumentOption = value;
  }-*/;
  
  private static native boolean getAddKeywordOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addKeywordOption;
  }-*/;
  
  private static native void setAddKeywordOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addKeywordOption = value;
  }-*/;
  
  private static native boolean getAddNoteOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addNoteOption;
  }-*/;
  
  private static native void setAddNoteOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addNoteOption = value;
  }-*/;
  
  private static native boolean getAddPropertyGroupOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addPropertyGroupOption;
  }-*/;
  
  private static native void setAddPropertyGroupOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addPropertyGroupOption = value;
  }-*/;
  
  private static native boolean getAddSubscriptionOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addSubscriptionOption;
  }-*/;
  
  private static native void setAddSubscriptionOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::addSubscriptionOption = value;
  }-*/;
  
  private static native boolean getAdministrationOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::administrationOption;
  }-*/;
  
  private static native void setAdministrationOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::administrationOption = value;
  }-*/;
  
  private static native boolean getBugReportOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::bugReportOption;
  }-*/;
  
  private static native void setBugReportOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::bugReportOption = value;
  }-*/;
  
  private static native boolean getCancelCheckoutOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::cancelCheckoutOption;
  }-*/;
  
  private static native void setCancelCheckoutOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::cancelCheckoutOption = value;
  }-*/;
  
  private static native boolean getCheckinOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::checkinOption;
  }-*/;
  
  private static native void setCheckinOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::checkinOption = value;
  }-*/;
  
  private static native boolean getCheckoutOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::checkoutOption;
  }-*/;
  
  private static native void setCheckoutOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::checkoutOption = value;
  }-*/;
  
  private static native boolean getConvertOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::convertOption;
  }-*/;
  
  private static native void setConvertOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::convertOption = value;
  }-*/;
  
  private static native boolean getCopyOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::copyOption;
  }-*/;
  
  private static native void setCopyOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::copyOption = value;
  }-*/;
  
  private static native boolean getCreateFolderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::createFolderOption;
  }-*/;
  
  private static native void setCreateFolderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::createFolderOption = value;
  }-*/;
  
  private static native boolean getCreateFromTemplateOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::createFromTemplateOption;
  }-*/;
  
  private static native void setCreateFromTemplateOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::createFromTemplateOption = value;
  }-*/;
  
  private static native boolean getDebugOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::debugOption;
  }-*/;
  
  private static native void setDebugOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::debugOption = value;
  }-*/;
  
  private static native boolean getDeleteOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::deleteOption;
  }-*/;
  
  private static native void setDeleteOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::deleteOption = value;
  }-*/;
  
  private static native boolean getDocumentationOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::documentationOption;
  }-*/;
  
  private static native void setDocumentationOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::documentationOption = value;
  }-*/;
  
  private static native boolean getDownloadOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::downloadOption;
  }-*/;
  
  private static native void setDownloadOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::downloadOption = value;
  }-*/;
  
  private static native boolean getDownloadPdfOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::downloadPdfOption;
  }-*/;
  
  private static native void setDownloadPdfOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::downloadPdfOption = value;
  }-*/;
  
  private static native boolean getExportOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::exportOption;
  }-*/;
  
  private static native void setExportOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::exportOption = value;
  }-*/;
  
  private static native boolean getFindDocumentOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::findDocumentOption;
  }-*/;
  
  private static native void setFindDocumentOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::findDocumentOption = value;
  }-*/;
  
  private static native boolean getFindFolderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::findFolderOption;
  }-*/;
  
  private static native void setFindFolderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::findFolderOption = value;
  }-*/;
  
  private static native boolean getForwardMailOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::forwardMailOption;
  }-*/;
  
  private static native void setForwardMailOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::forwardMailOption = value;
  }-*/;
  
  private static native boolean getGotoFolderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::gotoFolderOption;
  }-*/;
  
  private static native void setGotoFolderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::gotoFolderOption = value;
  }-*/;
  
  private static native boolean getHelpOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::helpOption;
  }-*/;
  
  private static native void setHelpOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::helpOption = value;
  }-*/;
  
  private static native boolean getHomeOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::homeOption;
  }-*/;
  
  private static native void setHomeOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::homeOption = value;
  }-*/;
  
  private static native boolean getImageViewerOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::imageViewerOption;
  }-*/;
  
  private static native void setImageViewerOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::imageViewerOption = value;
  }-*/;
  
  private static native boolean getLanguagesOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::languagesOption;
  }-*/;
  
  private static native void setLanguagesOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::languagesOption = value;
  }-*/;
  
  private static native boolean getLockOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::lockOption;
  }-*/;
  
  private static native void setLockOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::lockOption = value;
  }-*/;
  
  private static native boolean getManageBookmarkOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::manageBookmarkOption;
  }-*/;
  
  private static native void setManageBookmarkOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::manageBookmarkOption = value;
  }-*/;
  
  private static native boolean getMediaPlayerOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::mediaPlayerOption;
  }-*/;
  
  private static native void setMediaPlayerOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::mediaPlayerOption = value;
  }-*/;
  
  private static native boolean getMergePdfOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::mergePdfOption;
  }-*/;
  
  private static native void setMergePdfOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::mergePdfOption = value;
  }-*/;
  
  private static native boolean getMoveOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::moveOption;
  }-*/;
  
  private static native void setMoveOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::moveOption = value;
  }-*/;
  
  private static native boolean getPreferencesOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::preferencesOption;
  }-*/;
  
  private static native void setPreferencesOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::preferencesOption = value;
  }-*/;
  
  private static native boolean getProjectWebOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::projectWebOption;
  }-*/;
  
  private static native void setProjectWebOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::projectWebOption = value;
  }-*/;
  
  private static native boolean getPublicForumOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::publicForumOption;
  }-*/;
  
  private static native void setPublicForumOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::publicForumOption = value;
  }-*/;
  
  private static native boolean getPurgeOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::purgeOption;
  }-*/;
  
  private static native void setPurgeOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::purgeOption = value;
  }-*/;
  
  private static native boolean getPurgeTrashOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::purgeTrashOption;
  }-*/;
  
  private static native void setPurgeTrashOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::purgeTrashOption = value;
  }-*/;
  
  private static native boolean getRefreshOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::refreshOption;
  }-*/;
  
  private static native void setRefreshOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::refreshOption = value;
  }-*/;
  
  private static native boolean getRemoveCategoryOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeCategoryOption;
  }-*/;
  
  private static native void setRemoveCategoryOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeCategoryOption = value;
  }-*/;
  
  private static native boolean getRemoveKeywordOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeKeywordOption;
  }-*/;
  
  private static native void setRemoveKeywordOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeKeywordOption = value;
  }-*/;
  
  private static native boolean getRemoveNoteOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeNoteOption;
  }-*/;
  
  private static native void setRemoveNoteOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeNoteOption = value;
  }-*/;
  
  private static native boolean getRemovePropertyGroupOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removePropertyGroupOption;
  }-*/;
  
  private static native void setRemovePropertyGroupOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removePropertyGroupOption = value;
  }-*/;
  
  private static native boolean getRemoveSubscriptionOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeSubscriptionOption;
  }-*/;
  
  private static native void setRemoveSubscriptionOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::removeSubscriptionOption = value;
  }-*/;
  
  private static native boolean getRenameOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::renameOption;
  }-*/;
  
  private static native void setRenameOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::renameOption = value;
  }-*/;
  
  private static native boolean getRestoreOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::restoreOption;
  }-*/;
  
  private static native void setRestoreOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::restoreOption = value;
  }-*/;
  
  private static native boolean getScannerOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::scannerOption;
  }-*/;
  
  private static native void setScannerOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::scannerOption = value;
  }-*/;
  
  private static native boolean getSendDocumentAttachmentOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::sendDocumentAttachmentOption;
  }-*/;
  
  private static native void setSendDocumentAttachmentOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::sendDocumentAttachmentOption = value;
  }-*/;
  
  private static native boolean getSendDocumentLinkOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::sendDocumentLinkOption;
  }-*/;
  
  private static native void setSendDocumentLinkOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::sendDocumentLinkOption = value;
  }-*/;
  
  private static native boolean getSetHomeOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::setHomeOption;
  }-*/;
  
  private static native void setSetHomeOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::setHomeOption = value;
  }-*/;
  
  private static native boolean getSimilarDocumentVisible(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::similarDocumentVisible;
  }-*/;
  
  private static native void setSimilarDocumentVisible(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::similarDocumentVisible = value;
  }-*/;
  
  private static native boolean getSkinOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::skinOption;
  }-*/;
  
  private static native void setSkinOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::skinOption = value;
  }-*/;
  
  private static native boolean getSupportRequestOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::supportRequestOption;
  }-*/;
  
  private static native void setSupportRequestOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::supportRequestOption = value;
  }-*/;
  
  private static native boolean getUnLockOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::unLockOption;
  }-*/;
  
  private static native void setUnLockOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::unLockOption = value;
  }-*/;
  
  private static native boolean getUpdatePropertyGroupOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::updatePropertyGroupOption;
  }-*/;
  
  private static native void setUpdatePropertyGroupOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::updatePropertyGroupOption = value;
  }-*/;
  
  private static native boolean getUploaderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::uploaderOption;
  }-*/;
  
  private static native void setUploaderOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::uploaderOption = value;
  }-*/;
  
  private static native boolean getVersionChangesOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::versionChangesOption;
  }-*/;
  
  private static native void setVersionChangesOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::versionChangesOption = value;
  }-*/;
  
  private static native boolean getWorkflowOption(com.openkm.frontend.client.bean.GWTAvailableOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAvailableOption::workflowOption;
  }-*/;
  
  private static native void setWorkflowOption(com.openkm.frontend.client.bean.GWTAvailableOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAvailableOption::workflowOption = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTAvailableOption instance) throws SerializationException {
    setAboutOption(instance, streamReader.readBoolean());
    setAddBookmarkOption(instance, streamReader.readBoolean());
    setAddCategoryOption(instance, streamReader.readBoolean());
    setAddDocumentOption(instance, streamReader.readBoolean());
    setAddKeywordOption(instance, streamReader.readBoolean());
    setAddNoteOption(instance, streamReader.readBoolean());
    setAddPropertyGroupOption(instance, streamReader.readBoolean());
    setAddSubscriptionOption(instance, streamReader.readBoolean());
    setAdministrationOption(instance, streamReader.readBoolean());
    setBugReportOption(instance, streamReader.readBoolean());
    setCancelCheckoutOption(instance, streamReader.readBoolean());
    setCheckinOption(instance, streamReader.readBoolean());
    setCheckoutOption(instance, streamReader.readBoolean());
    setConvertOption(instance, streamReader.readBoolean());
    setCopyOption(instance, streamReader.readBoolean());
    setCreateFolderOption(instance, streamReader.readBoolean());
    setCreateFromTemplateOption(instance, streamReader.readBoolean());
    setDebugOption(instance, streamReader.readBoolean());
    setDeleteOption(instance, streamReader.readBoolean());
    setDocumentationOption(instance, streamReader.readBoolean());
    setDownloadOption(instance, streamReader.readBoolean());
    setDownloadPdfOption(instance, streamReader.readBoolean());
    setExportOption(instance, streamReader.readBoolean());
    setFindDocumentOption(instance, streamReader.readBoolean());
    setFindFolderOption(instance, streamReader.readBoolean());
    setForwardMailOption(instance, streamReader.readBoolean());
    setGotoFolderOption(instance, streamReader.readBoolean());
    setHelpOption(instance, streamReader.readBoolean());
    setHomeOption(instance, streamReader.readBoolean());
    setImageViewerOption(instance, streamReader.readBoolean());
    setLanguagesOption(instance, streamReader.readBoolean());
    setLockOption(instance, streamReader.readBoolean());
    setManageBookmarkOption(instance, streamReader.readBoolean());
    setMediaPlayerOption(instance, streamReader.readBoolean());
    setMergePdfOption(instance, streamReader.readBoolean());
    setMoveOption(instance, streamReader.readBoolean());
    setPreferencesOption(instance, streamReader.readBoolean());
    setProjectWebOption(instance, streamReader.readBoolean());
    setPublicForumOption(instance, streamReader.readBoolean());
    setPurgeOption(instance, streamReader.readBoolean());
    setPurgeTrashOption(instance, streamReader.readBoolean());
    setRefreshOption(instance, streamReader.readBoolean());
    setRemoveCategoryOption(instance, streamReader.readBoolean());
    setRemoveKeywordOption(instance, streamReader.readBoolean());
    setRemoveNoteOption(instance, streamReader.readBoolean());
    setRemovePropertyGroupOption(instance, streamReader.readBoolean());
    setRemoveSubscriptionOption(instance, streamReader.readBoolean());
    setRenameOption(instance, streamReader.readBoolean());
    setRestoreOption(instance, streamReader.readBoolean());
    setScannerOption(instance, streamReader.readBoolean());
    setSendDocumentAttachmentOption(instance, streamReader.readBoolean());
    setSendDocumentLinkOption(instance, streamReader.readBoolean());
    setSetHomeOption(instance, streamReader.readBoolean());
    setSimilarDocumentVisible(instance, streamReader.readBoolean());
    setSkinOption(instance, streamReader.readBoolean());
    setSupportRequestOption(instance, streamReader.readBoolean());
    setUnLockOption(instance, streamReader.readBoolean());
    setUpdatePropertyGroupOption(instance, streamReader.readBoolean());
    setUploaderOption(instance, streamReader.readBoolean());
    setVersionChangesOption(instance, streamReader.readBoolean());
    setWorkflowOption(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTAvailableOption instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTAvailableOption();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTAvailableOption instance) throws SerializationException {
    streamWriter.writeBoolean(getAboutOption(instance));
    streamWriter.writeBoolean(getAddBookmarkOption(instance));
    streamWriter.writeBoolean(getAddCategoryOption(instance));
    streamWriter.writeBoolean(getAddDocumentOption(instance));
    streamWriter.writeBoolean(getAddKeywordOption(instance));
    streamWriter.writeBoolean(getAddNoteOption(instance));
    streamWriter.writeBoolean(getAddPropertyGroupOption(instance));
    streamWriter.writeBoolean(getAddSubscriptionOption(instance));
    streamWriter.writeBoolean(getAdministrationOption(instance));
    streamWriter.writeBoolean(getBugReportOption(instance));
    streamWriter.writeBoolean(getCancelCheckoutOption(instance));
    streamWriter.writeBoolean(getCheckinOption(instance));
    streamWriter.writeBoolean(getCheckoutOption(instance));
    streamWriter.writeBoolean(getConvertOption(instance));
    streamWriter.writeBoolean(getCopyOption(instance));
    streamWriter.writeBoolean(getCreateFolderOption(instance));
    streamWriter.writeBoolean(getCreateFromTemplateOption(instance));
    streamWriter.writeBoolean(getDebugOption(instance));
    streamWriter.writeBoolean(getDeleteOption(instance));
    streamWriter.writeBoolean(getDocumentationOption(instance));
    streamWriter.writeBoolean(getDownloadOption(instance));
    streamWriter.writeBoolean(getDownloadPdfOption(instance));
    streamWriter.writeBoolean(getExportOption(instance));
    streamWriter.writeBoolean(getFindDocumentOption(instance));
    streamWriter.writeBoolean(getFindFolderOption(instance));
    streamWriter.writeBoolean(getForwardMailOption(instance));
    streamWriter.writeBoolean(getGotoFolderOption(instance));
    streamWriter.writeBoolean(getHelpOption(instance));
    streamWriter.writeBoolean(getHomeOption(instance));
    streamWriter.writeBoolean(getImageViewerOption(instance));
    streamWriter.writeBoolean(getLanguagesOption(instance));
    streamWriter.writeBoolean(getLockOption(instance));
    streamWriter.writeBoolean(getManageBookmarkOption(instance));
    streamWriter.writeBoolean(getMediaPlayerOption(instance));
    streamWriter.writeBoolean(getMergePdfOption(instance));
    streamWriter.writeBoolean(getMoveOption(instance));
    streamWriter.writeBoolean(getPreferencesOption(instance));
    streamWriter.writeBoolean(getProjectWebOption(instance));
    streamWriter.writeBoolean(getPublicForumOption(instance));
    streamWriter.writeBoolean(getPurgeOption(instance));
    streamWriter.writeBoolean(getPurgeTrashOption(instance));
    streamWriter.writeBoolean(getRefreshOption(instance));
    streamWriter.writeBoolean(getRemoveCategoryOption(instance));
    streamWriter.writeBoolean(getRemoveKeywordOption(instance));
    streamWriter.writeBoolean(getRemoveNoteOption(instance));
    streamWriter.writeBoolean(getRemovePropertyGroupOption(instance));
    streamWriter.writeBoolean(getRemoveSubscriptionOption(instance));
    streamWriter.writeBoolean(getRenameOption(instance));
    streamWriter.writeBoolean(getRestoreOption(instance));
    streamWriter.writeBoolean(getScannerOption(instance));
    streamWriter.writeBoolean(getSendDocumentAttachmentOption(instance));
    streamWriter.writeBoolean(getSendDocumentLinkOption(instance));
    streamWriter.writeBoolean(getSetHomeOption(instance));
    streamWriter.writeBoolean(getSimilarDocumentVisible(instance));
    streamWriter.writeBoolean(getSkinOption(instance));
    streamWriter.writeBoolean(getSupportRequestOption(instance));
    streamWriter.writeBoolean(getUnLockOption(instance));
    streamWriter.writeBoolean(getUpdatePropertyGroupOption(instance));
    streamWriter.writeBoolean(getUploaderOption(instance));
    streamWriter.writeBoolean(getVersionChangesOption(instance));
    streamWriter.writeBoolean(getWorkflowOption(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTAvailableOption)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTAvailableOption)object);
  }
  
}
