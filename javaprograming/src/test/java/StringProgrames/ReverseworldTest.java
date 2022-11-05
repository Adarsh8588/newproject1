package StringProgrames;

import org.testng.annotations.Test;

public class ReverseworldTest {
public class ReversetheWordsTest {
	@Test
public void reverse()
{
String s="i love banglore city";
String[] as = s.split(" ");
for(int i=0;i<=as.length-1;i++)
{
System.out.print( reverse(as[i])+" ");

}

}
	public String reverse(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
		s1=s1+s.charAt(i);
		}
		return s1;
	}
	
}
}