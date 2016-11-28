package com.dbyl.libarary.utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchBrowserTab {
	
	public void SwitchTab(WebDriver driver,String currentWindow){
	// 得到当前窗口的句柄
    //String currentWindow = driver.getWindowHandle();  
    // 得到所有窗口的句柄  
    Set<String> handles = driver.getWindowHandles();  
    Iterator<String> it = handles.iterator();        //创建一个对象实现存放主页面句柄 
    String preWindowString = currentWindow;         
    while (it.hasNext())         {  
        String cruWindowString = it.next(); 
        System.out.println("next = " + cruWindowString);            
        if (currentWindow == cruWindowString) {                  
            continue;  
        }  
        WebDriver window = driver.switchTo().window(cruWindowString); 
    } 
    System.out.println("url1 = " + driver.getCurrentUrl());  				 
    driver.close();
    WebDriver window = driver.switchTo().window(preWindowString); 
    //driver.navigate().to(url0);
    System.out.println(driver.getCurrentUrl());	
	}
}
