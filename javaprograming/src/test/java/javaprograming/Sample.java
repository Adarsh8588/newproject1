package javaprograming;

import org.testng.annotations.Test;

public class Sample 
{@Test
	public void test()
	{
		String [] s= {"2667","234537","7647826478","764"};
		for(int i=0;i<s.length;i++)
		{int length=s[i].length();
			for(int j=0;j<s.length;j++)
			{
				if(length>s[j].length())
				{
					System.out.println(s[i]);
					
				}
			}
		}
	}
}