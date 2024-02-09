package com.generics.actitime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getCellValue(String sheet, int row, int cell) throws IOException
	{
//		FileInputStream fis = new FileInputStream(excel_path);
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//	   
//		String cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
//		return cellvalue;
		
		FileInputStream fis = new FileInputStream(prop_path);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(sheet);
		
		
	}

}
