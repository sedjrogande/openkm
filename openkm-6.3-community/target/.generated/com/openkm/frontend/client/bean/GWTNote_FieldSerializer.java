package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTNote_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTNote instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTNote::author;
  }-*/;
  
  private static native void setAuthor(com.openkm.frontend.client.bean.GWTNote instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTNote::author = value;
  }-*/;
  
  private static native java.util.Date getDate(com.openkm.frontend.client.bean.GWTNote instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTNote::date;
  }-*/;
  
  private static native void setDate(com.openkm.frontend.client.bean.GWTNote instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTNote::date = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTNote instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTNote::path;
  }-*/;
  
  private static native void setPath(com.openkm.frontend.client.bean.GWTNote instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTNote::path = value;
  }-*/;
  
  private static native java.lang.String getText(com.openkm.frontend.client.bean.GWTNote instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTNote::text;
  }-*/;
  
  private static native void setText(com.openkm.frontend.client.bean.GWTNote instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTNote::text = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTUser getUser(com.openkm.frontend.client.bean.GWTNote instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTNote::user;
  }-*/;
  
  private static native void setUser(com.openkm.frontend.client.bean.GWTNote instance, com.openkm.frontend.client.bean.GWTUser value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTNote::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTNote instance) throws SerializationException {
    setAuthor(instance, streamReader.readString());
    setDate(instance, (java.util.Date) streamReader.readObject());
    setPath(instance, streamReader.readString());
    setText(instance, streamReader.readString());
    setUser(instance, (com.openkm.frontend.client.bean.GWTUser) streamReader.readObject());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTNote instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTNote();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTNote instance) throws SerializationException {
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeString(getText(instance));
    streamWriter.writeObject(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTNote_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTNote_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTNote)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTNote_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTNote)object);
  }
  
}
