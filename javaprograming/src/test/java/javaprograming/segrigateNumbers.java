package javaprograming;

import org.testng.annotations.Test;

public class segrigateNumbers {
	@Test
public void segrigate()
{
	String s="a$#1sv%2";
	char[] sa = s.toCharArray();
	String a="";
	String d="";
	String sp="";
	for(int i=0;i<sa.length;i++)
	{
		if(Character.isAlphabetic(sa[i]))
		{
			a=a+sa[i];
		}
		else if(Character.isDigit(sa[i]))
		{
			d=d+sa[i];
		}
		else
		{
			sp=sp+sa[i];
		}
	}
	
	System.out.println(a);
	System.out.println(d);
	System.out.println(sp);
}
}
