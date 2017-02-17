package com.openkm.frontend.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class OKMMassiveService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.i18n.shared.impl.DateRecord/3375188634"] = [
        ,
        ,
        @com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/shared/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["com.openkm.frontend.client.OKMException/1351513842"] = [
        @com.openkm.frontend.client.OKMException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.OKMException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/OKMException;),
      ];
    
    result["com.openkm.frontend.client.bean.GWTFolder/1904246720"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.GWTFolder_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTFolder;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTNote/1760296963"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.GWTNote_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTNote;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.GWTNote;/3777182822"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.GWTNote_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/GWTNote;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTUser/1844720219"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.GWTUser_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTUser;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTButton/3774345947"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTButton;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTButton;/2729729402"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTButton_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTButton;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTCheckBox/3635695530"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTCheckBox;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTCheckBox;/839810964"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTCheckBox_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTCheckBox;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTDownload/1001678564"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTDownload;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTDownload;/725090506"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTDownload_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTDownload;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTFormElement/3225343223"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTFormElement;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTFormElement;/378458069"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTFormElement_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTFormElement;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTInput/2795871859"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTInput;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTInput;/3779958542"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTInput_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTInput;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTNode/971517141"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTNode;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTNode;/2872961105"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTNode_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTNode;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTOption/1541678324"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTOption;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTOption;/1203648528"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTOption_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTOption;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTPrint/602664531"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTPrint;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTPrint;/168684583"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTPrint_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTPrint;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTSelect/2286453455"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTSelect;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTSelect;/3211232540"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTSelect_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTSelect;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTSeparator/3015862250"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTSeparator;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTSeparator;/75079524"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTSeparator_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTSeparator;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTSuggestBox/2955350704"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTSuggestBox;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTSuggestBox;/2017903570"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTSuggestBox;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTText/3588128186"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTText_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTText;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTTextArea/2618283748"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTTextArea;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTTextArea;/546313721"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTTextArea_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTTextArea;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTText;/3708004535"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTText_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTText;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTUpload/172244304"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTUpload;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTUpload;/2347874406"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTUpload_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTUpload;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTValidator/3741116181"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTValidator;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTValidator;/2122628886"] = [
        ,
        ,
        @com.openkm.frontend.client.bean.form.GWTValidator_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTValidator;)
      ];
    
    result["java.lang.Boolean/476441737"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["java.sql.Date/730999118"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/1816797103"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Date/3385151746"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["java.util.HashSet/3273092938"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.LinkedHashSet/1826081506"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1346942793"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ];
    
    result["java.util.Vector/3057315478"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.shared.impl.DateRecord::class)] = "com.google.gwt.i18n.shared.impl.DateRecord/3375188634";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.OKMException::class)] = "com.openkm.frontend.client.OKMException/1351513842";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTFolder::class)] = "com.openkm.frontend.client.bean.GWTFolder/1904246720";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTNote::class)] = "com.openkm.frontend.client.bean.GWTNote/1760296963";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTNote[]::class)] = "[Lcom.openkm.frontend.client.bean.GWTNote;/3777182822";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTUser::class)] = "com.openkm.frontend.client.bean.GWTUser/1844720219";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTButton::class)] = "com.openkm.frontend.client.bean.form.GWTButton/3774345947";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTButton[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTButton;/2729729402";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTCheckBox::class)] = "com.openkm.frontend.client.bean.form.GWTCheckBox/3635695530";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTCheckBox[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTCheckBox;/839810964";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTDownload::class)] = "com.openkm.frontend.client.bean.form.GWTDownload/1001678564";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTDownload[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTDownload;/725090506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTFormElement::class)] = "com.openkm.frontend.client.bean.form.GWTFormElement/3225343223";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTFormElement[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTFormElement;/378458069";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTInput::class)] = "com.openkm.frontend.client.bean.form.GWTInput/2795871859";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTInput[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTInput;/3779958542";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTNode::class)] = "com.openkm.frontend.client.bean.form.GWTNode/971517141";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTNode[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTNode;/2872961105";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTOption::class)] = "com.openkm.frontend.client.bean.form.GWTOption/1541678324";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTOption[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTOption;/1203648528";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTPrint::class)] = "com.openkm.frontend.client.bean.form.GWTPrint/602664531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTPrint[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTPrint;/168684583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSelect::class)] = "com.openkm.frontend.client.bean.form.GWTSelect/2286453455";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSelect[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTSelect;/3211232540";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSeparator::class)] = "com.openkm.frontend.client.bean.form.GWTSeparator/3015862250";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSeparator[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTSeparator;/75079524";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSuggestBox::class)] = "com.openkm.frontend.client.bean.form.GWTSuggestBox/2955350704";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSuggestBox[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTSuggestBox;/2017903570";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTText::class)] = "com.openkm.frontend.client.bean.form.GWTText/3588128186";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTTextArea::class)] = "com.openkm.frontend.client.bean.form.GWTTextArea/2618283748";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTTextArea[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTTextArea;/546313721";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTText[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTText;/3708004535";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTUpload::class)] = "com.openkm.frontend.client.bean.form.GWTUpload/172244304";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTUpload[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTUpload;/2347874406";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTValidator::class)] = "com.openkm.frontend.client.bean.form.GWTValidator/3741116181";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTValidator[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTValidator;/2122628886";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/730999118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/1816797103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/3040052672";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptySet::class)] = "java.util.Collections$EmptySet/3523698179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/1826081506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    return result;
  }-*/;
  
  public OKMMassiveService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
