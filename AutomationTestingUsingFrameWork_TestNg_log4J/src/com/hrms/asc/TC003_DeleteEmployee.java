package com.hrms.asc;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.hrms.libf.General;

public class TC003_DeleteEmployee {

	@Test
   public void del_Emp() {
		General gen=null;
		try {
			gen=new General();
			gen.openApplication();
			gen.login_App();
			gen.deleteEmployee();
			Thread.sleep(2000);
			gen.logout_App();
			gen.closeApplication();
			gen.closeApplication();
		}
		catch(Exception e) {
			((TakesScreenshot)gen.driver).getScreenshotAs(OutputType.FILE).renameTo(new File("G:\\screenshot\\hrmsS2.png"));
		}

	}

}
