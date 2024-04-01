package om.nt.autoscripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC015_ScreenShot {
	
	static String url="http://183.82.103.245/nareshit/login.php";
    static String tittle="OrangeHRM - New Level of HR Management";
    static String tittle1="OrangeHRM";
    static String userName="nareshit";
    static String password="nareshit";
	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is the Open");
		
		try {
		//enter the url
		driver.navigate().to(url);
		 System.out.println("Url is the Enter the Browser::");
		 Thread.sleep(3000);
		 
		//verify the tittle
		 if(driver.getTitle().equals("tittle")) {
			 System.out.println("Tittle is matched");
		 }
		 else {
			 System.out.println("Tittle is not matched");
		     System.out.println(driver.getTitle());
		 }
		 System.out.println("Tittle is verified");
		 Thread.sleep(3000);
		 
		 //enetr the username
		 driver.findElement(By.name("txtUserName")).sendKeys(userName);
		 //enetr the Password
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		System.out.println("user name and password is enetred");
		 Thread.sleep(3000);
		 
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login The Application is is success");
		 Thread.sleep(3000);
		 
		if(driver.getTitle().equals("tittle1")) {
			 System.out.println("Tittle is matched");
		 }
		 else {
			 System.out.println("Tittle is not matched");
		     System.out.println(driver.getTitle());
		 }
		 System.out.println("Tittle is verified");
		 Thread.sleep(3000);
		 
		 //perform the mouse over operation PIM
		 //Create the Actions Class Object for ACCESS THE MOVETOelement
		   Actions ac=new Actions(driver);
		   System.out.println("Actions Class is Created");
		   ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		   Thread.sleep(3000);
		   System.out.println("Cursor is the move to the PIM ELEMNET");
		   
		   driver.findElement(By.linkText("Add Employee")).click();
		   System.out.println("Add Employee link is click()::");
		   Thread.sleep(3000);
		   
		   driver.findElement(By.linkText("Logout")).click();
		   System.out.println("Logout the Application is sucess");
		   Thread.sleep(3000);
		   
		  
		}
		catch(Exception e) {
			File f1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("G:\\screenshot\\hrms.png"));
		}
			
		driver.close();
		
		
		

	}


	}


