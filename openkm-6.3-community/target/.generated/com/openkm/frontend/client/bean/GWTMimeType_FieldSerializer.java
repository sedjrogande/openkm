package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTMimeType_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDescription(com.openkm.frontend.client.bean.GWTMimeType instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMimeType::description;
  }-*/;
  
  private static native void setDescription(com.openkm.frontend.client.bean.GWTMimeType instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMimeType::description = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTMimeType instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMimeType::name;
  }-*/;
  
  private static native void setName(com.openkm.frontend.client.bean.GWTMimeType instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMimeType::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTMimeType instance) throws SerializationException {
    setDescription(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTMimeType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTMimeType();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTMimeType instance) throws SerializationException {
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTMimeType_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTMimeType_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTMimeType)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTMimeType_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTMimeType)object);
  }
  
}
