package utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] getData(String excelFilePath) throws IOException {
		//to open excel file
		XSSFWorkbook book=new XSSFWorkbook(excelFilePath);
		//To open a sheet from the excel
		XSSFSheet sheet = book.getSheet("Sheet1");
		//To find no .of active rows in sheet
		int Rowcount = sheet.getLastRowNum();
		System.out.println("Row Count:"+ Rowcount);
		//to find the no.of active column in the sheet
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("column count:"+ colcount);
		// iterate the rows using for loop
		//create 2D array of string to store the data
		String[][]data =new String[Rowcount][colcount];
		for (int i = 1; i <= Rowcount; i++) {
			XSSFRow eachrow = sheet.getRow(i);
			//iterate the columns inside the row to get the data
			for (int j = 0; j < colcount; j++) {
				XSSFCell eachcell = eachrow.getCell(j);
				String value = eachcell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}
		}
	book.close();
	return data;
	}
	

}
