package patternprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paternnumseq {
	@Test
public void seq()
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		System.out.println(ele.getCssValue("font-colour"));
		
	int n=5;
	int k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			if(k<9)
			{
		k++;
			}
			else
			{
				k=1;
			}
		}
		System.out.println();
	}
	/*
	 * int n=5; int k=9; 
	 * for(int i=1;i<n;i++)
	 *  { for(int j=1;j<n;j++) {
	 *  if(i>=j)
	 *  {
	 * System.out.print(k++%9+1+" "); }
	 * else
	 * {
	 *  System.out.print(" ");
	 *  }
	 *  }
	 *  System.out.println();
	 */
}
}
