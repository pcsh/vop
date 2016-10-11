package com.zyd.pages;

import org.openqa.selenium.By;
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

}
