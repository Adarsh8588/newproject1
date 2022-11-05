package javaprograming;

import org.testng.annotations.Test;

public class AddintegerinString {
	@Test
public void add()
{
	String s="b2c3d1";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			//int n=s.charAt(i)-48;
			char no = s.charAt(i);
			String num1 = Character.toString(no);
			
			int num=Integer.parseInt(num1);
			sum=sum+num;
			//sum=sum+n;
		}
	}
	System.out.println(sum);
}
}
