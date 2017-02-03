package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTLockInfo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getNodePath(com.openkm.frontend.client.bean.GWTLockInfo instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLockInfo::nodePath;
  }-*/;
  
  private static native void setNodePath(com.openkm.frontend.client.bean.GWTLockInfo instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTLockInfo::nodePath = value;
  }-*/;
  
  private static native java.lang.String getOwner(com.openkm.frontend.client.bean.GWTLockInfo instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLockInfo::owner;
  }-*/;
  
  private static native void setOwner(com.openkm.frontend.client.bean.GWTLockInfo instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTLockInfo::owner = value;
  }-*/;
  
  private static native java.lang.String getToken(com.openkm.frontend.client.bean.GWTLockInfo instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLockInfo::token;
  }-*/;
  
  private static native void setToken(com.openkm.frontend.client.bean.GWTLockInfo instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTLockInfo::token = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTUser getUser(com.openkm.frontend.client.bean.GWTLockInfo instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLockInfo::user;
  }-*/;
  
  private static native void setUser(com.openkm.frontend.client.bean.GWTLockInfo instance, com.openkm.frontend.client.bean.GWTUser value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTLockInfo::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTLockInfo instance) throws SerializationException {
    setNodePath(instance, streamReader.readString());
    setOwner(instance, streamReader.readString());
    setToken(instance, streamReader.readString());
    setUser(instance, (com.openkm.frontend.client.bean.GWTUser) streamReader.readObject());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTLockInfo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTLockInfo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTLockInfo instance) throws SerializationException {
    streamWriter.writeString(getNodePath(instance));
    streamWriter.writeString(getOwner(instance));
    streamWriter.writeString(getToken(instance));
    streamWriter.writeObject(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTLockInfo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTLockInfo_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTLockInfo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTLockInfo_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTLockInfo)object);
  }
  
}
