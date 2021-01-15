package Readexcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws Exception  {
		
		File src = new File("E:\\Mukesh\\DTT\\Excel\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		String dataString= sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is " + dataString);
		
		String dataString1= sh1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is " + dataString1);
		
		wb.close();

	}

}
