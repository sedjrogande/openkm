package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTButton_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getConfirmation(com.openkm.frontend.client.bean.form.GWTButton instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTButton::confirmation;
  }-*/;
  
  private static native void setConfirmation(com.openkm.frontend.client.bean.form.GWTButton instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTButton::confirmation = value;
  }-*/;
  
  private static native java.lang.String getStyle(com.openkm.frontend.client.bean.form.GWTButton instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTButton::style;
  }-*/;
  
  private static native void setStyle(com.openkm.frontend.client.bean.form.GWTButton instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTButton::style = value;
  }-*/;
  
  private static native java.lang.String getTransition(com.openkm.frontend.client.bean.form.GWTButton instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTButton::transition;
  }-*/;
  
  private static native void setTransition(com.openkm.frontend.client.bean.form.GWTButton instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTButton::transition = value;
  }-*/;
  
  private static native boolean getValidate(com.openkm.frontend.client.bean.form.GWTButton instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTButton::validate;
  }-*/;
  
  private static native void setValidate(com.openkm.frontend.client.bean.form.GWTButton instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTButton::validate = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTButton instance) throws SerializationException {
    setConfirmation(instance, streamReader.readString());
    setStyle(instance, streamReader.readString());
    setTransition(instance, streamReader.readString());
    setValidate(instance, streamReader.readBoolean());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTButton instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTButton();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTButton instance) throws SerializationException {
    streamWriter.writeString(getConfirmation(instance));
    streamWriter.writeString(getStyle(instance));
    streamWriter.writeString(getTransition(instance));
    streamWriter.writeBoolean(getValidate(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTButton)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTButton)object);
  }
  
}
