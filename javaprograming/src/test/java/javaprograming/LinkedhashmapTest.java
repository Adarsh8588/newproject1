package javaprograming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class LinkedhashmapTest {
	@Test
	public void linkhashmaptest()
	{
		LinkedHashMap<Integer, String> ht = new LinkedHashMap<Integer,String>();
		ht.put(10,"hi");
		ht.put(20,"hello");
		ht.put(10,"hello");
		ht.put(5,"bye");
		ht.put(3,"hello");
		ht.put(null,"hello");//one null key allows
		ht.put(null,"abcd");
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
