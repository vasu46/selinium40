package com.hrms.as;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.hrms.lib.General;

public class TC001_Login_Logout {

	public static void main(String[] args) {
		WebDriver driver;
		
	
		General gen = null;
		try {
		gen=new General();
		gen.openApplication();
		gen.verifyTitle("OrangeHRM - New Level of HR Management");
		gen.login_App();
		gen.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		gen.logout_App();
		gen.closeApplication();
		}//try
		catch(Exception e) {
			((TakesScreenshot)gen.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmsS.png"));
     }
	}
}
