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

public class OKMMacrosService_Proxy extends RemoteServiceProxy implements com.openkm.extension.frontend.client.service.OKMMacrosServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.extension.frontend.client.service.OKMMacrosService";
  private static final String SERIALIZATION_POLICY ="709980694B843A76D38ACC8CEE8DB05A";
  private static final com.openkm.extension.frontend.client.service.OKMMacrosService_TypeSerializer SERIALIZER = new com.openkm.extension.frontend.client.service.OKMMacrosService_TypeSerializer();
  
  public OKMMacrosService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "../extension/Macros", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void executeAction(com.openkm.extension.frontend.client.bean.GWTMacros action, java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMacrosService_Proxy", "executeAction");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("com.openkm.extension.frontend.client.bean.GWTMacros/2118865697");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(action);
      streamWriter.writeString(path);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getActions(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMMacrosService_Proxy", "getActions");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(callback, ResponseReader.OBJECT);
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
