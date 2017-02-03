package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTDownload_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTDownload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTDownload::data;
  }-*/;
  
  private static native void setData(com.openkm.frontend.client.bean.form.GWTDownload instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTDownload::data = value;
  }-*/;
  
  private static native java.util.List getNodes(com.openkm.frontend.client.bean.form.GWTDownload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTDownload::nodes;
  }-*/;
  
  private static native void setNodes(com.openkm.frontend.client.bean.form.GWTDownload instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTDownload::nodes = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTDownload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTDownload::validators;
  }-*/;
  
  private static native void setValidators(com.openkm.frontend.client.bean.form.GWTDownload instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTDownload::validators = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTDownload instance) throws SerializationException {
    setData(instance, streamReader.readString());
    setNodes(instance, (java.util.List) streamReader.readObject());
    setValidators(instance, (java.util.List) streamReader.readObject());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTDownload instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTDownload();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTDownload instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    streamWriter.writeObject(getNodes(instance));
    streamWriter.writeObject(getValidators(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTDownload)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTDownload)object);
  }
  
}
