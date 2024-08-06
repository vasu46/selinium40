package com.nt.selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverGetMethods {
	/*public static String user_Name="nareshit";
	public static String password="nareshit";
	public static String title1="Hrms Open page";*/
	
	/*public static String user_Name;
	public static String password;
	public static String title1;
	*/
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Selenium WebDriver
		WebDriver driver = new ChromeDriver();
		// Navigate the specific Url
		driver.get("http://183.82.103.245/nareshit/login.php");
		// driver.navigate().to("http://183.82.103.245/nareshit/login.php");

		// get Curreent Url
		String url = driver.getCurrentUrl();
		System.out.println("Current Url is::" + url);
		if (url.equals("http://183.82.103.245/nareshit/login.php")) {
			System.out.println("it's open correct url");

		} else {
			System.out.println("Navigation faild");
		}

		// get Title from current page
		  String title=driver.getTitle();
		  if(title.equals("orange Hrm")) {
			  System.out.println("title match");
		  }
		  else {
			  System.out.println("Title is nort match");
			  System.out.println(title);
		  }
		// get Page Source
		// String pageSource=driver.getPageSource();
		// System.out.println(pageSource);

		// Login the Application
		WebElement un = driver.findElement(By.name("txtUserName"));
		un.sendKeys("nareshit");
		/*System.out.println("enetr the user name");
		user_Name = sc.next();
		//un.sendKeys("nareshit");
		sc.nextLine();*/
		WebElement pass = driver.findElement(By.name("txtPassword"));
		 pass.sendKeys("nareshit");
			/*System.out.println("enetr the passwords::");
			password = sc.next();
		//pass.sendKeys(password);*/
		driver.findElement(By.name("Submit")).click();
         Thread.sleep(2000);
         
		// fInd same Elements and get The text
		/* List<WebElement> li=driver.findElements(By.tagName("a"));
		 System.out.println(li.size());
		 System.out.println(li);
		 for(WebElement ele:li) {
			 String element=ele.getText();
			 System.out.println(element);
				if(element.equals("Logout")) {
				  ele.click();	
				 }
			
		 }*/
		
		//Navigation Move Forward,back,referesh
		/*driver.navigate().to("https://chatgpt.com/c/c47ed900-7486-43e7-b2ec-eba5328b5e2d");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
         //Mouse Over the Application
         WebElement admin=driver.findElement(By.linkText("Admin"));
         Actions ac=new Actions(driver);
         ac.moveToElement(admin).perform();
         Thread.sleep(5000);
         WebElement skills=driver.findElement(By.linkText("Skills"));
         ac.moveToElement(skills).perform();
         Thread.sleep(5000);
         WebElement skills1=driver.findElement(By.linkText("Skills"));
         skills1.click();
         Thread.sleep(5000);
		

		// driver.close();
		driver.quit();

	}
}
