package javaprograming;

import org.testng.annotations.Test;

public class Factprogra {
	@Test
public void fact()
{
	int n=5;
	int fact=1;
	for(int i=5;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println("factorial of "+n+"  is "+fact);
}
}
