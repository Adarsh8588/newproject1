package javaprograming;

import org.testng.annotations.Test;

public class Sampleprogram2 {
	@Test
public void sample()
{
	String s="11hj45h2";
	int sum=0;
	int tempsum=0;
	for(int i=0;i<s.length();i++)
	{char ch=s.charAt(i);
		if(ch>='1'&&ch<='9')
		{
			int num=ch-48;
			tempsum=tempsum*10+num;
		}
		else
		{
			sum=sum+tempsum;
			tempsum=0;
		}
	}
	sum=sum+tempsum;
	System.out.println(sum);
}
}
