package com.nt.auto_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC0011_navigate_Methods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Url is enetred");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login is Successfull and display home menu page");
		driver.navigate().back();
		System.out.println("navigate back button");
		
		driver.navigate().forward();
		System.out.println("navigate forword to forwad button");
		
		
	}

}
