package com.zyd.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.utils.zydUserDelete;
import com.zyd.pages.zydCorp;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydUserManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydUserDeleteTest {

/*
 * 验证：用户管理，编辑用户信息
 */
	
@Test
  public static void DeleteUser() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydUserManage zum = new zydUserManage();
	  zum.openPage(driver);
	  String loginname = "zyd3_auto_user";
	  zum.DeleteUser(driver, loginname);
	  zlp.loginout(driver);
	  driver.quit();
  }

}
