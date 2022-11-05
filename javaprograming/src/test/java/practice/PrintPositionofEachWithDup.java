package practice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintPositionofEachWithDup {

@Test
	public void position()
	{
			int[] a= {4,3,2,3,1};
			LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
			for(int i=0;i<a.length;i++)
			{
				lh.add(a[i]);
			}
			for(Integer b:lh)
			{
				for(int i=0;i<a.length;i++)
				{if(b==a[i])
				{
					System.out.println(a[i]+" poisition "+ (i+1));
					
				}
					
				}
			}
	}
	
}

