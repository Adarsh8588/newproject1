package StringProgrames;

import org.testng.annotations.Test;

public class PositionofeachcharwithDup {
	@Test
public void position()
{
	String s="tester";
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i)+" position "+(i+1));
	}
	
}
}
