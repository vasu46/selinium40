package com.nt.auto_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_Frames {
	public static String url="http://183.82.103.245/nareshit/login.php";
    public static String userName="nareshit";
    public static String password="nareshit";
    public static String title1="OrangeHRM - New Level of HR Management";
    public static String title2="OrangeHRM";
    public static String empLastName="suresh";
    public static String empFirstName="Suresh";
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to(url);
		 if(driver.getTitle().equals(title1)) {
			 System.out.println("Title is Verified");
		 }
		 else {
			 System.out.println("Title is Not Verified");
			 System.out.println(driver.getTitle());
		 }
		 driver.findElement(By.name("txtUserName")).sendKeys(userName);
		 driver.findElement(By.name("txtPassword")).sendKeys(password);
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Login Is SucessFull");
		 if(driver.getTitle().equals(title2)) {
			 System.out.println("Title is Verified");
		 }
		 else {
			 System.out.println("Title is Not Verified");
			 System.out.println(driver.getTitle());
		 }
		 driver.switchTo().frame("rightMenu");
		  System.out.println("cursor is go to frame");
		  driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		  System.out.println("click on Add Employee Button");
		  driver.findElement(By.name("txtEmpLastName")).sendKeys(empLastName);
		  driver.findElement(By.name("txtEmpFirstName")).sendKeys(empFirstName);
		  driver.findElement(By.id("btnEdit")).click();
		  System.out.println("employe is savede");
		  driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		 
		  driver.switchTo().defaultContent();
		  System.out.println("exit to frame");
		  driver.findElement(By.linkText("Logout")).click();
		  System.out.println("logout the Application");
		  driver.close();
		  System.out.println("close the APP");
		

	}

}
