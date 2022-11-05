package javaprograming;

import org.testng.annotations.Test;

public class ArrayTest {
@Test
public void array()

{
	int [] a= {5,6,712,6,7};
	int [] b= {2,7,2,6};
	
	int length=a.length>b.length?a.length:b.length;
	int [] c=new int[length];
	for(int i=0;i<length;i++)
	{
	if(i<a.length&&i<b.length)
	{
		c[i]=a[i]+b[i];
	}
	else if(a.length>b.length)
	{
		c[i]=a[i];
	}
	else if(b.length>a.length)
	{
		c[i]=b[i];
	}
	}
for(int i=0;i<c.length;i++)
{
	if(c[i]<10)
	{
		System.out.print(c[i]+",");
	}
	else  if(c[i]>=10&&c[i]<=99){
		System.out.print((c[i]/10)+","+(c[i]%10)+",");	
	}
	else if(c[i]>100)
	{
		System.out.println((c[i]/100)+","+((c[i]/10)%10)+","+(c[i]%100)%10);
	}
}
}
}
