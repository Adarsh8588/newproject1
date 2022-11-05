package patternprograms;

import org.testng.annotations.Test;

public class Patternstar {
	@Test
public void pattern()
{
	int n=5;
	for(int i=1;i<n;i++)//row
	{
	for(int j=1;j<=n;j++)//col
	{
		System.out.print("* ");
	}
	System.out.println();
}
}
}
