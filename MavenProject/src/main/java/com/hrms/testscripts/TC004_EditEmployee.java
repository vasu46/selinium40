package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.EditEmployeePage;
import com.hrms.pages.EmployeeInformationFrame;
import com.hrms.pages.LogingPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC004_EditEmployee {
	@Test
	public void editEmp()throws Exception {
		BaseClass.openApplication();
		VerifyPage.verifyTittle("OrangeHRM");
		LogingPage.loginApp("nareshit","nareshit");
		VerifyPage.verifyTittle("OrangeHRM");
		BaseClass.waitStmt();
		EmployeeInformationFrame.enter_Frame("rightMenu");
		AddEmployeePage.AddEmp("vasu","kothem","anju","vaju");
		
		BaseClass.waitStmt();
		VerifyPage.verifyTittle("OrangeHRM");
		EditEmployeePage.edit("anjana","seelam");
		EmployeeInformationFrame.exit_Frame();
		BaseClass.waitStmt();
		LogoutPage.logout();
		BaseClass.waitStmt();
		BaseClass.closeApplication();	
	}

}
