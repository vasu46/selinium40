package com.hrms.as;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.hrms.lib.General;


public class TC005_AddCompanyLocation {
	
	General gen=null;
      @Test
	public void TC05() {
		gen=new General();
		try {
			gen.openApplication();
			gen.verifyTitle("OrangeHRM - New Level of HR Management");
			gen.login_App();
			gen.company_Location();
		gen.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			gen.closeApplication();
			
 		}
		catch(Exception e) {
			((TakesScreenshot)gen.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmstc05.png"));
		}
		

	}

}
