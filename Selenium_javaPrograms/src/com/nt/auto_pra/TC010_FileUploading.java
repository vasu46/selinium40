package com.nt.auto_pra;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

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
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC010_FileUploading {
	public static String url="http://183.82.103.245/nareshit/login.php";
    public static String userName="nareshit";
    public static String password="nareshit";
    public static String title1="OrangeHRM - New Level of HR Management";
    public static String title2="OrangeHRM";
    public static String empLastName="suresh";
    public static String empFirstName="Suresh";

	public static void main(String[] args) /*throws AWTException,Exception*/ {
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome BRowser is Launcheed::");
		try {
			/*
			 * //1.Launch Browser WebDriver driver=new ChromeDriver();
			 * System.out.println("Chrome BRowser is Launcheed::");
			 */
		
		//2.Enter the URL
		driver.navigate().to(url);
	   System.out.println("URL is Entered and Application is Open");
	   
	   //3.VERIFY THE Title
	   if(driver.getTitle().equals(title1)) {
		   System.out.println("Login page Title is Verified::");
	   }
	   else {
		   System.out.println("Login page Title is not Verified:: ");
		   System.out.println(driver.getTitle()); 
	   }
	   //4.enter the Loging UserName
	   driver.findElement(By.name("txtUserName")).sendKeys(userName);
	   //5.Click on Login Button
	   driver.findElement(By.name("Submit")).click();
	   //go to ALert page
	   Alert a=driver.switchTo().alert();
	   //6.get alert message
	   System.out.println(a.getText());
	   //7.click on OK Button
	   a.accept();
	   //8.enter the Password
	   driver.findElement(By.name("txtPassword")).sendKeys(password);
	   //9.Explicit wait for find Login Button
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	   //10.keyboard actions to click on Login button
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_TAB);
	   r.keyRelease(KeyEvent.VK_TAB);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   System.out.println("Loging is Successfull::");
	   
	   //11.implicitly wait for home menu page find
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //12.verify the Title to home menu page
	   if(driver.getTitle().equals(title2)) {
		   System.out.println("Login page Title is Verified::");
	   }
	   else {
		   System.out.println("Login page Title is not Verified:: ");
		   System.out.println(driver.getTitle()); 
	   }
	   
	   //13.enetr the frame to employee information
	   driver.switchTo().frame("rightMenu");
	   System.out.println("Cursor is eneterd into frame::");
	   
	   //14.clik on add new Employee button
	   driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
	   System.out.println("add Employee button is clickable");
	   
	   //15.implicit wait for add employee page
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //16.enetr employee last name
	   driver.findElement(By.name("txtEmpLastName")).sendKeys(empLastName);
	   //17.Enter Employee First Name
	   driver.findElement(By.name("txtEmpFirstName")).sendKeys(empFirstName);
	   System.out.println("Employee first and Last name entered::");
	   //18.upload the photo File element indentifiede
	   WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@id='photofile']"));
	   //19.given to path file 
	   fileInput.sendKeys("D://images/rashimika.JFIF");
	   System.out.println("File is Instered");
	   //20.explicity wait for FIND add employee save Button
	   WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='button'][@id='btnEdit']"))));
	   driver.findElement(By.xpath("//input[@type='button'][@id='btnEdit']")).click();
	   Thread.sleep(2000);
	   System.out.println("Add new Employee is successfull");
	   
	   //21.click on back button
	   driver.findElement(By.xpath("/html/body/div[5]/input")).click();
	   System.out.println("click on Back Button");
	   //22.implicit wait for home menu page
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //23.exit from frame
	   driver.switchTo().defaultContent();
	   System.out.println("Cursor comes out from frame::");
	   
	   //23.mouse over the to find pim module
	   Actions ac=new Actions(driver);
	   ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"))).perform();
	   System.out.println("Cursor is Moved to PIM Module");
	   //22.click on employee List
	    driver.findElement(By.linkText("Employee List")).click();
	   System.out.println("Employe List will be Displayed::");
	   
	   //23.click on Logout link
	   driver.findElement(By.linkText("Logout")).click();
	   System.out.println("App is Logout");
	   
	   //24.close the Application
	   driver.close();
	   System.out.println("Application is Closed");
		}//try
		catch(Exception e) {
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(f1,new File("G:\\screenshot\\hrms12.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	   
	   
	   
	   
	   

	}

}
