package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTProcessInstanceLogEntry_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getDate(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::date;
  }-*/;
  
  private static native void setDate(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::date = value;
  }-*/;
  
  private static native java.lang.String getInfo(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::info;
  }-*/;
  
  private static native void setInfo(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::info = value;
  }-*/;
  
  private static native double getProcessDefinitionId(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::processDefinitionId;
  }-*/;
  
  private static native void setProcessDefinitionId(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance, double value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::processDefinitionId = value;
  }-*/;
  
  private static native java.lang.String getProcessDefinitionName(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::processDefinitionName;
  }-*/;
  
  private static native void setProcessDefinitionName(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::processDefinitionName = value;
  }-*/;
  
  private static native double getProcessInstanceId(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::processInstanceId;
  }-*/;
  
  private static native void setProcessInstanceId(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance, double value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::processInstanceId = value;
  }-*/;
  
  private static native java.lang.String getToken(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::token;
  }-*/;
  
  private static native void setToken(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::token = value;
  }-*/;
  
  private static native java.lang.String getType(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::type;
  }-*/;
  
  private static native void setType(com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry::type = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) throws SerializationException {
    setDate(instance, (java.util.Date) streamReader.readObject());
    setInfo(instance, streamReader.readString());
    setProcessDefinitionId(instance, streamReader.readDouble());
    setProcessDefinitionName(instance, streamReader.readString());
    setProcessInstanceId(instance, streamReader.readDouble());
    setToken(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry instance) throws SerializationException {
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeString(getInfo(instance));
    streamWriter.writeDouble(getProcessDefinitionId(instance));
    streamWriter.writeString(getProcessDefinitionName(instance));
    streamWriter.writeDouble(getProcessInstanceId(instance));
    streamWriter.writeString(getToken(instance));
    streamWriter.writeString(getType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTProcessInstanceLogEntry)object);
  }
  
}
