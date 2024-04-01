package om.nt.autoscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC012_WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//1.enetr the url
		driver.navigate().to("file:///G:/WebTable.html");
		//count Row Number
		int rows=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		int colsCount=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		int rows_cols=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		
		System.out.println("no rows in Table"+rows);
		System.out.println("no colss in Table"+colsCount);
		System.out.println("no rows_cols in Table"+rows_cols);
		
		String cellData=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[3]/td[2]")).getText();
		  System.out.println("cell data::"+cellData);
		    for(int i=1;i<rows;i++) {
		  String allCellData=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
		     
		    System.out.println("allCellData::"+allCellData);
		    }

	}

}
