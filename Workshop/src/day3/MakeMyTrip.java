package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {
    static String expectedMonth_Year = "October 2024";
    static String travleDay = "19";

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        // Close the initial popup if present
        driver.findElement(By.xpath("//div[contains(@class,'imageSliderModal')]//span[@class='commonModal__close']")).click();

        // Select the 'From' city
        driver.findElement(By.xpath("//span[text()='From']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("new");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

        // Select the 'To' city
        driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox searchToCity inactiveWidget')]//span[text()='To']")).click();
        driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open') and @placeholder='To']")).sendKeys("mum");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open') and @placeholder='To']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        // Open the date picker
        driver.findElement(By.xpath("//span[text()='Departure']")).click();

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
Thread.sleep(7000);

 

		
		System.out.println("Next day's date selected and search finished.");

        
        // Optionally, you can close the driver
        //driver.quit();
    }
}