package com.zyd.tests;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class zydOpenStatisticsPageTest {

	/*
	 * 验证：统计分析，九个页面都能正常打开
	 */
@Test
  public static void OpenPage() throws Exception {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setEnableNativeEvents(false);
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zydEnvSet zes = new zydEnvSet(); 
	  zlp.login(driver,zydEnvSet.loginurl_sit, zydEnvSet.loginuser_sit,zydEnvSet.loginpassword_sit);
/*	  zydCorpServiceStatistics zcss = new zydCorpServiceStatistics();
	  zcss.openPage(driver);
	  zydAccountCorpStatistics zacs = new zydAccountCorpStatistics();
	  zacs.openPage(driver);
	  zydCorpStatistics zcs = new zydCorpStatistics();
	  zcs.openPage(driver);*/
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
