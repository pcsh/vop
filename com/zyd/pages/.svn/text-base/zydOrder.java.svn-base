package com.zyd.pages;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dbyl.libarary.utils.QueryData;
import com.dbyl.libarary.utils.zydPageExist;

/*
 * 业务管理-合同，页面功能
 */
public class zydOrder {
	/*
	 * 业务管理-合同，打开页面
	 */
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("业务管理","合同","toolbarPluginbiz2010Frame",driver); 		
	}
	
	/*
	 * 业务管理-合同，“查询”按钮
	 */
	public void Query(WebDriver driver){
		driver.findElement(By.id("queryDataId")).click();
	}	

	/*
	 * 业务管理-合同，查询数据库中企业主是否已经存在
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
	 * 业务管理-合同，“新增”按钮
	 */
	public void Add(WebDriver driver,String corpname) throws InterruptedException{
		driver.findElement(By.id("aAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='corpName']")).click();
		driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(corpname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@name='empName']")).click();
//		driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓11");
//		driver.findElement(By.xpath("//*[@name='empName']")).clear();				
//		driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓");
//		Thread.sleep(2000);
		driver.findElement(By.name("customerOrderNum")).click();
		driver.findElement(By.name("customerOrderNum")).sendKeys("CUSORD00001");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@name='empName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);			
		driver.findElement(By.xpath("//button[@clickaction='step1']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='btnjqg1']/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='jqg1']/td[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_productName']")).click();//sendKeys("代理记账");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'代理记账')]")).click();//sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='jqg1']/td[6]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='jqg3']/td[6]")).clear();
		driver.findElement(By.xpath("//*[@id='1_buyNumber']")).clear();
		driver.findElement(By.xpath("//*[@id='1_buyNumber']")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='jqg1']/td[9]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='jqg3']/td[6]")).clear();
		driver.findElement(By.xpath("//*[@id='1_referencePrice']")).clear();
		driver.findElement(By.xpath("//*[@id='1_referencePrice']")).sendKeys("500");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='1_buyNumber']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='jqg1']/td[15]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='jqg3']/td[14]")).clear();
		driver.findElement(By.xpath("//*[@id='1_planStartTime']")).sendKeys("2015-01-01");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='jqg3']/td[14]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='jqg1']/td[16]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='jqg3']/td[15]")).clear();
		driver.findElement(By.xpath("//*[@id='1_firstPayDate']")).sendKeys("2015-01-01");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='jqg3']/td[15]")).sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@clickaction='step2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@clickaction='step3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@clickaction='step4']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@clickaction='finishCreateOrder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("searchText")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("queryDataId")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("searchText")).click();
		driver.findElement(By.name("searchText")).sendKeys(corpname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@clickaction='queryOrderGrid']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@clickaction='resetOrderSearchForm']")).click();
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
	public void DeleteOrderBySQL(String name,String union_id,String url,String username,String pwd) throws SQLException{
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
		  String sql_vop_tsk5 ="delete from t_vop_ord_order  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk5);	      
	}
}
