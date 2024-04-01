package com.hrms.as;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hrms.lib.General;

public class TC004_EditEmployee {

	public static void main(String[] args) {
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
