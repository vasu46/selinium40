package om.nt.autoscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public  class TC004_AddEmployeeUsingIFrame {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String userName="nareshit";
	static String password="nareshit";
	static String firstName="vasu";
	static String lastName="kothem";

	public static void main(String[] args)throws Exception {
		System.out.println("Luanch Browser");
	   WebDriver driver=new ChromeDriver();
	   System.out.println("Enter the Url::");
	   driver.navigate().to(url);
	   Thread.sleep(3000);
	   System.out.println("ENter the user name::");
	   driver.findElement(By.name("txtUserName")).sendKeys(userName);
	   System.out.println("ENter the password::");
	   driver.findElement(By.name("txtPassword")).sendKeys(password);
	   driver.findElement(By.name("Submit")).click();
	   System.out.println("Login is SucessFull::");
	   Thread.sleep(3000);
	   //clik on Add button
	   driver.switchTo().frame("rightMenu");
	   driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
	   Thread.sleep(3000);
	   System.out.println("enetr the employee First name::");
	   driver.findElement(By.name("txtEmpFirstName")).sendKeys(firstName);
	   System.out.println("enetr the Last name::");
	   
	   driver.findElement(By.name("txtEmpLastName")).sendKeys(lastName);
	   System.out.println("click on save Button::");
	   driver.findElement(By.id("btnEdit")).click();
	   driver.switchTo().defaultContent();
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("Logout")).click();
	   System.out.println("click on logout sucessful::");
	   driver.close();
	   System.out.println("Application closed:");
	   
	   
	   

	}

}
