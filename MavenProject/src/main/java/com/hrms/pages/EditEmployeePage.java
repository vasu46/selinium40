package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.util.Log4j;
import com.hrms.utility.BaseClass;

public class EditEmployeePage extends BaseClass {
//objects/elemebts
	static By btn_edit=By.xpath("//input[@name='EditMain'][@value='Edit']");
	static By edit_lastName=By.name("txtEmpLastName");
	static By edit_firstName=By.name("txtEmpFirstName");
	static By save_Edit=By.xpath("//input[@id='btnEditPers'][@title='Save']");
	static By btn_Back=By.xpath("//input[@value='Back']");
	
	//edit Method
	public static void edit(String firstName,String lastName) {
		driver.findElement(btn_edit).click();
		driver.findElement(edit_lastName).clear();
		driver.findElement(edit_firstName).clear();
		driver.findElement(edit_lastName).sendKeys(lastName);
		driver.findElement(edit_firstName).sendKeys(firstName);
		driver.findElement(save_Edit).click();
		driver.findElement(btn_Back).click();
		Reporter.log("Edit Employee is successfull");
		System.out.println("Edit employee is sucessfull");
		Log4j.info("Edit employee is SuccessFull");
       		
	}
}
