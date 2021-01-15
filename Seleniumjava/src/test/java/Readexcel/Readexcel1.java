package Readexcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel1 {
		public static void main(String[] args) throws Exception  {
			
			File src = new File("E:\\Mukesh\\DTT\\Excel\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1= wb.getSheetAt(0);
			
			int rowcount= sh1.getLastRowNum();
			System.out.println("Total no of rows " + rowcount);
			
			for(int i =0; i<rowcount; i++)
			{
				String data = sh1.getRow(i).getCell(0).getStringCellValue();
				
				System.out.println("Test Data from excel is" + data);
			}
			wb.close();
	}

}
