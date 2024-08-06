package com.nt.windowhandels;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/window.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btn3")).click();
		
		/*Set<String> winds=driver.getWindowHandles();
		  for(String i : winds) {
			  System.out.println(i);
			  String i1=driver.switchTo().window(i).getTitle();
			  System.out.println(i1);
		  }*/
		
		  
		  String wind=driver.getWindowHandle();
		   System.out.println(wind);
		
		System.out.println("===================");
		
		driver.switchTo().window(wind);
		Thread.sleep(5000);
		
		Set<String> winds=driver.getWindowHandles();
		System.out.println(winds);
		 for(String i :winds) {
			 driver.switchTo().window(i);
			String title= driver.switchTo().window(i).getCurrentUrl();
			System.out.println(title);
			 
			 Thread.sleep(5000);
		 }
		
		
		
	}   

}
