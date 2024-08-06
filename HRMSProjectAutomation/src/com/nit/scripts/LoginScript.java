package com.nit.scripts;

import java.time.Duration;

import com.nit.lib.Global;
import com.nit.lib.General;
public class LoginScript {
	static General gen=new General();
	public static void main(String[] args)throws Exception {
		System.out.println("Main start");
		  gen.openapplication();
		  gen.verifyTitel("OrangeHrms");
		  gen.loginFuction();
		  Thread.sleep(2000);
		  gen.verifyTitel("OrangeHrms");
		  gen.closeApplication();
	}
}
