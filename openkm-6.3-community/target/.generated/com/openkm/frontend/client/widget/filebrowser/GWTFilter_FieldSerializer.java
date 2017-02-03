package com.openkm.frontend.client.widget.filebrowser;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTFilter_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getFilterValue1(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::filterValue1;
  }-*/;
  
  private static native void setFilterValue1(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::filterValue1 = value;
  }-*/;
  
  private static native java.lang.String getFilterValue2(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::filterValue2;
  }-*/;
  
  private static native void setFilterValue2(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::filterValue2 = value;
  }-*/;
  
  private static native java.util.Date getFrom(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::from;
  }-*/;
  
  private static native void setFrom(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::from = value;
  }-*/;
  
  private static native java.lang.String getItem(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::item;
  }-*/;
  
  private static native void setItem(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::item = value;
  }-*/;
  
  private static native int getSizeType1(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeType1;
  }-*/;
  
  private static native void setSizeType1(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeType1 = value;
  }-*/;
  
  private static native int getSizeType2(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeType2;
  }-*/;
  
  private static native void setSizeType2(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeType2 = value;
  }-*/;
  
  private static native int getSizeValue1(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeValue1;
  }-*/;
  
  private static native void setSizeValue1(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeValue1 = value;
  }-*/;
  
  private static native int getSizeValue2(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeValue2;
  }-*/;
  
  private static native void setSizeValue2(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, int value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::sizeValue2 = value;
  }-*/;
  
  private static native java.util.Date getTo(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::to;
  }-*/;
  
  private static native void setTo(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, java.util.Date value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::to = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) /*-{
    return instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::value;
  }-*/;
  
  private static native void setValue(com.openkm.frontend.client.widget.filebrowser.GWTFilter instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.widget.filebrowser.GWTFilter::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) throws SerializationException {
    setFilterValue1(instance, streamReader.readString());
    setFilterValue2(instance, streamReader.readString());
    setFrom(instance, (java.util.Date) streamReader.readObject());
    setItem(instance, streamReader.readString());
    setSizeType1(instance, streamReader.readInt());
    setSizeType2(instance, streamReader.readInt());
    setSizeValue1(instance, streamReader.readInt());
    setSizeValue2(instance, streamReader.readInt());
    setTo(instance, (java.util.Date) streamReader.readObject());
    setValue(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.widget.filebrowser.GWTFilter instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.widget.filebrowser.GWTFilter();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.widget.filebrowser.GWTFilter instance) throws SerializationException {
    streamWriter.writeString(getFilterValue1(instance));
    streamWriter.writeString(getFilterValue2(instance));
    streamWriter.writeObject(getFrom(instance));
    streamWriter.writeString(getItem(instance));
    streamWriter.writeInt(getSizeType1(instance));
    streamWriter.writeInt(getSizeType2(instance));
    streamWriter.writeInt(getSizeValue1(instance));
    streamWriter.writeInt(getSizeValue2(instance));
    streamWriter.writeObject(getTo(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.widget.filebrowser.GWTFilter_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.widget.filebrowser.GWTFilter_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.widget.filebrowser.GWTFilter)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.widget.filebrowser.GWTFilter_FieldSerializer.serialize(writer, (com.openkm.frontend.client.widget.filebrowser.GWTFilter)object);
  }
  
}
