package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTPrint_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTPrint instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTPrint::data;
  }-*/;
  
  private static native void setData(com.openkm.frontend.client.bean.form.GWTPrint instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTPrint::data = value;
  }-*/;
  
  private static native java.util.List getNodes(com.openkm.frontend.client.bean.form.GWTPrint instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTPrint::nodes;
  }-*/;
  
  private static native void setNodes(com.openkm.frontend.client.bean.form.GWTPrint instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTPrint::nodes = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTPrint instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTPrint::validators;
  }-*/;
  
  private static native void setValidators(com.openkm.frontend.client.bean.form.GWTPrint instance, java.util.List value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTPrint::validators = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTPrint instance) throws SerializationException {
    setData(instance, streamReader.readString());
    setNodes(instance, (java.util.List) streamReader.readObject());
    setValidators(instance, (java.util.List) streamReader.readObject());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTPrint instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTPrint();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTPrint instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    streamWriter.writeObject(getNodes(instance));
    streamWriter.writeObject(getValidators(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTPrint)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTPrint)object);
  }
  
}
