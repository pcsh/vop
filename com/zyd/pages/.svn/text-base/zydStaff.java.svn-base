package com.zyd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.JsClickByXpath;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * "用户管理"
 */
public class zydStaff {
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("设置与参数","员工档案","toolbarPluginbdm20Frame",driver);	
		driver.findElement(By.name("query"));
	}
	
	public void addStaff(WebDriver driver,String staffcode,String staffname) throws InterruptedException{
		driver.findElement(By.xpath("//button[@clickaction='add']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("staffCode")).click();
		driver.findElement(By.name("staffCode")).sendKeys(staffcode);
		driver.findElement(By.name("staffName")).click();
		driver.findElement(By.name("staffName")).sendKeys(staffname);
		driver.findElement(By.xpath("//button[@clickaction='save']")).click();
		Thread.sleep(2000);
	}
	
	public void EditStaff(WebDriver driver,String staffcode) throws InterruptedException{
		driver.findElement(By.name("query")).click();
		driver.findElement(By.name("query")).sendKeys(staffcode);
		driver.findElement(By.xpath("//button[@clickaction='search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("编辑")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("staffCode")).click();
		driver.findElement(By.name("staffCode")).clear();
		driver.findElement(By.name("staffCode")).sendKeys("new"+staffcode);
		driver.findElement(By.xpath("//button[@clickaction='update']")).click();
		Thread.sleep(2000);
	}
	
	public void DeleteStaff(WebDriver driver,String staffcode) throws InterruptedException{
		driver.findElement(By.name("query")).click();
		driver.findElement(By.name("query")).sendKeys(staffcode);
		driver.findElement(By.xpath("//button[@clickaction='search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("删除")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@i-id='ok']")).click();
		Thread.sleep(3000);
	}

}
