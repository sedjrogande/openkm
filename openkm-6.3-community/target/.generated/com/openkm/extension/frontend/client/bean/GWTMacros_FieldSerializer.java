package com.openkm.extension.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTMacros_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getPathDestination(com.openkm.extension.frontend.client.bean.GWTMacros instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTMacros::pathDestination;
  }-*/;
  
  private static native void setPathDestination(com.openkm.extension.frontend.client.bean.GWTMacros instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTMacros::pathDestination = value;
  }-*/;
  
  private static native java.lang.String getPathOrigin(com.openkm.extension.frontend.client.bean.GWTMacros instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTMacros::pathOrigin;
  }-*/;
  
  private static native void setPathOrigin(com.openkm.extension.frontend.client.bean.GWTMacros instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTMacros::pathOrigin = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.extension.frontend.client.bean.GWTMacros instance) throws SerializationException {
    setPathDestination(instance, streamReader.readString());
    setPathOrigin(instance, streamReader.readString());
    
  }
  
  public static com.openkm.extension.frontend.client.bean.GWTMacros instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.extension.frontend.client.bean.GWTMacros();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.extension.frontend.client.bean.GWTMacros instance) throws SerializationException {
    streamWriter.writeString(getPathDestination(instance));
    streamWriter.writeString(getPathOrigin(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.extension.frontend.client.bean.GWTMacros_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTMacros_FieldSerializer.deserialize(reader, (com.openkm.extension.frontend.client.bean.GWTMacros)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTMacros_FieldSerializer.serialize(writer, (com.openkm.extension.frontend.client.bean.GWTMacros)object);
  }
  
}
