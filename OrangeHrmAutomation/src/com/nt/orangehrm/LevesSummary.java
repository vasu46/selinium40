package com.nt.orangehrm;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
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

public class LevesSummary {
	static String userName;
	static String password;
	static WebDriver driver;
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
				userName=rs.getString(1).toLowerCase();
				password=rs.getString(2).toLowerCase();
			}
			System.out.println(userName);
			System.out.println(password);
		
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		try {
		 // Class.forName("oracle.jdbc.driver.OracleDriver");
		   // Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","7825");
				//System.out.println("ConnectionEstablish");
	 //OPEN Chrome Browser
	     driver=new ChromeDriver();
	   driver.get("http://183.82.103.245/nareshit/login.php");
	   String leves_url=driver.getCurrentUrl();
	   if(leves_url.equals("http://183.82.103.245/nareshit/login.php")) {
		   System.out.println("Navigation is Successfull");
	   }
	   else {
		   System.out.println("navigation is wrong");
		   System.exit(0);
	      }
	   //enetr the User name
	    driver.findElement(By.name("txtUserName")).sendKeys(userName);
	    driver.findElement(By.name("txtPassword")).sendKeys(password);;
	    WebElement login= driver.findElement(By.name("Submit"));
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(login));
	        login.click();
	        System.out.println("Login SuccessFull");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Actions ac=new Actions(driver);
	    WebElement leves_mod=driver.findElement(By.linkText("Leave"));
	    ac.moveToElement(leves_mod).perform();
	    System.out.println("Cursor moved to leves module");
	    WebElement leves_Summary=driver.findElement(By.linkText("Leave Summary"));
	    ac.moveToElement(leves_Summary).perform();
	    WebElement emp_leave_summary=driver.findElement(By.linkText("Employee Leave Summary"));
	    emp_leave_summary.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.switchTo().frame("rightMenu");
	    WebElement year= driver.findElement(By.name("year"));
	    Select se=new Select(year);
	     se.selectByVisibleText("2025");
	     WebElement view_btn=driver.findElement(By.id("btnView"));
	       view_btn.click();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     int row_count=driver.findElements(By.xpath("//*[@id=\"frmSummary\"]/table/tbody/tr")).size();
	     System.out.println(row_count);
	     int col_count=driver.findElements(By.xpath("//*[@id=\"frmSummary\"]/table/tbody/tr[1]/td")).size();
	     System.out.println(col_count);	
			 WebElement btn_edit=driver.findElement(By.id("editBtn"));
			 btn_edit.click();
			 for(int i=1;i<row_count;i++) {
				 WebElement edit_leaveEntitled=driver.findElement(By.xpath("//*[@id=\"frmSummary\"]/table/tbody/tr["+i+"]/td[3]"));
				 edit_leaveEntitled.sendKeys("40.00");
			
			 }
	     WebElement back_btn1=driver.findElement(By.xpath("//input[@type='button'][@value='Back']"));
	     back_btn1.click();
	     WebElement dropDown_Emp=driver.findElement(By.name("cmbId")); 
	     Select se1=new Select(dropDown_Emp);
	     se1.selectByVisibleText("Select");
	     WebElement leave_type=driver.findElement(By.name("leaveTypeId"));
	     Select se2=new Select(leave_type);
	     se2.selectByVisibleText("Medical");
	     WebElement btn_select=driver.findElement(By.xpath("//input[@type='button'][@value='...']"));
	     btn_select.click();
	     Set<String> s=driver.getWindowHandles();
	     for(String i:s) {
	    	 System.out.println(i);
	    	 String title=driver.switchTo().window(i).getTitle();
	    	 System.out.println(title);
	     }
	     driver.manage().window().maximize();
	     WebElement dropdown_serach=driver.findElement(By.name("loc_code"));
	     Select se3=new Select(dropdown_serach);
	     se3.selectByVisibleText("Name");
	     WebElement name=driver.findElement(By.name("loc_name"));
	     name.sendKeys("vasu");
	     WebElement search_btn_medical=driver.findElement(By.name("btnSearch"));
	     search_btn_medical.click();
	   // driver.close();
	    //System.out.println("current browser is close");
	     Set<String> s1=driver.getWindowHandles();
	     for(String i:s) {
	    	 System.out.println(i);
	    	 String title=driver.switchTo().window(i).getTitle();
	    	 System.out.println(title);
	    	if(title.equals("OrangeHRM")) {
	    		break;
	    	}
	     }
	     WebElement logout=driver.findElement(By.linkText("Logout"));
	       logout.click();
	       Thread.sleep(2000);
	     driver.quit();
		}
		catch(Exception e) {
			TakesScreenshot screenShot=(TakesScreenshot) driver;
			File srcFile=screenShot.getScreenshotAs(OutputType.FILE);
			File destFile=new File("G://screenshot/orgHrms1.png");
			FileUtils.copyFile(srcFile, destFile);
			System.out.println(e.getMessage());
		}
       
	}

}
