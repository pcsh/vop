package com.zyd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydCorpOwner;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydPartnerInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydCorpAddTest {

/*
 * 验证：业务管理-企业，新增企业成功
 */
@Test
  public static void CorpAdd() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydCorpOwner zco = new zydCorpOwner();
	  zco.openPage(driver);
	  String corpowner = "autoowner";
	  String Mobile = "18288889999";
	  String Email = "18288889999@139.com";
	  boolean isUserExistBeforeAdd = zco.QueryDatabaseCorpOwnerIsExist(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  if(isUserExistBeforeAdd){
		  zco.DeleteCorpOwnerBySQL(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
		  zco.DeleteOnlyouCorpOwnerBySQL(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_Onlyou_sit, zydEnvSet.DBuser_Onlyou_sit, zydEnvSet.DBpassword_Onlyou_sit); 
	  }	 
	  zco.Add(driver, corpowner, Mobile, Email, "18181818");
	  zydPartnerInfo zpi = new zydPartnerInfo();
	  zpi.openPage(driver);
	  String corporg = zpi.QueryPartnerName(driver);	
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);	 
	  String corpname = "autoqy";  
	  boolean isCorpExistBeforeAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  if(isCorpExistBeforeAdd){
		  zc.DeleteCorpBySQL(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  }	
	  zc.DeleteCorpBySQL(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  zc.Add(driver, corpowner, corpname, corporg);
	  Thread.sleep(5000);
	  boolean isCorpExistAfterAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  Assert.assertTrue(isCorpExistAfterAdd);  
	  driver.quit();
  }

}
