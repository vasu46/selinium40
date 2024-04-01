package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.util.Log4j;
import com.hrms.utility.BaseClass;

public class AddEmployeePage extends BaseClass{
	static By btn_AddEmp=By.xpath("//input[@value='Add']");
	static By txt_FirstName=By.name("txtEmpFirstName");
	static By txt_LastName=By.name("txtEmpLastName");
	static By txt_NickName=By.name("txtEmpNickName");
	static By txt_MiddleName=By.name("txtEmpMiddleName");
	static By btn_saveButton=By.xpath("//input[@id='btnEdit'][@value='Save']");

	 public static void AddEmp(String firstName,String lastName,String NickName,String middleName){
		driver.findElement(btn_AddEmp) .click();
		driver.findElement(txt_FirstName).sendKeys(firstName);
		driver.findElement(txt_LastName).sendKeys(lastName);
		driver.findElement(txt_NickName).sendKeys(NickName);
		driver.findElement(txt_MiddleName).sendKeys(middleName);
		driver.findElement(btn_saveButton).click();
		System.out.println("AddEmployee is Sucessfull");
	    Reporter.log("AddEmployee is SucessFull");
	    Log4j.info("AddEmployee is Sucessfull");
	 }
}
