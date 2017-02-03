package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTAppVersion_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getBuild(com.openkm.frontend.client.bean.GWTAppVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAppVersion::build;
  }-*/;
  
  private static native void setBuild(com.openkm.frontend.client.bean.GWTAppVersion instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAppVersion::build = value;
  }-*/;
  
  private static native java.lang.String getExtension(com.openkm.frontend.client.bean.GWTAppVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAppVersion::extension;
  }-*/;
  
  private static native void setExtension(com.openkm.frontend.client.bean.GWTAppVersion instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAppVersion::extension = value;
  }-*/;
  
  private static native java.lang.String getMaintenance(com.openkm.frontend.client.bean.GWTAppVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAppVersion::maintenance;
  }-*/;
  
  private static native void setMaintenance(com.openkm.frontend.client.bean.GWTAppVersion instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAppVersion::maintenance = value;
  }-*/;
  
  private static native java.lang.String getMajor(com.openkm.frontend.client.bean.GWTAppVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAppVersion::major;
  }-*/;
  
  private static native void setMajor(com.openkm.frontend.client.bean.GWTAppVersion instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAppVersion::major = value;
  }-*/;
  
  private static native java.lang.String getMinor(com.openkm.frontend.client.bean.GWTAppVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTAppVersion::minor;
  }-*/;
  
  private static native void setMinor(com.openkm.frontend.client.bean.GWTAppVersion instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTAppVersion::minor = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTAppVersion instance) throws SerializationException {
    setBuild(instance, streamReader.readString());
    setExtension(instance, streamReader.readString());
    setMaintenance(instance, streamReader.readString());
    setMajor(instance, streamReader.readString());
    setMinor(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTAppVersion instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTAppVersion();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTAppVersion instance) throws SerializationException {
    streamWriter.writeString(getBuild(instance));
    streamWriter.writeString(getExtension(instance));
    streamWriter.writeString(getMaintenance(instance));
    streamWriter.writeString(getMajor(instance));
    streamWriter.writeString(getMinor(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTAppVersion_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTAppVersion_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTAppVersion)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTAppVersion_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTAppVersion)object);
  }
  
}
