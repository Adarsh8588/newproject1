package patternprograms;

import org.testng.annotations.Test;

public class Patternuninumber {
	@Test
public void number()
{
	int n=5;
	for(int i=1,k=5;i<=n;i++,k--)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print(k+" ");
		}
		System.out.println();
	}
	
}
}
