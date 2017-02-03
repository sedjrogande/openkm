package com.openkm.extension.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTDropboxStatusListener_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.openkm.frontend.client.bean.GWTDocument getDocument(com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener::document;
  }-*/;
  
  private static native void setDocument(com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener instance, com.openkm.frontend.client.bean.GWTDocument value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener::document = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTFolder getFolder(com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener::folder;
  }-*/;
  
  private static native void setFolder(com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener instance, com.openkm.frontend.client.bean.GWTFolder value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener::folder = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener instance) throws SerializationException {
    setDocument(instance, (com.openkm.frontend.client.bean.GWTDocument) streamReader.readObject());
    setFolder(instance, (com.openkm.frontend.client.bean.GWTFolder) streamReader.readObject());
    
  }
  
  public static com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener instance) throws SerializationException {
    streamWriter.writeObject(getDocument(instance));
    streamWriter.writeObject(getFolder(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener_FieldSerializer.deserialize(reader, (com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener_FieldSerializer.serialize(writer, (com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener)object);
  }
  
}
