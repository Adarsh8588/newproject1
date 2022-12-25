package Practice1;


public class Methods
{
	public static void main(String[] args) {
		abc();
		System.out.println("hai");
		int res1 = xyz(5, 6);
		System.out.println(res1);
		System.out.println("bye");
		System.out.println(xyz1("adarsh", "a"));
	//	System.out.println(xyz1("ghjhgbj","chgc"));
		pqr('a', 'b');
	}
	
	public static void abc() {
		int a=10;
		int b=20;
	int	c=a+b;
	System.out.println(c);
	}
	
	public static int xyz(int a , int b) {
	
		int	c1=a*b;

		return c1;
}
	public static String xyz1( String d , String r) {
		String f2=d+r;
		return f2;
		}
	public static void pqr( char d , char r) {
		int c=d;
		short e=(short) r;
		System.out.println(c);
		System.out.println(e);
	}
	}