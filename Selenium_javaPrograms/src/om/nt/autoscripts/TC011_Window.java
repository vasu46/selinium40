package om.nt.autoscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC011_Window {

	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///G:/window.html");
		//1.window
		System.out.println("Browser is Launched and url enetred:;");
		//2.window
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		//3.window
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		//navigate to first window
		//ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
		 String wind=driver.getWindowHandle();
		 System.out.println("go to first window::");
		driver.switchTo().window(wind);
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	
		

	}

}
