package patternprograms;

import org.testng.annotations.Test;

public class Patternrigthangle {


	@Test
public void rightAngle()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		
		for(int k=1;k<=i;k++)
		{
		System.out.print(" *");	
		}
		System.out.println();
	}
}
}

