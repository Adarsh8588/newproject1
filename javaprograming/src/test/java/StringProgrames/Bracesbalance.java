package StringProgrames;

import org.testng.annotations.Test;

public class Bracesbalance {
	@Test
public void balance()
{
	String s="{[()]]";
	int count1=0;
	
	for(int i=0;i<s.length()/2;i++)
	{
	char ch1=s.charAt(i);
	char ch2=s.charAt(s.length()-(i+1));
	
		if(ch1+2==ch2||ch1+1==ch2)
		{
			count1++;
		}
		else
		{
			break;
		}
	}
	if(count1==s.length()/2)
	{
		System.out.println("String is balanced");
	}
	else
	{
		System.out.println("String is not balanced");
		
	}
}
}
