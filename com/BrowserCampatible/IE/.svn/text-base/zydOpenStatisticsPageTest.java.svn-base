package com.BrowserCampatible.IE;

import org.testng.annotations.Test;


import com.zyd.pages.zydAccountCorpStatistics;
import com.zyd.pages.zydAccountDailyTskStatistics;
import com.zyd.pages.zydAccountWorkStatistics;
import com.zyd.pages.zydCorpBillStatistics;
import com.zyd.pages.zydCorpDailyTskStatistics;
import com.zyd.pages.zydCorpServiceStatistics;
import com.zyd.pages.zydCorpStatistics;
import com.zyd.pages.zydGatherDetailStatistics;
import com.zyd.pages.zydGatherStatistics;
import com.zyd.pages.zydLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class zydOpenStatisticsPageTest {

	/*
	 * 验证：统计分析，九个页面都能正常打开
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
	  zydCorpServiceStatistics zcss = new zydCorpServiceStatistics();
	  zcss.openPage(driver);
	  zydCorpStatistics zcs = new zydCorpStatistics();
	  zcs.openPage(driver);
	  zydAccountCorpStatistics zacs = new zydAccountCorpStatistics();
	  zacs.openPage(driver);
	  zydAccountDailyTskStatistics zadts = new zydAccountDailyTskStatistics();
	  zadts.openPage(driver);
	  zydAccountWorkStatistics zaws = new zydAccountWorkStatistics();
	  zaws.openPage(driver);
	  zydCorpBillStatistics zcbs = new zydCorpBillStatistics();
	  zcbs.openPage(driver);
	  zydCorpDailyTskStatistics zcdts = new zydCorpDailyTskStatistics();
	  zcdts.openPage(driver);
	  zydGatherDetailStatistics zgds = new zydGatherDetailStatistics();
	  zgds.openPage(driver);
	  zydGatherStatistics zgs = new zydGatherStatistics();
	  zgs.openPage(driver);
	  driver.quit();
  }

}
