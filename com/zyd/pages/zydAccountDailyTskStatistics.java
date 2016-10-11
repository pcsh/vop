package com.zyd.pages;

import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.zydPageExist;

/*
 * "统计分析"-"会计日常任务"
 */
public class zydAccountDailyTskStatistics {
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("统计分析","会计日常任务","toolbarPluginsta05Frame",driver);		
	}

}
