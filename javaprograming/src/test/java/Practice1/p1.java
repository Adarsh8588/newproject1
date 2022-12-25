package Practice1;

public class p1 extends p {
	int a=100;
	int c=200;


	public void m2() {
		int d = a+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) 
	{
		p1 ob = new p1();
		ob.m2();
		System.out.println(ob.a);
		System.out.println(ob.c);
		System.out.println(p.a);
		ob.m1();
	}
}
