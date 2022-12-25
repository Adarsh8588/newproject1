package Practice1;

public class student1 {
	String name;
	int rno;
	
	  student1() //default constructor 
	 {
      name="adarsh";
      rno=02;
	}
	  student1(String a , int b) //parameterized constructor
	 {
		name=a;
		rno=b;
	 } 
	public static void main(String[] args)
   	{
	student1 s1 = new student1("abhi",01);
	student1 s2= new student1();
	System.out.println(" name ="  +  s1.name);
	System.out.println(s1.rno);
	System.out.println("name ="  +s2.name);
	System.out.println(s2.rno);
	}
}
