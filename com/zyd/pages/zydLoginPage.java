package com.zyd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class zydLoginPage {
	public void login(WebDriver driver,String url,String username,String password) throws InterruptedException{
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.name("userName")).click();
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).click();
	  driver.findElement(By.name("password")).sendKeys(password);
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("立即登录")).click();
	  Thread.sleep(1000);
	}
}
