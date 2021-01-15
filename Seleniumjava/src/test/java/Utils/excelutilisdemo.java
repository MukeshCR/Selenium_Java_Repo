package Utils;

public class excelutilisdemo {
	public static void main(String[] args) throws Exception {
		
		String projectpath = System.getProperty("user.dir");
		
		ExcelUtils excel = new ExcelUtils(projectpath+"/Excel/TestData.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataNum(1, 1);
		excel.getCellDatastring(0, 0);
		
		
	}

}
