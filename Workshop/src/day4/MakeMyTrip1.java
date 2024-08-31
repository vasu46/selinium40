package day4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip1 {
    public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		// Close the initial popup if present
		driver.findElement(By.xpath("//div[contains(@class,'imageSliderModal')]//span[@class='commonModal__close']")).click();
		
		// Select the 'From' city
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("hy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		
		// Select the 'To' city
		driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox searchToCity inactiveWidget')]//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open') and @placeholder='To']")).sendKeys("ban");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open') and @placeholder='To']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		// Open the date picker
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		// Calculate the next day's date
		LocalDate nextDay = LocalDate.now().plusDays(1);
		String expectedMonth_Year = nextDay.format(DateTimeFormatter.ofPattern("MMMM yyyy"));
		String travleDay = String.valueOf(nextDay.getDayOfMonth());
		
		// Capture the month and year and navigate to the expected month and year
		while (true) {
		    List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'DayPicker')]//div[@class='DayPicker-Month']/div"));
		    WebElement ele = list.get(0);
		    String monthAndYear = ele.getText();
		    if (expectedMonth_Year.equals(monthAndYear)) {
		        break;
		    }
		    driver.findElement(By.xpath("//span[@role='button' and @aria-label='Next Month']")).click();
		}
		
		// Select the specific travel day
		List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'DayPicker')]//div[@class='DayPicker-Month']/div/following-sibling::div[contains(@class,'DayPicker-Body')]//p[contains(text(),'" + travleDay + "')]"));
		for (WebElement date : dates) {
		    if (date.getText().equals(travleDay)) {
		        date.click();
		        break;
		    }
		}
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		System.out.println("Next day's date selected and search finished.");
		Thread.sleep(5000);
		// Optionally, you can close the driver
		driver.quit();
		
    	
		/*LocalDate ldt=LocalDate.now();
		System.out.println(ldt);
		System.out.println(ldt.plusDays(1));
		LocalDate nextDay=ldt.plusDays(1);
		String expectedMonthYear=nextDay.format(DateTimeFormatter.ofPattern("MMMM yyyy"));
		System.out.println(expectedMonthYear);
		int day=nextDay.getDayOfMonth();
		System.out.println(day);
		String travelDay=String.valueOf(day);
		System.out.println(travelDay);*/
		
    }
}
