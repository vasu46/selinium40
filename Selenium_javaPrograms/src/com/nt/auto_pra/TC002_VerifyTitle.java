package com.nt.auto_pra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_VerifyTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("url entered");
		if(driver.getTitle().equals("Orange HRMS APPLICATION")) {
			System.out.println("title is verified");
		}
		else {
			System.out.println("title is not Verified");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login SussesFull");
		if(driver.getTitle().equals("HRMS APPLICATION")) {
			System.out.println("title is verified");
		}
		else {
			System.out.println("title is not Verified");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout SuccessFull");
		driver.close();
		System.out.println("App Closed");

	}

}
