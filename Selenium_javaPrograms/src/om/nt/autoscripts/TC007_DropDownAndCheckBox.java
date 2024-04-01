package om.nt.autoscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC007_DropDownAndCheckBox {
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
		Thread.sleep(3000);
		//SELECT DROP DOWN CONTETN BY USING SELECTBYVISIBLETEXT
		//add frame
		System.out.println("application is enterd into frame::");
		driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name("loc_code")));
		//SELECT DROP DOWN CONTETN BY USING SELECTBYVISIBLETEXT
		//st.selectByVisibleText("Emp. ID");
		
		//SELECT DROP DOWN CONTETN BY USING SelectByIndex
		  // st.selectByIndex(1);
		
		//SELECT DROP DOWN CONTETN BY USING SelecTByValue
		 st.selectByValue("0");
		System.out.println("select drop down data as needed::");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loc_name")).sendKeys(emp_Id);
		System.out.println("enetr the dropdown selected data");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("search for the Employee as by emp id::");
		Thread.sleep(3000);
		
		driver.findElement(By.name("chkLocID[]")).click();
		System.out.println("select checkbox fro delete::");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.println("delete button will be pressed::");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("application is come out from frame::");
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout will be secussed::");
		Thread.sleep(2000);
		driver.close();
		System.out.println("CLOSE THE APPLICATION::");
		
		
		
		
		
		
		
		

	}

}
