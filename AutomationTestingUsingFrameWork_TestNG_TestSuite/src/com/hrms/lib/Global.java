package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Global {
	//Global variable for ALL methods
	public WebDriver driver;
	
	//Test data for all the APPLICATION
	public String url="http://183.82.103.245/nareshit/login.php";
	public String log_userName="nareshit";
	public String log_password="nareshit";
	public String emp_first_name="suresh";
	public String emp_last_name="suresh";
	public String emp_middle_name="vasu";
	public String emp_nick_name="kothem";
	public String photo_path="‪D://images//rashimika.jfif";
	public String search_emp_No="4254";
    public String edit_firstName="Anjana";
    public String edit_lastName="seelm";
    public String location_name="Nuzvid";
    public String state="AP";
    public String address="Ravicharal Nuzvid[Mandal] Krishna[Dist] AP";
    public String zipCode="521201";
    public String phoneNum="7989880205";
    
	
	
	//Object Indentification for whole Application
	public String txt_userName="txtUserName";
	public String txt_password="txtPassword";
	public String but_Login="Submit";
	public String link_logout="Logout";
	public String pim_module="PIM";
	public String add_emp="Add Employee";
	public String txt_emp_first_name="txtEmpFirstName";
	public String txt_emp_last_name="txtEmpLastName";
	public String txt_middle_name="txtEmpMiddleName";
	public String txt_nick_name="txtEmpNickName";
	public String txt_fileUpload="//input[@type='file'][@id='photofile']";
	public String but_newEmp_save="//input[@type='button'][@id='btnEdit']";
	public String frame_name="rightMenu";
	public String txt_dropdown="loc_code";
	public String txt_search="loc_name";
	public String btn_search="//input[@type='button'][@value='Search']";
	public String checkbox_select="chkLocID[]";
	public String btn_delete="//input[@type='button'][@value='Delete']";
	public String btn_edit="//input[@name='EditMain'][@value='Edit']";
	public String txt_edit_firstName="txtEmpFirstName";
	public String txt_edit_lastName="txtEmpLastName";
	public String btn_edit_save ="//input[@id='btnEditPers'][@title='Save']";
	public String admin_Module="Admin";
	public String company_Info="Company Info";
	public String locations="Locations";
	public String add_Loaction="//input[@type='button'][@value='Add']";
	public String txt_location_name="txtLocDescription";
	public String txt_Loc_DropDown="cmbCountry";
	public String txt_Location_State="txtState";
	public String txt_Loaction_Add="txtAddress";
	public String txt_ZipCode="txtZIP";
	public String txt_phoneNum="txtPhone";
	public String btn_save_loc="savebutton";
	
			
	
	

}
