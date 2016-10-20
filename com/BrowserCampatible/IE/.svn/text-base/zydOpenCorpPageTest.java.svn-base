package com.BrowserCampatible.IE;

import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class zydOpenCorpPageTest {

/*
 * 验证：业务管理-企业，页面能够正常打开
 */
	
@Test
  public static void OpenPage() throws Exception {
    System.setProperty("webdriver.ie.driver", 
	"E:\\seleniumS\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");//IEDriverServer.exe PATH
DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
WebDriver driver = new InternetExplorerDriver(ieCapabilities);
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);
	  zc.Query(driver);
	  driver.quit();
  }

}
