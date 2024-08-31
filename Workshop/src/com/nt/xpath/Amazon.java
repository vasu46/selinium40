package com.nt.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
      static int count=0;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3");
		driver.findElement(By.xpath("//h2[text()='Hot New Releases in Home & Kitchen']/following::div/a")).click();
		//List list=driver.findElements(By.xpath("//div[@id='zg-right-col']/child::div[@data-csa-c-id='fruzh-r1jivz-6qec4x-nvujbz']/div[1]/div[2]/div[1]/div[1]/div"));
		List list=driver.findElements(By.xpath("//div[@id='zg-right-col']/child::div/div/div[2]/div[1]/div[1]/div"));
		for(int i=0;i<list.size();i++) {
			count++;
		}
		
		System.out.println("select one element in page");
		System.out.println(count);
		
	}
	
}
