package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTValidator_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getParameter(com.openkm.frontend.client.bean.form.GWTValidator instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTValidator::parameter;
  }-*/;
  
  private static native void setParameter(com.openkm.frontend.client.bean.form.GWTValidator instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTValidator::parameter = value;
  }-*/;
  
  private static native java.lang.String getType(com.openkm.frontend.client.bean.form.GWTValidator instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTValidator::type;
  }-*/;
  
  private static native void setType(com.openkm.frontend.client.bean.form.GWTValidator instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTValidator::type = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTValidator instance) throws SerializationException {
    setParameter(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.form.GWTValidator instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTValidator();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTValidator instance) throws SerializationException {
    streamWriter.writeString(getParameter(instance));
    streamWriter.writeString(getType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTValidator)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTValidator)object);
  }
  
}
