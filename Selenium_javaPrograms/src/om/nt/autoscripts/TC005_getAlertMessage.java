package om.nt.autoscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class TC005_getAlertMessage {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String userName="nareshit";
	static String password="nareshit";

	public static void main(String[] args)throws Exception {
		//Luanch Browser
		System.out.println("Browser is Luanched::");
		WebDriver driver=new ChromeDriver();
		//enter the Url
		System.out.println("url is the ENterd::");
		driver.navigate().to(url);
		Thread.sleep(3000);
		//enetr the UserNmae
	 System.out.println("ENter the User name::");
	 driver.findElement(By.name("txtUserName")).sendKeys(userName);
	 //click on the Login Button
	 System.out.println("Click on the Login Button::");
	 driver.findElement(By.name("Submit")).click();
	 Thread.sleep(5000);
	 //Alert object is create
	 Alert a=driver.switchTo().alert();
	 Thread.sleep(5000);
	 //retriving the alert message
	 System.out.println("Alert Message is::"+a.getText());
	 System.out.println("click on ALert box Ok button::");
	 a.accept();
	 Thread.sleep(5000);
	 //enetr the password
	 System.out.println("ENter the password::");
	 driver.findElement(By.name("txtPassword")).sendKeys(password);
	 Thread.sleep(3000);
	 System.out.println("Click on the Login Button");
	 driver.findElement(By.name("Submit")).click();
	 Thread.sleep(5000);
	 System.out.println("login is sucessfull");
	 driver.findElement(By.linkText("Logout")).click();
	 System.out.println("Logout is the SuccessFull");
	 Thread.sleep(5000);
	 driver.close();
	 System.out.println("Application is Closed");
	 
	 
	 
		
		

	}

}
