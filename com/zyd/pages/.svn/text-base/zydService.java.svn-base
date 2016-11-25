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
 * 业务管理-服务，页面功能
 */
public class zydService {
	/*
	 * 业务管理-服务，打开页面
	 */
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("客户与合同","服务","toolbarPluginbiz2020Frame",driver); 		
	}
	
	/*
	 * 业务管理-服务，“查询”按钮
	 */
	public void Query(WebDriver driver){
		driver.findElement(By.id("queryDataId")).click();
	}	

	/*
	 * 业务管理-服务，查询数据库中企业服务是否已经存在
	 */
	public Boolean QueryDatabaseOrderIsExist(String corpname,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		if(qd.OrderExist(url,username,pwd,corpname)){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * 业务管理-服务，“新增”按钮
	 * 新增代理记账服务
	 */
	public void AddAcc(WebDriver driver,String corpname) throws InterruptedException{
		driver.findElement(By.name("query")).clear();
		driver.findElement(By.name("query")).click();
		driver.findElement(By.name("query")).sendKeys(corpname);
		Thread.sleep(5000);
		driver.findElement(By.id("queryDataId")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("aAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='corpName']")).click();
		driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(corpname);
		Thread.sleep(2000);
		List<WebElement> allSpanTexts =
				driver.findElements(By.xpath("//span[contains(text(),'"+corpname+"')]"));
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement webelement1 = allSpanTexts.get(allSpanTexts.size()-1);//"+strOrg+",选择页面的最后一个对象
        js1.executeScript("arguments[0].click();",webelement1);			
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='全部产品']")).click();
		Thread.sleep(2000);
		List<WebElement> allproducts =
				driver.findElements(By.xpath("//td[contains(text(),'代理记账')]"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement webelement2 = allproducts.get(allproducts.size()-1);
		js2.executeScript("arguments[0].click();",webelement2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='startTime']")).sendKeys("2014-01-01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='freeNumber']")).clear();
		driver.findElement(By.xpath("//*[@name='freeNumber']")).click();
		driver.findElement(By.xpath("//*[@name='freeNumber']")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@clickaction='saveAddForm']")).click();
		Thread.sleep(2000);
	}	
	
	/*
	 * 新增代理注册任务
	 */
	public void AddReg(WebDriver driver,String corpname) throws InterruptedException{
		driver.findElement(By.name("query")).clear();
		driver.findElement(By.name("query")).click();
		driver.findElement(By.name("query")).sendKeys(corpname);
		Thread.sleep(5000);
		driver.findElement(By.id("queryDataId")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("aAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='corpName']")).click();
		driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(corpname);
		Thread.sleep(2000);
		//定位一组元素
		List<WebElement> allSpanTexts =
				driver.findElements(By.xpath("//td[contains(text(),'"+corpname+"')]"));
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement webelement1 = allSpanTexts.get(allSpanTexts.size()-1);//"+strOrg+",选择页面的最后一个对象
        js1.executeScript("arguments[0].click();",webelement1);			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='全部产品']")).click();
		Thread.sleep(2000);
		List<WebElement> allproducts =
				driver.findElements(By.xpath("//td[contains(text(),'代理注册')]"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement webelement2 = allproducts.get(allproducts.size()-1);
		js2.executeScript("arguments[0].click();",webelement2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@clickaction='saveAddForm']")).click();
		Thread.sleep(2000);
	}	
	
	/*从数据库删除对应的企业，合同，服务，任务
	 * delete from t_vop_tsk_reg_task  where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from t_vop_tsk_daily_work  where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from t_vop_tsk_gl_task where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from t_vop_svr_service where  corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy')
	 * delete from t_vop_ord_order where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from  t_vop_cor_corp where name = 'autoqy'
	 * delete from t_vop_amt_pay_plan_detail where service_id in (select id from t_vop_svr_service where  corp_id in ());
	 * delete from t_vop_amt_pay_plan where  corp_id in();
	 * 业务管理-合同，从数据库中删除企业
	 */
	public void DeleteServiceBySQL(String name,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		  String sql_vop_tsk1 ="delete from t_vop_tsk_reg_task  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk1);
		  String sql_vop_tsk2 ="delete from t_vop_tsk_daily_work  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk2);
		  String sql_vop_tsk3 ="delete from t_vop_tsk_gl_task  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk3);
		  String sql_vop_tsk7 ="delete from t_vop_amt_pay_plan  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk7);
		  String sql_vop_tsk8 ="delete from t_vop_amt_pay_plan_detail where service_id in (select id from t_vop_svr_service where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"'))";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk8);
		  String sql_vop_tsk4 ="delete from t_vop_svr_service  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk4);     
	}
}
