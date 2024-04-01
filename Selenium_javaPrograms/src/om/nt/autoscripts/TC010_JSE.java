package om.nt.autoscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TC010_JSE {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		WebElement logintbtn=driver.findElement(By.name("Submit"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("argument[0].click();logintbtn");
	System.out.println("login sucessful");
	}

}
