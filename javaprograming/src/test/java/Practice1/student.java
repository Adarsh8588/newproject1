package Practice1;
// this is default constructor or no argument  constructor
public class student {
	
	String name;
	int rno;
	
	 student() // constructore name
	 { 
		name="adarsh";
		rno=1234;
	}
	public static void main(String[] args) 
	{
	        	student s1=new student();
				System.out.println(s1.name);
				System.out.println(s1.rno);
	}
}
