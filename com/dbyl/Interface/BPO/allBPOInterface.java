package com.dbyl.Interface.BPO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class allBPOInterface {
	
 /*
  * 无票通知
  */	
  //@Test 
  public void noBills() throws JSONException, IOException {
      HttpClient hc = new HttpClient();
      PostMethod method = null;
      JSONObject jsonObject = new JSONObject();
      //////////////////////////////////////////
      System.out.println("无票通知");
      //设置url以及json参数：
      method = new PostMethod("http://172.16.6.151:9091/vop/interface/bpo/noBills.htm");	           
      jsonObject.put("customerCode", "fe0620fc5f5841f9902c10ca530b7a4a");
      jsonObject.put("date","201601");
      //////////////////////////////////////////
      String transJson = jsonObject.toString();
      System.out.println(transJson);
      RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
      method.setRequestEntity(se);
      //使用系统提供的默认的恢复策略
      method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
      //设置超时的时间
      method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 3000);	            
      hc.executeMethod(method);
      InputStream strStream = method.getResponseBodyAsStream();
      ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream(); 
      int   i=-1; 
      while((i=strStream.read())!=-1){ 
      baos.write(i); 
      } 
     String strBody =   baos.toString(); 
      System.out.println(new String(strBody));
      System.out.println("getStatusLine:"+method.getStatusLine());
  }
  
  /*
   * 票据已扫描完毕scanningFinished.htm
   * 企业名称：票据实时入库，201603，对应的报文：
   * {"billsCount":3549,
   * "customerCode":"39ed0cef1a0c4b69b2b55ab95e089490",
   * "path":"/bills/086240201_2/1468679728809/201603/V204000023_3",
   * "date":"201603"}
   */
  //@Test 
  public void scanningFinished() throws JSONException, IOException {
      HttpClient hc = new HttpClient();
      PostMethod method = null;
      JSONObject jsonObject = new JSONObject();
      System.out.println("票据已扫描完毕");
      //设置url以及json参数：
      method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/scanningFinished.htm");	           
      jsonObject.put("customerCode", "39ed0cef1a0c4b69b2b55ab95e089490");
      jsonObject.put("date","201603");
      jsonObject.put("billsCount", "3549");
      jsonObject.put("path","/bills/086240201_2/1468679728809/201603/V204000023_3");
      String transJson = jsonObject.toString();
      System.out.println(transJson);
      //String transJson1 ="{\"billsCount\":\"5\",\"customerCode\":\"937a6c26f8e04f4d941e9dc12d7b7536\",\"path\":\"/bills/1004/1474613050035/201602/V241000018\",\"date\":\"201602\"}";
      //System.out.println(transJson1);
      RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
      method.setRequestEntity(se);
      //使用系统提供的默认的恢复策略
      method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
      //设置超时的时间
      method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 3000);	            
      hc.executeMethod(method);
      InputStream strStream = method.getResponseBodyAsStream();
      ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream(); 
      int   i=-1; 
      while((i=strStream.read())!=-1){ 
      baos.write(i); 
      } 
     String strBody =   baos.toString(); 
      System.out.println(new String(strBody));
      System.out.println("getStatusLine:"+method.getStatusLine());
  }
  
  
  /*
   * 传票完毕通知billFinished.htm
   * 企业名称：票据实时入库，201603，对应的报文：
   * {"billsCount":3549,
   * "customerCode":"39ed0cef1a0c4b69b2b55ab95e089490",
   * "path":"/bills/086240201_2/1468679728809/201603/V204000023_3",
   * "date":"201603"}
   */
  //@Test 
  public void billFinished() throws JSONException, IOException {
      HttpClient hc = new HttpClient();
      PostMethod method = null;
      JSONObject jsonObject = new JSONObject();
      System.out.println("传票完毕通知");
      //设置url以及json参数：
      method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/billFinished.htm");	           
      jsonObject.put("billsCount", "3549");
      jsonObject.put("customerCode", "39ed0cef1a0c4b69b2b55ab95e089490");
      jsonObject.put("path","/bills/086240201_2/1468679728809/201603/V204000023_3");
      jsonObject.put("date","201603");
      String transJson = jsonObject.toString();
      System.out.println(transJson);
      //String transJson1 ="{\"billsCount\":\"5\",\"customerCode\":\"937a6c26f8e04f4d941e9dc12d7b7536\",\"path\":\"/bills/1004/1474613050035/201602/V241000018\",\"date\":\"201602\"}";
      //System.out.println(transJson1);
      RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
      method.setRequestEntity(se);
      //使用系统提供的默认的恢复策略
      method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
      //设置超时的时间
      method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 3000);	            
      hc.executeMethod(method);
      InputStream strStream = method.getResponseBodyAsStream();
      ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream(); 
      int   i=-1; 
      while((i=strStream.read())!=-1){ 
      baos.write(i); 
      } 
     String strBody =   baos.toString(); 
      System.out.println(new String(strBody));
      System.out.println("getStatusLine:"+method.getStatusLine());
  }
 
  /*
   * 同步企业名录
   */
  //@Test  
  public void getCustomerList()  throws JSONException, IOException {
      HttpClient hc = new HttpClient();
      PostMethod method = null;
      JSONObject jsonObject = new JSONObject();
      System.out.println("同步企业名录");
      method = new PostMethod("http://172.16.6.151:9091/vop/interface/bpo/getCustomerList.htm");
      jsonObject.put("lastSyncDate", "20161014");
      String transJson = jsonObject.toString();
      RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
      method.setRequestEntity(se);
      //使用系统提供的默认的恢复策略
      method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
      //设置超时的时间
      method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 3000);
      hc.executeMethod(method);
      InputStream strStream = method.getResponseBodyAsStream();
      ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream(); 
      int   i=-1; 
      while((i=strStream.read())!=-1){ 
      baos.write(i); 
      } 
     String strBody =   baos.toString(); 
      System.out.println(new String(strBody));
      System.out.println("getStatusLine:"+method.getStatusLine());
  }
  
  /*
   * 扫描前置客户端权限校验
   * 返回：0-失败；1-成功
   * 18890902222(123456):不用平台，不同用户名，每个平台有2个加盟商
   * 18890901010（123456）：不同平台，不同用户名，每个平台有1个加盟商
   * 18788881139：唯你网（111111）企业主渠道管理员；枫江（123456）渠道管理员
   * pancs_op(111111)：运维人员
   * pancs_qd(111111)：渠道管理员，一个平台多个加盟商
   */
  @Test
  public void UserValidate() throws JSONException, IOException {
      HttpClient hc = new HttpClient();
      PostMethod method = null;
      System.out.println(" 扫描前置客户端权限校验");
      method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/UserValidate.htm");
      JSONObject jsonObject = new JSONObject();
      jsonObject.put("username", "18890902233");//18788881139;18890901010
      jsonObject.put("password", "123456");
      String transJson = jsonObject.toString();
      RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
      method.setRequestEntity(se);
      //使用系统提供的默认的恢复策略
      method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
      //设置超时的时间
      method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);	            
      hc.executeMethod(method);
      InputStream strStream = method.getResponseBodyAsStream();
      ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream(); 
      int   i=-1; 
      while((i=strStream.read())!=-1){ 
      baos.write(i); 
      } 
     String strBody =   baos.toString(); 
      System.out.println(new String(strBody));
      System.out.println("getStatusLine:"+method.getStatusLine());
  }
  
 
 
}
