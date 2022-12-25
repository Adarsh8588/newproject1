package StringProgrames;

import org.testng.annotations.Test;

public class StringMethods {
	@Test
public void stringTest() {
	String s="welcome";
	System.out.println(s.length());
	char[] c=s.toCharArray();
	System.out.println(c.length);
	System.out.println(s.charAt(1));
	System.out.println(s.indexOf('e'));
	String s1="hi";
	String s2="hello";
	String s3="how";
	System.out.println("concat");
	System.out.println(s1.concat(s2).concat(s3));
	System.out.println("joins");
	System.out.println(String.join(" ",s1,s2,s3));
	System.out.println(s.contains("lc"));
	System.out.println(s.startsWith("we"));
	System.out.println(s.endsWith("me"));
	String s4="";
//	System.out.println(s4.isBlank());
	System.out.println(s4.isEmpty());
	
	String s5="  hi hello how are you   ";
	System.out.println(s5.trim());//used remove starting and ending space
	
	String s6="welcome";
	System.out.println(s6.substring(0,3));
	
	String s7="hi hello how are you";
	String[] sa = s7.split("");
	for(String d:sa)
	{
		System.out.println(d);
	}
	
	String a="hi";
	String b="hi";
	
	System.out.println(a.equals(b));
	
	String d="hi hello how";
	
	System.out.println(d.replace(" ",""));
	System.out.println(d.replaceAll(" ",""));
	
	String e="WELCOME";
	System.out.println(e.toLowerCase());
	
	String f="welcome";
	System.out.println(f.toUpperCase());
	
	
	for(char c1='a';c1<'z';c1++)
	{
		System.out.println(c1);
	}
	
}
}
