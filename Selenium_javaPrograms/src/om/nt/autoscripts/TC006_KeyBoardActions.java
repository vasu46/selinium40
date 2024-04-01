package om.nt.autoscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC006_KeyBoardActions {
	 static String url="http://183.82.103.245/nareshit/login.php";
	 static String userName="nareshit";
	 static String password="nareshit";
  public static void  main(String[] args) throws Exception {
	  //1.Launch Browser
	  WebDriver driver=new ChromeDriver();
	  System.out.println("Luanch Browser::");
	  
	  //2.enetr url
	  driver.navigate().to(url);
	  System.out.println("enetr the url::");
	  Thread.sleep(3000);
	  
	  //3.enetr the username
	  driver.findElement(By.name("txtUserName")).sendKeys(userName);
	  System.out.println("enetr the Username::");
	  
	  //4/enter password
	  driver.findElement(By.name("txtPassword")).sendKeys(password);
	  System.out.println("enetr the Password::");
	  
	  //5.perform tab activity
	  Robot r=new Robot();
	  //press the Tab
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_TAB);
	  System.out.println("TAB");
	  
	  //6.press the enter
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyPress(KeyEvent.VK_ENTER);
	  System.out.println("enetr");
	  System.out.println("Login is SuccessFull::");
	  
	  //7.logout
	  driver.findElement(By.linkText("Logout")).click();
	  System.out.println("Logout is the SuccessFull::");
	  //8.close driver
	  driver.close();
	  
	 
 }
}
