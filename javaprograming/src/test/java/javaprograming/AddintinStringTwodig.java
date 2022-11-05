package javaprograming;

import org.testng.annotations.Test;

public class AddintinStringTwodig {
	@Test
	public void add()
	{
		String s="10b100c3a";
		int sum=0;
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				int num = Integer.parseInt(s1);
				sum=sum+num;
				s1="0";
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				s1=s1+s.charAt(i);
			}
			}
		
		int num = Integer.parseInt(s1);
		sum=sum+num;
		System.out.println(sum);
	}
}
