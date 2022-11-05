package javaprograming;

import org.testng.annotations.Test;

public class Samplepeogram3 {
	@Test
public void sample()
{
	int []a= {1,4,2,5,6,7};
	int fm=a[0];
	int sm=a[0];
	int tm=a[0];
	int sum=0;

		for(int j=0;j<a.length;j++)
		{
		if(a[j]<fm)
		{   tm=sm;
			sm=fm;
			fm=a[j];
		}
		else if(fm==sm||a[j]<sm)
		{   tm=sm;
			sm=a[j];
		
		}
		else if(fm==tm||tm==sm||a[j]<tm)
		{
			tm=a[j];
		}
		}
	
	sum=fm+sm+tm;
	System.out.println(sum);
	System.out.println(fm);
	System.out.println(sm);
	System.out.println(tm);
	
}
}
