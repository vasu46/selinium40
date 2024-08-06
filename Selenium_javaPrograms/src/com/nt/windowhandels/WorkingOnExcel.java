package com.nt.windowhandels;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class WorkingOnExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream is=new FileInputStream("G:\\EmpDetails.xls");
		Workbook wb=Workbook.getWorkbook(is);
		Sheet s1=wb.getSheet(0);
		String names=s1.getCell(1,0).getContents();
		System.out.println(s1.getRows());
		System.out.println(names);
		System.out.println("=================================");
		int rows=s1.getRows();
		for(int i=0;i<rows;i++) {
			String names1=s1.getCell(0,i).getContents();
			String names2=s1.getCell(1,i).getContents();
			System.out.println(names1+"  "+names2);
			System.out.println("=======================");
		
			
		}
		
		

	}

}
