package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTResultSet_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Collection getResults(com.openkm.frontend.client.bean.GWTResultSet instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTResultSet::results;
  }-*/;
  
  private static native void setResults(com.openkm.frontend.client.bean.GWTResultSet instance, java.util.Collection value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTResultSet::results = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getTotal(com.openkm.frontend.client.bean.GWTResultSet instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTResultSet::total;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setTotal(com.openkm.frontend.client.bean.GWTResultSet instance, long value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTResultSet::total = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTResultSet instance) throws SerializationException {
    setResults(instance, (java.util.Collection) streamReader.readObject());
    setTotal(instance, streamReader.readLong());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTResultSet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTResultSet();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTResultSet instance) throws SerializationException {
    streamWriter.writeObject(getResults(instance));
    streamWriter.writeLong(getTotal(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTResultSet_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTResultSet_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTResultSet)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTResultSet_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTResultSet)object);
  }
  
}
