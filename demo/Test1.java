package demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static List findAllLinks(WebDriver driver)

	{

	List<WebElement> elementList = new ArrayList();

	elementList = driver.findElements(By.tagName("a"));

	elementList.addAll(driver.findElements(By.tagName("img")));

	List finalList = new ArrayList(); ;

	for (WebElement element : elementList)

	{

	if(element.getAttribute("href") != null)

	{

	finalList.add(element);

	} 

	} 

	return finalList;

	}

	public static String isLinkBroken(URL url) throws Exception

	{

	//url = new URL("http://yahoo.com");

	String response = "";

	HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	try

	{

	connection.connect();

	response = connection.getResponseMessage(); 

	connection.disconnect();

	return response;

	}

	catch(Exception exp)

	{

	return exp.getMessage();

	} 

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\3.00\\geckodriver-v0.11.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.onlyou.com.my");

		List<WebElement> allImages = findAllLinks(driver); 

		System.out.println("Total number of elements found " + allImages.size());

		for( WebElement element : allImages){

		try

		{

		System.out.println("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

		//System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

		}

		catch(Exception exp)

		{

		System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage()); 

		}

		}


	}

}
