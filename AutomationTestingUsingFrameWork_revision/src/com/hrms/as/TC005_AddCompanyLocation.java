package com.hrms.as;

import org.openqa.selenium.WebDriver;

import com.hrms.lib.General;

public class TC005_AddCompanyLocation {

	public static void main(String[] args) {
		WebDriver driver;
		General gen=null;
		try {
			gen=new General();
			gen.openApplication();
			gen.verifyTitle("OrangeHRM - New Level of HR Management");
			gen.login_App();
			gen. company_Location();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
