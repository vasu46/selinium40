package om.nt.autoscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC009_FileUploading {
	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login SucessFull::");
        Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Divya");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("vasu");
		WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@id='photofile']"));
		fileInput.sendKeys("D://Apache Software Foundation/servlet_Images/home.png");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}

}
