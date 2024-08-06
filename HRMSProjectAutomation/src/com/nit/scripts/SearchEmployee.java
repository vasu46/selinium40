package com.nit.scripts;

import com.nit.lib.General;

public class SearchEmployee {

	public static void main(String[] args) throws Exception {
		System.out.println("Execution satr");
		General gen=new General();
		gen.openapplication();
		gen.verifyTitel("OrangeHRM - New Level of HR Management");
		gen.loginFuction();
		gen.verifyTitel("OrangeHRM");
		gen.addEmployee();
		gen.exeitFrame();
		Thread.sleep(2000);
		gen.searchEmployee();
		gen.exeitFrame();
		gen.closeApplication();
	    }
	 

}
