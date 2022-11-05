package javaprograming;

import org.testng.annotations.Test;

public class Findmaxlentharray {

	@Test
	public void max()
	{
		String [] s= {"15465","5676","76","3","676"};
		int length=s[0].length();
		for(int i=0;i<s.length;i++)
		{
			String a=s[i];
			if(a.length()>length)
			{
				length=a.length();
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			String b=s[i];
		if(length==b.length())
		{
			System.out.println(s[i]);
		}
		}
	}
	}
