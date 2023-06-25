package excelread;

import java.io.IOException;

public class ExcelReadMain 
{

	public static void main(String[] args) throws IOException 
	{
		String x = ExcelRead.readstringdata(0, 0);
		System.out.println(x);
		String y = ExcelRead.readintegerdata(1, 0);
		System.out.println(y);
	

	}
	

}
