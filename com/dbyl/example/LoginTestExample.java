package com.dbyl.example;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;
import com.dbyl.libarary.utils.Locator.ByType;
import com.dbyl.libarary.utils.UITest;



public class LoginTestExample extends BasePage {
  protected LoginTestExample(WebDriver driver) throws IOException {
		super(driver);
		driver.get("http://test.zyd.onlyou.com/login.htm");
		driver.manage().window().maximize();
	}

  Locator loginEmailInputBox = new Locator(locatorMap[4][1],10,ByType.name);  
  Locator loginPasswordInputBox = new Locator(locatorMap[7][1],10,ByType.name);
  Locator loginButton = new Locator(locatorMap[5][1],10,ByType.className);
  Locator profile = new Locator(locatorMap[6][1]);//after login find information
  
  public void typeEmailInputBox(String username) throws Exception{
	  System.out.println("username is ...");
	  type(loginEmailInputBox,username);
  }
  
  public void typePasswordInputBox(String password) throws Exception{
	  type(loginPasswordInputBox,password);	  
  }
  
  public void clickOnLoginButton() throws Exception{
	  click(loginButton);
  }
  
  public boolean isPrestentProfile() throws Exception{
	  return isElementPresent(profile,20);
  }
  
  public void waitForPageLoad(){
	  super.getDriver().manage().timeouts()
	  .pageLoadTimeout(90, TimeUnit.SECONDS);
  }
  
@Test
  public static void loginTestVop() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  LoginTestExample lte =new LoginTestExample(driver);
	  lte.getDriver();
	  lte.waitForPageLoad();
	  lte.typeEmailInputBox("pancs_owner");
	  lte.typePasswordInputBox("123456");
	  lte.clickOnLoginButton();
	  Assert.assertTrue(lte.isPrestentProfile());        
	  driver.quit();
	  
	  
  }
}
