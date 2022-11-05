package javaprograming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
public void sampleTest()
{
	Stack<String> s=new Stack<String>();
	s.push("hello");
	s.push("hi");
	s.push("hi1");
	s.push("hi2");
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s.pop());

}
}
