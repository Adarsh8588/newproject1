package practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {

	@Test
	public void hardassert()
	{
		
		System.out.println("executed line 1");
		System.out.println("executed line 2");
		System.out.println("executed line 3");
		assertEquals("a","b");
		
		System.out.println("executed line 4");
		System.out.println("executed line 5");
		
	}
	@Test
	public void softaassert()
	{
		
		System.out.println("executed line 1");
		System.out.println("executed line 2");
		System.out.println("executed line 3");
	 SoftAssert sa = new SoftAssert();
		sa.assertEquals("a","b");
		
		System.out.println("executed line 4");
		System.out.println("executed line 5");
		sa.assertAll();
	}
	
}



