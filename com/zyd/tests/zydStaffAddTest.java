package com.zyd.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.utils.zydUserDelete;
import com.zyd.pages.zydCorp;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydStaff;
import com.zyd.pages.zydUserManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydStaffAddTest {

/*
 * 验证：用户管理，页面能够正常打开
 */
	
@Test
  public static void AddStaff() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydStaff zs = new zydStaff();
	  zs.openPage(driver);
	  String staffname = "自动化用户auto姓名";
	  String staffcode = "autocode";
	  zs.addStaff(driver, staffcode, staffname);
	  Thread.sleep(3000);
	  driver.quit();
  }

}
