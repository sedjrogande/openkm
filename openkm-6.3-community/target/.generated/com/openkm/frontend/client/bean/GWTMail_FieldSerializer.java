package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTMail_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Collection getAttachments(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::attachments;
  }-*/;
  
  private static native void setAttachments(com.openkm.frontend.client.bean.GWTMail instance, java.util.Collection value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::attachments = value;
  }-*/;
  
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::author;
  }-*/;
  
  private static native void setAuthor(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::author = value;
  }-*/;
  
  private static native java.lang.String[] getBcc(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::bcc;
  }-*/;
  
  private static native void setBcc(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::bcc = value;
  }-*/;
  
  private static native java.util.Set getCategories(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::categories;
  }-*/;
  
  private static native void setCategories(com.openkm.frontend.client.bean.GWTMail instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::categories = value;
  }-*/;
  
  private static native java.lang.String[] getCc(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::cc;
  }-*/;
  
  private static native void setCc(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::cc = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn0(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column0;
  }-*/;
  
  private static native void setColumn0(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column0 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn1(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column1;
  }-*/;
  
  private static native void setColumn1(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column1 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn2(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column2;
  }-*/;
  
  private static native void setColumn2(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column2 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn3(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column3;
  }-*/;
  
  private static native void setColumn3(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column3 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn4(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column4;
  }-*/;
  
  private static native void setColumn4(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column4 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn5(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column5;
  }-*/;
  
  private static native void setColumn5(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column5 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn6(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column6;
  }-*/;
  
  private static native void setColumn6(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column6 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn7(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column7;
  }-*/;
  
  private static native void setColumn7(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column7 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn8(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column8;
  }-*/;
  
  private static native void setColumn8(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column8 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn9(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::column9;
  }-*/;
  
  private static native void setColumn9(com.openkm.frontend.client.bean.GWTMail instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::column9 = value;
  }-*/;
  
  private static native java.lang.String getContent(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::content;
  }-*/;
  
  private static native void setContent(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::content = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::created;
  }-*/;
  
  private static native void setCreated(com.openkm.frontend.client.bean.GWTMail instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::created = value;
  }-*/;
  
  private static native java.lang.String getFrom(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::from;
  }-*/;
  
  private static native void setFrom(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::from = value;
  }-*/;
  
  private static native boolean getHasNotes(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::hasNotes;
  }-*/;
  
  private static native void setHasNotes(com.openkm.frontend.client.bean.GWTMail instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::hasNotes = value;
  }-*/;
  
  private static native java.util.Set getKeywords(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::keywords;
  }-*/;
  
  private static native void setKeywords(com.openkm.frontend.client.bean.GWTMail instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::keywords = value;
  }-*/;
  
  private static native java.lang.String getMimeType(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::mimeType;
  }-*/;
  
  private static native void setMimeType(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::mimeType = value;
  }-*/;
  
  private static native java.util.List getNotes(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::notes;
  }-*/;
  
  private static native void setNotes(com.openkm.frontend.client.bean.GWTMail instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::notes = value;
  }-*/;
  
  private static native java.lang.String getParentPath(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::parentPath;
  }-*/;
  
  private static native void setParentPath(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::parentPath = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::path;
  }-*/;
  
  private static native void setPath(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::path = value;
  }-*/;
  
  private static native int getPermissions(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::permissions;
  }-*/;
  
  private static native void setPermissions(com.openkm.frontend.client.bean.GWTMail instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::permissions = value;
  }-*/;
  
  private static native java.util.Date getReceivedDate(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::receivedDate;
  }-*/;
  
  private static native void setReceivedDate(com.openkm.frontend.client.bean.GWTMail instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::receivedDate = value;
  }-*/;
  
  private static native java.lang.String[] getReply(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::reply;
  }-*/;
  
  private static native void setReply(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::reply = value;
  }-*/;
  
  private static native java.util.Date getSentDate(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::sentDate;
  }-*/;
  
  private static native void setSentDate(com.openkm.frontend.client.bean.GWTMail instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::sentDate = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getSize(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::size;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setSize(com.openkm.frontend.client.bean.GWTMail instance, long value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::size = value;
  }-*/;
  
  private static native java.lang.String getSubject(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::subject;
  }-*/;
  
  private static native void setSubject(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::subject = value;
  }-*/;
  
  private static native java.lang.String[] getTo(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::to;
  }-*/;
  
  private static native void setTo(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::to = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::uuid;
  }-*/;
  
  private static native void setUuid(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::uuid = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTMail instance) throws SerializationException {
    setAttachments(instance, (java.util.Collection) streamReader.readObject());
    setAuthor(instance, streamReader.readString());
    setBcc(instance, (java.lang.String[]) streamReader.readObject());
    setCategories(instance, (java.util.Set) streamReader.readObject());
    setCc(instance, (java.lang.String[]) streamReader.readObject());
    setColumn0(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn1(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn2(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn3(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn4(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn5(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn6(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn7(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn8(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setColumn9(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setContent(instance, streamReader.readString());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setFrom(instance, streamReader.readString());
    setHasNotes(instance, streamReader.readBoolean());
    setKeywords(instance, (java.util.Set) streamReader.readObject());
    setMimeType(instance, streamReader.readString());
    setNotes(instance, (java.util.List) streamReader.readObject());
    setParentPath(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setPermissions(instance, streamReader.readInt());
    setReceivedDate(instance, (java.util.Date) streamReader.readObject());
    setReply(instance, (java.lang.String[]) streamReader.readObject());
    setSentDate(instance, (java.util.Date) streamReader.readObject());
    setSize(instance, streamReader.readLong());
    setSubject(instance, streamReader.readString());
    setTo(instance, (java.lang.String[]) streamReader.readObject());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTMail instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTMail();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTMail instance) throws SerializationException {
    streamWriter.writeObject(getAttachments(instance));
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeObject(getBcc(instance));
    streamWriter.writeObject(getCategories(instance));
    streamWriter.writeObject(getCc(instance));
    streamWriter.writeObject(getColumn0(instance));
    streamWriter.writeObject(getColumn1(instance));
    streamWriter.writeObject(getColumn2(instance));
    streamWriter.writeObject(getColumn3(instance));
    streamWriter.writeObject(getColumn4(instance));
    streamWriter.writeObject(getColumn5(instance));
    streamWriter.writeObject(getColumn6(instance));
    streamWriter.writeObject(getColumn7(instance));
    streamWriter.writeObject(getColumn8(instance));
    streamWriter.writeObject(getColumn9(instance));
    streamWriter.writeString(getContent(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeString(getFrom(instance));
    streamWriter.writeBoolean(getHasNotes(instance));
    streamWriter.writeObject(getKeywords(instance));
    streamWriter.writeString(getMimeType(instance));
    streamWriter.writeObject(getNotes(instance));
    streamWriter.writeString(getParentPath(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeInt(getPermissions(instance));
    streamWriter.writeObject(getReceivedDate(instance));
    streamWriter.writeObject(getReply(instance));
    streamWriter.writeObject(getSentDate(instance));
    streamWriter.writeLong(getSize(instance));
    streamWriter.writeString(getSubject(instance));
    streamWriter.writeObject(getTo(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTMail_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTMail_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTMail)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTMail_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTMail)object);
  }
  
}
