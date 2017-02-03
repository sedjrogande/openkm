package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTFormElement_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTFormElement instance) throws SerializationException {
    instance.height = streamReader.readString();
    instance.label = streamReader.readString();
    instance.name = streamReader.readString();
    instance.width = streamReader.readString();
    
  }
  
  public static com.openkm.frontend.client.bean.form.GWTFormElement instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTFormElement();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTFormElement instance) throws SerializationException {
    streamWriter.writeString(instance.height);
    streamWriter.writeString(instance.label);
    streamWriter.writeString(instance.name);
    streamWriter.writeString(instance.width);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTFormElement)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTFormElement)object);
  }
  
}
