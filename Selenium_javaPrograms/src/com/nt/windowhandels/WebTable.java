package com.nt.windowhandels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///G:/WebTable.html");
		int row_count=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		System.out.println("row count is::"+row_count);
		int col_count=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		System.out.println("col_count::"+col_count);
		int ro_co=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println("row and columns::"+ro_co);
		
		String cellData=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(cellData);
		
		for(int i=1;i<=row_count;i++) {
			String AllCellData=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
			System.out.println(AllCellData);
		   
		}
	                	      
	}                                 

}
