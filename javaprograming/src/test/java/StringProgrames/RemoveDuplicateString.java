package StringProgrames;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicateString {
	@Test
public void removedupstringtest()
{
	String s="tester";
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		hs.add(s.charAt(i));
	}
	System.out.println(hs);
	int count=0;
	for(Character ch:hs)
	{
		System.out.print(ch);
		count++;
	}
	System.out.println();
	System.out.println(count);
}
	
}
