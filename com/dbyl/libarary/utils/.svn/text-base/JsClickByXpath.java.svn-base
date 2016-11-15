package com.dbyl.libarary.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsClickByXpath {

	public void JsClick(WebDriver driver,String selector)
	{
        JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement webelement = driver.findElement(By.xpath(selector));
		js.executeScript("arguments[0].click();",webelement);
	}
}
