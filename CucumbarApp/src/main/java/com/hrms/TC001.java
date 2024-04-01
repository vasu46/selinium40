package com.hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC001 {
	public WebDriver driver;
	@Given("^OpenApplication$")
	public void openApp() {
		driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("app open");	
	}
	@When("^VerifyTitle$")
	public void verifyTitle() {
		if(driver.getTitle().equalsIgnoreCase("OrangeHRM")) {
			System.out.println("title Verified");
		}
		else {
			System.out.println("Title Not matched");
			driver.getTitle();
		}
	}
		@Then("^Close Application$")
		public void close() {
		  driver.close();
		  System.out.println("App closed");
		}
		
	

}
