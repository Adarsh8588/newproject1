package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelMultipleReadTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Bookp1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("sheet1");
		int count = sheet.getLastRowNum();
		for(int i=0;i<=count;i++)
		{
			Row row = sheet.getRow(i);
			short c = row.getLastCellNum();
			for(int j=0;j<=c-1;j++)
			{
				Cell cell = row.getCell(j);
				String value = cell.toString();
				System.out.println(value);
			}
			
		}
		

	}

}
