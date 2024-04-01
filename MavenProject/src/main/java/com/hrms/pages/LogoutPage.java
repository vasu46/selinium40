package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.util.Log4j;
import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass {
	//objecta/element
	static By link_logout=By.linkText("Logout");
	
	//Methods
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("Application is Logout::");
		System.out.println("Application Logout");
		Log4j.info("Logout is Succesfull");
	}

}
