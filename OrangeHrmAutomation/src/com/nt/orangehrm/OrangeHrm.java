package com.nt.orangehrm;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;



public class OrangeHrm {
	//static String user_Name="nareshit";
	//static String password_l="nareshit";
	//Giving User_name and pasword in takeing Enduser
	 static String user_Name_Excel;
	  static String password_l_Excel;
	  public static String userName_DB;
	  public  static String password_DB;
	  public static WebDriver  driver;
	  static {
		  try {
				//Load Jdbc Driver class in DriverManger
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//Establish the Connection
			 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","7825");
				System.out.println("ConnectionEstablish");
				//Create Statement Object
				Statement st=con.createStatement();
				//Execute the Query
				ResultSet rs=st.executeQuery("SELECT USERNAME,PASSWORD FROM HRMS");
				//Validate the ResultSet
				if(rs.next()!=false) {
					System.out.println(rs.getString(1)+","+rs.getString(2));
					//STORE RESULTSET DATA INTO FIELDS
					userName_DB=rs.getString(1).toLowerCase();
					password_DB=rs.getString(2).toLowerCase();
				}
				System.out.println("userNameDB::"+userName_DB);
				System.out.println("passwordDB::"+password_DB);
			
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	  }
	

	public static void main(String[] args)throws Exception {
		 try {
		//GET EXCEL FILE  USING FILESTREAM
		FileInputStream is=new FileInputStream("G://EmpDetails.xls");
		//GET WORKBBOK
		Workbook wb=Workbook.getWorkbook(is);
		//GET SHEET
		Sheet s1=wb.getSheet(0);
		user_Name_Excel=s1.getCell(0, 1).getContents();
		password_l_Excel=s1.getCell(1,1).getContents();
		
		//i want get All data from excel
		int rows=s1.getRows();
		for(int i=0;i<rows;i++) {
		 String names=s1.getCell(0,i).getContents();;
		 String passwords=s1.getCell(1,i).getContents();
		 System.out.println(names+" "+passwords);
		}
		System.out.println("-=============================================");
		System.out.println("Usernamee::"+user_Name_Excel);
		System.out.println("PASSWORD::"+password_l_Excel);
		//Scanner scn=new Scanner(System.in);
		System.out.println("Automation Script is Started");
		//Open the Chrome Browser
		 driver=new ChromeDriver();
		//Navigate to the Url
		driver.get("http://183.82.103.245/nareshit/login.php");
		//getting Current URL
	     String currentUrl=driver.getCurrentUrl();
	     //Verify the Current Url
	      if(currentUrl.equals("http://183.82.103.245/nareshit/login.php")) {
	    	  System.out.println("Navigation is Successful");
	      }
	      else {
	    	  System.out.println("Navigation is Fails");
	    	  System.exit(0);
	      }
	      //get Login page Title
	      String open_Title=driver.getTitle();
	      System.out.println(open_Title);
	      //Verify the Login page Title
	      if(open_Title.equals("OrangeHRM - New Level of HR Management")) {
	    	  System.out.println("Title is Match");
	          }
	      else {
	    	  System.out.println("The Title is::"+open_Title);
	    	  System.out.println("Title is Not match");  
	         }
	      //Login to the Application
	      //Enter user name
	       WebElement user_name=driver.findElement(By.name("txtUserName"));
			/* System.out.println("Enter the Username");
			 user_Name=scn.next();
			 scn.nextLine();*/
	       user_name.sendKeys(user_Name_Excel);
	       //ENter the PAssword
	       WebElement password=driver.findElement(By.name("txtPassword"));
			/*  System.out.println("Enter the password");
			  password_l=scn.next();*/
	       password.sendKeys(password_l_Excel);
	       //Click On Login Button
	       WebElement login=driver.findElement(By.name("Submit"));
	       login.click();
	       System.out.println("Login is SuccessFull");
	       //Implicit Wait for the Open Adminstation page
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       //Get the Title Adminstration Page
	       String title2=driver.getTitle();
	       System.out.println("the Title is::"+title2);
	       //verify the Admistration Page
	       if(title2.equals("OrangeHRM")) {
	    	   System.out.println("Title is Match");
	       }
	       else {
	    	   System.out.println("Title is Not Match");
	    	   System.out.println("The title is::"+title2);
	       }
	       //Perform the MouseOver in go to PIM MODULE
	       WebElement pim=driver.findElement(By.linkText("PIM"));
	       Actions ac=new Actions(driver);
	       ac.moveToElement(pim).perform();
	       System.out.println("Cursor is enetred in PIM module");
	       //Perform AddEmployee in Pim Module
	       WebElement addEmp=driver.findElement(By.linkText("Add Employee"));
	       addEmp.click();
	       System.out.println("Click on AddEmployee button");
	       //First U have To Enter the Frames
	       driver.switchTo().frame("rightMenu");
	       System.out.println("We Are Enter the Iframe");
	       // Enter the NewEmployee Details
	       WebElement empLastName=driver.findElement(By.name("txtEmpLastName"));
	       empLastName.sendKeys("KOTHEM");
	       System.out.println("Emp lastname is Entered");
	       WebElement empFirstName=driver.findElement(By.name("txtEmpFirstName"));
	       empFirstName.sendKeys("VASU");
	       System.out.println("EmpFirstName is Entered");
	       WebElement empMiddleName=driver.findElement(By.name("txtEmpMiddleName"));
	       empMiddleName.sendKeys("NAIDU");
	       System.out.println("EmpMiddle Name is Entered");
	       WebElement nickName=driver.findElement(By.name("txtEmpNickName"));
	       nickName.sendKeys("CHinna");
	       System.out.println("EmpNickName is Enterd");
			/* WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@id='photofile']"));
			fileInput.sendKeys("‪D://HTMLPRACTICE/htmlPraticeTags/images/selenium2.png");*/
	       WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@id='photofile']"));
			fileInput.sendKeys("D://Apache Software Foundation/servlet_Images/vasu_img.jpeg");
	       System.out.println("New Employee Photo is Entered");
	       WebElement saveBtn=driver.findElement(By.id("btnEdit"));
	       saveBtn.click();
	       System.out.println("Add Employee is Successfull");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       //ofter the enter the details we are moving to back
	       WebElement back_btn=driver.findElement(By.xpath("//input[@class='backbutton'][@onclick='goBack()']"));
	       //Wait until Back Button click
	       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	       WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(back_btn));
	       back_btn.click();
	       System.out.println("After adding the Employee details we are back to home");
	       
	       //we search the sertain employee
	       WebElement drop_Down=driver.findElement(By.name("loc_code"));
	       Select sc=new Select(drop_Down);
	       //select the DropDown
	       sc.selectByVisibleText("Emp. ID");
	       WebElement search=driver.findElement(By.name("loc_name"));
	       search.sendKeys("4072");
	       WebElement search_btn=driver.findElement(By.xpath("//input[@class='plainbtn'][@onclick='returnSearch();']"));
	       search_btn.click();
	       System.out.println("Particular Employee is Search is Completed");
	       Thread.sleep(2000);
	       //move to the back in history
	       driver.navigate().back();
	       System.out.println("We go to back to  the Current Webpage");
	       //to referesh the Current page
	       driver.navigate().refresh();
	       System.out.println("We refresh the current webPage");
	       //to forwarde the current page
	       driver.navigate().forward();
	       System.out.println("we go to the forward the webpage");
	       //exit to the Frame
	       driver.switchTo().defaultContent();
	       System.out.println("came out of the frame");
	       //go the admin Module
	       WebElement admin=driver.findElement(By.linkText("Admin"));
	       ac.moveToElement(admin).perform();
	       System.out.println("mouse move to teh Admin PAGE");
	       //Move to company Info
	       WebElement Company_Info=driver.findElement(By.linkText("Company Info"));
	       ac.moveToElement(Company_Info).perform();
	       System.out.println("mouse move to the companyInfo");
	       //click on the Genearl Module
	       WebElement general=driver.findElement(By.linkText("General"));
	       general.click();
	       System.out.println("Click on general module page");
	       Thread.sleep(2000);
	       driver.navigate().back();
	       System.out.println("We go to back to  the Current Webpage");
	       driver.navigate().refresh();
	       System.out.println("We refresh the current webPage");
	       //logout the Appliaction
	       WebElement logout=driver.findElement(By.linkText("Logout"));
	       logout.click();
	       System.out.println("We logut the Application first tiem");
	      // click on login Button
	       WebElement login1=driver.findElement(By.name("Submit"));
	       login1.click();
	       System.out.println("we click on login page without un and password");
	       //go to alert page
	       Alert a=driver.switchTo().alert();
	       System.out.println("mouse move to the alert page");
	       Thread.sleep(2000);
	       //get alert text
	       String alert_Text=a.getText();
	       System.out.println("alert Message::"+alert_Text);
	       //click on ok button on Alert button
	       a.accept();
	       System.out.println("alert page ok button click");
	       //Enter the Username
	       WebElement user_name1=driver.findElement(By.name("txtUserName"));
	       user_name1.sendKeys(user_Name_Excel);
	       //enetr the password
	       WebElement password1=driver.findElement(By.name("txtPassword"));
	       password1.sendKeys(password_l_Excel);
	       //Click on Clear Buuton
	       WebElement clear_btn=driver.findElement(By.name("clear"));
	       clear_btn.click();
	       System.out.println("click on clear Button");
	       
	       Thread.sleep(5000);
	       System.out.println("PiM Module and Admin Module Exceution is Completeed");    
	      //auto mation oN Leaves Summary
	       //enetr the User name
		    driver.findElement(By.name("txtUserName")).sendKeys(userName_DB);
		    driver.findElement(By.name("txtPassword")).sendKeys(password_DB);
		    WebElement login_leave= driver.findElement(By.name("Submit"));
		    //Explicit wait for the Login Button
		    WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		    wait1.until(ExpectedConditions.elementToBeClickable(login_leave));
		        login_leave.click();
		        System.out.println("Login SuccessFull");
		        //Implicit Wait for the Home PAGE
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    //mouse over the LeaveSummary
		    Actions ac1=new Actions(driver);
		    WebElement leves_mod=driver.findElement(By.linkText("Leave"));
		    ac1.moveToElement(leves_mod).perform();
		    System.out.println("Cursor moved to leves module");
		    //leave Summary module
		    WebElement leves_Summary=driver.findElement(By.linkText("Leave Summary"));
		    //mouse over the leaves Summary
		    ac1.moveToElement(leves_Summary).perform();
		    System.out.println("Mouse over the levae Summaray");
		    //click on Employee Summary
		    WebElement emp_leave_summary=driver.findElement(By.linkText("Employee Leave Summary"));
		    emp_leave_summary.click();
		    System.out.println("go to the Employyee Leave Summary");
		    //im[plicity wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    //enetr the Frame
		    driver.switchTo().frame("rightMenu");
		    System.out.println("Enter then farame Leave summary");
		    //select the year of leave module
		    WebElement year= driver.findElement(By.name("year"));
		    //dropdown select year
		    Select se=new Select(year);
		     se.selectByVisibleText("2025");
		     WebElement view_btn=driver.findElement(By.id("btnView"));
		       view_btn.click();
		       System.out.println("view Button click");
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       //get Row Count
		     int row_count=driver.findElements(By.xpath("//*[@id=\"frmSummary\"]/table/tbody/tr")).size();
		     System.out.println(row_count);
		     //get Column Count
		     int col_count=driver.findElements(By.xpath("//*[@id=\"frmSummary\"]/table/tbody/tr[1]/td")).size();
		     System.out.println(col_count);	
				/* WebElement btn_edit=driver.findElement(By.id("editBtn"));
				 btn_edit.click();
				 for(int i=1;i<row_count;i++) {
					 WebElement edit_leaveEntitled=driver.findElement(By.xpath("//*[@id=\"frmSummary\"]/table/tbody/tr["+i+"]/td[3]"));
					 edit_leaveEntitled.sendKeys("40.00");
				
				 }*/
		     //click on Back Button
		     WebElement back_btn1=driver.findElement(By.xpath("//input[@type='button'][@value='Back']"));
		     back_btn1.click();
		     System.out.println("Click on Button Back");
		     //Select the Employees
		     WebElement dropDown_Emp=driver.findElement(By.name("cmbId")); 
		     Select se1=new Select(dropDown_Emp);
		     se1.selectByVisibleText("Select");
		     //Select the Levae Type
		     WebElement leave_type=driver.findElement(By.name("leaveTypeId"));
		     Select se2=new Select(leave_type);
		     se2.selectByVisibleText("Medical");
		     System.out.println("select the Medical Leave");
		     //select button click in leves page
		     WebElement btn_select=driver.findElement(By.xpath("//input[@type='button'][@value='...']"));
		     btn_select.click();
		     System.out.println("cilck on select leves button");
		     //get Window Handles
		     Set<String> s=driver.getWindowHandles();
		     for(String i:s) {
		    	 System.out.println(i);
		    	 String title=driver.switchTo().window(i).getTitle();
		    	 System.out.println(title);
		     }
		     //window the maximze
		     driver.manage().window().maximize();
		     System.out.println("maximize the Window");
		     //select option the which type name ,id
		     WebElement dropdown_serach=driver.findElement(By.name("loc_code"));
		     Select se3=new Select(dropdown_serach);
		     //select by name
		     se3.selectByVisibleText("Name");
		     WebElement name=driver.findElement(By.name("loc_name"));
		     name.sendKeys("vasu");
		     WebElement search_btn_medical=driver.findElement(By.name("btnSearch"));
		     search_btn_medical.click();
		     System.out.println("click on the mediacl leave on search button");
		   // driver.close();
		    //System.out.println("current browser is close");
		     //get Window handles
		     Set<String> s2=driver.getWindowHandles();
		     for(String i:s2) {
		    	 System.out.println(i);
		    	 String title=driver.switchTo().window(i).getTitle();
		    	 System.out.println(title);
		    	if(title.equals("OrangeHRM")) {
		    		break;
		    	}
		     }
		     //logout the application
		     WebElement logout2=driver.findElement(By.linkText("Logout"));
		       logout2.click();
		       System.out.println("Logout the Apllication second time");
		       Thread.sleep(2000);
		       //close the all windoes
		       driver.quit();
		       System.out.println("Close the all windows");
		 }
		 catch(Exception e) {
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
			File destFile=new File("G://screenshot/orgHrms.png");
			FileUtils.copyFile(srcFile, destFile);
			System.out.println(e.getMessage());
			e.printStackTrace();
		 }
	}

}
