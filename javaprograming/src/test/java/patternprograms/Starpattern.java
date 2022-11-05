package patternprograms;

import org.testng.annotations.Test;

public class Starpattern {
	@Test
public void star()
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
	int space1=1;
	int star1=7;
	for(int i=1;i<n;i++)
	{
		for(int j=1;j<=space1;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=star1;k++)
		{
			System.out.print(" *");
		}
		System.out.println();
		space1=space1+1;
		star1=star1-2;
		
	}
}
}
