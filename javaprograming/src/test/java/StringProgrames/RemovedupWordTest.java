package StringProgrames;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class RemovedupWordTest {
@Test
	public void remove()
	{
Scanner sc= new	Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		String[] as = s.split(" ");
		for(int i=0;i<as.length;i++)
		{
			ls.add(as[i]);
		}
		System.out.println(ls);
	}
}
