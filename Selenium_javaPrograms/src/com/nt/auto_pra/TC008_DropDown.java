package com.nt.auto_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC008_DropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		System.out.println("BROWSER IS OPEN");
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println("url Enterd");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login successFull");
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.name("loc_name")).sendKeys("1765");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("employee is Selected::");
		Thread.sleep(2000);
		driver.findElement(By.name("chkLocID[]")).click();
		System.out.println("check box is selectted");
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(2000);
		System.out.println("Delete the Employee::");
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		System.out.println("Application is Closed");
		
	}

}
