package com.datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws IOException, InterruptedException {
	  ExcelUtils.setExcelFile(Constant.Path_TestDate+Constant.File_TestDate, "Sheet1");
	  for(int i=1;i<=3;i++){
	  String sUserName = ExcelUtils.getCellData(i,1);
	  String sPassword = ExcelUtils.getCellData(i,2);	  
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  System.out.println(sPassword);
	  driver.get(Constant.URL);
	  driver.findElement(By.name("username")).sendKeys(sUserName);
	  driver.findElement(By.name("password")).sendKeys(sPassword);
	  driver.findElement(By.className("btn-submit")).click();
	  Thread.sleep(5000);
	  try{
	  driver.findElement(By.xpath("//img[@src='assets/images/logo-7.2.png']"));
	  ExcelUtils.setCellData("Pass", i,3);
	  }catch(org.openqa.selenium.NoSuchElementException ex){
		  ExcelUtils.setCellData("Fail", i,3);
	  }
	  driver.quit();
	  }
	  }

}
