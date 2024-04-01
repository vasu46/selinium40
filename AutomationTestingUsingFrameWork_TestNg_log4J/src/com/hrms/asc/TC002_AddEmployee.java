package com.hrms.asc;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.hrms.libf.General;

public class TC002_AddEmployee {
	
     @Test
	public void AddEmp() {
		General gen=null;
		try {
		 gen=new General();
		gen.openApplication();
		gen.verifyTitle("OrangeHRM - New Level of HR Management");
		gen.login_App();
		gen.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		gen.verifyTitle("OrangeHRM");
		gen.add_Employee();
		Thread.sleep(2000);
		gen.exit_frame();
		gen.logout_App();
		gen.closeApplication();
		}
  catch(Exception e) {
	((TakesScreenshot)gen.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmsS1.png"));
	
  }
	}

}
