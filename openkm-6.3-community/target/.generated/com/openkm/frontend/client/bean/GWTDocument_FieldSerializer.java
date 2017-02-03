package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTDocument_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.openkm.frontend.client.bean.GWTVersion getActualVersion(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::actualVersion;
  }-*/;
  
  private static native void setActualVersion(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.GWTVersion value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::actualVersion = value;
  }-*/;
  
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::author;
  }-*/;
  
  private static native void setAuthor(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::author = value;
  }-*/;
  
  private static native java.util.Set getCategories(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::categories;
  }-*/;
  
  private static native void setCategories(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::categories = value;
  }-*/;
  
  private static native boolean getCheckedOut(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::checkedOut;
  }-*/;
  
  private static native void setCheckedOut(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::checkedOut = value;
  }-*/;
  
  private static native java.lang.String getCipherName(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::cipherName;
  }-*/;
  
  private static native void setCipherName(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::cipherName = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn0(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column0;
  }-*/;
  
  private static native void setColumn0(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column0 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn1(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column1;
  }-*/;
  
  private static native void setColumn1(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column1 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn2(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column2;
  }-*/;
  
  private static native void setColumn2(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column2 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn3(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column3;
  }-*/;
  
  private static native void setColumn3(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column3 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn4(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column4;
  }-*/;
  
  private static native void setColumn4(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column4 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn5(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column5;
  }-*/;
  
  private static native void setColumn5(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column5 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn6(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column6;
  }-*/;
  
  private static native void setColumn6(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column6 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn7(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column7;
  }-*/;
  
  private static native void setColumn7(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column7 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn8(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column8;
  }-*/;
  
  private static native void setColumn8(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column8 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn9(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::column9;
  }-*/;
  
  private static native void setColumn9(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::column9 = value;
  }-*/;
  
  private static native byte[] getContent(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::content;
  }-*/;
  
  private static native void setContent(com.openkm.frontend.client.bean.GWTDocument instance, byte[] value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::content = value;
  }-*/;
  
  private static native boolean getConvertibleToDxf(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToDxf;
  }-*/;
  
  private static native void setConvertibleToDxf(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToDxf = value;
  }-*/;
  
  private static native boolean getConvertibleToPdf(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToPdf;
  }-*/;
  
  private static native void setConvertibleToPdf(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToPdf = value;
  }-*/;
  
  private static native boolean getConvertibleToSwf(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToSwf;
  }-*/;
  
  private static native void setConvertibleToSwf(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToSwf = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::created;
  }-*/;
  
  private static native void setCreated(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::created = value;
  }-*/;
  
  private static native boolean getHasNotes(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::hasNotes;
  }-*/;
  
  private static native void setHasNotes(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::hasNotes = value;
  }-*/;
  
  private static native boolean getIsAttachment(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::isAttachment;
  }-*/;
  
  private static native void setIsAttachment(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::isAttachment = value;
  }-*/;
  
  private static native java.util.Set getKeywords(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::keywords;
  }-*/;
  
  private static native void setKeywords(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::keywords = value;
  }-*/;
  
  private static native java.util.Date getLastModified(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::lastModified;
  }-*/;
  
  private static native void setLastModified(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::lastModified = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTLockInfo getLockInfo(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::lockInfo;
  }-*/;
  
  private static native void setLockInfo(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.GWTLockInfo value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::lockInfo = value;
  }-*/;
  
  private static native boolean getLocked(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::locked;
  }-*/;
  
  private static native void setLocked(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::locked = value;
  }-*/;
  
  private static native java.lang.String getMimeType(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::mimeType;
  }-*/;
  
  private static native void setMimeType(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::mimeType = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::name;
  }-*/;
  
  private static native void setName(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::name = value;
  }-*/;
  
  private static native java.util.List getNotes(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::notes;
  }-*/;
  
  private static native void setNotes(com.openkm.frontend.client.bean.GWTDocument instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::notes = value;
  }-*/;
  
  private static native java.lang.String getParentPath(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::parentPath;
  }-*/;
  
  private static native void setParentPath(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::parentPath = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::path;
  }-*/;
  
  private static native void setPath(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::path = value;
  }-*/;
  
  private static native int getPermissions(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::permissions;
  }-*/;
  
  private static native void setPermissions(com.openkm.frontend.client.bean.GWTDocument instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::permissions = value;
  }-*/;
  
  private static native boolean getSigned(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::signed;
  }-*/;
  
  private static native void setSigned(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::signed = value;
  }-*/;
  
  private static native boolean getSubscribed(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::subscribed;
  }-*/;
  
  private static native void setSubscribed(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::subscribed = value;
  }-*/;
  
  private static native java.util.Set getSubscriptors(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::subscriptors;
  }-*/;
  
  private static native void setSubscriptors(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::subscriptors = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTUser getUser(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::user;
  }-*/;
  
  private static native void setUser(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.GWTUser value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::user = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::uuid;
  }-*/;
  
  private static native void setUuid(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::uuid = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTDocument instance) throws SerializationException {
    setActualVersion(instance, (com.openkm.frontend.client.bean.GWTVersion) streamReader.readObject());
    setAuthor(instance, streamReader.readString());
    setCategories(instance, (java.util.Set) streamReader.readObject());
    setCheckedOut(instance, streamReader.readBoolean());
    setCipherName(instance, streamReader.readString());
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
    setContent(instance, (byte[]) streamReader.readObject());
    setConvertibleToDxf(instance, streamReader.readBoolean());
    setConvertibleToPdf(instance, streamReader.readBoolean());
    setConvertibleToSwf(instance, streamReader.readBoolean());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setHasNotes(instance, streamReader.readBoolean());
    setIsAttachment(instance, streamReader.readBoolean());
    setKeywords(instance, (java.util.Set) streamReader.readObject());
    setLastModified(instance, (java.util.Date) streamReader.readObject());
    setLockInfo(instance, (com.openkm.frontend.client.bean.GWTLockInfo) streamReader.readObject());
    setLocked(instance, streamReader.readBoolean());
    setMimeType(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setNotes(instance, (java.util.List) streamReader.readObject());
    setParentPath(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setPermissions(instance, streamReader.readInt());
    setSigned(instance, streamReader.readBoolean());
    setSubscribed(instance, streamReader.readBoolean());
    setSubscriptors(instance, (java.util.Set) streamReader.readObject());
    setUser(instance, (com.openkm.frontend.client.bean.GWTUser) streamReader.readObject());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTDocument instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTDocument();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTDocument instance) throws SerializationException {
    streamWriter.writeObject(getActualVersion(instance));
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeObject(getCategories(instance));
    streamWriter.writeBoolean(getCheckedOut(instance));
    streamWriter.writeString(getCipherName(instance));
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
    streamWriter.writeObject(getContent(instance));
    streamWriter.writeBoolean(getConvertibleToDxf(instance));
    streamWriter.writeBoolean(getConvertibleToPdf(instance));
    streamWriter.writeBoolean(getConvertibleToSwf(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeBoolean(getHasNotes(instance));
    streamWriter.writeBoolean(getIsAttachment(instance));
    streamWriter.writeObject(getKeywords(instance));
    streamWriter.writeObject(getLastModified(instance));
    streamWriter.writeObject(getLockInfo(instance));
    streamWriter.writeBoolean(getLocked(instance));
    streamWriter.writeString(getMimeType(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getNotes(instance));
    streamWriter.writeString(getParentPath(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeInt(getPermissions(instance));
    streamWriter.writeBoolean(getSigned(instance));
    streamWriter.writeBoolean(getSubscribed(instance));
    streamWriter.writeObject(getSubscriptors(instance));
    streamWriter.writeObject(getUser(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTDocument_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTDocument_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTDocument)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTDocument_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTDocument)object);
  }
  
}
