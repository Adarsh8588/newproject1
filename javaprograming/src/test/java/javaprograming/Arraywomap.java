package javaprograming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Arraywomap {
	@Test
	public void duplicateArray()
	{
		int[] a= {2,4,1,1,5,4,5};
		int count1=0;
		int count2=0;
		int count4=0;
		int count5=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				count1++;
			}
			else if(a[i]==2)
			{
				count2++;
			}
			else if(a[i]==4)
			{
				count4++;
			}
			else if(a[i]==5)
			{
				count5++;
			}
		}
		System.out.println(2+"======countis====="+count2);
		System.out.println(4+"======countis====="+count4);
		System.out.println(5+"======countis====="+count5);
		System.out.println(1+"======countis====="+count1);
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{lh.add(a[i]);}
		for(int ch:lh)
		{
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(ch==a[i])
			{
				count++;
			}
			
		}
		System.out.println(ch+" "+ count);
		}
		
	}
}
