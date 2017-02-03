package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTProfilePagination_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getMiscFilterEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfilePagination::miscFilterEnabled;
  }-*/;
  
  private static native void setMiscFilterEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfilePagination::miscFilterEnabled = value;
  }-*/;
  
  private static native java.lang.String getPageList(com.openkm.frontend.client.bean.GWTProfilePagination instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfilePagination::pageList;
  }-*/;
  
  private static native void setPageList(com.openkm.frontend.client.bean.GWTProfilePagination instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfilePagination::pageList = value;
  }-*/;
  
  private static native boolean getPaginationEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfilePagination::paginationEnabled;
  }-*/;
  
  private static native void setPaginationEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfilePagination::paginationEnabled = value;
  }-*/;
  
  private static native boolean getShowDocumentsEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfilePagination::showDocumentsEnabled;
  }-*/;
  
  private static native void setShowDocumentsEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfilePagination::showDocumentsEnabled = value;
  }-*/;
  
  private static native boolean getShowFoldersEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfilePagination::showFoldersEnabled;
  }-*/;
  
  private static native void setShowFoldersEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfilePagination::showFoldersEnabled = value;
  }-*/;
  
  private static native boolean getShowMailsEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfilePagination::showMailsEnabled;
  }-*/;
  
  private static native void setShowMailsEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfilePagination::showMailsEnabled = value;
  }-*/;
  
  private static native boolean getTypeFilterEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfilePagination::typeFilterEnabled;
  }-*/;
  
  private static native void setTypeFilterEnabled(com.openkm.frontend.client.bean.GWTProfilePagination instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfilePagination::typeFilterEnabled = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTProfilePagination instance) throws SerializationException {
    setMiscFilterEnabled(instance, streamReader.readBoolean());
    setPageList(instance, streamReader.readString());
    setPaginationEnabled(instance, streamReader.readBoolean());
    setShowDocumentsEnabled(instance, streamReader.readBoolean());
    setShowFoldersEnabled(instance, streamReader.readBoolean());
    setShowMailsEnabled(instance, streamReader.readBoolean());
    setTypeFilterEnabled(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTProfilePagination instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTProfilePagination();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTProfilePagination instance) throws SerializationException {
    streamWriter.writeBoolean(getMiscFilterEnabled(instance));
    streamWriter.writeString(getPageList(instance));
    streamWriter.writeBoolean(getPaginationEnabled(instance));
    streamWriter.writeBoolean(getShowDocumentsEnabled(instance));
    streamWriter.writeBoolean(getShowFoldersEnabled(instance));
    streamWriter.writeBoolean(getShowMailsEnabled(instance));
    streamWriter.writeBoolean(getTypeFilterEnabled(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTProfilePagination_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProfilePagination_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTProfilePagination)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProfilePagination_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTProfilePagination)object);
  }
  
}
