package com.zyd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydCorpOwner;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydOrder;
import com.zyd.pages.zydPartnerInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydOrderAddTest {

/*
 * 验证：业务管理-合同，新增合同成功
 */
@Test
  public static void OrderAdd() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydCorpOwner zco = new zydCorpOwner();
	  zco.openPage(driver);
	  String corpowner = "qyownertest";
	  String Mobile = "18211119999";
	  String Email = "18211119999@139.com";
	  boolean isUserExistBeforeAdd = zco.QueryDatabaseCorpOwnerIsExist(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  boolean isOnlyouUserExistBeforeAdd = zco.QueryDatabaseOnlyouCorpOwnerIsExist(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_Onlyou_sit, zydEnvSet.DBuser_Onlyou_sit, zydEnvSet.DBpassword_Onlyou_sit);
	  if(isUserExistBeforeAdd||isOnlyouUserExistBeforeAdd){
		  zco.DeleteCorpOwnerBySQL(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
		  zco.DeleteOnlyouCorpOwnerBySQL(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_Onlyou_sit, zydEnvSet.DBuser_Onlyou_sit, zydEnvSet.DBpassword_Onlyou_sit);
	  }	 
	  zco.Add(driver, corpowner, Mobile, Email, "18181818");
	  zydPartnerInfo zpi = new zydPartnerInfo();
	  zpi.openPage(driver);
	  String corporg = zpi.QueryPartnerName(driver);		  
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);	 
	  String corpname = "有合同的企业qy";
	  boolean isCorpExistBeforeAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  if(isCorpExistBeforeAdd){
		  zc.DeleteCorpBySQL(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  }	
	  //zc.DeleteCorpBySQL(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  zc.Add(driver, corpowner, corpname, corporg);
	  Thread.sleep(5000);
	  boolean isCorpExistAfterAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  Assert.assertTrue(isCorpExistAfterAdd);  
	  zydOrder zo = new zydOrder();
	  zo.openPage(driver);
	  zo.Query(driver);
	  boolean isOrderExistBeforAdd = zo.QueryDatabaseOrderIsExist(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  if(isOrderExistBeforAdd)
	  {
		  zo.DeleteOrderBySQL(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  }
	  zo.Add(driver, corpname);
	  boolean isOrderExistAfterAdd = zo.QueryDatabaseOrderIsExist(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  Assert.assertTrue(isOrderExistAfterAdd);
	  driver.quit();
  }

}
