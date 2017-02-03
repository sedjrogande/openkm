package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTTestMail_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getError(com.openkm.frontend.client.bean.GWTTestMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTestMail::error;
  }-*/;
  
  private static native void setError(com.openkm.frontend.client.bean.GWTTestMail instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTTestMail::error = value;
  }-*/;
  
  private static native java.lang.String getErrorMsg(com.openkm.frontend.client.bean.GWTTestMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTestMail::errorMsg;
  }-*/;
  
  private static native void setErrorMsg(com.openkm.frontend.client.bean.GWTTestMail instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTTestMail::errorMsg = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTTestMail instance) throws SerializationException {
    setError(instance, streamReader.readBoolean());
    setErrorMsg(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTTestMail instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTTestMail();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTTestMail instance) throws SerializationException {
    streamWriter.writeBoolean(getError(instance));
    streamWriter.writeString(getErrorMsg(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTTestMail_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTTestMail_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTTestMail)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTTestMail_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTTestMail)object);
  }
  
}
