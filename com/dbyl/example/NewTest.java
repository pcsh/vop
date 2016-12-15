package com.dbyl.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
	

	//@Test
	public void test2() throws InterruptedException{
		 WebDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.1diaocha.com/user/Register.aspx");
		  Thread.sleep(3000);
		  //Select sel = new Select(driver.findElement(By.id("ctl00_search1_ddlsurveysearch")));
		  //sel.selectByValue("depth");
		  //driver.findElement(By.id("ctl00_search1_ddlsurveysearch")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//select[@id='ctl00_search1_ddlsurveysearch']")).sendKeys("深度调查");//[contains(text(),'深度调查')]
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("ctl00_search1_txtsurveysearch")).sendKeys("test1000");
		
	}
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
		driver.get("https://test.rycaifu.com/portal/user/portalLogin.html");
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("登录")).click();
//		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver,10);
/*		wait.until(new ExpectedCondition<WebElement>(){
			@Override
			public WebElement apply(WebDriver d) {
				return driver.findElement(By.id("txtLoginAccount"));
			}
		}).click();*/
		driver.findElement(By.id("txtLoginAccount")).sendKeys("13120510001");//13120510001
		driver.findElement(By.id("txtLoginPwd")).sendKeys("a111111");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("我要借款")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
      WebElement webelement1 = driver.findElement(By.linkText("瑞源借款申请"));
      js1.executeScript("arguments[0].click();",webelement1);
      Thread.sleep(2000);
      driver.findElement(By.linkText("立即申请")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//p/input[3]")).sendKeys("1");
      Thread.sleep(2000);
      driver.findElement(By.id("btnViewShisuan")).click();
      //driver.findElement(By.id("SelectCattleType")).sendKeys("2-8月龄犊牛");
	
      Thread.sleep(2000);
/*
      
      driver.findElement(By.id("sbankcode")).sendKeys("中国农业银行");
      driver.findElement(By.id("bankaccountno")).sendKeys("6228220012050001");
      driver.findElement(By.id("branchbankname")).sendKeys("深圳分行南山支行");
      driver.findElement(By.xpath("//select[@id='loanKind']")).sendKeys("个人");

      Thread.sleep(2000);
      driver.findElement(By.id("tareaDayMsg")).click();
      driver.findElement(By.id("tareaDayMsg")).sendKeys("借款申请说明");*/

  }
}
