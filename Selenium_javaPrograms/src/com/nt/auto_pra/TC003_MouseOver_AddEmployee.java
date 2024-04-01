package com.nt.auto_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC003_MouseOver_AddEmployee {
	public static String url="http://183.82.103.245/nareshit/login.php";
    public static String userName="nareshit";
    public static String password="nareshit";
    public static String title1="OrangeHRM - New Level of HR Management";
    public static String title2="OrangeHRM";
    public static String cityName="Hydharabad";
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to(url);
	 if(driver.getTitle().equals(title1)) {
		 System.out.println("Title is Verified");
	 }
	 else {
		 System.out.println("Title is Not Verified");
		 System.out.println(driver.getTitle());
	 }
	 driver.findElement(By.name("txtUserName")).sendKeys(userName);
	 driver.findElement(By.name("txtPassword")).sendKeys(password);
	 driver.findElement(By.name("Submit")).click();
	 System.out.println("Login Is SucessFull");
	 if(driver.getTitle().equals(title2)) {
		 System.out.println("Title is Verified");
	 }
	 else {
		 System.out.println("Title is Not Verified");
		 System.out.println(driver.getTitle());
	 }
	 
	 Actions ac=new Actions(driver);
	 ac.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
	 System.out.println("cursor is moved to admin palce");
	 ac.moveToElement(driver.findElement(By.linkText("Company Info"))).perform();
	 System.out.println("cursor is moved to Company Info palce");
	 driver.findElement(By.linkText("General")).click();
	 System.out.println("click on general information");
	 driver.findElement(By.xpath("//input[@value='Edit']")).click();
	System.out.println("click on edit Button");
	 driver.findElement(By.name("cmbCity")).sendKeys(cityName);
	 driver.findElement(By.xpath("//input[@class='savebutton'][@id='editBtn']")).click();
	 System.out.println("Edit Button information save");
	 driver.findElement(By.linkText("Logout")).click();
	 driver.close();
	 System.out.println("Application is Closed");
	 

	}

}
