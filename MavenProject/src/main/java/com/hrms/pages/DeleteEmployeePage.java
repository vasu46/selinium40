package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.util.Log4j;
import com.hrms.utility.BaseClass;

public class DeleteEmployeePage extends BaseClass{
	//objects/element
	static By txt_dropDownBox=By.name("loc_code");
	static By txt_searchBox=By.name("loc_name");
	static By btn_searchBox=By.xpath("//input[@value='Search']");
	static By cb_box=By.name("chkLocID[]");
	static By btn_delete=By.xpath("//input[@value='Delete']");
	
	//delete method
	public static void deleteEmp(String dropdownName,String empNo) {
		Select st=new Select (driver.findElement(txt_dropDownBox));
		st.selectByVisibleText(dropdownName);
		driver.findElement(txt_searchBox).sendKeys(empNo);
		driver.findElement(btn_searchBox).click();
		driver.findElement(cb_box).click();
		driver.findElement(btn_delete).click();
		Reporter.log("Employee is Deleted");
		System.out.println("Employee is Deleted");
		Log4j.info("Employee is Deleted");
		
	}

}
