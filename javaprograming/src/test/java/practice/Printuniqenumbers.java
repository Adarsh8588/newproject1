package practice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Printuniqenumbers {
@Test
public void printuniqe()
{
	int[] a= {4,3,2,3,1};
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		lh.add(a[i]);
	}
	for(int b:lh)
	{
				System.out.println(b);
		
			}
		}
	
}

