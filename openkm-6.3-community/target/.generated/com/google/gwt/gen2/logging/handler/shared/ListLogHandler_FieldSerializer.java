package com.google.gwt.gen2.logging.handler.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ListLogHandler_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.google.gwt.gen2.logging.handler.shared.ListLogHandler instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.google.gwt.gen2.logging.handler.shared.ListLogHandler instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.google.gwt.gen2.logging.handler.shared.ListLogHandler();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.google.gwt.gen2.logging.handler.shared.ListLogHandler instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.gen2.logging.handler.shared.ListLogHandler_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.gen2.logging.handler.shared.ListLogHandler_FieldSerializer.deserialize(reader, (com.google.gwt.gen2.logging.handler.shared.ListLogHandler)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.gen2.logging.handler.shared.ListLogHandler_FieldSerializer.serialize(writer, (com.google.gwt.gen2.logging.handler.shared.ListLogHandler)object);
  }
  
}
