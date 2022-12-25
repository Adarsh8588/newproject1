package javaprograming;

import org.testng.annotations.Test;

public class AddArrayNew {
	@Test
	
public void arrayadd() {
	int [] a= {1,2,3,4,5};
	int [] b= {2,4,5,6};
	int length=a.length;
	if(a.length<b.length)
	{
		length=b.length;
	}
	for(int i=0;i<length;i++)
	{
	try 
		
		{
			System.out.print(a[i]+b[i]+" ");
		}

	catch(Exception e)
	{
		if(a.length>b.length)
		{
			System.out.println(a[i]);
		}
		else
		{
			System.out.println(b[i]);
		}
	}
}
}
}