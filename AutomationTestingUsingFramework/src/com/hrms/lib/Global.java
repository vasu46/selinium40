package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//Goldal visible of driver class
	WebDriver driver;
	//TEST DATA
	String url="http://183.82.103.245/nareshit/login.php";
	String login_UserName="nareshit";
	String login_Password="nareshit";
	String addEmp_FirstName="vasu";
	String addEmp_LastName="Kothem";
	
	//Object/Element Data
	String txt_loginName="txtUserName";
	String txt_loginPassword="txtPassword";
	String btn_login="Submit";
	String emp_details_fame="rightMenu";
	String btn_add="//input[@value='Add']";
	String txt_addEmpFirstName="txtEmpFirstName";
	String txt_addEmpLastName="txtEmpLastName";
	String btn_save="btnEdit";
	String link_logout="Logout";
	
	
	
    
}
