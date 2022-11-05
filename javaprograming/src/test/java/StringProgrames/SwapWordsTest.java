package StringProgrames;

import org.testng.annotations.Test;

public class SwapWordsTest {
	@Test
	public void swapTest()
	{
	String s="i love banglore city";
	String[] as = s.split(" ");
	String temp=as[0];
	as[0]=as[as.length-1];
	as[as.length-1]=temp;
	for(int i=0;i<=as.length-1;i++)
	{
		System.out.print(as[i]+" ");
		
	}
	System.out.println();
	String s1="hi";
	String s2="hello";
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	
	System.out.println(s1);
	System.out.println(s2);
	}
}
