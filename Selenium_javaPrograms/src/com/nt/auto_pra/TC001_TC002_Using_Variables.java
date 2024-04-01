package com.nt.auto_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_TC002_Using_Variables {
	public static String url="http://183.82.103.245/nareshit/login.php";
    public static String userName="nareshit";
    public static String password="nareshit";
    public static String title="OrangeHRMS";

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		if(driver.getTitle().equals(title)) {
			System.out.println("title is verified");
		}
		else {   
			System.out.println("title is not verified");
		     System.out.println(driver.getTitle());
	        }
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login is SucessFUll");
		if(driver.getTitle().equals(title)) {
			System.out.println("title is verified");
		}
		else {   
			System.out.println("title is not verified");
		     System.out.println(driver.getTitle());
	        }
		driver.findElement(By.linkText("Logout")).click();

	}

}
