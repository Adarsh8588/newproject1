package StringProgrames;

import org.testng.annotations.Test;

public class ReverseString {
	@Test
public void reverse()
{
	String s="welcome";
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
		
	}
	
	System.out.println(s);
	System.out.println(s1);
	
	
	StringBuffer sb=new StringBuffer("welcome");
	sb.reverse();
	System.out.println(sb);
	
	char[] c = s.toCharArray();
	for(int i=c.length-1;i>=0;i--)
	{
		System.out.print(c[i]);
	}
	System.out.println();
	int count=0;
	for(char c1:c)
	{
	count++;
	}
	for(int i=count-1;i>=0;i--)
	{
		System.out.print(c[i]);
	}
	System.out.println();
	StringBuilder sd=new StringBuilder(s);
	sd.insert(3,"hi");
	System.out.println(sd);
	sd.reverse();
	System.out.println(sd);
}
}
