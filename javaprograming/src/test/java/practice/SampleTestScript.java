package practice;

import java.util.Date;

import org.testng.annotations.Test;

public class SampleTestScript {
	@Test
public void sampletest1()
{
	System.out.println("sampletest1");
}
	
	@Test
public void sampletest2()
{
	System.out.println("sampletest2");
}
	@Test
public void sampletest3()
{
	System.out.println("sampletest3");
}
	@Test
public void sampletest4()
{
	Date date=new Date();
	String ndate = date.toString();
	System.out.println(ndate);
}
}
