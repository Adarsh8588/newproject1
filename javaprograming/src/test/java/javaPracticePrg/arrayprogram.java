package javaPracticePrg;

public class arrayprogram {

	public static void main(String[] args) {
	int[] x= {2,4,5,6,7};
	int[] y= {1,2,3,4};
	
	int length=x.length;
	
	if(x.length<y.length) {
		length=y.length;
	}
	for(int i=0; i<length;i++) {
		try {
			System.out.print(x[i]+y[i]+" ");
		} 
		catch (Exception e)
		{
			if (x.length>y.length)
			{
				System.out.println(x[i]);
			}
			else
			{
              System.out.println(y[i]);
			}
		}
	}
	
	}

}
