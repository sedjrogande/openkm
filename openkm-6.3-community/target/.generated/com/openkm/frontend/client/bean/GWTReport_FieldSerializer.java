package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTReport_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getActive(com.openkm.frontend.client.bean.GWTReport instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTReport::active;
  }-*/;
  
  private static native void setActive(com.openkm.frontend.client.bean.GWTReport instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTReport::active = value;
  }-*/;
  
  private static native java.lang.String getFileContent(com.openkm.frontend.client.bean.GWTReport instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTReport::fileContent;
  }-*/;
  
  private static native void setFileContent(com.openkm.frontend.client.bean.GWTReport instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTReport::fileContent = value;
  }-*/;
  
  private static native java.lang.String getFileMime(com.openkm.frontend.client.bean.GWTReport instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTReport::fileMime;
  }-*/;
  
  private static native void setFileMime(com.openkm.frontend.client.bean.GWTReport instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTReport::fileMime = value;
  }-*/;
  
  private static native java.lang.String getFileName(com.openkm.frontend.client.bean.GWTReport instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTReport::fileName;
  }-*/;
  
  private static native void setFileName(com.openkm.frontend.client.bean.GWTReport instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTReport::fileName = value;
  }-*/;
  
  private static native java.util.List getFormElements(com.openkm.frontend.client.bean.GWTReport instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTReport::formElements;
  }-*/;
  
  private static native void setFormElements(com.openkm.frontend.client.bean.GWTReport instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTReport::formElements = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId(com.openkm.frontend.client.bean.GWTReport instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTReport::id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId(com.openkm.frontend.client.bean.GWTReport instance, long value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTReport::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTReport instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTReport::name;
  }-*/;
  
  private static native void setName(com.openkm.frontend.client.bean.GWTReport instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTReport::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTReport instance) throws SerializationException {
    setActive(instance, streamReader.readBoolean());
    setFileContent(instance, streamReader.readString());
    setFileMime(instance, streamReader.readString());
    setFileName(instance, streamReader.readString());
    setFormElements(instance, (java.util.List) streamReader.readObject());
    setId(instance, streamReader.readLong());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTReport instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTReport();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTReport instance) throws SerializationException {
    streamWriter.writeBoolean(getActive(instance));
    streamWriter.writeString(getFileContent(instance));
    streamWriter.writeString(getFileMime(instance));
    streamWriter.writeString(getFileName(instance));
    streamWriter.writeObject(getFormElements(instance));
    streamWriter.writeLong(getId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTReport_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTReport_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTReport)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTReport_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTReport)object);
  }
  
}
