package com.zyd.pages;

import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.zydPageExist;

/*
 * "统计分析"-"收款统计"
 */
public class zydGatherStatistics {
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("统计分析","收款统计","toolbarPluginsta40Frame",driver);		
	}

}
