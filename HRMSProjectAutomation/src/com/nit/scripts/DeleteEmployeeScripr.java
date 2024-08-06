package com.nit.scripts;

import java.time.Duration;

import com.nit.lib.General;

public class DeleteEmployeeScripr {

	public static void main(String[] args)throws Exception {
		System.out.println("main methid execution start");
		General gen=new General();
		gen.openapplication();
		gen.verifyTitel("OrangeHRM - New Level of HR Management");
		gen.loginFuction();
		gen.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		gen.deleteEmployee("4137");
		gen.enterFrame();
		gen.closeApplication();

	}

}
