package om.nt.autoscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public  class TC000_FullApplicationAutoScript {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String tittle1="OrangeHRM - New Level of HR Management";
	static String userName="nareshit";
	static String password="nareshit";
	static String tittle2="OrangeHRM";
	static String firstName="anjana";
    static String lastName="seelam";
    
	public static void main(String[] args) throws Exception {
		//1.Launch Browser
		System.out.println("Launch Browser");
		WebDriver driver=new ChromeDriver();
		//2.Enter Url
		System.out.println("enetr the Url");
		driver.navigate().to(url);
		Thread.sleep(4000);
		//3.verify the Tittle
		System.out.println("Tittle Verification::");
		if(driver.getTitle().equals(tittle1)) {
			System.out.println("Tittle is MATCHED::");
			
		}
		else{
			System.out.println(driver.getTitle());
			System.out.println("Title is not matched::");
		}
		Thread.sleep(4000);
      //4.enetr  username
		System.out.println("enetr the Username::");
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
	//5.emetr the password
		System.out.println("enter the password::");
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(4000);
	//6.Click on Login page
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login is successFull");
		Thread.sleep(4000);
	//7.verify the Title
		System.out.println("Verify the Tittle in Home PAGE::");
		if(driver.getTitle().equals(tittle2)) {
			System.out.println("Title is Matched:: ");
		}
		else {
			System.out.println("Title is not matched::");
			System.out.println(driver.getTitle());
		  }
		Thread.sleep(4000);
		
		//9.Mouse over the Admin 
		//see company Information
		Actions action=new Actions(driver);
		  System.out.println("Click on Adimin click::");
		 action.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
		 Thread.sleep(4000);
		 System.out.println("Company Info::");
		 action.moveToElement(driver.findElement(By.linkText("Company Info"))).perform();
		 Thread.sleep(4000);
		 System.out.println("Click on general::");
         driver.findElement(By.linkText("General")).click();
         Thread.sleep(6000);
         
         //10.add Employee in PiM MODULE
           System.out.println("Go to PIM MODULE:;");
          action.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
          Thread.sleep(4000);
          //CLICK ON Add employee
          System.out.println("CLICK ON ADD EMPLOYEE::");
           Thread.sleep(4000);
          driver.findElement(By.linkText("Add Employee")).click();
            driver.switchTo().frame("rightMenu");
          System.out.println("Enter the first name");
          driver.findElement(By.name("txtEmpFirstName")).sendKeys(firstName);
          System.out.println("eneter the Last name::");
          driver.findElement(By.name("txtEmpLastName")).sendKeys(lastName);
          Thread.sleep(4000);
          System.out.println("click on Save Button::");
          driver.findElement(By.id("btnEdit")).click();
          Thread.sleep(4000);
          //click on back Buttonm
          driver.findElement(By.xpath("//input[@type='button']")).click();
          Thread.sleep(4000);
          driver.switchTo().defaultContent();
         
		//8.Logout
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout is the Successful");
	}//main

}//class
