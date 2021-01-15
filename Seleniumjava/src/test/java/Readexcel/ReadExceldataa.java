package Readexcel;

import exceldataconfig.exceldatareuse;

public class ReadExceldataa {

	public static void main(String[] args) {
		
		exceldatareuse excel = new exceldatareuse("E:\\Mukesh\\DTT\\Excel\\TestData.xlsx");
		
		System.out.println(excel.getData(0, 2, 1));

	}

}
