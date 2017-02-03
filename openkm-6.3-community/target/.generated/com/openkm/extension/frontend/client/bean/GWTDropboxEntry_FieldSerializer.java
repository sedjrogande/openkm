package com.openkm.extension.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTDropboxEntry_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getBytes(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::bytes;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setBytes(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, long value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::bytes = value;
  }-*/;
  
  private static native boolean getChildren(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::children;
  }-*/;
  
  private static native void setChildren(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, boolean value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::children = value;
  }-*/;
  
  private static native java.lang.String getClientMTime(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::clientMTime;
  }-*/;
  
  private static native void setClientMTime(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::clientMTime = value;
  }-*/;
  
  private static native boolean getDeleted(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::deleted;
  }-*/;
  
  private static native void setDeleted(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, boolean value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::deleted = value;
  }-*/;
  
  private static native boolean getDir(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::dir;
  }-*/;
  
  private static native void setDir(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, boolean value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::dir = value;
  }-*/;
  
  private static native java.lang.String getFileName(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::fileName;
  }-*/;
  
  private static native void setFileName(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::fileName = value;
  }-*/;
  
  private static native java.lang.String getHash(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::hash;
  }-*/;
  
  private static native void setHash(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::hash = value;
  }-*/;
  
  private static native java.lang.String getIcon(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::icon;
  }-*/;
  
  private static native void setIcon(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::icon = value;
  }-*/;
  
  private static native java.lang.String getMimeType(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::mimeType;
  }-*/;
  
  private static native void setMimeType(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::mimeType = value;
  }-*/;
  
  private static native java.lang.String getModified(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::modified;
  }-*/;
  
  private static native void setModified(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::modified = value;
  }-*/;
  
  private static native java.lang.String getParentPath(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::parentPath;
  }-*/;
  
  private static native void setParentPath(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::parentPath = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::path;
  }-*/;
  
  private static native void setPath(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::path = value;
  }-*/;
  
  private static native java.lang.String getRev(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::rev;
  }-*/;
  
  private static native void setRev(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::rev = value;
  }-*/;
  
  private static native java.lang.String getRoot(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::root;
  }-*/;
  
  private static native void setRoot(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::root = value;
  }-*/;
  
  private static native java.lang.String getSize(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::size;
  }-*/;
  
  private static native void setSize(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::size = value;
  }-*/;
  
  private static native boolean getThumbExists(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::thumbExists;
  }-*/;
  
  private static native void setThumbExists(com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance, boolean value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxEntry::thumbExists = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) throws SerializationException {
    setBytes(instance, streamReader.readLong());
    setChildren(instance, streamReader.readBoolean());
    setClientMTime(instance, streamReader.readString());
    setDeleted(instance, streamReader.readBoolean());
    setDir(instance, streamReader.readBoolean());
    setFileName(instance, streamReader.readString());
    setHash(instance, streamReader.readString());
    setIcon(instance, streamReader.readString());
    setMimeType(instance, streamReader.readString());
    setModified(instance, streamReader.readString());
    setParentPath(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setRev(instance, streamReader.readString());
    setRoot(instance, streamReader.readString());
    setSize(instance, streamReader.readString());
    setThumbExists(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.extension.frontend.client.bean.GWTDropboxEntry instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.extension.frontend.client.bean.GWTDropboxEntry();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.extension.frontend.client.bean.GWTDropboxEntry instance) throws SerializationException {
    streamWriter.writeLong(getBytes(instance));
    streamWriter.writeBoolean(getChildren(instance));
    streamWriter.writeString(getClientMTime(instance));
    streamWriter.writeBoolean(getDeleted(instance));
    streamWriter.writeBoolean(getDir(instance));
    streamWriter.writeString(getFileName(instance));
    streamWriter.writeString(getHash(instance));
    streamWriter.writeString(getIcon(instance));
    streamWriter.writeString(getMimeType(instance));
    streamWriter.writeString(getModified(instance));
    streamWriter.writeString(getParentPath(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeString(getRev(instance));
    streamWriter.writeString(getRoot(instance));
    streamWriter.writeString(getSize(instance));
    streamWriter.writeBoolean(getThumbExists(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.extension.frontend.client.bean.GWTDropboxEntry_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxEntry_FieldSerializer.deserialize(reader, (com.openkm.extension.frontend.client.bean.GWTDropboxEntry)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxEntry_FieldSerializer.serialize(writer, (com.openkm.extension.frontend.client.bean.GWTDropboxEntry)object);
  }
  
}
