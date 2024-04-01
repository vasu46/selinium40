package om.nt.autoscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC008_DropDownAndCheckBoxUsingWaitStatdement {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String userName="nareshit";
	static String password="nareshit";
	static String emp_Id="10000";
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.launch Browser
		WebDriver driver=new ChromeDriver();
		
		//2.enetr the Url
		driver.navigate().to(url);
		System.out.println("enetr the url::");
		Thread.sleep(3000);
		
		//3.enetr the Username
		driver.findElement(By.name("txtUserName")).sendKeys(userName);
		
		//4.emetr the the password
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		//3.wait until Login button found By using Explicit WaitSatatement
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));		
		//press the tab key
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Tab enetr::");
		Thread.sleep(2000);
		//press the ernetr kery
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Enetr key enetr::");
		System.out.println("Login is SuccessFull::");
		
		//wait is implesit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout will be secussed::");
		Thread.sleep(2000);
		driver.close();
		System.out.println("CLOSE THE APPLICATION::");
		
		
		
		
		
		
		
		

	}

}
