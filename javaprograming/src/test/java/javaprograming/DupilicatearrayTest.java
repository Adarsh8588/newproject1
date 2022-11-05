package javaprograming;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class DupilicatearrayTest {
	@Test
public void duplicateArray()
{
	int[] a= {2,4,1,1,5,4};
	int c=0;
	LinkedHashMap<Integer, Integer> tm=new LinkedHashMap<Integer, Integer>();
	for(int i=0;i<a.length;i++)
	{
		if(!tm.containsKey(a[i]))
		{
			tm.put(a[i], 1);
		}
		
		else
		{
			int x = tm.get(a[i]);
			x++;
			tm.put(a[i], x);
		}
	}
	for(Entry<Integer, Integer> map:tm.entrySet())
	{
	
			System.out.println(+map.getKey() +"    count    "+map.getValue());
		}
	
	for(Entry<Integer, Integer> map:tm.entrySet())
	{
	if(map.getValue()==1)
	{
		System.out.println("unique array with count =====");
		System.out.println(+map.getKey() +"    count    "+map.getValue());
	}
	}
	for(Entry<Integer, Integer> map:tm.entrySet())
	{
		if(map.getValue()!=1)
	{
		System.out.println("duplicate array with count =====");
		System.out.println(+map.getKey() +"    count    "+map.getValue());
	}
	}
	for(Entry<Integer, Integer> map:tm.entrySet())
	{

		
	System.out.println(map.getKey() +" position ===="+c);	
	c++;
	}
	LinkedHashSet ts=new LinkedHashSet();
	for(int i=0;i<a.length;i++)
	{
		ts.add(a[i]);
	}
	System.out.println("array after remove duplicate");
	System.out.println(ts);
		}
	
	
}


