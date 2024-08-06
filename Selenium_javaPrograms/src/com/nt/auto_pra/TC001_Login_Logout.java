package com.nt.auto_pra;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Login_Logout {

	public static void main(String[] args) {
	  //Launch Browser
		WebDriver driver=new ChromeDriver();
	   //enetr url
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//enter username
		WebElement ele=driver.findElement(By.name("txtUserName"));
		  ele.sendKeys("nareshit");
		//enetr the password
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//click on Login Button
		driver.findElement(By.name("Submit")).click();
		//click on Logout Button
		driver.findElement(By.linkText("Logout")).click();
		//close the Application
		driver.close();
		System.out.println("Appication is closed");

	}

}
