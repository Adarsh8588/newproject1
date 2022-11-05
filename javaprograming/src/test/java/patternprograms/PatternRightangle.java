package patternprograms;

import org.testng.annotations.Test;

public class PatternRightangle
{
	@Test
public void rightAngle()
{int space=4;
int star=1;
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=star;k++)
		{
		System.out.print(" *");	
		}
		System.out.println();
		space--;
		star++;
	}
}
}
