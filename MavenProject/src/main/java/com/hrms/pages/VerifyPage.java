package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.util.Log4j;
import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass{
	
	//getTittle
	public static void verifyTittle(String title) {
		if(driver.getTitle().equals(title)) {
			Reporter.log("Tittle is Verified::");
			System.out.println("Tittle is Verified:;");
			Log4j.info("Tittle Is Verified");
		}
		else {
			Reporter.log("Tittle is not matched::");
			System.out.println("Tittle is not Matched:;");
			Reporter.log(driver.getTitle());
			System.out.println(driver.getTitle());
			Log4j.info("Tittle is verified");
		}
		
	}
	

}
