package com.dbyl.libarary.utils;

import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.QueryData;
import com.dbyl.libarary.utils.zydPageExist;
import com.zyd.tests.zydEnvSet;

/*
 * 业务管理-企业主，页面功能
 */
public class zydUserDelete {

	

	

	public Boolean QueryDatabaseUserIsExist(String name,String Mobile,String Email,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		if(qd.UserExist(url,username,pwd,name,Mobile,Email)){
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public Boolean QueryDatabaseOnlyouUserIsExist(String name,String Mobile,String Email,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		if(qd.OnlyouUserExist(url,username,pwd,name,Mobile,Email)){
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public void DeleteVopUserBySQL(String name,String Mobile,String Email,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		  String sql_vop ="delete from t_vop_ssm_user "
				  +"where name = '"+name+"' or mobile_phone_no ='"+Mobile+"' or email = '"+Email+"'";
		//  String sql_onlyou="delete from t_onlyou_user "
		//		  +"where name = '15880276011' or mobile_phone_no = '15880276011'";
	      qd.DeleteData(url,username,pwd, sql_vop);
	    //  qd.DeleteData("jdbc:postgresql://172.16.11.35:5432/onlyou_uat", "onlyou_uat", "onlyou_uat", sql_onlyou);

	}
	
	public void DeleteOnlyouUserBySQL(String name,String Mobile,String Email,String union_id,String url,String username,String pwd) throws SQLException{
		QueryData qd = new 	QueryData();		
		  String sql_vop ="delete from t_onlyou_user "
				  +"where name = '"+name+"' or mobile_phone_no ='"+Mobile+"' or email = '"+Email+"'";
		//  String sql_onlyou="delete from t_onlyou_user "
		//		  +"where name = '15880276011' or mobile_phone_no = '15880276011'";
	      qd.DeleteData(url,username,pwd, sql_vop);
	    //  qd.DeleteData("jdbc:postgresql://172.16.11.35:5432/onlyou_uat", "onlyou_uat", "onlyou_uat", sql_onlyou);

	}
	
	public void DeleteUser(String name,
			String mobile,
			String email,
			String unionid,
			String vop_dburl,
			String vop_dbuser,
			String vop_dbpassword,
			String onlyou_dburl,
			String onlyou_dbuser,
			String onlyou_dbpassword) throws SQLException{
		  boolean isUserExistBeforeAdd = QueryDatabaseUserIsExist(name,mobile,email, unionid, vop_dburl, vop_dbuser, vop_dbpassword);
		  boolean isOnlyouUserExistBeforeAdd = QueryDatabaseOnlyouUserIsExist(name,mobile,email, unionid, onlyou_dburl, onlyou_dbuser, onlyou_dbpassword);
		  if(isUserExistBeforeAdd||isOnlyouUserExistBeforeAdd){
			  DeleteVopUserBySQL(name,mobile,email, unionid, vop_dburl, vop_dbuser, vop_dbpassword);
			  DeleteOnlyouUserBySQL(name,mobile,email, unionid, onlyou_dburl, onlyou_dbuser, onlyou_dbpassword);
		  }	
	}


}
