package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksOfPage {
	public static WebDriver driver=null;
	public static void getAllLinks() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
            for(WebElement n:list) {
            	String tagName=n.getText();
            	if(!tagName.isEmpty()) {
            	System.out.println(tagName);
            	}
            	
            	
            }
	}
	public static void GetOnlyTextFromPage() {
      try {
    	  driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
        List<WebElement> textElements = driver.findElements(By.tagName("html"));
        for (WebElement element : textElements) {
            // Get the text of the element
            String text = element.getText().trim();

            // Get all <a> tags within this element
            List<WebElement> links = element.findElements(By.tagName("a"));

            // Remove text from hyperlinks
            for (WebElement link : links) {
                String linkText = link.getText().trim();
                text = text.replace(linkText, "").trim();
            }

            // Print the final text if it's not empty
            if (text.isEmpty()); 
            else {
                System.out.println(text);
            }
        }

    } finally {
        if (driver != null) {
            // Close the browser
            driver.quit();
        }
    }

}

           
	public static void SeleniumWordRepetsTime() {
		int count=0;
		driver=new ChromeDriver();
		//driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
		driver.get("https://www.selenium.dev/documentation");
		 String text=driver.findElement(By.tagName("body")).getText();
		 count=countOccurrences(text,"Selenium");
				 System.out.println(count);
		}
	    
private static int countOccurrences(String text, String word) {
    int count = 0;
    int index = 0;
    
   
    text = text.toLowerCase();
    word = word.toLowerCase();

    
    while ((index = text.indexOf(word, index)) != -1) {
        count++;
        index += word.length();
    }

    return count;
}

	public static void main(String[] args) {
		//GetOnlyTextFromPage();
		//SeleniumWordRepetsTime();
		//GetOnlyTextFromPage();
		getAllLinks();
		 
            	
            }
	}


//*[@id="root"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div[1]/div[2]/ul[1]/li/div/div
//input[@placeholder="Where from?"]/following::div/ul/li//div[2]

