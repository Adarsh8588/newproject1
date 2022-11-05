package javaprograming;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class TreemapTest {
	@Test
	public void linkhashmaptest()
	{
		TreeMap<Integer, String> ht = new TreeMap<Integer,String>();
		ht.put(10,"hi");
		ht.put(20,"hello");
		ht.put(10,"hello");
		ht.put(5,"bye");
		ht.put(3,"hello");
	
		ht.put(4,null);//allows
		ht.put(5,null);//allows
		System.out.println(ht);
		System.out.println(ht.remove(20));
		System.out.println(ht.size());
		System.out.println(ht.containsKey(5));
		System.out.println(ht.replace(5,"super"));
		System.out.println(ht.get(10));
		System.out.println(ht);
		for(Entry<Integer, String> map:ht.entrySet())
		{
			System.out.println("key "+ map.getKey() +" value is "+map.getValue());
		}
		

	}
}
