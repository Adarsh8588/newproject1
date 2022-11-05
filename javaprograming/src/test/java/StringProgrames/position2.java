package StringProgrames;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class position2 {
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
		int count=0;
		for(int i=s.length()-1;i>0;i--)
		{
		if(ch==s.charAt(i))
		{
			System.out.println(ch+" "+(i+1));
			break;
		}
		}
		
	}
}
}