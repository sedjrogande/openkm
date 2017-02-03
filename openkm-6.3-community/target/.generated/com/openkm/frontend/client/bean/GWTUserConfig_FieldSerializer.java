package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTUserConfig_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getHomeNode(com.openkm.frontend.client.bean.GWTUserConfig instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUserConfig::homeNode;
  }-*/;
  
  private static native void setHomeNode(com.openkm.frontend.client.bean.GWTUserConfig instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUserConfig::homeNode = value;
  }-*/;
  
  private static native java.lang.String getHomePath(com.openkm.frontend.client.bean.GWTUserConfig instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUserConfig::homePath;
  }-*/;
  
  private static native void setHomePath(com.openkm.frontend.client.bean.GWTUserConfig instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUserConfig::homePath = value;
  }-*/;
  
  private static native java.lang.String getHomeType(com.openkm.frontend.client.bean.GWTUserConfig instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUserConfig::homeType;
  }-*/;
  
  private static native void setHomeType(com.openkm.frontend.client.bean.GWTUserConfig instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUserConfig::homeType = value;
  }-*/;
  
  private static native java.lang.String getUser(com.openkm.frontend.client.bean.GWTUserConfig instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUserConfig::user;
  }-*/;
  
  private static native void setUser(com.openkm.frontend.client.bean.GWTUserConfig instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUserConfig::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTUserConfig instance) throws SerializationException {
    setHomeNode(instance, streamReader.readString());
    setHomePath(instance, streamReader.readString());
    setHomeType(instance, streamReader.readString());
    setUser(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTUserConfig instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTUserConfig();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTUserConfig instance) throws SerializationException {
    streamWriter.writeString(getHomeNode(instance));
    streamWriter.writeString(getHomePath(instance));
    streamWriter.writeString(getHomeType(instance));
    streamWriter.writeString(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTUserConfig_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTUserConfig_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTUserConfig)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTUserConfig_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTUserConfig)object);
  }
  
}
