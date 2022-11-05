package patternprograms;

import org.testng.annotations.Test;

public class Patterneven {

	@Test
public void number()
{
	int n=5;
	for(int i=1,k=0;i<=n;i++,k=k+2)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print(k+" ");
		}
		System.out.println();
	}
	
}
}
