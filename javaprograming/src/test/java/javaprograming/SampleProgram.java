package javaprograming;

import org.testng.annotations.Test;

public class SampleProgram {
	@Test
public void sample()
{
	String [ ]a= {"121768789","342","4254","41132","4132423"};
	int lentgh=a[0].length();
	for(int i=0;i<a.length;i++)
	{
		if(a[i].length()>lentgh)
		{
			lentgh=a[i].length();
		}
	}
	for(int j=0;j<a.length;j++)
	{
		if(a[j].length()==lentgh)
		{
			System.out.println(a[j]);
		}
	}
}
}
