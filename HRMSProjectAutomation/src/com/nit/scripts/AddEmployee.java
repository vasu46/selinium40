package com.nit.scripts;


import java.time.Duration;

import com.nit.lib.General;
public class AddEmployee {

	public static void main(String[] args)throws Exception {
		System.out.println("Main START");
		General gen=new General();
		gen.openapplication();
		gen.verifyTitel("OrangeHRM - New Level of HR Management");
		gen.loginFuction();
		gen.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		gen.verifyTitel("OrangeHRM");
		gen.addEmployee();
		gen.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    gen.exeitFrame();
	   Thread.sleep(2000);
	   gen.closeApplication();
	}

}
