package com.nt.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LowestPeiceXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div[1]/div[2]")).click();
	driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div[1]/input")).sendKeys("BLR - Bangalore, IN");
	driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div[3]/input")).sendKeys("DEL - New Delhi, IN");
		
		
	}

}
