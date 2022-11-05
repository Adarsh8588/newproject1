package patternprograms;

import org.testng.annotations.Test;

public class Patternrevequi {

	@Test
	public void equitr()
	{
		int n=7;
		int space=0;
		int star=7;
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
			space++;;
			star=star-2;
		}
	}
	}
