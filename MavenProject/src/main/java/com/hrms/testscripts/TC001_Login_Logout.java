package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LogingPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001_Login_Logout {
	@Test
 public void tcoo1() {
	 BaseClass.openApplication();
	 VerifyPage.verifyTittle("hrms");
	LogingPage.loginApp("nareshit","nareshit");
	VerifyPage.verifyTittle("OrangeHRM");
	LogoutPage.logout();
	BaseClass.closeApplication();
 }

}
