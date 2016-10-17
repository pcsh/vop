package com.zyd.pages;

import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.QueryData;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * 业务管理-企业主，页面功能
 */
public class zydCorpOwner {
	/*
	 * 业务管理-企业主，打开页面
	 */
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("业务管理","企业主","toolbarPluginbiz1010Frame",driver); 		
	}
	
	/*
	 * 业务管理-企业主，“查询”按钮
	 */
	public void Query(WebDriver driver){
		driver.findElement(By.id("queryDataId")).click();
	}	
	
	/*
	 * 业务管理-企业主，查询数据库中企业主是否已经存在
	 */
	public Boolean QueryDatabaseCorpOwnerIsExist(String name,String Mobile,String Email,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		if(qd.UserExist(url,username,pwd,name,Mobile,Email)){
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	/*
	 * 业务管理-企业主，查询数据库中企业主是否已经存在
	 */
	public void DeleteCorpOwnerBySQL(String name,String Mobile,String Email,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		  String sql_vop ="delete from t_vop_ssm_user "
				  +"where name = '"+name+"' or mobile_phone_no ='"+Mobile+"' or email = '"+Email+"'";
		//  String sql_onlyou="delete from t_onlyou_user "
		//		  +"where name = '15880276011' or mobile_phone_no = '15880276011'";
	      qd.DeleteData(url,username,pwd, sql_vop);
	    //  qd.DeleteData("jdbc:postgresql://172.16.11.35:5432/onlyou_uat", "onlyou_uat", "onlyou_uat", sql_onlyou);

	}
	
	/*
	 * 业务管理-企业主，“新增”按钮
	 */
	public void Add(WebDriver driver,String name,String mobile,String email,String qq) throws InterruptedException, SQLException{
		driver.findElement(By.id("aAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name' and @placeholder='请输入唯一登录账号']")).click();
		driver.findElement(By.xpath("//input[@name='name' and @placeholder='请输入唯一登录账号']")).sendKeys(name);
		driver.findElement(By.name("mobilePhoneNo")).click();
		driver.findElement(By.name("mobilePhoneNo")).sendKeys(mobile);
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("qq")).click();
		driver.findElement(By.name("qq")).sendKeys(qq);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(2000);			
	}	

}
