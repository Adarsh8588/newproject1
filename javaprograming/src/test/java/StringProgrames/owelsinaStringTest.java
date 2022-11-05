package StringProgrames;

import org.testng.annotations.Test;

public class owelsinaStringTest {
	@Test
public void owel()
{int count=0;
	String s="india";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
		
	}
	System.out.println(count);
}
}
