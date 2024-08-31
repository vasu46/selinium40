package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//Actions ac=new Actions(driver);
		//ac.sendKeys(userName, "Admin").perform();;
		//ac.sendKeys(password,"admin").perform();
		
	    
		

	}

}
