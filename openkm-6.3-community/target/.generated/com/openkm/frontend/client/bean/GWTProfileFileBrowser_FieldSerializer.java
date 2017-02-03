package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTProfileFileBrowser_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAuthorVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::authorVisible;
  }-*/;
  
  private static native void setAuthorVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::authorVisible = value;
  }-*/;
  
  private static native java.lang.String getAuthorWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::authorWidth;
  }-*/;
  
  private static native void setAuthorWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::authorWidth = value;
  }-*/;
  
  private static native boolean getExtraColumns(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::extraColumns;
  }-*/;
  
  private static native void setExtraColumns(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::extraColumns = value;
  }-*/;
  
  private static native boolean getIconVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::iconVisible;
  }-*/;
  
  private static native void setIconVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::iconVisible = value;
  }-*/;
  
  private static native java.lang.String getIconWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::iconWidth;
  }-*/;
  
  private static native void setIconWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::iconWidth = value;
  }-*/;
  
  private static native boolean getLastModifiedVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::lastModifiedVisible;
  }-*/;
  
  private static native void setLastModifiedVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::lastModifiedVisible = value;
  }-*/;
  
  private static native java.lang.String getLastModifiedWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::lastModifiedWidth;
  }-*/;
  
  private static native void setLastModifiedWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::lastModifiedWidth = value;
  }-*/;
  
  private static native boolean getMassiveVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::massiveVisible;
  }-*/;
  
  private static native void setMassiveVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::massiveVisible = value;
  }-*/;
  
  private static native java.lang.String getMassiveWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::massiveWidth;
  }-*/;
  
  private static native void setMassiveWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::massiveWidth = value;
  }-*/;
  
  private static native boolean getNameVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::nameVisible;
  }-*/;
  
  private static native void setNameVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::nameVisible = value;
  }-*/;
  
  private static native java.lang.String getNameWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::nameWidth;
  }-*/;
  
  private static native void setNameWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::nameWidth = value;
  }-*/;
  
  private static native boolean getSizeVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::sizeVisible;
  }-*/;
  
  private static native void setSizeVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::sizeVisible = value;
  }-*/;
  
  private static native java.lang.String getSizeWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::sizeWidth;
  }-*/;
  
  private static native void setSizeWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::sizeWidth = value;
  }-*/;
  
  private static native boolean getStatusVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::statusVisible;
  }-*/;
  
  private static native void setStatusVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::statusVisible = value;
  }-*/;
  
  private static native java.lang.String getStatusWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::statusWidth;
  }-*/;
  
  private static native void setStatusWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::statusWidth = value;
  }-*/;
  
  private static native boolean getVersionVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::versionVisible;
  }-*/;
  
  private static native void setVersionVisible(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, boolean value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::versionVisible = value;
  }-*/;
  
  private static native java.lang.String getVersionWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::versionWidth;
  }-*/;
  
  private static native void setVersionWidth(com.openkm.frontend.client.bean.GWTProfileFileBrowser instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.frontend.client.bean.GWTProfileFileBrowser::versionWidth = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) throws SerializationException {
    setAuthorVisible(instance, streamReader.readBoolean());
    setAuthorWidth(instance, streamReader.readString());
    setExtraColumns(instance, streamReader.readBoolean());
    setIconVisible(instance, streamReader.readBoolean());
    setIconWidth(instance, streamReader.readString());
    setLastModifiedVisible(instance, streamReader.readBoolean());
    setLastModifiedWidth(instance, streamReader.readString());
    setMassiveVisible(instance, streamReader.readBoolean());
    setMassiveWidth(instance, streamReader.readString());
    setNameVisible(instance, streamReader.readBoolean());
    setNameWidth(instance, streamReader.readString());
    setSizeVisible(instance, streamReader.readBoolean());
    setSizeWidth(instance, streamReader.readString());
    setStatusVisible(instance, streamReader.readBoolean());
    setStatusWidth(instance, streamReader.readString());
    setVersionVisible(instance, streamReader.readBoolean());
    setVersionWidth(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTProfileFileBrowser instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTProfileFileBrowser();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTProfileFileBrowser instance) throws SerializationException {
    streamWriter.writeBoolean(getAuthorVisible(instance));
    streamWriter.writeString(getAuthorWidth(instance));
    streamWriter.writeBoolean(getExtraColumns(instance));
    streamWriter.writeBoolean(getIconVisible(instance));
    streamWriter.writeString(getIconWidth(instance));
    streamWriter.writeBoolean(getLastModifiedVisible(instance));
    streamWriter.writeString(getLastModifiedWidth(instance));
    streamWriter.writeBoolean(getMassiveVisible(instance));
    streamWriter.writeString(getMassiveWidth(instance));
    streamWriter.writeBoolean(getNameVisible(instance));
    streamWriter.writeString(getNameWidth(instance));
    streamWriter.writeBoolean(getSizeVisible(instance));
    streamWriter.writeString(getSizeWidth(instance));
    streamWriter.writeBoolean(getStatusVisible(instance));
    streamWriter.writeString(getStatusWidth(instance));
    streamWriter.writeBoolean(getVersionVisible(instance));
    streamWriter.writeString(getVersionWidth(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.frontend.client.bean.GWTProfileFileBrowser_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProfileFileBrowser_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTProfileFileBrowser)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.frontend.client.bean.GWTProfileFileBrowser_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTProfileFileBrowser)object);
  }
  
}
