package day5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoBrowsersOpenInTwodifferentTags {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver() ;
		driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			 driver.switchTo().newWindow(WindowType.TAB);
			driver.switchTo().newWindow(WindowType.WINDOW);
			//driver.get("https://www.opencart.com/index.php?route=cms/demo");
			System.out.println("vasis");
			
			 
		

	}

}
