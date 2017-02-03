package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTConverterStatus_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getConversionFinish(com.openkm.frontend.client.bean.GWTConverterStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTConverterStatus::conversionFinish;
  }-*/;
  
  private static native void setConversionFinish(com.openkm.frontend.client.bean.GWTConverterStatus instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTConverterStatus::conversionFinish = value;
  }-*/;
  
  private static native java.lang.String getError(com.openkm.frontend.client.bean.GWTConverterStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTConverterStatus::error;
  }-*/;
  
  private static native void setError(com.openkm.frontend.client.bean.GWTConverterStatus instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTConverterStatus::error = value;
  }-*/;
  
  private static native int getStatus(com.openkm.frontend.client.bean.GWTConverterStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTConverterStatus::status;
  }-*/;
  
  private static native void setStatus(com.openkm.frontend.client.bean.GWTConverterStatus instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTConverterStatus::status = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTConverterStatus instance) throws SerializationException {
    setConversionFinish(instance, streamReader.readBoolean());
    setError(instance, streamReader.readString());
    setStatus(instance, streamReader.readInt());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTConverterStatus instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTConverterStatus();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTConverterStatus instance) throws SerializationException {
    streamWriter.writeBoolean(getConversionFinish(instance));
    streamWriter.writeString(getError(instance));
    streamWriter.writeInt(getStatus(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTConverterStatus_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTConverterStatus_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTConverterStatus)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTConverterStatus_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTConverterStatus)object);
  }
  
}
