package com.nt.auto_pra;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC012_WindowHandler {

	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome browser is open");
		driver.get("file:///G:/window.html");
		System.out.println("url is open");
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		String wind1=driver.getWindowHandle();
		System.out.println(wind1);
		ArrayList<String>list=new ArrayList<>(driver.getWindowHandles());
		System.out.println(list);
	    driver.switchTo().window(wind1);
	    Thread.sleep(2000);
	    driver.switchTo().window("0");
	    Thread.sleep(2000);
	    System.out.println("go to previous window");
		
		

	}

}
