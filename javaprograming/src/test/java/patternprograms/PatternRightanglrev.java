package patternprograms;

import org.testng.annotations.Test;

public class PatternRightanglrev {

	@Test
public void rightAngle()
{
	int n=5;
	for(int i=n;i>=0;i--)
	{
		
		for(int k=1;k<=i;k++)
		{
		System.out.print(" *");	
		}
		System.out.println();
	}
}
}
