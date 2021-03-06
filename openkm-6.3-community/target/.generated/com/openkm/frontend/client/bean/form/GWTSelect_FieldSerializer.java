package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTSelect_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getClassName(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::className;
  }-*/;
  
  private static native void setClassName(com.openkm.frontend.client.bean.form.GWTSelect instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::className = value;
  }-*/;
  
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::data;
  }-*/;
  
  private static native void setData(com.openkm.frontend.client.bean.form.GWTSelect instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::data = value;
  }-*/;
  
  private static native java.util.Collection getOptions(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::options;
  }-*/;
  
  private static native void setOptions(com.openkm.frontend.client.bean.form.GWTSelect instance, java.util.Collection value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::options = value;
  }-*/;
  
  private static native java.lang.String getOptionsData(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::optionsData;
  }-*/;
  
  private static native void setOptionsData(com.openkm.frontend.client.bean.form.GWTSelect instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::optionsData = value;
  }-*/;
  
  private static native boolean getReadonly(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::readonly;
  }-*/;
  
  private static native void setReadonly(com.openkm.frontend.client.bean.form.GWTSelect instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::readonly = value;
  }-*/;
  
  private static native java.lang.String getSuggestion(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::suggestion;
  }-*/;
  
  private static native void setSuggestion(com.openkm.frontend.client.bean.form.GWTSelect instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::suggestion = value;
  }-*/;
  
  private static native java.lang.String getType(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::type;
  }-*/;
  
  private static native void setType(com.openkm.frontend.client.bean.form.GWTSelect instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::type = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTSelect instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSelect::validators;
  }-*/;
  
  private static native void setValidators(com.openkm.frontend.client.bean.form.GWTSelect instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSelect::validators = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTSelect instance) throws SerializationException {
    setClassName(instance, streamReader.readString());
    setData(instance, streamReader.readString());
    setOptions(instance, (java.util.Collection) streamReader.readObject());
    setOptionsData(instance, streamReader.readString());
    setReadonly(instance, streamReader.readBoolean());
    setSuggestion(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    setValidators(instance, (java.util.List) streamReader.readObject());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTSelect instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTSelect();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTSelect instance) throws SerializationException {
    streamWriter.writeString(getClassName(instance));
    streamWriter.writeString(getData(instance));
    streamWriter.writeObject(getOptions(instance));
    streamWriter.writeString(getOptionsData(instance));
    streamWriter.writeBoolean(getReadonly(instance));
    streamWriter.writeString(getSuggestion(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeObject(getValidators(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTSelect)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTSelect)object);
  }
  
}
