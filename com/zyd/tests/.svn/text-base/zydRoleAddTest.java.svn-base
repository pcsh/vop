package com.zyd.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.utils.zydUserDelete;
import com.zyd.pages.zydCorp;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydRoleManage;
import com.zyd.pages.zydStaff;
import com.zyd.pages.zydUserManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydRoleAddTest {

/*
 * 验证：用户管理，页面能够正常打开
 */
	
@Test
  public static void AddRole() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
	  zydRoleManage zrm = new zydRoleManage();
	  zrm.openPage(driver);
	  String rolename = "自动化roleauto姓名";
	  String rolecode = "rolecode";
	  zrm.addRole(driver, rolename, rolecode);
	  Thread.sleep(3000);
	  driver.quit();
  }

}
