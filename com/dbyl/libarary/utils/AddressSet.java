package com.dbyl.libarary.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressSet {

	public void setAddress(
			WebDriver driver,
			String province,
			String city,
			String district,
			String address
			) throws InterruptedException{
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).sendKeys(province);
		driver.findElement(By.xpath("//td[contains(text(),'"+province+"')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@name='serAddrCityName']")).click();
		//driver.findElement(By.xpath("//*[@name='serAddrCityName']")).sendKeys("北京"+Keys.ENTER);
		driver.findElement(By.id("serAddrCityNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'"+city+"')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).click();
		//driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).sendKeys("东城区"+Keys.ENTER);
		driver.findElement(By.id("serAddrDistrictNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'"+district+"')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).click();
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).sendKeys(address);
		Thread.sleep(1000);
	}
}
