package StringProgrames;

import java.io.InputStream;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReversetheWordsTest {
	@Test
public void reverse()
{
String s="i love banglore";
String[] as = s.split(" ");
for(int i=as.length-1;i>=0;i--)
{
	System.out.print(as[i]+" ");
}

}
}
