package com.hrms.as;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class AutomationWithTestNG {
	
	
	@Test
	public void Login_LogoutApp() {
		General gen=null;
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
				((TakesScreenshot)gen.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmsS6.png"));
	     }
	}
	
	@Test
	public void Add_EmpApp()throws Exception {
		General gen1=null;
			try {
				 gen1=new General();
				gen1.openApplication();
				gen1.verifyTitle("OrangeHRM - New Level of HR Management");
				gen1.login_App();
				gen1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				gen1.verifyTitle("OrangeHRM");
				gen1.add_Employee();
				gen1.exit_frame();
				Thread.sleep(2000);
				gen1.logout_App();
				gen1.closeApplication();
				}
		  catch(Exception e) {
			((TakesScreenshot)gen1.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmsS7.png"));
		 }
	}
	
	@Test
	public void delete_EmpApp()throws Exception {
		General gen2=null;
		try {
			gen2=new General();
			gen2.openApplication();
			gen2.login_App();
			gen2.deleteEmployee();
			Thread.sleep(2000);
			gen2.logout_App();
			gen2.closeApplication();
			gen2.closeApplication();
		}
		catch(Exception e) {
			((TakesScreenshot)gen2.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmsS2.png"));
		}

		
	}
	
	@Test
	public void edit_empApp() {
		General gen=null;
		try {
			gen=new General();
		  gen.openApplication();
		  gen.verifyTitle("OrangeHRM - New Level of HR Management");
		  gen.login_App();
		  gen.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  gen.verifyTitle("OrangeHRM");
		  gen.edit_Employee();
		  gen.exit_frame();
		 gen.logout_App();
		 gen.closeApplication();
		}
		catch(Exception e) {
			((TakesScreenshot)gen.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmsS3.png"));
		}
	}
	}

