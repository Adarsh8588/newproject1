package StringProgrames;

import org.testng.annotations.Test;

public class StringPaLINDROME {
	@Test
public void reverse()
{
	String s="MOM";
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
		
	}
	if(s.equalsIgnoreCase(s))
	{
	System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("string is not palindrome");
	}
}
}
