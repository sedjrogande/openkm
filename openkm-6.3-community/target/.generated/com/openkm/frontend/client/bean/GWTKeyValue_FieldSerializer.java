package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTKeyValue_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getKey(com.openkm.frontend.client.bean.GWTKeyValue instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTKeyValue::key;
  }-*/;
  
  private static native void setKey(com.openkm.frontend.client.bean.GWTKeyValue instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTKeyValue::key = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.bean.GWTKeyValue instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTKeyValue::value;
  }-*/;
  
  private static native void setValue(com.openkm.frontend.client.bean.GWTKeyValue instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTKeyValue::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTKeyValue instance) throws SerializationException {
    setKey(instance, streamReader.readString());
    setValue(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTKeyValue instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTKeyValue();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTKeyValue instance) throws SerializationException {
    streamWriter.writeString(getKey(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTKeyValue_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTKeyValue_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTKeyValue)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTKeyValue_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTKeyValue)object);
  }
  
}
