package com.zyd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zyd.pages.zydCorpOwner;
import com.zyd.pages.zydLoginPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydCorpOwnerPageTest {

/*
 * 验证：业务管理-企业主，新增企业主成功
 */
@Test
  public static void CorpOwnerPage() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydCorpOwner zco = new zydCorpOwner();
	  zco.openPage(driver);
	  String corpowner = "AUTOADD02";
	  String Mobile = "18288889997";
	  String Email = "18288889997@139.com";
	  boolean isUserExistBeforeAdd = zco.QueryDatabaseCorpOwnerIsExist(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  boolean isOnlyouUserExistBeforeAdd = zco.QueryDatabaseOnlyouCorpOwnerIsExist(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_Onlyou_sit, zydEnvSet.DBuser_Onlyou_sit, zydEnvSet.DBpassword_Onlyou_sit);
	  if(isUserExistBeforeAdd||isOnlyouUserExistBeforeAdd){
		  zco.DeleteCorpOwnerBySQL(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
		  zco.DeleteOnlyouCorpOwnerBySQL(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_Onlyou_sit, zydEnvSet.DBuser_Onlyou_sit, zydEnvSet.DBpassword_Onlyou_sit);
	  }	  
	  zco.Add(driver, corpowner,Mobile, Email, "18181818");	
	  boolean isExistAfterAdd = zco.QueryDatabaseCorpOwnerIsExist(corpowner,Mobile, Email, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  Assert.assertTrue(isExistAfterAdd);
	  driver.quit();
  }

}
