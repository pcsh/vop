package com.BrowserCampatible.IE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zyd.pages.zydCorpOwner;
import com.zyd.pages.zydLoginPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class zydCorpOwnerPageTest {

/*
 * 验证：业务管理-企业主，新增企业主成功
 */
@Test
  public static void CorpOwnerPage() throws Exception {
    System.setProperty("webdriver.ie.driver", 
	"E:\\seleniumS\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");//IEDriverServer.exe PATH
DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
WebDriver driver = new InternetExplorerDriver(ieCapabilities);
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
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
