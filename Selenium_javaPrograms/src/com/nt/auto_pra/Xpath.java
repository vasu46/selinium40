package com.nt.auto_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	     //xpath by name xpath
			/*  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(
			  "nareshit");
			  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(
			  "nareshit"); driver.findElement(By.xpath("//input[@name='Submit']")).click();*/
			 
			/*driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
			driver.findElement(By.xpath("//input[@name='Submit']")).click();*/
	    
	     driver.findElement(By.tagName("input")).sendKeys("nareshit");
	     driver.findElement(By.cssSelector("//input[@name='txtPassword']")).sendKeys("nareshit");
	    
	    //driver.findElement(By.xpath("[text()='PIM']")).click();
	     
		

	}

}
