package StringProgrames;

import org.testng.annotations.Test;

public class PrintPmimeinArray1 {
	@Test
public void prime() {
	int[]a={1,2,3,4,5,6,7,9};
	for(int i=0;i<a.length;i++)
	{
		int n=a[i];
		int j=2;
		while(j<=n)
		{
			if(n%j==0)//3%2,3%3//4%2
			{
				break;
			}
			else
			{
				j++;//2,3
			}
		}
		if(j==n)//3==3//4==2
		{
			System.out.println(a[i]);
		}
	}
}
}
