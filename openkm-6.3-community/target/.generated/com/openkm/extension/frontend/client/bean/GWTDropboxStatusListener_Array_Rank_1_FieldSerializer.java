package com.openkm.extension.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTDropboxStatusListener_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener_Array_Rank_1_FieldSerializer.deserialize(reader, (com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener_Array_Rank_1_FieldSerializer.serialize(writer, (com.openkm.extension.frontend.client.bean.GWTDropboxStatusListener[])object);
  }
  
}
