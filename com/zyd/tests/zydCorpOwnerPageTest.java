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
	  String name = "AUTOADD02";
	  String Mobile = "18288889997";
	  String Email = "18288889997@139.com";
	  boolean isExistBeforeAdd = zco.QueryDatabaseCorpOwnerIsExist(name,Mobile, Email, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  if(isExistBeforeAdd){
		  zco.DeleteCorpOwnerBySQL(name,Mobile, Email, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  }	  
	  zco.Add(driver, name,Mobile, Email, "18181818");	
	  boolean isExistAfterAdd = zco.QueryDatabaseCorpOwnerIsExist(name,Mobile, Email, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  Assert.assertTrue(isExistAfterAdd);
	  driver.quit();
  }

}
