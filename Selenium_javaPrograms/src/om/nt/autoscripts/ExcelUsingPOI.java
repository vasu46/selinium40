package om.nt.autoscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUsingPOI {

	public static void main(String[] args)throws Exception {
		FileInputStream file=new FileInputStream("G:\\student.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println(sh.getSheetName());
		System.out.println(sh.getLastRowNum());
		System.out.println("before Updateing::"+sh.getRow(1).getCell(2));
		 
		XSSFCell cell=sh.getRow(2).getCell(1);
		cell.setCellValue("c++");
		file.close();
		FileOutputStream fo=new FileOutputStream("G:\\\\student.xlsx");
		wb.write(fo);
        System.out.println("Updateing dat after write is done::"+cell.getRichStringCellValue());		
		 
	}

}
