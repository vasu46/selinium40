package com.nt.auto_pra;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC009_WaitStatements {
	public static String url="http://183.82.103.245/nareshit/login.php";
    public static String userName="nareshit";
    public static String password="nareshit";
    public static String title1="OrangeHRM - New Level of HR Management";
    public static String title2="OrangeHRM";
    
	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser is Launched");
		driver.navigate().to(url);
		System.out.println("URL IS ENTERED OPEN APPLIACTION");
	    if(driver.getTitle().equals(title1)) {
	    	System.out.println("Title is verified");
	    }
	    else {
	    	System.out.println("Title is Not Verified");
	    	System.out.println(driver.getTitle());
	    }
	    driver.findElement(By.name("txtUserName")).sendKeys(userName);
	    driver.findElement(By.name("txtPassword")).sendKeys(password);
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	    driver.findElement(By.name("Submit")).click();
	    System.out.println("Login Is SuccessFull");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    if(driver.getTitle().equals(title2)) {
	    	System.out.println("Title is verified");
	    }
	    else {
	    	System.out.println("Title is Not Verified");
	    	System.out.println(driver.getTitle());
	    }
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(2000);
	    driver.close();	
	    
	    	
	}
}