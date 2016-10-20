package com.BrowserCampatible.IE;

import org.testng.annotations.Test;

import com.zyd.pages.zydLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class zydLoginPageTestA {

/*
 * 验证：登录页面，用户名和密码正确可以正常登录
 */
@Test
  public static void LoginPage() throws Exception {
    System.setProperty("webdriver.ie.driver", 
	"E:\\seleniumS\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");//IEDriverServer.exe PATH
DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
WebDriver driver = new InternetExplorerDriver(ieCapabilities);
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
	  driver.quit();
  }

}
