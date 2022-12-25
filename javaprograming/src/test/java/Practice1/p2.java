package Practice1;

public class p2 extends p1  //or p
{
  String s="abc";         //multi level inheritance  p grand parent p1 parent, p2 child
                          //hierarchal inheritance 1 parent 2 child class
  
  public void m3() {
	  
	System.out.println(s);
  }
	
	public static void main(String[] args) {
		
		p2 ob1 = new p2();
		System.out.println(ob1.s);
		ob1.m3();
		ob1.m1();
	//	ob1.m2();
	}	
}
