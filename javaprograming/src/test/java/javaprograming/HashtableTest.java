package javaprograming;

import java.util.Hashtable;

import org.testng.annotations.Test;

public class HashtableTest {
	@Test
public void hashtable()
{
	Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
	ht.put(10,"hi");
	ht.put(20,"hello");
	ht.put(10,"hello");
	ht.put(5,"bye");
	ht.put(3,"hello");
	System.out.println(ht);
	System.out.println(ht.remove(20));
	System.out.println(ht.size());
	System.out.println(ht.containsKey(5));
	System.out.println(ht.replace(5,"super"));
	System.out.println(ht.get(10));
	System.out.println(ht);
	
}
}
