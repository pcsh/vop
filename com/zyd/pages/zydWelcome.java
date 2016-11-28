package com.zyd.pages;

import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.QueryData;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * 业务管理-企业主，页面功能
 */
public class zydWelcome {
	/*
	 * 工作台
	 */
	public void openPage(WebDriver driver) throws InterruptedException{
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);        
        driver.switchTo().frame("toolbarPluginwelcomeFrame");	 
	}
	
	public void buildaccount(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("SSMMENUpartnermyWorkbench0102000")).click();
		Thread.sleep(2000);
	}
	
	

}
