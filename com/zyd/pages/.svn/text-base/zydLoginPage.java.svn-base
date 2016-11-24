package com.zyd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class zydLoginPage {
	public void login(WebDriver driver,String url,String username,String password) throws InterruptedException{
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.name("username")).click();
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).click();
	  driver.findElement(By.name("password")).sendKeys(password);
	  Thread.sleep(1000);
	  driver.findElement(By.className("btn-submit")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.className("step1")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.className("step2")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.className("step3")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.className("step4")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.className("step5")).click();
	  
	}
	
	public void loginout(WebDriver driver) throws InterruptedException{
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div/ul/li/span")).click();
		driver.findElement(By.xpath("//a[@id='loginOut']")).click();
		Thread.sleep(3000);
	}
}
