package com.dbyl.libarary.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class zydPageExist {
	     public static void PageExist(String str1,String str2,String str3,WebDriver driver) throws InterruptedException{
	             
	    	        Thread.sleep(1000);
	    	        driver.navigate().refresh();
	                Thread.sleep(1000);
	    	        driver.switchTo().defaultContent();
	                Thread.sleep(1000);            
	                Actions builder1 = new Actions(driver);
	                WebElement nav1 = driver.findElement(By.linkText(str1));
	                //Thread.sleep(1000); 
	                if(nav1.isDisplayed()){
	                	//Thread.sleep(1000); 
	                    builder1.moveToElement(nav1).build().perform();
	                }
	                //Thread.sleep(1000); 
	                JavascriptExecutor js1 = (JavascriptExecutor) driver;
	                //Thread.sleep(1000); 
	                WebElement webelement1 = driver.findElement(By.linkText(str2));
	                js1.executeScript("arguments[0].click();",webelement1);
	                Thread.sleep(1000);    
	                driver.switchTo().frame(str3);	                
	      } 
}
