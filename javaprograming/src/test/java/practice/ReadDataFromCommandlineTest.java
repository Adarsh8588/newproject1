package practice;

public class ReadDataFromCommandlineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String browser = System.getProperty("Browser");
String url = System.getProperty("Url");
String username = System.getProperty("Username");
String password = System.getProperty("Password");
System.out.println(browser);
System.out.println(url);
System.out.println(username);
System.out.println(password);
	}

}
