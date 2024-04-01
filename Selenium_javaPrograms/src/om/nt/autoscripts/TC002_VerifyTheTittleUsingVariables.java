package om.nt.autoscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_VerifyTheTittleUsingVariables {
	static String url="http://183.82.103.245/nareshit/login.php";
	static  String  tittle1="OrangeHRM - New Level of HR Management";
	static String tittle2="OrangeHRM";
	static String userName="txtUserName";
	static String password="txtPassword";

	public static void main(String[] args)throws Exception {
		//1.Launch BROWSER
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser is Launched");
		Thread.sleep(3000);
		
		
		//2.ENETR URL
		driver.navigate().to(url);
		System.out.println("URL IS ENTERD::");
		Thread.sleep(3000);
		
		//3.VERIFY THE TITTLE
		if(driver.getTitle().equals(tittle1)) {
			System.out.println("TITTLE IS MATCH");
		}
		else {
			System.out.println("TITTLE IS NOT MATCH");
			System.out.println(driver.getTitle());
		}
		System.out.println("Tittle is verifyed");
		Thread.sleep(3000);
		
		//4.enetr user name
		driver.findElement(By.name(userName)).sendKeys("nareshit");
		System.out.println("USER NAME IS ENTERD");
		Thread.sleep(3000);
		
		//5.enetr password
		driver.findElement(By.name(password)).sendKeys("nareshit");
		System.out.println("Password is the ENTERD::");
		Thread.sleep(3000);
		
		//6.CLICK ON LOGIN BUTTON
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN IS SUCCESS");
		Thread.sleep(3000);
		
		//7.VERIFY THE HOME PAGE TITTLE
	     if(driver.getTitle().equals(tittle2)) {
	    	 System.out.println("TITTLE MATCH");
	     }
	     else{
	    	 System.out.println("TITTLE DOES NOT MATCH");
	    	 System.out.println(driver.getTitle());
	     }
	      System.out.println("TILLE VERIFIED");
	      Thread.sleep(3000);
	      
	      //8.LICK ON lOGOUT LINK
	     driver.findElement(By.linkText("Logout")).click();
	     System.out.println("logout is done");
	     
	     //CLOSE THE APP
	       driver.close();
	       System.out.println("app is closed");
	     }//MAIN
		
}//CLASS
