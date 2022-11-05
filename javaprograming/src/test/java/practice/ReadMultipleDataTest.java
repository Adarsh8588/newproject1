package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.torism.GenericUtilities.ExcelUtility;

public class ReadMultipleDataTest {
@Test(dataProvider ="getData")
public void readData(String src,String dst)
{
	
	System.out.println(src+"    "+dst+"  ");
}
@DataProvider
public Object[][] getData() throws Throwable
{
	ExcelUtility elib=new ExcelUtility();
	Object[][] value = elib.readMultipleData("readm");
	return value;
}
}
