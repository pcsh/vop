package com.zyd.tests;

import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydOpenCorpPageTest {

/*
 * 验证：业务管理-企业，页面能够正常打开
 */
	
@Test
  public static void OpenPage() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);
	  zc.Query(driver);
	  driver.quit();
  }

}
