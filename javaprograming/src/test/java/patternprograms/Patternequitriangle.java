package patternprograms;

import org.testng.annotations.Test;

public class Patternequitriangle {
	@Test
public void equitr()
{
	int n=5;
	int space=4;
	int star=1;
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
		star=star+2;
	}
}
}
