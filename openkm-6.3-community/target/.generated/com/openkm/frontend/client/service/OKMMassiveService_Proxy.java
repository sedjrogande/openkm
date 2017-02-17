package com.openkm.frontend.client.service;

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

public class OKMMassiveService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMMassiveServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMMassiveService";
  private static final String SERIALIZATION_POLICY ="BDEC9E7108378616BAFF30811786B9EF";
  private static final com.openkm.frontend.client.service.OKMMassiveService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMMassiveService_TypeSerializer();
  
  public OKMMassiveService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Massive", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void addCategory(java.util.List paths, java.lang.String category, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "addCategory");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(category);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void addKeyword(java.util.List paths, java.lang.String keyword, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "addKeyword");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(keyword);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void addNote(java.util.List paths, java.lang.String text, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "addNote");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(text);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void addPropertyGroup(java.util.List paths, java.lang.String grpName, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "addPropertyGroup");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(grpName);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void copy(java.util.List paths, java.lang.String fldPath, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "copy");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(fldPath);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void delete(java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "delete");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void forwardMail(java.util.List uuids, java.lang.String mails, java.lang.String users, java.lang.String roles, java.lang.String message, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "forwardMail");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 5);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(uuids);
      streamWriter.writeString(mails);
      streamWriter.writeString(users);
      streamWriter.writeString(roles);
      streamWriter.writeString(message);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void lock(java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "lock");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void move(java.util.List paths, java.lang.String fldPath, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "move");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(fldPath);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void notify(java.util.List uuids, java.lang.String mails, java.lang.String users, java.lang.String roles, java.lang.String message, boolean attachment, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "notify");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 6);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeObject(uuids);
      streamWriter.writeString(mails);
      streamWriter.writeString(users);
      streamWriter.writeString(roles);
      streamWriter.writeString(message);
      streamWriter.writeBoolean(attachment);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void removeCategory(java.util.List paths, java.lang.String category, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "removeCategory");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(category);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void removeKeyword(java.util.List paths, java.lang.String keyword, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "removeKeyword");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(keyword);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void setMixedProperties(java.util.List uuidList, java.util.List formProperties, boolean recursive, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "setMixedProperties");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeObject(uuidList);
      streamWriter.writeObject(formProperties);
      streamWriter.writeBoolean(recursive);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void setProperties(java.util.List paths, java.lang.String grpName, java.util.List formProperties, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "setProperties");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      streamWriter.writeString(grpName);
      streamWriter.writeObject(formProperties);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void unlock(java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMassiveService_Proxy", "unlock");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
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
