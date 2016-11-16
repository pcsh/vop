package com.zyd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.JsClickByXpath;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * "用户管理"
 */
public class zydRoleManage {
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("设置与参数","角色管理","toolbarPluginssm1030Frame",driver);	
		driver.findElement(By.id("queryRoleId"));
	}
	
	public void addRole(WebDriver driver,String rolename,String rolecode) throws InterruptedException{
		driver.findElement(By.xpath("//a[@clickaction='add']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys(rolename);
		driver.findElement(By.name("code")).click();
		driver.findElement(By.name("code")).sendKeys(rolecode);
		driver.findElement(By.xpath("//a[@clickaction='save']")).click();
		Thread.sleep(2000);
	}
	
	public void EditRole(WebDriver driver,String rolecode) throws InterruptedException{
		driver.findElement(By.id("queryRoleId")).click();
		driver.findElement(By.id("queryRoleId")).sendKeys(rolecode);
		driver.findElement(By.xpath("//a[@clickaction='search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("code")).click();
		driver.findElement(By.name("code")).clear();
		driver.findElement(By.name("code")).sendKeys("new"+rolecode);
		driver.findElement(By.xpath("//a[@clickaction='save']")).click();
		Thread.sleep(2000);
	}
	
	public void DeleteRole(WebDriver driver,String rolecode) throws InterruptedException{
		driver.findElement(By.id("queryRoleId")).click();
		driver.findElement(By.id("queryRoleId")).sendKeys(rolecode);
		driver.findElement(By.xpath("//a[@clickaction='search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@clickaction='del']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@i-id='ok']")).click();
		Thread.sleep(3000);
	}

}
