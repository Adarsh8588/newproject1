package Practice1;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		
		int n=sc.nextInt();
		int sum=0;
		 for(int i=0;i<=n;i++) {
			 sum=sum+i;
		 }
		 System.out.println("sum of all the value");
   System.out.println(sum);
		 
	}

}
