package patternprograms;

import org.testng.annotations.Test;

public class PatternCharseq {
	@Test
public void pattern()
{
	int n=5;
	char c='A';
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(c+++" ");
		}
		System.out.println();
	}
}
}
