package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.EmployeeInformationFrame;
import com.hrms.pages.LogingPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC002_AddEmployee {
	@Test
	public void AddEmp()throws Exception {
		BaseClass.openApplication();
		VerifyPage.verifyTittle("OrangeHRM - New Level of HR Management");
		LogingPage.loginApp("nareshit","nareshit");
		BaseClass.waitStmt();
		VerifyPage.verifyTittle("OrangeHRM");
		EmployeeInformationFrame.enter_Frame("rightMenu");
		AddEmployeePage.AddEmp("anjana","vasu","anju","van");
		VerifyPage.verifyTittle("OrangeHRM");
		BaseClass.waitStmt();
		EmployeeInformationFrame.exit_Frame();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
