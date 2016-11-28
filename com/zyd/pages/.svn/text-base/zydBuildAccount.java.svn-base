package com.zyd.pages;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dbyl.libarary.utils.QueryData;
import com.dbyl.libarary.utils.SwitchBrowserTab;
import com.dbyl.libarary.utils.zydPageExist;

public class zydBuildAccount {
	/*
	 * 建账
	 */
	public void openPage(WebDriver driver) throws InterruptedException{
        driver.switchTo().defaultContent();
        Thread.sleep(1000);        
        driver.switchTo().frame("toolbarPluginwk_jzFrame");			
	}
	
	public String AddCorp(WebDriver driver,String corpname,String corporg) throws InterruptedException{
		Thread.sleep(2000);
   		driver.findElement(By.xpath("//*[@name='name']")).click();
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys(corpname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contact']")).click();
		driver.findElement(By.xpath("//*[@name='contact']")).sendKeys("pancs");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contactPhone']")).click();
		driver.findElement(By.xpath("//*[@name='contactPhone']")).sendKeys("15880276011");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contactFixedTelephone']")).click();
		driver.findElement(By.xpath("//*[@name='contactFixedTelephone']")).sendKeys("0592-6336308");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contactEmail']")).click();
		driver.findElement(By.xpath("//*[@name='contactEmail']")).sendKeys("6336308@139.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).sendKeys("北京");
		driver.findElement(By.xpath("//td[contains(text(),'北京')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).sendKeys("北京"+Keys.ENTER);
		//driver.findElement(By.id("serAddrCityNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'北京')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).sendKeys("东城区"+Keys.ENTER);
		//driver.findElement(By.id("serAddrDistrictNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'东城区')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).click();
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).sendKeys("长安街");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='orgName']")).click();
		Thread.sleep(3000);
		//定位一组元素
		@SuppressWarnings("unchecked")
		List<WebElement> allSpanTexts =
				driver.findElements(By.xpath("//span[contains(text(),'"+corporg+"')]"));
		//System.out.printf("%d\n", allSpanTexts.size());
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement webelement1 = allSpanTexts.get(allSpanTexts.size()-1);//"+strOrg+",选择页面的最后一个对象
        js1.executeScript("arguments[0].click();",webelement1);		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@clickaction='saveCorpInfo']")).click();
		Thread.sleep(5000);
		String currentWindow = driver.getWindowHandle(); 
		driver.findElement(By.xpath("//button[@i-id='继续建账']")).click();
		Thread.sleep(3000);
		return currentWindow;
	}	
	
	public void BuildAccount(WebDriver driver,String currentWindow) throws InterruptedException{
		SwitchBrowserTab sbt = new SwitchBrowserTab();
		sbt.SwitchTab(driver, currentWindow);
		zydPageExist zpe = new zydPageExist();
		zpe.PageExist("建账", "启用账套", "toolbarPluginsetting_612Frame", driver);
		Thread.sleep(3000);
		driver.findElement(By.id("setAcctBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@i-id='ok']")).click();
		Thread.sleep(5000);
	}
	
}
