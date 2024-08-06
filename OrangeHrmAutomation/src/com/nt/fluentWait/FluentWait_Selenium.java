package com.nt.fluentWait;


	// TODO Auto-generated method stub
		// Import necessary packages
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.FluentWait;
		import java.time.Duration;
		import java.util.NoSuchElementException;
		import java.util.function.Function;

		public class FluentWait_Selenium {
		    public static void main(String[] args) {
		        // Set the path to the WebDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the desired web page
		        driver.get("http://183.82.103.245/nareshit/login.php");

		        // Create an instance of FluentWait with a timeout of 30 seconds and a polling frequency of 5 seconds
		        FluentWait<WebDriver> wait = new FluentWait<>(driver)
		                .withTimeout(Duration.ofSeconds(30))
		                .pollingEvery(Duration.ofSeconds(5))
		                .ignoring(NoSuchElementException.class);

		        // Define the condition to wait for the username field to be present
		        WebElement usernameField = wait.until(new Function<WebDriver, WebElement>() {
		            public WebElement apply(WebDriver driver) {
		                return driver.findElement(By.name("txtUserName"));
		            }
		        });

		        // Enter the username
		        usernameField.sendKeys("yourUsername");

		        // Define the condition to wait for the password field to be present
		        WebElement passwordField = wait.until(new Function<WebDriver, WebElement>() {
		            public WebElement apply(WebDriver driver) {
		                return driver.findElement(By.name("txtPassword"));
		            }
		        });

		        // Enter the password
		        passwordField.sendKeys("yourPassword");

		        // Define the condition to wait for the login button to be clickable
		        WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
		            public WebElement apply(WebDriver driver) {
		                WebElement element = driver.findElement(By.name("Submit"));
		                if (element.isEnabled() && element.isDisplayed()) {
		                    return element;
		                }
		                return null;
		            }
		        });

		        // Click the login button
		        loginButton.click();

		        // Close the browser after some time (for demo purposes)
		        // In a real test, you might want to add more checks or assertions
		        try {
		            Thread.sleep(5000); // Wait for 5 seconds to observe the result
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        driver.quit();
		    }
	

	}


