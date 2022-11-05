package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertyFileTest {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/CommonDataProperties");
Properties pObj=new Properties();
pObj.load(fis);
String Browser = pObj.getProperty("Browser");
String Url = pObj.getProperty("Url");
System.out.println(Browser);
System.out.println(Url);
String Username = pObj.getProperty("UserName");
String Password = pObj.getProperty("Password");
WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();


driver.navigate().to(Url);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[.='Admin Login']")).click();
driver.findElement(By.name("username")).sendKeys(Username);
driver.findElement(By.name("password")).sendKeys(Password);
driver.findElement(By.name("login")).click();
}
}
