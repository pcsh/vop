package com.zyd.pages;

import org.testng.annotations.Test;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;
import com.dbyl.libarary.utils.PageExist;
import com.dbyl.libarary.utils.Locator.ByType;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zydLoginPage extends BasePage{
  protected zydLoginPage(WebDriver driver) throws IOException {
		super(driver);
		driver.get("http://test.zyd.onlyou.com/login.htm");
		driver.manage().window().maximize();
	}
@SuppressWarnings("static-access")
@Test
  public static void LoginPage() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  zydLoginPage zlp = new zydLoginPage(driver);
	  zlp.getDriver();
	  zlp.waitForPageLoad();
	  Locator username = new Locator("username",10,ByType.name);
	  zlp.type(username,"pancs_qd");
	  Locator password = new Locator("password",10,ByType.name);
	  zlp.type(password,"111111");
	  Locator loginbutton = new Locator("btn-submit",10,ByType.className);
	  zlp.click(loginbutton);
	  Locator profile = new Locator("//div[@id='xsydCilck']");
	  Assert.assertTrue(zlp.isElementPresent(profile,20));
	  PageExist pe = new PageExist();
	  pe.PageExist("item-bdm","item-bdm10","toolbarPluginbdm10Frame",driver);
	  Locator org = new Locator("//span[@id='orgTree_1_span']");
	  String strOrg = zlp.getElement(org).getText();		  
	  System.out.println(strOrg);
	  Assert.assertEquals("归属于潘才胜的测试渠道A", strOrg);
	  driver.quit();
  }

}
