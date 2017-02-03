package com.openkm.extension.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTDropboxAccount_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCountry(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::country;
  }-*/;
  
  private static native void setCountry(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::country = value;
  }-*/;
  
  private static native java.lang.String getDisplayName(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::displayName;
  }-*/;
  
  private static native void setDisplayName(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::displayName = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getQuota(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::quota;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setQuota(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance, long value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::quota = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getQuotaNormal(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::quotaNormal;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setQuotaNormal(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance, long value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::quotaNormal = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getQuotaShared(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::quotaShared;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setQuotaShared(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance, long value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::quotaShared = value;
  }-*/;
  
  private static native java.lang.String getReferralLink(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::referralLink;
  }-*/;
  
  private static native void setReferralLink(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance, java.lang.String value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::referralLink = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getUid(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) /*-{
    return instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::uid;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setUid(com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance, long value) 
  /*-{
    instance.@com.openkm.extension.frontend.client.bean.GWTDropboxAccount::uid = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) throws SerializationException {
    setCountry(instance, streamReader.readString());
    setDisplayName(instance, streamReader.readString());
    setQuota(instance, streamReader.readLong());
    setQuotaNormal(instance, streamReader.readLong());
    setQuotaShared(instance, streamReader.readLong());
    setReferralLink(instance, streamReader.readString());
    setUid(instance, streamReader.readLong());
    
  }
  
  public static com.openkm.extension.frontend.client.bean.GWTDropboxAccount instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.extension.frontend.client.bean.GWTDropboxAccount();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.extension.frontend.client.bean.GWTDropboxAccount instance) throws SerializationException {
    streamWriter.writeString(getCountry(instance));
    streamWriter.writeString(getDisplayName(instance));
    streamWriter.writeLong(getQuota(instance));
    streamWriter.writeLong(getQuotaNormal(instance));
    streamWriter.writeLong(getQuotaShared(instance));
    streamWriter.writeString(getReferralLink(instance));
    streamWriter.writeLong(getUid(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.openkm.extension.frontend.client.bean.GWTDropboxAccount_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxAccount_FieldSerializer.deserialize(reader, (com.openkm.extension.frontend.client.bean.GWTDropboxAccount)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.openkm.extension.frontend.client.bean.GWTDropboxAccount_FieldSerializer.serialize(writer, (com.openkm.extension.frontend.client.bean.GWTDropboxAccount)object);
  }
  
}
