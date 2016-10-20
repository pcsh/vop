package com.BrowserCampatible.chrome;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydCorpOwner;
import com.zyd.pages.zydLoginPage;
import com.zyd.pages.zydOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zydOrderAddTest {

/*
 * 验证：业务管理-合同，新增合同成功
 */
@Test
  public static void OrderAdd() throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumS\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("-test-type");
	  option.addArguments("-start-maximized");
	  WebDriver driver = new ChromeDriver(option);  
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
	  zydCorpOwner zco = new zydCorpOwner();
	  zco.openPage(driver);
	  String corpowner = "qyownertest";
	  String Mobile = "18211119999";
	  String Email = "18211119999@139.com";
	  boolean isUserExistBeforeAdd = zco.QueryDatabaseCorpOwnerIsExist(corpowner,Mobile, Email, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  if(isUserExistBeforeAdd){
		  zco.DeleteCorpOwnerBySQL(corpowner,Mobile, Email, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  }	 
	  zco.Add(driver, corpowner, Mobile, Email, "18181818");
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);	 
	  String corpname = "有合同的企业qy";
	  String corporg = "onlyou4潘才胜注册的加盟商";
	  boolean isCorpExistBeforeAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  if(isCorpExistBeforeAdd){
		  zc.DeleteCorpBySQL(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  }	
	  //zc.DeleteCorpBySQL(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  zc.Add(driver, corpowner, corpname, corporg);
	  Thread.sleep(5000);
	  boolean isCorpExistAfterAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  Assert.assertTrue(isCorpExistAfterAdd);  
	  zydOrder zo = new zydOrder();
	  zo.openPage(driver);
	  zo.Query(driver);
	  boolean isOrderExistBeforAdd = zo.QueryDatabaseOrderIsExist(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  if(isOrderExistBeforAdd)
	  {
		  zo.DeleteOrderBySQL(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  }
	  zo.Add(driver, corpname);
	  boolean isOrderExistAfterAdd = zo.QueryDatabaseOrderIsExist(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  Assert.assertTrue(isOrderExistAfterAdd);
	  driver.quit();
  }

}
