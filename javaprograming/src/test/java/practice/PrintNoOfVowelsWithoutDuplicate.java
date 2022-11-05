package practice;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class PrintNoOfVowelsWithoutDuplicate {
	@Test
public void vowel()
{int count=0;
	String s="indiaoo";
	LinkedHashSet<Character> sa=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		sa.add(s.charAt(i));
	}
	for(char ab:sa)
	{System.out.println(ab);
	}
	
	for(char ab:sa)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ab==ch) 
			{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				break;
			}
			}
		}
	}
	System.out.println(count);
}
}
