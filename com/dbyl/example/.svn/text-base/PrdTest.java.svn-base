package com.dbyl.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.dbyl.libarary.utils.PageExist;

public class PrdTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://zyd.onlyou.com/login.htm");
	  driver.findElement(By.name("username")).sendKeys("板板");
	  driver.findElement(By.name("password")).sendKeys("123456");
	  driver.findElement(By.className("btn-submit")).click();
	  PageExist pe = new PageExist();
	  pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
	  driver.findElement(By.linkText("新增")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).sendKeys("北京");
		driver.findElement(By.xpath("//td[contains(text(),'北京')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).click();
		//driver.findElement(By.xpath("//*[@name='serAddrCityName']")).sendKeys("北京"+Keys.ENTER);
		driver.findElement(By.id("serAddrCityNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'北京')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).click();
		//driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).sendKeys("东城区"+Keys.ENTER);
		driver.findElement(By.id("serAddrDistrictNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'东城区')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).click();
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).sendKeys("长安街");
		Thread.sleep(50000);	
		driver.quit();
  }
}
