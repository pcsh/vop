package com.zyd.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.zydPageExist;
import com.zyd.pages.zydLoginPage;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zydLoginPageTestA extends BasePage{
  protected zydLoginPageTestA(WebDriver driver) throws IOException {
		super(driver);

	}
@SuppressWarnings("static-access")
@Test
  public static void LoginPage() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
	  zydPageExist zydpe = new zydPageExist();
	  zydpe.PageExist("业务管理","企业","toolbarPluginbiz1020Frame",driver);
      driver.findElement(By.id("queryDataId")).click();
      Thread.sleep(5000);
	  driver.quit();
  }

}
