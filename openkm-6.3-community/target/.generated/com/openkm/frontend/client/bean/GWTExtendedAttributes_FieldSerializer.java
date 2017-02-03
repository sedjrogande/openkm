package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTExtendedAttributes_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getCategories(com.openkm.frontend.client.bean.GWTExtendedAttributes instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::categories;
  }-*/;
  
  private static native void setCategories(com.openkm.frontend.client.bean.GWTExtendedAttributes instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::categories = value;
  }-*/;
  
  private static native boolean getKeywords(com.openkm.frontend.client.bean.GWTExtendedAttributes instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::keywords;
  }-*/;
  
  private static native void setKeywords(com.openkm.frontend.client.bean.GWTExtendedAttributes instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::keywords = value;
  }-*/;
  
  private static native boolean getNotes(com.openkm.frontend.client.bean.GWTExtendedAttributes instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::notes;
  }-*/;
  
  private static native void setNotes(com.openkm.frontend.client.bean.GWTExtendedAttributes instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::notes = value;
  }-*/;
  
  private static native boolean getPropertyGroups(com.openkm.frontend.client.bean.GWTExtendedAttributes instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::propertyGroups;
  }-*/;
  
  private static native void setPropertyGroups(com.openkm.frontend.client.bean.GWTExtendedAttributes instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTExtendedAttributes::propertyGroups = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTExtendedAttributes instance) throws SerializationException {
    setCategories(instance, streamReader.readBoolean());
    setKeywords(instance, streamReader.readBoolean());
    setNotes(instance, streamReader.readBoolean());
    setPropertyGroups(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTExtendedAttributes instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTExtendedAttributes();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTExtendedAttributes instance) throws SerializationException {
    streamWriter.writeBoolean(getCategories(instance));
    streamWriter.writeBoolean(getKeywords(instance));
    streamWriter.writeBoolean(getNotes(instance));
    streamWriter.writeBoolean(getPropertyGroups(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTExtendedAttributes_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTExtendedAttributes_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTExtendedAttributes)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTExtendedAttributes_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTExtendedAttributes)object);
  }
  
}
