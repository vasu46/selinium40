package com.nt.auto_pra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActionsUsingSeleniumClass {
	 static String url="http://183.82.103.245/nareshit/login.php";
	 static String userName="nareshit";
	 static String password="nareshit";
	public static void main(String[] args) throws AWTException, Exception {
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is Launched");
		driver.get(url);
		System.out.println("url is entered");
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		
		

	}

}
