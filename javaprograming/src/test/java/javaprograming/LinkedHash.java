package javaprograming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class LinkedHash {

		@Test
			public void hashtest()
			{
				LinkedHashSet hs=new LinkedHashSet();
				hs.add("hello");
				hs.add("hello");
				hs.add("hi");
				hs.add(30);
				hs.add(null);
				hs.add(true);
				hs.add(null);
				System.out.println(hs);
				System.out.println(hs.isEmpty());
				System.out.println(hs.remove(30));
				System.out.println(hs.size());
				if(hs.contains("hi"))
				{
					System.out.println("present");
				}
				else
				{
					System.out.println("notpresent");
				}
				for(Object obj:hs)
				{
					System.out.println(obj);
				}
				System.out.println("======================");
				
				Iterator it = hs.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			}
}
