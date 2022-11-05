package StringProgrames;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class DupAndUniString {
	@Test
public void countdup()
{
	String s="tester";
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		hs.add(s.charAt(i));
	}
	
	for(Character ch:hs)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		if(ch==s.charAt(i))
		{
		count++;
		}
		}
		
		
		if(count>1)
		{
			System.out.println("duplicate characters");
			System.out.println(ch+" "+count);	
		}
		else if(count==1)
		{
			System.out.println("unique characters");
			System.out.println(ch+" "+count);	
			
		}
	}
	
}
}
