package com.zyd.tests;

import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydUserManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydUserAddTest {

/*
 * 验证：用户管理，页面能够正常打开
 */
	
@Test
  public static void AddUser() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydUserManage zum = new zydUserManage();
	  zum.openPage(driver);
	  String loginname = "zyd3_auto_user";
	  String staffname = "账益达自动化用户姓名";
	  zum.addUser(driver, loginname, staffname);
	  
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  driver.quit();
  }

}
