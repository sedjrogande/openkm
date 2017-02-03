package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTConfig_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getKey(com.openkm.frontend.client.bean.GWTConfig instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTConfig::key;
  }-*/;
  
  private static native void setKey(com.openkm.frontend.client.bean.GWTConfig instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTConfig::key = value;
  }-*/;
  
  private static native java.lang.String getType(com.openkm.frontend.client.bean.GWTConfig instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTConfig::type;
  }-*/;
  
  private static native void setType(com.openkm.frontend.client.bean.GWTConfig instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTConfig::type = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.bean.GWTConfig instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTConfig::value;
  }-*/;
  
  private static native void setValue(com.openkm.frontend.client.bean.GWTConfig instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTConfig::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTConfig instance) throws SerializationException {
    setKey(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    setValue(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTConfig instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTConfig();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTConfig instance) throws SerializationException {
    streamWriter.writeString(getKey(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTConfig_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTConfig_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTConfig)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTConfig_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTConfig)object);
  }
  
}
