package com.zyd.tests;

import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydPartnerInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zydOpenPartnerInfoPageTest {

/*
 * 验证：渠道管理-基础信息维护，页面能够正常打开，并获取到渠道名称
 */
	
@Test
  public static void OpenPage() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
	  zydPartnerInfo zpi = new zydPartnerInfo();
	  zpi.openPage(driver);
	  String partname;
	  partname = zpi.QueryPartnerName(driver);
	  System.out.println(partname);
	  driver.quit();
  }

}
