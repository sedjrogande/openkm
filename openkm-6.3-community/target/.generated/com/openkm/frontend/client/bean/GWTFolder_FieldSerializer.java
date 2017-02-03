package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTFolder_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::author;
  }-*/;
  
  private static native void setAuthor(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::author = value;
  }-*/;
  
  private static native java.util.Set getCategories(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::categories;
  }-*/;
  
  private static native void setCategories(com.openkm.frontend.client.bean.GWTFolder instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::categories = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn0(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column0;
  }-*/;
  
  private static native void setColumn0(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column0 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn1(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column1;
  }-*/;
  
  private static native void setColumn1(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column1 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn2(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column2;
  }-*/;
  
  private static native void setColumn2(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column2 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn3(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column3;
  }-*/;
  
  private static native void setColumn3(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column3 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn4(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column4;
  }-*/;
  
  private static native void setColumn4(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column4 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn5(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column5;
  }-*/;
  
  private static native void setColumn5(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column5 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn6(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column6;
  }-*/;
  
  private static native void setColumn6(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column6 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn7(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column7;
  }-*/;
  
  private static native void setColumn7(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column7 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn8(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column8;
  }-*/;
  
  private static native void setColumn8(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column8 = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getColumn9(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::column9;
  }-*/;
  
  private static native void setColumn9(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.form.GWTFormElement value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::column9 = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::created;
  }-*/;
  
  private static native void setCreated(com.openkm.frontend.client.bean.GWTFolder instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::created = value;
  }-*/;
  
  private static native boolean getHasChildren(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::hasChildren;
  }-*/;
  
  private static native void setHasChildren(com.openkm.frontend.client.bean.GWTFolder instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::hasChildren = value;
  }-*/;
  
  private static native boolean getHasNotes(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::hasNotes;
  }-*/;
  
  private static native void setHasNotes(com.openkm.frontend.client.bean.GWTFolder instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::hasNotes = value;
  }-*/;
  
  private static native java.util.Set getKeywords(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::keywords;
  }-*/;
  
  private static native void setKeywords(com.openkm.frontend.client.bean.GWTFolder instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::keywords = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::name;
  }-*/;
  
  private static native void setName(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::name = value;
  }-*/;
  
  private static native java.util.List getNotes(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::notes;
  }-*/;
  
  private static native void setNotes(com.openkm.frontend.client.bean.GWTFolder instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::notes = value;
  }-*/;
  
  private static native java.lang.String getParentPath(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::parentPath;
  }-*/;
  
  private static native void setParentPath(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::parentPath = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::path;
  }-*/;
  
  private static native void setPath(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::path = value;
  }-*/;
  
  private static native int getPermissions(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::permissions;
  }-*/;
  
  private static native void setPermissions(com.openkm.frontend.client.bean.GWTFolder instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::permissions = value;
  }-*/;
  
  private static native boolean getSubscribed(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::subscribed;
  }-*/;
  
  private static native void setSubscribed(com.openkm.frontend.client.bean.GWTFolder instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::subscribed = value;
  }-*/;
  
  private static native java.util.Set getSubscriptors(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::subscriptors;
  }-*/;
  
  private static native void setSubscriptors(com.openkm.frontend.client.bean.GWTFolder instance, java.util.Set value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::subscriptors = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTUser getUser(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::user;
  }-*/;
  
  private static native void setUser(com.openkm.frontend.client.bean.GWTFolder instance, com.openkm.frontend.client.bean.GWTUser value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::user = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::uuid;
  }-*/;
  
  private static native void setUuid(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::uuid = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTFolder instance) throws SerializationException {
    setAuthor(instance, streamReader.readString());
    setCategories(instance, (java.util.Set) streamReader.readObject());
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
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setHasChildren(instance, streamReader.readBoolean());
    setHasNotes(instance, streamReader.readBoolean());
    setKeywords(instance, (java.util.Set) streamReader.readObject());
    setName(instance, streamReader.readString());
    setNotes(instance, (java.util.List) streamReader.readObject());
    setParentPath(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setPermissions(instance, streamReader.readInt());
    setSubscribed(instance, streamReader.readBoolean());
    setSubscriptors(instance, (java.util.Set) streamReader.readObject());
    setUser(instance, (com.openkm.frontend.client.bean.GWTUser) streamReader.readObject());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTFolder instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTFolder();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTFolder instance) throws SerializationException {
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeObject(getCategories(instance));
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
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeBoolean(getHasChildren(instance));
    streamWriter.writeBoolean(getHasNotes(instance));
    streamWriter.writeObject(getKeywords(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getNotes(instance));
    streamWriter.writeString(getParentPath(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeInt(getPermissions(instance));
    streamWriter.writeBoolean(getSubscribed(instance));
    streamWriter.writeObject(getSubscriptors(instance));
    streamWriter.writeObject(getUser(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTFolder)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTFolder)object);
  }
  
}
