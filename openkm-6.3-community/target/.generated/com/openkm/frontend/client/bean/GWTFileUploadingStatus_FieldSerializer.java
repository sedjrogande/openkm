package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTFileUploadingStatus_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getBytesRead(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::bytesRead;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setBytesRead(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance, long value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::bytesRead = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getContentLength(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::contentLength;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setContentLength(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance, long value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::contentLength = value;
  }-*/;
  
  private static native boolean getStarted(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::started;
  }-*/;
  
  private static native void setStarted(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::started = value;
  }-*/;
  
  private static native boolean getUploadFinish(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::uploadFinish;
  }-*/;
  
  private static native void setUploadFinish(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::uploadFinish = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) throws SerializationException {
    setBytesRead(instance, streamReader.readLong());
    setContentLength(instance, streamReader.readLong());
    setStarted(instance, streamReader.readBoolean());
    setUploadFinish(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTFileUploadingStatus instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTFileUploadingStatus();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) throws SerializationException {
    streamWriter.writeLong(getBytesRead(instance));
    streamWriter.writeLong(getContentLength(instance));
    streamWriter.writeBoolean(getStarted(instance));
    streamWriter.writeBoolean(getUploadFinish(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTFileUploadingStatus_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTFileUploadingStatus_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTFileUploadingStatus)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTFileUploadingStatus_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTFileUploadingStatus)object);
  }
  
}
