package om.nt.autoscripts;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class WorkingWithExcelUsingJxl {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("G:\\EmpDetails.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		/*
		 * int row=3; String sno=st.getCell(0,row).getContents(); String
		 * sname=st.getCell(1,row).getContents(); String
		 * cours=st.getCell(2,row).getContents(); String
		 * job=st.getCell(3,row).getContents();
		 * System.out.println("sno::"+sno+",sname::"+sname+",course::"+cours+",job::"+
		 * job); int count=st.getRows(); System.out.println(count); int
		 * colCount=st.getColumns(); System.out.println(colCount);
		 */
		int count=st.getRows();
		for(int i=1;i<count;i++) {
			String sno=st.getCell(0,i).getContents();
			String sname=st.getCell(1,i).getContents();
			String course=st.getCell(2,i).getContents();
			String job=st.getCell(3,i).getContents();
			System.out.println("sno:"+sno+",sname::"+sname+", course::"+course+",job::"+job);
		}
	}

}
