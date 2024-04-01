package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.DeleteEmployeePage;
import com.hrms.pages.EmployeeInformationFrame;
import com.hrms.pages.LogingPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC003_DeleteEmployee {
	@Test
	public void deleteEmployee()throws Exception {
		BaseClass.openApplication();
		VerifyPage.verifyTittle("OrangehRM");
		LogingPage.loginApp("nareshit","nareshit");
		VerifyPage.verifyTittle("OrangeHRM");
		BaseClass.waitStmt();
		EmployeeInformationFrame.enter_Frame("rightMenu");
		DeleteEmployeePage.deleteEmp("Emp. ID","0862");
		VerifyPage.verifyTittle("OrangeHRM");
		BaseClass.waitStmt();
		EmployeeInformationFrame.exit_Frame();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
