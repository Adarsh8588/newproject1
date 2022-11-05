package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampeCssTestScript {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://192.168.0.231/domain/Online_Tourism_Management_System/");
	WebElement ele = driver.findElement(By.xpath("//a[.='Tourism Management System']"));
	String font = ele.getCssValue("font-family");
	System.out.println(font);
	String font1 = ele.getCssValue("width");
	System.out.println(font1);
	String font2 = ele.getCssValue("font-style");
	System.out.println(font2);
	
}
}
