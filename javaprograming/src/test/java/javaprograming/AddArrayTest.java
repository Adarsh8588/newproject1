package javaprograming;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AddArrayTest {
@Test
	public void addArrayTest()
	{
		int[] arr1= {1,2,3,4,6};
		int[] arr2= {2,4,7};
		int length=0;
		
		if(arr1.length>arr2.length)
		{
			length=arr1.length;
		}
		else
		{
			length=arr2.length;
		}
		int[] temp = new int[length];
		for(int i=0;i<length;i++)
		{
			if(i<arr1.length && i<arr2.length)
			{
			temp[i]=arr1[i]+arr2[i];
			}
			else if(i>=arr1.length)
			{
				temp[i]=arr2[i];
			}
			else if(i>=arr2.length)
			{
				temp[i]=arr1[i];
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
	}
}
