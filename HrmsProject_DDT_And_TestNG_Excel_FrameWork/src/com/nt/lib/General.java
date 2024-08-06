package com.nt.lib;


	import java.io.FileInputStream;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.support.ui.Select;

	public class General extends Global{
		//open Application
		public void openapplication() {
			driver=new ChromeDriver();
			 driver.navigate().to(url);
			 String currrentUrl=driver.getCurrentUrl();
		     if(currrentUrl.equals(url)) {
		    	 System.out.println("u r navigation is SuccessFull");
		    	 Reporter.log("u r navigation is successfull");
		     }
		     else {
		    	 System.out.println("u r navigation is not Current");
		    	 Reporter.log("u r navigate is not current");
		     }
			 
		  }
		//clsoe Application
		  public void closeApplication() {
			  driver.close();
			  System.out.println("IT closes current window");
			  Reporter.log("it closes current window");
		    }
		  //Title Verification
		  public void verifyTitel(String Title) {
			  String title=driver.getTitle();
			  if(title.equals(Title)) {
				  System.out.println("Title is matchs");
				  Reporter.log("Title is Matches");
			  }
			  else
			  {
				   System.out.println("Title is not match");
				   Reporter.log("Title is not match");
				  System.out.println("The current Title is::"+title);
				  Reporter.log("The current title is::"+title);
			  }  
		  }
		  //Login To the Application
		public  void loginFuction()throws Exception {
			  FileInputStream input=new FileInputStream("G://EmpDetails.xls");
			  Workbook wb=Workbook.getWorkbook(input);
			  Sheet s1=wb.getSheet(0);
			  String userName=s1.getCell(0,1).getContents();
			  String password=s1.getCell(1,1).getContents();
			  System.out.println("userName::"+userName);
			  Reporter.log("username:;"+userName);
			  Reporter.log("password::"+password);
			  System.out.println("Password::"+password);
			  
				/*  int row=s1.getRows();
				  for(int i=1;i<row;i++) {
					  String name=s1.getCell(0,i).getContents();
					  String passwords=s1.getCell(1,i).getContents();
					System.out.println("names::"+name+" \n "+"passwords::"+passwords);
				  
				  }
				  System.out.println(row);*/
			
			//WebElement userName_txt=driver.findElement(By.name(txt_userName));
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  WebElement name=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(txt_userName)));
		   name.sendKeys(userName);
		   
			
	    // driver.findElement(By.name(txt_password)).sendKeys(password);
	     WebElement tx_password=wait.until(ExpectedConditions.presenceOfElementLocated(By.name(txt_password)));
	     tx_password.sendKeys(password);
	    // driver.findElement(By.name(btn_login)).click();
	     WebElement loginbtn=wait.until(ExpectedConditions.elementToBeClickable(By.name(btn_login)));
	     loginbtn.click();
	     System.out.println("Login Successfull");
	     Reporter.log("Login successFull");
		}
		//enter the Frame
		  public void enterFrame() {
			  driver.switchTo().frame(frame_name);
			  System.out.println("We are enter into frame");
			  Reporter.log("we are entered into the frame");
			  }
		  public void exeitFrame() {
			  driver.switchTo().defaultContent();
			  System.out.println("WE exit from frame");
			  Reporter.log("We exite  from frame");
		  }
		//Mouse Over goto Pim Module
	  //Addemployee to pim Module
		 public void addEmployee() throws Exception {
			WebElement pim_mod = driver.findElement(By.linkText(pim_module));
			 Actions ac=new Actions(driver);
		    ac.moveToElement(pim_mod).perform();
		    System.out.println("Cursor is moving to PIM module");
		    Reporter.log("cursor is moving to PIM Module");
		   WebElement add= driver.findElement(By.linkText(add_Emp));
		     add.click();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      enterFrame();
		      WebElement last_Name=driver.findElement(By.name(txt_lastName));
		      last_Name.sendKeys(lastName);
		      System.out.println("LastName Entterd");
		      Reporter.log("LastName entered");
		      WebElement first_Name=driver.findElement(By.name(txt_firstName));
		      first_Name.sendKeys(firatName);
		      Reporter.log("first name entered");
		      System.out.println("FirstName Entterd");
		      WebElement middle_Name=driver.findElement(By.name(txt_middle));
		      middle_Name.sendKeys(middleName);
		      Reporter.log("middle name entered");
		      System.out.println("MiddleName Entterd");
		      WebElement nick_Name=driver.findElement(By.name(txt_nickName));
		      nick_Name.sendKeys(nickName);
		      Reporter.log("Nick name enterd");
		      System.out.println("nickName Entterd");
		      WebElement fileInput=driver.findElement(By.xpath(txt_photeFile));
		        fileInput.sendKeys(photoPlace);
		        System.out.println("photo Entterd");
		        Reporter.log("Photo entered");
		        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		       WebElement save=wait.until(ExpectedConditions.elementToBeClickable(By.id(btn_save)));
		       save.click();
		       System.out.println("Add EMployee is Commpleted");  
		       Reporter.log("Add employye is completed");
		       Thread.sleep(1000);
		       WebElement back=driver.findElement(By.xpath(btn_back));
		       back.click();
		       System.out.println("Back to the Home page");
		       Reporter.log("Bak to the Home page");
		      }
		 //SearchEmployee
		   public void searchEmployee() {
			   enterFrame();
			   System.out.println("we enter the farme for search Employee");
			   Reporter.log("We enetr the farme fro deldete employee");
			   WebElement dropdown=driver.findElement(By.id(select_dropdown_id));
			   Select sc=new Select(dropdown);
			   sc.selectByVisibleText("Emp. First Name" );
			   Reporter.log("Select dropdown option Emp. FirstName");
			   WebElement first_name=driver.findElement(By.name(search_box_name));
			   first_name.sendKeys(search_name);
			   
			   WebElement search_btn=driver.findElement(By.xpath(btn_search_Emp));
			   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			   wait.until(ExpectedConditions.elementToBeClickable(search_btn));
			   search_btn.click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   System.out.println("it shows Empl details search employee Completedd");
			   Reporter.log("it show emp details search employee completdd::");
			   driver.navigate().back();
			   System.out.println("we going home Page");
			   Reporter.log("we going home page");
			   
		   }
		   public void deleteEmployee(String num) {
			   enterFrame();
			   System.out.println("we enter the farme for delete Employee");
			   Reporter.log("We enetr the farme fro deldete employee");
			   WebElement dropdown=driver.findElement(By.id(select_dropdown_id));
			   Select sc=new Select(dropdown);
			   sc.selectByVisibleText("Emp. ID");
			   System.out.println("Select dropdown option Emp. ID");
			   Reporter.log("Select dropdown option Emp. ID");
			   WebElement search_btn=driver.findElement(By.xpath(btn_search_Emp));
			   search_btn.sendKeys(num);
			   System.out.println("we can enter num search the Employee employee is "+num);
			   Reporter.log("We can enetr num search the employee is "+num );
			   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			   wait.until(ExpectedConditions.elementToBeClickable(search_btn));
			   search_btn.click();
			   System.out.println("serach button is click for delete emp");
			   Reporter.log("Search button is click for delete emp");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   WebElement checkbox=driver.findElement(By.xpath(select_checkbox));
			   checkbox.click();
			   System.out.println("we can checkbox i select the fro delete employee");
			   Reporter.log("we can checbox i select the for delete employee");
			   WebElement btn_delete_emp=driver.findElement(By.xpath(delete_btn));
			   btn_delete_emp.click();
			   System.out.println(num+" Employee is deleted");
			   Reporter.log(num+" employee is deleted");
			   driver.navigate().back();
			   System.out.println("we are go in to home page");
			   Reporter.log("we are go in to home page");
			   
		   }
		   public void logout() {
			   WebElement logout_app=driver.findElement(By.xpath(logout));
			   logout_app.click();
			   System.out.println("Application Logout");
			   Reporter.log("Application logout");
		   }
		

	}


