package exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData 
{
	@Test
	public void writedata() throws IOException
	{
		FileInputStream fis = new FileInputStream("./excelsheet/actitime.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.createSheet("sss");
		Row r= s.createRow(5);
		Cell c= r.createCell(7);
		c.setCellValue("helllooooo");
		
		FileOutputStream fos = new FileOutputStream("./excelsheet/actitime.xlsx");
		wb.write(fos);
		
		System.out.println(wb.getSheet("sss").getRow(5).getCell(7).getStringCellValue());
		
		
	}

}
