package com.zyd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zyd.pages.zydCorp;
import com.zyd.pages.zydCorpOwner;
import com.zyd.pages.zydLoginPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zydCorpAddTest {

/*
 * 验证：业务管理-企业主，新增企业成功
 */
@Test
  public static void CorpAdd() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage();
	  zlp.login(driver, "http://172.16.6.151:9091/", "pancs_qd", "111111");
	  zydCorpOwner zco = new zydCorpOwner();
	  zco.openPage(driver);
	  String corpowner = "autoowner";
	  String Mobile = "18288889999";
	  String Email = "18288889999@139.com";
	  boolean isUserExistBeforeAdd = zco.QueryDatabaseCorpOwnerIsExist(corpowner,Mobile, Email, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  if(isUserExistBeforeAdd){
		  zco.DeleteCorpOwnerBySQL(corpowner,Mobile, Email, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  }	 
	  zco.Add(driver, corpowner, Mobile, Email, "18181818");
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);	 
	  String corpname = "autoqy";
	  String corporg = "onlyou4潘才胜注册的加盟商";
	  boolean isCorpExistBeforeAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  if(isCorpExistBeforeAdd){
		  zc.DeleteCorpBySQL(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  }	
	  zc.DeleteCorpBySQL(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  zc.Add(driver, corpowner, corpname, corporg);
	  Thread.sleep(5000);
	  boolean isCorpExistAfterAdd = zc.QueryDatabaseCorpIsExist(corpname, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  Assert.assertTrue(isCorpExistAfterAdd);  
	  driver.quit();
  }

}
