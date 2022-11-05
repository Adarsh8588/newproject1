package javaprograming;

import org.testng.annotations.Test;

public class ArrayAscendingTest {
@Test
	public void arrayAscendingTest()
	{
		int [] arr= {8,3,4,12,2,4,5};
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+"  ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+"  ");
		}
		
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
		@Test
		public void sumOfThreeeLargeTest()
		{
			
			int [] arr= {8,3,4,12,2,4,5,12,8,15,15};
			int fl=0;
			int sl=0;
			int tl=0;
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>fl)
				{
					tl=sl;
				    sl=fl;
					fl=arr[i];
					
				}
				else if(fl!=arr[i]&&arr[i]>sl)
				{
					tl=sl;
					sl=arr[i];
					
				}
				else if(fl!=arr[i]&&sl!=arr[i]&&arr[i]>tl)
				{
					tl=arr[i];
				}
		}
		
		System.out.println("first largest  "+fl+" ");
		
		System.out.println("second largest  "+sl+" ");
		System.out.println("third largest  "+tl+" ");

       System.out.println("sum of first three max "+(fl+sl+tl));
	
}
		@Test
		public void sumOfThreeeminTest()
		{
			
			int [] arr= {8,3,4,12,2,4,5};
			int fm=arr[0];
			int sm=arr[0];
			int tm=arr[0];
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<fm)
				{
					tm=sm;
				    sm=fm;
					fm=arr[i];
					
				}
				else if(arr[i]<sm)
				{
					tm=sm;
					sm=arr[i];
					
				}
				else if(arr[i]<tm)
				{
					tm=arr[i];
				}
		}
		
		System.out.println("first smalest  "+fm+" ");
		
		System.out.println("second smalest  "+sm+" ");
		System.out.println("third smalest  "+tm+" ");

       System.out.println("sum of first three min "+(fm+sm+tm));
	
}
}
