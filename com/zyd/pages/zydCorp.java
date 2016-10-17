package com.zyd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * 业务管理-企业，页面功能
 */
public class zydCorp {
	/*
	 * 业务管理-企业，打开页面
	 */
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("业务管理","企业","toolbarPluginbiz1020Frame",driver); 		
	}
	
	/*
	 * 业务管理-企业，“查询”按钮
	 */
	public void Query(WebDriver driver){
		driver.findElement(By.id("queryDataId")).click();
	}	

	/*
	 * 业务管理-企业，“新增”按钮
	 */
	public void Add(WebDriver driver,String corpowner,String corpname,String corporg) throws InterruptedException{
		driver.findElement(By.id("aAdd")).click();
		driver.findElement(By.xpath("//*[@name='ownerName']")).click();
		driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(corpowner);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业名称']")).click();
		driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业名称']")).sendKeys(corpname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='corpCode']")).click();
		driver.findElement(By.xpath("//*[@name='corpCode']")).sendKeys("zjmcorp");
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
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).sendKeys("北京"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).sendKeys("北京"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).sendKeys("东城区"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).click();
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).sendKeys("长安街");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='orgName']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'"+corporg+"')][1]")).click();//"+strOrg+"
		Thread.sleep(5000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("queryDataId")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys(corpname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@clickaction='queryGirdData']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@clickaction='resetTableBtn']")).click();
		Thread.sleep(2000);
	}	
}
