package patternprograms;

import org.testng.annotations.Test;

public class Patternrev2 {


	@Test
public void rightAngle()
{int space=1;
int star=4;
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
		space++;
		star--;
	}
}
}
