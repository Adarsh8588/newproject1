package practice;

import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class PrintoccuranceofEachnum {
	@Test
public void occurance()
{
	int [] a= {4,3,2,3,1};
	TreeMap<Integer,Integer> ts=new TreeMap<Integer,Integer>();
for(int i=0;i<a.length;i++)
{
	if(!ts.containsKey(a[i]))
	{
		ts.put(a[i],1);
	}
	else
	{
		int x=ts.get(a[i]);
		x++;
		ts.put(a[i], x);
	}
}

for(Entry<Integer, Integer> ab:ts.entrySet())
{

		System.out.println(ab.getKey()+"  count  "+ab.getValue());
	
}
}}