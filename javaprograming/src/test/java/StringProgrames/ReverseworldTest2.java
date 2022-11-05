package StringProgrames;

import org.testng.annotations.Test;

public class ReverseworldTest2 
{
	public class ReversetheWordsTest {
		@Test
	public void reverse()
	{
	String s="i love banglore city";
	String[] as = s.split(" ");
	for(int i=0;i<=as.length-1;i++)
	{
		
	String s1=as[i];
	for(int j=s1.length()-1;j>=0;j--)
	{
	System.out.print(s1.charAt(j));
	}
System.out.println(" ");
	}

	}
	}}
