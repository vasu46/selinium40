package com.nt.auto_pra;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005_Alert {
	public static String url="http://183.82.103.245/nareshit/login.php";
    public static String userName="nareshit";
    public static String password="nareshit";
    public static String title1="OrangeHRM - New Level of HR Management";
    public static String title2="OrangeHRM";
		

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("url is ENtered");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		if(driver.getTitle().equals(title1)) {
			 System.out.println("Title is Verified");
		 }
		 else {
			 System.out.println("Title is Not Verified");
			 System.out.println(driver.getTitle());
		 }
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("Submit")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login is SuccessFull");
		Thread.sleep(2000);
		driver.close();
		System.out.println("App closed");
		
		
		
		

	}

}
