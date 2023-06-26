package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String readstringdata(int i, int j) throws IOException
	{
		f = new FileInputStream("C:\\MavenExcel\\Excelread.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}
	public static String readintegerdata(int i,int j) throws IOException
	{
		f = new FileInputStream("C:\\MavenExcel\\Excelread.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int a = (int) c.getNumericCellValue();
		return String.valueOf(a);

		
	}

}

