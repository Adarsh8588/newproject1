package StringProgrames;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PositionofeachwordTest {

	@Test
	public void occurenceTest() {
		
	Scanner sc= new	Scanner(System.in);
			String s="i love love i";
			String[] as = s.split(" ");
			for(int i=0;i<as.length;i++)
			{
			System.out.println(as[i]+" position  "+(i+1));	
			}
	}

	}
