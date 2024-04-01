package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.util.Log4j;
import com.hrms.utility.BaseClass;

public class LogingPage extends BaseClass {
	//objects/elemets data
	static By txt_userName=By.name("txtUserName");
	static By txt_password=By.name("txtPassword");
	static By btn_login=By.name("Submit");
	
	//Login Application
	public static void loginApp(String userName,String password) {
		driver.findElement(txt_userName).sendKeys(userName);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		Reporter.log("Application is Login");
		System.out.println("Appliaction is Login");
		Log4j.info("Application is Login");
	   }
	

}
