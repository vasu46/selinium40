package om.nt.autoscripts;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Login_LogOut {

	public static void main(String[] args) throws Exception{
		//1.Lunch Browser
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser is Open");
		//2.Enter Url
		//driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		 driver.get("http://183.82.103.245/nareshit/login.php");
		 System.out.println("Hrms url is Entered");
		 Thread.sleep(10000);
		//3.Enter the User NAme
		   //3.1 Identify the Elememt
		     driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		   //4.enetr Password
		     driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		     System.out.println("user name and Password is enetred");
		     Thread.sleep(10000);
		   //5.close On Login Button
		     driver.findElement(By.name("Submit")).click();
		     Thread.sleep(10000);
		     System.out.println("Login HRMS IS COMPLETED");
		   //6.clisk on Logut Button
		     driver.findElement(By.linkText("Logout")).click();
		     System.out.println("LOGOUT IS COMPLETED");
		     Thread.sleep(10000);
		   //close the app
		     driver.close();
		     System.out.println("APPLICATION IS CLOSED");
		     
	}
	

}
