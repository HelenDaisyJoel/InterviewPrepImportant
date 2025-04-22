package testPackage;

import utilities.ExcelReader;

public class ExcelReading {
	public static void main(String[] args) {
		ExcelReader excel=new ExcelReader(".\\src\\test\\resources\\excel\\LoginTest.xlsx");
		String sheetName="LoginTest";
		System.out.println(excel.getRowCount(sheetName));
		System.out.println(excel.getColumnCount(sheetName));	
	}

}
