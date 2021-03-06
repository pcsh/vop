package com.zyd.pages;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dbyl.libarary.utils.QueryData;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * 业务管理-企业，页面功能
 */
public class zydPartnerInfo {
	/*
	 * 渠道管理-基础信息维护，打开页面
	 */
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("设置与参数","基础信息","toolbarPluginpnm10Frame",driver); 		
	}
	
	/*
	 * 渠道管理-基础信息维护，“查询渠道名称”
	 * 通过JS方式获取input属性里面的值
	 * document.getElementById获取ID唯一的那个值
	 * document.getElementsByName获取name值一样的那一组值，[0]获取第一个值
	 */
	public String QueryPartnerName(WebDriver driver){
		String partnername = (String)((JavascriptExecutor)driver).executeScript("return document.getElementsByName('name')[0].value");
		return partnername;		
	}


}
