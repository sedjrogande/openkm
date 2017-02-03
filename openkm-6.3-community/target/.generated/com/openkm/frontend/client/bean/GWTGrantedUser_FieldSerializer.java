package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTGrantedUser_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getPermissions(com.openkm.frontend.client.bean.GWTGrantedUser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTGrantedUser::permissions;
  }-*/;
  
  private static native void setPermissions(com.openkm.frontend.client.bean.GWTGrantedUser instance, java.lang.Integer value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTGrantedUser::permissions = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTUser getUser(com.openkm.frontend.client.bean.GWTGrantedUser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTGrantedUser::user;
  }-*/;
  
  private static native void setUser(com.openkm.frontend.client.bean.GWTGrantedUser instance, com.openkm.frontend.client.bean.GWTUser value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTGrantedUser::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTGrantedUser instance) throws SerializationException {
    setPermissions(instance, (java.lang.Integer) streamReader.readObject());
    setUser(instance, (com.openkm.frontend.client.bean.GWTUser) streamReader.readObject());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTGrantedUser instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTGrantedUser();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTGrantedUser instance) throws SerializationException {
    streamWriter.writeObject(getPermissions(instance));
    streamWriter.writeObject(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTGrantedUser_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTGrantedUser_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTGrantedUser)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTGrantedUser_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTGrantedUser)object);
  }
  
}
