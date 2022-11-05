package javaprograming;

import java.util.SortedSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortedsetTest {
	@Test
public void sort() {
	SortedSet<String> ss=new TreeSet<String>();
	ss.add("infosys");
	ss.add("ibm");
	ss.add("wipro");
	ss.add("google");
	ss.add("microsoft");
	ss.add("conginizant");
	System.out.println(ss);
	for(String set:ss)
	{
		System.out.println(set);
	}
	System.out.println();
	
	System.out.println(ss.first());
	System.out.println(ss.last());
	System.out.println(ss.headSet("infosys"));
	System.out.println(ss.tailSet("google"));
}
}
