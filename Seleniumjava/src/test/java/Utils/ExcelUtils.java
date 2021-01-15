package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public ExcelUtils(String excelpath, String Sheetname) throws Exception {
		projectpath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook("excelpath");
		sheet = workbook.getSheet("Sheetname");


	}


	public static void main(String[] args) throws Exception {
		getRowCount();
		getCellDataNum(1,1);
		getCellDatastring(0,0);
	}


	public static void getRowCount() throws Exception {

		projectpath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectpath +"\\Excel\\TestData.xlsx");
		sheet = workbook.getSheet("Sheet1");

		int Rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows" + Rowcount);

	}

	public static void getCellDataNum(int rowNum, int cellNum) throws Exception {

		Double cellData = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		System.out.println(cellData);

	}

	public static void getCellDatastring(int rowNum, int cellNum) throws Exception {

		String cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		System.out.println(cellData);
	}
}
