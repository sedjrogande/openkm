package com.openkm.extension.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMOpenMeetingsService_Proxy extends RemoteServiceProxy implements com.openkm.extension.frontend.client.service.OKMOpenMeetingsServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.extension.frontend.client.service.OKMOpenMeetingsService";
  private static final String SERIALIZATION_POLICY ="2FE109528F896EB99E42A307C7C4CDB5";
  private static final com.openkm.extension.frontend.client.service.OKMOpenMeetingsService_TypeSerializer SERIALIZER = new com.openkm.extension.frontend.client.service.OKMOpenMeetingsService_TypeSerializer();
  
  public OKMOpenMeetingsService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "../extension/OpenMeetings", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void addDocumentToRoom(java.lang.String SID, long roomId, java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "addDocumentToRoom");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("J");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(SID);
      streamWriter.writeLong(roomId);
      streamWriter.writeString(path);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void createNewRoom(java.lang.String SID, java.lang.String name, long roomType, long numberOfPartizipants, boolean isPublic, boolean appointment, boolean moderated, boolean allowUserQuestions, boolean audioOnly, boolean waitForRecording, boolean allowRecording, boolean topBar, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "createNewRoom");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 12);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("J");
      streamWriter.writeString("J");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString(SID);
      streamWriter.writeString(name);
      streamWriter.writeLong(roomType);
      streamWriter.writeLong(numberOfPartizipants);
      streamWriter.writeBoolean(isPublic);
      streamWriter.writeBoolean(appointment);
      streamWriter.writeBoolean(moderated);
      streamWriter.writeBoolean(allowUserQuestions);
      streamWriter.writeBoolean(audioOnly);
      streamWriter.writeBoolean(waitForRecording);
      streamWriter.writeBoolean(allowRecording);
      streamWriter.writeBoolean(topBar);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void deleteRoom(java.lang.String SID, long rooms_id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "deleteRoom");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("J");
      streamWriter.writeString(SID);
      streamWriter.writeLong(rooms_id);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getInterviewUserRooms(java.lang.String SID, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "getInterviewUserRooms");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(SID);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getPrivateConferenceUserRooms(java.lang.String SID, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "getPrivateConferenceUserRooms");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(SID);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getPublicRoomURL(java.lang.String SID, long roomId, boolean moderator, boolean showAudioVideoTest, java.lang.String lang, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "getPublicRoomURL");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 5);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("J");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(SID);
      streamWriter.writeLong(roomId);
      streamWriter.writeBoolean(moderator);
      streamWriter.writeBoolean(showAudioVideoTest);
      streamWriter.writeString(lang);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getRestrictedUserRooms(java.lang.String SID, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "getRestrictedUserRooms");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(SID);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getRoomsPublic(java.lang.String SID, long roomType, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "getRoomsPublic");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("J");
      streamWriter.writeString(SID);
      streamWriter.writeLong(roomType);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void loginUser(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "loginUser");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void sendInvitation(java.lang.String SID, long room_id, java.lang.String users, java.lang.String roles, java.lang.String subject, java.lang.String message, java.lang.String lang, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMOpenMeetingsService_Proxy", "sendInvitation");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("J");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(SID);
      streamWriter.writeLong(room_id);
      streamWriter.writeString(users);
      streamWriter.writeString(roles);
      streamWriter.writeString(subject);
      streamWriter.writeString(message);
      streamWriter.writeString(lang);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
