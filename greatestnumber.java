package assignment;

import java.util.Scanner;

public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
       Scanner sc = new Scanner(System.in);
       System.out.println("a=");
       a=sc.nextInt();
       System.out.println("b=");
       b=sc.nextInt();
       System.out.println("c=");
       c=sc.nextInt();
       if( a>=b && a>=c) {
    	   System.out.println(a);
       }else if(b>=c && b>=a) {
    	   System.out.println(b);
       }else {
    	   System.out.println(c);
       }
	}

}