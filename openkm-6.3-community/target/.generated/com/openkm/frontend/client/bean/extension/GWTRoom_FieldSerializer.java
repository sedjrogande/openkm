package com.openkm.frontend.client.bean.extension;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTRoom_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getId(com.openkm.frontend.client.bean.extension.GWTRoom instance) /*-{
    return instance.@com.openkm.frontend.client.bean.extension.GWTRoom::id;
  }-*/;
  
  private static native void setId(com.openkm.frontend.client.bean.extension.GWTRoom instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.extension.GWTRoom::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.extension.GWTRoom instance) /*-{
    return instance.@com.openkm.frontend.client.bean.extension.GWTRoom::name;
  }-*/;
  
  private static native void setName(com.openkm.frontend.client.bean.extension.GWTRoom instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.extension.GWTRoom::name = value;
  }-*/;
  
  private static native boolean getPub(com.openkm.frontend.client.bean.extension.GWTRoom instance) /*-{
    return instance.@com.openkm.frontend.client.bean.extension.GWTRoom::pub;
  }-*/;
  
  private static native void setPub(com.openkm.frontend.client.bean.extension.GWTRoom instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.extension.GWTRoom::pub = value;
  }-*/;
  
  private static native java.util.Date getStart(com.openkm.frontend.client.bean.extension.GWTRoom instance) /*-{
    return instance.@com.openkm.frontend.client.bean.extension.GWTRoom::start;
  }-*/;
  
  private static native void setStart(com.openkm.frontend.client.bean.extension.GWTRoom instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.extension.GWTRoom::start = value;
  }-*/;
  
  private static native int getType(com.openkm.frontend.client.bean.extension.GWTRoom instance) /*-{
    return instance.@com.openkm.frontend.client.bean.extension.GWTRoom::type;
  }-*/;
  
  private static native void setType(com.openkm.frontend.client.bean.extension.GWTRoom instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.extension.GWTRoom::type = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.extension.GWTRoom instance) throws SerializationException {
    setId(instance, streamReader.readInt());
    setName(instance, streamReader.readString());
    setPub(instance, streamReader.readBoolean());
    setStart(instance, (java.util.Date) streamReader.readObject());
    setType(instance, streamReader.readInt());
    
  }
  
  public static com.openkm.frontend.client.bean.extension.GWTRoom instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.extension.GWTRoom();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.extension.GWTRoom instance) throws SerializationException {
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeBoolean(getPub(instance));
    streamWriter.writeObject(getStart(instance));
    streamWriter.writeInt(getType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.extension.GWTRoom_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.extension.GWTRoom_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.extension.GWTRoom)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.extension.GWTRoom_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.extension.GWTRoom)object);
  }
  
}
