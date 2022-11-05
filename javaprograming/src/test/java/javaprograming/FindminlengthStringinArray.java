package javaprograming;

import org.testng.annotations.Test;

public class FindminlengthStringinArray 
{
	@Test
public void min()
{
	String [] s= {"abcdef","avbc","qfq","ab","eweree"};
	int length=s[0].length();
	for(int i=0;i<s.length;i++)
	{
		String a=s[i];
		if(a.length()<length)
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
