package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTOption_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getLabel(com.openkm.frontend.client.bean.form.GWTOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTOption::label;
  }-*/;
  
  private static native void setLabel(com.openkm.frontend.client.bean.form.GWTOption instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTOption::label = value;
  }-*/;
  
  private static native boolean getSelected(com.openkm.frontend.client.bean.form.GWTOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTOption::selected;
  }-*/;
  
  private static native void setSelected(com.openkm.frontend.client.bean.form.GWTOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTOption::selected = value;
  }-*/;
  
  private static native boolean getSuggested(com.openkm.frontend.client.bean.form.GWTOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTOption::suggested;
  }-*/;
  
  private static native void setSuggested(com.openkm.frontend.client.bean.form.GWTOption instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTOption::suggested = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.bean.form.GWTOption instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTOption::value;
  }-*/;
  
  private static native void setValue(com.openkm.frontend.client.bean.form.GWTOption instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTOption::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTOption instance) throws SerializationException {
    setLabel(instance, streamReader.readString());
    setSelected(instance, streamReader.readBoolean());
    setSuggested(instance, streamReader.readBoolean());
    setValue(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.form.GWTOption instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTOption();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTOption instance) throws SerializationException {
    streamWriter.writeString(getLabel(instance));
    streamWriter.writeBoolean(getSelected(instance));
    streamWriter.writeBoolean(getSuggested(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTOption)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTOption)object);
  }
  
}
