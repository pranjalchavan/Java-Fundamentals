package assignment;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=76745,count=0;
		do
		{
			num=num/10;
			count=count+1;			
		}while(num!=0);
		System.out.println("Total number of digits "+count);
	}

}