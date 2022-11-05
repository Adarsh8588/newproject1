package StringProgrames;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class wordcountuniqe {
	@Test
	public void occurenceTest() {
		
	Scanner sc= new	Scanner(System.in);
			String s="i love love i banglore";
			LinkedHashSet<String> ls=new LinkedHashSet<String>();
			String[] as = s.split(" ");
			for(int i=0;i<as.length;i++)
			{
				ls.add(as[i]);
			}
			for(String ob:ls)
			{
				int count=0;
				for(int i=0;i<as.length;i++)
				{
					if(as[i].equalsIgnoreCase(ob))
					{
						count++;
					}}
				if(count==1) {
					System.out.println(ob+"  "+ count);
					
				}
			}
		}

	}
