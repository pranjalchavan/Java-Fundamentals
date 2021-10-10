package assignment;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 23;
		   
		   int factors = 0;
		   
		   for (int i = 1; i<=num; i ++) {
			   if(num % i == 0) {
				   factors = factors + 1;
			   }
		   }
		   
		   System.out.println("factors="+factors);
		   if(factors == 2 ) {
			   System.out.print("Prime");
		   }else {
			   System.out.print("not prime");
		   }
	}

}