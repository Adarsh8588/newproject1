package javaprograming;

import org.testng.annotations.Test;

public class MinAraaysTest {
	@Test
	  public void minimumarrayTest()
		{
		  int [] arr= {1,2,94,54,98,98,6,86,4};
		  int fmin=arr[0];
		  int smin=arr[0];
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]<=fmin)
			  {
				  if(arr[i]!=fmin)
				  {
				  smin=fmin;
			  }
			  fmin=arr[i];
		  }
		  else if(fmin==smin || arr[i]<smin)
		  {
			  smin=arr[i];
		  }
		}
		  
		  System.out.println("first max  value ==>"+fmin);
		  System.out.println("second max  value ==>"+smin);
	  }
}
