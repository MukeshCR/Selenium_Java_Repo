package ownAutomated;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fO;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static void setExcelFile(String xlfile, String xlsheet) throws Exception {
		FileInputStream excelfile = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(excelfile);
		sh = wb.getSheet(xlsheet);
		}
	
	public static int getRowCount(String xlfile, String xlsheet) throws Exception {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(xlsheet);
		int rowcount = sh.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;

}
	
	public static int getCellCount(String xlfile, String xlsheet, int rownum) throws Exception {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(xlsheet);
		row = sh.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	 

	public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws Exception {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(xlsheet);
		row = sh.getRow(rownum);
		cell = row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter  = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
			
		} catch (Exception e) {
			{
				data="";
			}
		wb.close();
		fi.close();
		return data; 
		}
	}
	
	public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws Exception {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(xlsheet);
		row = sh.getRow(rownum);
		cell = row.getCell(colnum);
		cell.setCellValue(data);
		fO = new FileOutputStream(xlfile);
		wb.write(fO);
		wb.close();
		fi.close();
		fO.close();
	}
	
}


