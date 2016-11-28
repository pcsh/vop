package com.zyd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zyd.pages.zydBuildAccount;
import com.zyd.pages.zydCorp;
import com.zyd.pages.zydCorpOwner;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydPartnerInfo;
import com.zyd.pages.zydWelcome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydBuildAccountTest {

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
	  zydPartnerInfo zpi = new zydPartnerInfo();
	  zpi.openPage(driver);
	  String corporg = zpi.QueryPartnerName(driver);	
	  zydCorp zc = new zydCorp(); 
	  String corpname = "autoqy_jz";  
	  boolean isCorpExistBeforeAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  if(isCorpExistBeforeAdd){
		  zc.DeleteCorpBySQL(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  }	
	  zc.DeleteCorpBySQL(corpname, "1", zydEnvSet.DBurl_sit, zydEnvSet.DBuser_sit, zydEnvSet.DBpassword_sit);
	  zydWelcome zw = new zydWelcome();
	  zw.openPage(driver);
	  zw.buildaccount(driver);
	  zydBuildAccount zba = new zydBuildAccount();
	  zba.openPage(driver);
	  String currentWindow = zba.AddCorp(driver, corpname, corporg);
	  zba.BuildAccount(driver, currentWindow);
	  driver.quit();
  }

}
