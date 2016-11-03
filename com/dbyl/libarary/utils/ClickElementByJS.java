package com.dbyl.libarary.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickElementByJS {

	public void clickByxpath(WebDriver driver,String strxpath)
	{
        JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement webelement = driver.findElement(By.xpath(strxpath));
		js.executeScript("arguments[0].click();",webelement);
	}	

}
