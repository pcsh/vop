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

public class zydCorpEdit {

/*
 * 验证：业务管理-企业，新增企业成功
 */
@Test
  public static void CorpEdit() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);	 
	  String corpname = "autoqy";  
	  String corpShortName = "shortname";
	  String corpCode = "code";
	  String contact = "contact";
	  zc.CorpBasicInfoEdit(driver, corpname, corpShortName, corpCode, contact);
	  Thread.sleep(3000);
	  driver.quit();
  }

}
