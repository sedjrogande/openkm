package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTUINotification_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getAction(com.openkm.frontend.client.bean.GWTUINotification instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUINotification::action;
  }-*/;
  
  private static native void setAction(com.openkm.frontend.client.bean.GWTUINotification instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUINotification::action = value;
  }-*/;
  
  private static native java.util.Date getDate(com.openkm.frontend.client.bean.GWTUINotification instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUINotification::date;
  }-*/;
  
  private static native void setDate(com.openkm.frontend.client.bean.GWTUINotification instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUINotification::date = value;
  }-*/;
  
  private static native int getId(com.openkm.frontend.client.bean.GWTUINotification instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUINotification::id;
  }-*/;
  
  private static native void setId(com.openkm.frontend.client.bean.GWTUINotification instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUINotification::id = value;
  }-*/;
  
  private static native java.lang.String getMessage(com.openkm.frontend.client.bean.GWTUINotification instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUINotification::message;
  }-*/;
  
  private static native void setMessage(com.openkm.frontend.client.bean.GWTUINotification instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUINotification::message = value;
  }-*/;
  
  private static native boolean getShow(com.openkm.frontend.client.bean.GWTUINotification instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUINotification::show;
  }-*/;
  
  private static native void setShow(com.openkm.frontend.client.bean.GWTUINotification instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUINotification::show = value;
  }-*/;
  
  private static native int getType(com.openkm.frontend.client.bean.GWTUINotification instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTUINotification::type;
  }-*/;
  
  private static native void setType(com.openkm.frontend.client.bean.GWTUINotification instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTUINotification::type = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTUINotification instance) throws SerializationException {
    setAction(instance, streamReader.readInt());
    setDate(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readInt());
    setMessage(instance, streamReader.readString());
    setShow(instance, streamReader.readBoolean());
    setType(instance, streamReader.readInt());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTUINotification instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTUINotification();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTUINotification instance) throws SerializationException {
    streamWriter.writeInt(getAction(instance));
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getMessage(instance));
    streamWriter.writeBoolean(getShow(instance));
    streamWriter.writeInt(getType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTUINotification_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTUINotification_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTUINotification)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTUINotification_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTUINotification)object);
  }
  
}
