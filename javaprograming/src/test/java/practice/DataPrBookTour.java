package practice;

import org.testng.annotations.DataProvider;

public class DataPrBookTour {
@DataProvider(name="book")
public static Object[][] getData()
{
	Object [][] objArr=new Object[1][3];
	objArr[0][0]= "22";
	objArr[0][1]= "23";
	objArr[0][2]= "comment1 ";
	/*
	 * objArr[0][2]= "comment1 "; objArr[1][0]= "25"; objArr[1][1]= "27";
	 * objArr[1][2]= "comment2"; objArr[2][0]= "28"; objArr[2][1]= "29";
	 * objArr[2][2]= "comment3";
	 */
	return objArr;
}
}
