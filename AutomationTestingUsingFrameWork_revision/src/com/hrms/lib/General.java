package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class General extends Global {
	public void openApplication() {
		driver=new ChromeDriver();
		System.out.println("Chrome Driver is Open");
		driver.navigate().to(url);
		System.out.println("Url Is Entered");
		System.out.println("Application is  open");	
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application is Closed");
	}
	public void verifyTitle(String title) {
		if(driver.getTitle().equals(title)) {
			System.out.println("the Title is matched");
		}
		else {
			System.out.println("Title is not matched");
			System.out.println(driver.getTitle());
		}
	}
	public void login_App() {
		driver.findElement(By.name(txt_userName)).sendKeys(log_userName);
		driver.findElement(By.name(txt_password)).sendKeys(log_password);
		driver.findElement(By.name(but_Login)).click();
		System.out.println("user Loging is SuccessFull");	
	  }
	public void logout_App() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Application will be Logout sucessfull");	
	}
	public void add_Employee() {
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(pim_module))).perform();
		driver.findElement(By.linkText(add_emp)).click();
		enter_frame();
		driver.findElement(By.name(txt_emp_first_name)).sendKeys(emp_first_name);
		driver.findElement(By.name(txt_emp_last_name)).sendKeys(emp_last_name);
		driver.findElement(By.id(txt_middle_name)).sendKeys(emp_middle_name);
		driver.findElement(By.name(txt_nick_name)).sendKeys(emp_nick_name);
		/*
		 * WebElement file=driver.findElement(By.xpath(txt_fileUpload));
		 * file.sendKeys(photo_path);
		 */
		//System.out.println("photo is uploaded:;");
		driver.findElement(By.xpath(but_newEmp_save)).click();
		System.out.println("Add new Employee SucessFull");
		
	}
	public void enter_frame() {
		driver.switchTo().frame(frame_name);
		System.out.println("enterd into the FRAME");		
	}
	public void exit_frame() {
		driver.switchTo().defaultContent();
		System.out.println("exit into the frame");
	}
	public void deleteEmployee() {
		enter_frame();
		Select st=new Select(driver.findElement(By.name(txt_dropdown)));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.name(txt_search)).sendKeys(search_emp_No);
		driver.findElement(By.xpath(btn_search)).click();
		driver.findElement(By.name(checkbox_select)).click();
		driver.findElement(By.xpath(btn_delete)).click();
		System.out.println("Delete Employee is SuccessFull");
		exit_frame();
	  }
	
	public void edit_Employee() {
		add_Employee();
		driver.findElement(By.xpath(btn_edit)).click();
		driver.findElement(By.name(txt_edit_firstName)).clear();
		driver.findElement(By.name(txt_edit_firstName)).sendKeys(edit_firstName);
		driver.findElement(By.name(txt_edit_lastName)).clear();
		driver.findElement(By.name(txt_edit_lastName)).sendKeys(edit_lastName);
		driver.findElement(By.xpath(btn_edit_save)).click();
		System.out.println("Edit Employee is Sucessfull");	
	}
	 public void company_Location() {
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(admin_Module))).perform();
		ac.moveToElement(driver.findElement(By.linkText(company_Info))).perform();
		driver.findElement(By.linkText(locations)).click();
		enter_frame();
		driver.findElement(By.xpath(add_Loaction)).click();
		driver.findElement(By.name(txt_location_name)).sendKeys(location_name);
		Select st=new Select(driver.findElement(By.id(txt_Loc_DropDown)));
		st.selectByVisibleText("India");
		System.out.println("drop down value India is Entered");
		driver.findElement(By.name(txt_Location_State)).sendKeys(state);
		driver.findElement(By.id(txt_Loaction_Add)).sendKeys(address);
		driver.findElement(By.name(txt_ZipCode)).sendKeys(zipCode);
		driver.findElement(By.name(txt_phoneNum)).sendKeys(phoneNum);
		driver.findElement(By.className(btn_save_loc)).click();
		 
	 }
	
		
		
		
		
	}
    

