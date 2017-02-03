package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTProfileToolbar_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAddDocumentVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::addDocumentVisible;
  }-*/;
  
  private static native void setAddDocumentVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::addDocumentVisible = value;
  }-*/;
  
  private static native boolean getAddPropertyGroupVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::addPropertyGroupVisible;
  }-*/;
  
  private static native void setAddPropertyGroupVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::addPropertyGroupVisible = value;
  }-*/;
  
  private static native boolean getAddSubscriptionVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::addSubscriptionVisible;
  }-*/;
  
  private static native void setAddSubscriptionVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::addSubscriptionVisible = value;
  }-*/;
  
  private static native boolean getCancelCheckoutVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::cancelCheckoutVisible;
  }-*/;
  
  private static native void setCancelCheckoutVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::cancelCheckoutVisible = value;
  }-*/;
  
  private static native boolean getCheckinVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::checkinVisible;
  }-*/;
  
  private static native void setCheckinVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::checkinVisible = value;
  }-*/;
  
  private static native boolean getCheckoutVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::checkoutVisible;
  }-*/;
  
  private static native void setCheckoutVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::checkoutVisible = value;
  }-*/;
  
  private static native boolean getCreateFolderVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::createFolderVisible;
  }-*/;
  
  private static native void setCreateFolderVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::createFolderVisible = value;
  }-*/;
  
  private static native boolean getDeleteVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::deleteVisible;
  }-*/;
  
  private static native void setDeleteVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::deleteVisible = value;
  }-*/;
  
  private static native boolean getDownloadPdfVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::downloadPdfVisible;
  }-*/;
  
  private static native void setDownloadPdfVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::downloadPdfVisible = value;
  }-*/;
  
  private static native boolean getDownloadVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::downloadVisible;
  }-*/;
  
  private static native void setDownloadVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::downloadVisible = value;
  }-*/;
  
  private static native boolean getFindDocumentVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::findDocumentVisible;
  }-*/;
  
  private static native void setFindDocumentVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::findDocumentVisible = value;
  }-*/;
  
  private static native boolean getFindFolderVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::findFolderVisible;
  }-*/;
  
  private static native void setFindFolderVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::findFolderVisible = value;
  }-*/;
  
  private static native boolean getHomeVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::homeVisible;
  }-*/;
  
  private static native void setHomeVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::homeVisible = value;
  }-*/;
  
  private static native boolean getLockVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::lockVisible;
  }-*/;
  
  private static native void setLockVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::lockVisible = value;
  }-*/;
  
  private static native boolean getPrintVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::printVisible;
  }-*/;
  
  private static native void setPrintVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::printVisible = value;
  }-*/;
  
  private static native boolean getRefreshVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::refreshVisible;
  }-*/;
  
  private static native void setRefreshVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::refreshVisible = value;
  }-*/;
  
  private static native boolean getRemovePropertyGroupVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::removePropertyGroupVisible;
  }-*/;
  
  private static native void setRemovePropertyGroupVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::removePropertyGroupVisible = value;
  }-*/;
  
  private static native boolean getRemoveSubscriptionVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::removeSubscriptionVisible;
  }-*/;
  
  private static native void setRemoveSubscriptionVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::removeSubscriptionVisible = value;
  }-*/;
  
  private static native boolean getScannerVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::scannerVisible;
  }-*/;
  
  private static native void setScannerVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::scannerVisible = value;
  }-*/;
  
  private static native boolean getSimilarDocumentVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::similarDocumentVisible;
  }-*/;
  
  private static native void setSimilarDocumentVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::similarDocumentVisible = value;
  }-*/;
  
  private static native boolean getSplitterResizeVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::splitterResizeVisible;
  }-*/;
  
  private static native void setSplitterResizeVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::splitterResizeVisible = value;
  }-*/;
  
  private static native boolean getStartWorkflowVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::startWorkflowVisible;
  }-*/;
  
  private static native void setStartWorkflowVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::startWorkflowVisible = value;
  }-*/;
  
  private static native boolean getUnlockVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::unlockVisible;
  }-*/;
  
  private static native void setUnlockVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::unlockVisible = value;
  }-*/;
  
  private static native boolean getUploaderVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::uploaderVisible;
  }-*/;
  
  private static native void setUploaderVisible(com.openkm.frontend.client.bean.GWTProfileToolbar instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileToolbar::uploaderVisible = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTProfileToolbar instance) throws SerializationException {
    setAddDocumentVisible(instance, streamReader.readBoolean());
    setAddPropertyGroupVisible(instance, streamReader.readBoolean());
    setAddSubscriptionVisible(instance, streamReader.readBoolean());
    setCancelCheckoutVisible(instance, streamReader.readBoolean());
    setCheckinVisible(instance, streamReader.readBoolean());
    setCheckoutVisible(instance, streamReader.readBoolean());
    setCreateFolderVisible(instance, streamReader.readBoolean());
    setDeleteVisible(instance, streamReader.readBoolean());
    setDownloadPdfVisible(instance, streamReader.readBoolean());
    setDownloadVisible(instance, streamReader.readBoolean());
    setFindDocumentVisible(instance, streamReader.readBoolean());
    setFindFolderVisible(instance, streamReader.readBoolean());
    setHomeVisible(instance, streamReader.readBoolean());
    setLockVisible(instance, streamReader.readBoolean());
    setPrintVisible(instance, streamReader.readBoolean());
    setRefreshVisible(instance, streamReader.readBoolean());
    setRemovePropertyGroupVisible(instance, streamReader.readBoolean());
    setRemoveSubscriptionVisible(instance, streamReader.readBoolean());
    setScannerVisible(instance, streamReader.readBoolean());
    setSimilarDocumentVisible(instance, streamReader.readBoolean());
    setSplitterResizeVisible(instance, streamReader.readBoolean());
    setStartWorkflowVisible(instance, streamReader.readBoolean());
    setUnlockVisible(instance, streamReader.readBoolean());
    setUploaderVisible(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTProfileToolbar instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTProfileToolbar();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTProfileToolbar instance) throws SerializationException {
    streamWriter.writeBoolean(getAddDocumentVisible(instance));
    streamWriter.writeBoolean(getAddPropertyGroupVisible(instance));
    streamWriter.writeBoolean(getAddSubscriptionVisible(instance));
    streamWriter.writeBoolean(getCancelCheckoutVisible(instance));
    streamWriter.writeBoolean(getCheckinVisible(instance));
    streamWriter.writeBoolean(getCheckoutVisible(instance));
    streamWriter.writeBoolean(getCreateFolderVisible(instance));
    streamWriter.writeBoolean(getDeleteVisible(instance));
    streamWriter.writeBoolean(getDownloadPdfVisible(instance));
    streamWriter.writeBoolean(getDownloadVisible(instance));
    streamWriter.writeBoolean(getFindDocumentVisible(instance));
    streamWriter.writeBoolean(getFindFolderVisible(instance));
    streamWriter.writeBoolean(getHomeVisible(instance));
    streamWriter.writeBoolean(getLockVisible(instance));
    streamWriter.writeBoolean(getPrintVisible(instance));
    streamWriter.writeBoolean(getRefreshVisible(instance));
    streamWriter.writeBoolean(getRemovePropertyGroupVisible(instance));
    streamWriter.writeBoolean(getRemoveSubscriptionVisible(instance));
    streamWriter.writeBoolean(getScannerVisible(instance));
    streamWriter.writeBoolean(getSimilarDocumentVisible(instance));
    streamWriter.writeBoolean(getSplitterResizeVisible(instance));
    streamWriter.writeBoolean(getStartWorkflowVisible(instance));
    streamWriter.writeBoolean(getUnlockVisible(instance));
    streamWriter.writeBoolean(getUploaderVisible(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTProfileToolbar_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProfileToolbar_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTProfileToolbar)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProfileToolbar_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTProfileToolbar)object);
  }
  
}
