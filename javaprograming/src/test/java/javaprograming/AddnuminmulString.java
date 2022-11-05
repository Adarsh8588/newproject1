package javaprograming;

import org.testng.annotations.Test;

public class AddnuminmulString {
	@Test
	public void add()
	{
		String s="10b100c3a";
		int sum=0;
		int tsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
						
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}
}
