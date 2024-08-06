package com.nit.lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class General extends Global{
	//open Application
	public void openapplication() {
		driver=new ChromeDriver();
		 driver.navigate().to(url);
		 String currrentUrl=driver.getCurrentUrl();
	     if(currrentUrl.equals(url)) {
	    	 System.out.println("u r navigation is SuccessFull");
	     }
	     else {
	    	 System.out.println("u r navigation is not Current");
	     }
		 
	  }
	//clsoe Application
	  public void closeApplication() {
		  driver.close();
		  System.out.println("IT closes current window");
	    }
	  //Title Verification
	  public void verifyTitel(String Title) {
		  String title=driver.getTitle();
		  if(title.equals(Title)) {
			  System.out.println("Title is matchs");
		  }
		  else
		  {
			   System.out.println("Title is not match");
			  System.out.println("The current Title is::"+title);
		  }  
	  }
	  //Login To the Application
	public  void loginFuction() {
		
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
	}
	//enter the Frame
	  public void enterFrame() {
		  driver.switchTo().frame(frame_name);
		  System.out.println("We are enter into frame");
		  }
	  public void exeitFrame() {
		  driver.switchTo().defaultContent();
		  System.out.println("WE exit from frame");
	  }
	//Mouse Over goto Pim Module
  //Addemployee to pim Module
	 public void addEmployee() throws Exception {
		WebElement pim_mod = driver.findElement(By.linkText(pim_module));
		 Actions ac=new Actions(driver);
	    ac.moveToElement(pim_mod).perform();
	   WebElement add= driver.findElement(By.linkText(add_Emp));
	     add.click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      enterFrame();
	      WebElement last_Name=driver.findElement(By.name(txt_lastName));
	      last_Name.sendKeys(lastName);
	      System.out.println("LastName Entterd");
	      WebElement first_Name=driver.findElement(By.name(txt_firstName));
	      first_Name.sendKeys(firatName);
	      System.out.println("FirstName Entterd");
	      WebElement middle_Name=driver.findElement(By.name(txt_middle));
	      middle_Name.sendKeys(middleName);
	      System.out.println("MiddleName Entterd");
	      WebElement nick_Name=driver.findElement(By.name(txt_nickName));
	      nick_Name.sendKeys(nickName);
	      System.out.println("nickName Entterd");
	      WebElement fileInput=driver.findElement(By.xpath(txt_photeFile));
	        fileInput.sendKeys(photoPlace);
	        System.out.println("photo Entterd");
	       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	       WebElement save=wait.until(ExpectedConditions.elementToBeClickable(By.id(btn_save)));
	       save.click();
	       System.out.println("Add EMployee is Commpleted");  
	       Thread.sleep(1000);
	       WebElement back=driver.findElement(By.xpath(btn_back));
	       back.click();
	       System.out.println("Back to the Home page");
	      }
	 //SearchEmployee
	   public void searchEmployee() {
		   enterFrame();
		   System.out.println("we enter the farme for search Employee");
		   WebElement dropdown=driver.findElement(By.id(select_dropdown_id));
		   Select sc=new Select(dropdown);
		   sc.selectByVisibleText("Emp. First Name" );
		   WebElement first_name=driver.findElement(By.name(search_box_name));
		   first_name.sendKeys(search_name);
		   
		   WebElement search_btn=driver.findElement(By.xpath(btn_search_Emp));
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(search_btn));
		   search_btn.click();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   System.out.println("it shows Empl details search employee Completedd");
		   driver.navigate().back();
		   System.out.println("we going home Page");
		   
	   }
	   public void deleteEmployee(String num) {
		   enterFrame();
		   System.out.println("we enter the farme for delete Employee");
		   WebElement dropdown=driver.findElement(By.id(select_dropdown_id));
		   Select sc=new Select(dropdown);
		   sc.selectByVisibleText("Emp. ID");
		   System.out.println("Select dropdown option Emp. ID");
		   WebElement search_btn=driver.findElement(By.xpath(btn_search_Emp));
		   search_btn.sendKeys(num);
		   System.out.println("we can enter num search the Employee employee is "+num);
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(search_btn));
		   search_btn.click();
		   System.out.println("serach button is click for delete emp");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   WebElement checkbox=driver.findElement(By.xpath(select_checkbox));
		   checkbox.click();
		   System.out.println("we can checkbox i select the fro delete employee");
		   WebElement btn_delete_emp=driver.findElement(By.xpath(delete_btn));
		   btn_delete_emp.click();
		   System.out.println(num+" Employee is deleted");
		   driver.navigate().back();
		   System.out.println("we are go in to home page");
		   
	   }
	

}
