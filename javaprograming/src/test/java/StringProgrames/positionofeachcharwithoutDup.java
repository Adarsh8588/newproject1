package StringProgrames;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class positionofeachcharwithoutDup {
	@Test

	public void positiontest()
	{
	String s="tester";
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		hs.add(s.charAt(i));
	}
	
	for(Character ch:hs)
	{
		
		for(int i=0;i<s.length();i++)
		{
		if(ch==s.charAt(i))
		{
			System.out.println(ch+" "+(i+1));
			break;
		}
		}
		
	}
}}