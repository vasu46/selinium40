package com.nt.scripts;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nt.lib.General;

public class AddEmployee {
	public static General gen=new General();
	
	@BeforeClass
	public  void openApplication() {
		gen.openapplication();
		System.out.println("Application open before First Test Excecuted");
		Reporter.log("Application open before First Test Excecuted");
		gen.verifyTitel("orangehrm");
		Reporter.log("Title Is Verifed");
		
	  }
	@AfterClass
	public void closeApp() {
		gen.closeApplication();
		System.out.println("Application close ofter Class Last Method Is Exceuted::");
		Reporter.log("Application close ofter Class Last Method Is Exceuted::");
	}
	@BeforeMethod
	public void loginApp()throws Exception {
		gen.loginFuction();
		System.out.println("Login App is before Test Add Emp excecuted");
		Reporter.log("Login App is before Test Add Emp excecuted");
	}
	@AfterMethod
	public void logout() {
		gen.logout();
	  System.out.println("Application logout ofter the test exceutioj start");
	  Reporter.log("APPLICATION LOGOUT AFTER TEST METHOD IS EXECUTED:");
	}
	
	@Test
	public void addEmp() throws Exception{
		gen.verifyTitel("orange hrm");
		gen.addEmployee();
	    	System.out.println("APPLICATION ADD EMPLOYEE IS FIRST tEST");
	    	Reporter.log("Add Employee is executed");
	    gen.exeitFrame();
	}

}
