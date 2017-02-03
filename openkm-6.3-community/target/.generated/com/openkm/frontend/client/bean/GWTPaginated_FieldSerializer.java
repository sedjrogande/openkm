package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTPaginated_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.openkm.frontend.client.bean.GWTDocument getDoc(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::doc;
  }-*/;
  
  private static native void setDoc(com.openkm.frontend.client.bean.GWTPaginated instance, com.openkm.frontend.client.bean.GWTDocument value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::doc = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTFolder getFld(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::fld;
  }-*/;
  
  private static native void setFld(com.openkm.frontend.client.bean.GWTPaginated instance, com.openkm.frontend.client.bean.GWTFolder value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::fld = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTMail getMail(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::mail;
  }-*/;
  
  private static native void setMail(com.openkm.frontend.client.bean.GWTPaginated instance, com.openkm.frontend.client.bean.GWTMail value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::mail = value;
  }-*/;
  
  private static native int getNewOffset(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::newOffset;
  }-*/;
  
  private static native void setNewOffset(com.openkm.frontend.client.bean.GWTPaginated instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::newOffset = value;
  }-*/;
  
  private static native java.util.List getObjects(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::objects;
  }-*/;
  
  private static native void setObjects(com.openkm.frontend.client.bean.GWTPaginated instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::objects = value;
  }-*/;
  
  private static native boolean getOutOfRange(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::outOfRange;
  }-*/;
  
  private static native void setOutOfRange(com.openkm.frontend.client.bean.GWTPaginated instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::outOfRange = value;
  }-*/;
  
  private static native int getTotal(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::total;
  }-*/;
  
  private static native void setTotal(com.openkm.frontend.client.bean.GWTPaginated instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::total = value;
  }-*/;
  
  private static native int getTotalDocuments(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::totalDocuments;
  }-*/;
  
  private static native void setTotalDocuments(com.openkm.frontend.client.bean.GWTPaginated instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::totalDocuments = value;
  }-*/;
  
  private static native int getTotalFolder(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::totalFolder;
  }-*/;
  
  private static native void setTotalFolder(com.openkm.frontend.client.bean.GWTPaginated instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::totalFolder = value;
  }-*/;
  
  private static native int getTotalMails(com.openkm.frontend.client.bean.GWTPaginated instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPaginated::totalMails;
  }-*/;
  
  private static native void setTotalMails(com.openkm.frontend.client.bean.GWTPaginated instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTPaginated::totalMails = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTPaginated instance) throws SerializationException {
    setDoc(instance, (com.openkm.frontend.client.bean.GWTDocument) streamReader.readObject());
    setFld(instance, (com.openkm.frontend.client.bean.GWTFolder) streamReader.readObject());
    setMail(instance, (com.openkm.frontend.client.bean.GWTMail) streamReader.readObject());
    setNewOffset(instance, streamReader.readInt());
    setObjects(instance, (java.util.List) streamReader.readObject());
    setOutOfRange(instance, streamReader.readBoolean());
    setTotal(instance, streamReader.readInt());
    setTotalDocuments(instance, streamReader.readInt());
    setTotalFolder(instance, streamReader.readInt());
    setTotalMails(instance, streamReader.readInt());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTPaginated instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTPaginated();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTPaginated instance) throws SerializationException {
    streamWriter.writeObject(getDoc(instance));
    streamWriter.writeObject(getFld(instance));
    streamWriter.writeObject(getMail(instance));
    streamWriter.writeInt(getNewOffset(instance));
    streamWriter.writeObject(getObjects(instance));
    streamWriter.writeBoolean(getOutOfRange(instance));
    streamWriter.writeInt(getTotal(instance));
    streamWriter.writeInt(getTotalDocuments(instance));
    streamWriter.writeInt(getTotalFolder(instance));
    streamWriter.writeInt(getTotalMails(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTPaginated_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTPaginated_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTPaginated)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTPaginated_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTPaginated)object);
  }
  
}
