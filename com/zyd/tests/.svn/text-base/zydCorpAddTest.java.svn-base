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
	  zydCorp zc = new zydCorp();
	  zc.openPage(driver);
	  String corpowner = "autoowner";
	  String corpname = "autoqy";
	  String corporg = "onlyou4潘才胜注册的加盟商";
	  zc.Add(driver, corpowner, corpname, corporg);
	  Thread.sleep(5000);
	  
/*	  boolean isExistBeforeAdd = zco.QueryDatabaseCorpOwnerIsExist(name, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  if(isExistBeforeAdd){
		  zco.DeleteCorpOwnerBySQL(name, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	  }	  
	  zco.Add(driver, name, "18288889999", "18288889999@139.com", "18181818");	
	  boolean isExistAfterAdd = zco.QueryDatabaseCorpOwnerIsExist(name, "1", "jdbc:postgresql://172.16.11.35:5432/zyd_dev", "zyd_dev", "zyd_dev");
	 Assert.assertTrue(isExistAfterAdd);
	 */ 
	  
	  driver.quit();
  }

}
