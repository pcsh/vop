package com.zyd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.JsClickByXpath;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * "用户管理"
 */
public class zydUserManage {
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("设置与参数","用户管理","toolbarPluginssm1010Frame",driver);	
		driver.findElement(By.id("queryUserId"));
	}
	
	public void addUser(WebDriver driver,String loginname,String staffname) throws InterruptedException{
		driver.findElement(By.xpath("//a[@clickaction='add']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys(loginname);
		driver.findElement(By.name("staffName")).click();
		driver.findElement(By.name("staffName")).sendKeys(staffname);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.name("orgName")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[6]/div/ul/li/span[2]")).click();
		driver.findElement(By.id("name")).click();
		driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/form//ul/li[7]/div/div/label[1]/i")).click();
		driver.findElement(By.xpath("//a[@clickaction='save']")).click();
		Thread.sleep(2000);
	}

}
