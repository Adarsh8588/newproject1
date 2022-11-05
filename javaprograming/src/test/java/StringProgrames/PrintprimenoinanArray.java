package StringProgrames;

import org.testng.annotations.Test;

public class PrintprimenoinanArray
{
	@Test
public void printprime() 
{
	int[] a= {1,2,3,4,5,6,7,8,9};
	
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		int num=a[i];
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
			{
				count++;
			}
			
		}if(count==2)
		System.out.println("no is prime "+a[i]);
	}
}
}
