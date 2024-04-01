package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.util.Log4j;

public class BaseClass {
	//drievr reference for whole app
	public static  WebDriver driver;
	
	//open Application
	public static void openApplication() {
		driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("OpenApplication");
		System.out.println("OpenApplication");
		Log4j.info("Application is open");
	  }
	//close the App
	public static void closeApplication() {
		driver.close();
		Reporter.log("Close the application");
		Log4j.info("Application is Close");
	}
	public static void waitStmt()throws Exception {
		Thread.sleep(2000);
		Log4j.info("Wait stmt is excecuted");
	}

}
