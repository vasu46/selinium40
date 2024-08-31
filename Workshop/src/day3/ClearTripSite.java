package day3;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTripSite {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.navigate().refresh();
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		ele.sendKeys("hyd");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div[1]/div[2]/ul/li//p"));
		for (WebElement n : list) {
		    String str = n.getText();
		    System.out.println(str);
		    if (str.equals("Hyderabad, IN - Rajiv Gandhi International (HYD)")) 
		      n.click();
		     System.out.println("hyd selcted::");
		        break;
		    }
		}
	  //s driver.findElement(By.xpath("//input[@placeholder="Where to?\" ]"))
	   
		 
		    
	
		
		 
	}


