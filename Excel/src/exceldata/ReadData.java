package exceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData 
{
	@Test 
	public void readdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:/seleniumm/Excel/excelsheet/actitime.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("login");
		Row r= s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c.getStringCellValue());
		
		System.out.println(wb.getSheet("login").getRow(1).getCell(1).toString());
		
		
		
		
	}

}
