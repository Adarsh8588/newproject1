package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(1);
		cell.setCellValue("hello");
		FileOutputStream fo=new FileOutputStream(".\\src\\test\\resources\\testdata.xlsx");
		book.write(fo);
		

	}

}
