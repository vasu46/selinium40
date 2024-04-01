package om.nt.autoscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class TC014_DragAndDrop {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		System.out.println("url enetrd:;");
		Thread.sleep(3000);
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("Tittle Matched");
		
		driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();
		
		
	     
   }

}
