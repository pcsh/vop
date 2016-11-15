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
public class zydCorp {
	/*
	 * 业务管理-企业，打开页面
	 */
	@SuppressWarnings("static-access")
	public void openPage(WebDriver driver) throws InterruptedException{
		zydPageExist zydpe = new zydPageExist();
		zydpe.PageExist("客户与合同","企业","toolbarPluginbiz1020Frame",driver); 		
	}
	
	/*
	 * 业务管理-企业，“查询”按钮
	 */
	public void Query(WebDriver driver){
		driver.findElement(By.id("queryDataId")).click();
	}	

	/*
	 * 业务管理-企业主，查询数据库中企业主是否已经存在
	 */
	public Boolean QueryDatabaseCorpIsExist(String corpname,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		if(qd.CorpExist(url,username,pwd,corpname)){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * 业务管理-企业，“新增”按钮
	 */
	public void Add(WebDriver driver,String corpowner,String corpname,String corporg) throws InterruptedException{
		driver.findElement(By.id("aAdd")).click();
		driver.findElement(By.xpath("//*[@name='ownerName']")).click();
		driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(corpowner);
		Thread.sleep(1000);
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
		WebElement webelement6 = driver.findElement(By.xpath("//td[contains(text(),'"+corpowner+"')]"));
		js6.executeScript("arguments[0].click();",webelement6);
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
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).sendKeys("北京");
		driver.findElement(By.xpath("//td[contains(text(),'北京')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).sendKeys("北京"+Keys.ENTER);
		//driver.findElement(By.id("serAddrCityNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'北京')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).sendKeys("东城区"+Keys.ENTER);
		//driver.findElement(By.id("serAddrDistrictNameTextDataGrid")).findElement(By.xpath("//td[contains(text(),'东城区')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).click();
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).sendKeys("长安街");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='orgName']")).click();
		Thread.sleep(3000);
		//定位一组元素
		@SuppressWarnings("unchecked")
		List<WebElement> allSpanTexts =
				driver.findElements(By.xpath("//span[contains(text(),'"+corporg+"')]"));
		//System.out.printf("%d\n", allSpanTexts.size());
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement webelement1 = allSpanTexts.get(allSpanTexts.size()-1);//"+strOrg+",选择页面的最后一个对象
        js1.executeScript("arguments[0].click();",webelement1);		
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
//		driver.findElement(By.xpath("//button[@clickaction='resetTableBtn']")).click();
//		Thread.sleep(2000);
	}	
	
	public void CorpBasicInfoEdit(
			WebDriver driver,
			String corpname,
			String corpShortName,
			String corpCode,
			String contact) throws InterruptedException{
		driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("queryDataId")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys(corpname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@clickaction='queryGirdData']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("企业信息")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("toolbarPlugincor301Frame");
		driver.findElement(By.xpath("//a[contains(text(),'联系信息')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("corpShortName")).clear();
		driver.findElement(By.name("corpShortName")).click();
		driver.findElement(By.name("corpShortName")).sendKeys(corpShortName);
		Thread.sleep(1000);
		driver.findElement(By.name("corpCode")).clear();
		driver.findElement(By.name("corpCode")).click();
		driver.findElement(By.name("corpCode")).sendKeys(corpCode);
		Thread.sleep(1000);
		driver.findElement(By.name("contact")).clear();
		driver.findElement(By.name("contact")).click();
		driver.findElement(By.name("contact")).sendKeys(contact);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@onclick='pageObj.stagingBtn(0)']")).click();
		Thread.sleep(1000);				
		
	}
	
	/*从数据库删除对应的企业，合同，服务，任务
	 * delete from t_vop_tsk_reg_task  where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from t_vop_tsk_daily_work  where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from t_vop_tsk_gl_task where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from t_vop_svr_service where  corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy')
	 * delete from t_vop_ord_order where corp_id in (select corp.id from t_vop_cor_corp as corp where corp.name = 'autoqy') 
	 * delete from  t_vop_cor_corp where name = 'autoqy'
	 * 业务管理-企业，从数据库中删除企业
	 */
	public void DeleteCorpBySQL(String name,String union_id,String url,String username,String pwd) throws SQLException{
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
		  String sql_vop_tsk4 ="delete from t_vop_svr_service  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk4);
		  String sql_vop_tsk5 ="delete from t_vop_ord_order  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk5);
		  String sql_vop_tsk6 ="delete from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"'";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk6);
		  String sql_vop_tsk7 ="delete from t_vop_amt_pay_plan  where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"')";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk7);
		  String sql_vop_tsk8 ="delete from t_vop_amt_pay_plan_detail where service_id in (select id from t_vop_svr_service where corp_id in (select corp.id from t_vop_cor_corp as corp  "
				  +"where corp.name = '"+name+"'))";
	      qd.DeleteData(url,username,pwd, sql_vop_tsk8);
	      
	}
}
