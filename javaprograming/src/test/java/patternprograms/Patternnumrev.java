package patternprograms;

import org.testng.annotations.Test;

public class Patternnumrev {

	@Test
public void number()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j>=1;j--)
		{
		System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
