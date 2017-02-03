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

public class OKMPaginationService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMPaginationServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMPaginationService";
  private static final String SERIALIZATION_POLICY ="0D31AF716DA190EB9DF83177211BB8A0";
  private static final com.openkm.frontend.client.service.OKMPaginationService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMPaginationService_TypeSerializer();
  
  public OKMPaginationService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Pagination", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getChildrenPaginated(java.lang.String fldPath, boolean extraColumns, int offset, int limit, int order, boolean reverse, boolean folders, boolean documents, boolean mails, java.lang.String selectedRowId, java.util.Map filter, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("OKMPaginationService_Proxy", "getChildrenPaginated");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 11);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString(fldPath);
      streamWriter.writeBoolean(extraColumns);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      streamWriter.writeInt(order);
      streamWriter.writeBoolean(reverse);
      streamWriter.writeBoolean(folders);
      streamWriter.writeBoolean(documents);
      streamWriter.writeBoolean(mails);
      streamWriter.writeString(selectedRowId);
      streamWriter.writeObject(filter);
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
