package assignment;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short old_age = 126;
		
		int new_age = old_age;
		
		System.out.println(old_age);
		System.out.println(new_age);
		
		int salary = 21312;
		double new_salary = salary;
		System.out.println(salary); 
		System.out.println(new_salary);
		
		int cash = 20000;
		short new_cash = (short) cash;
		System.out.println(cash);
		System.out.println(new_cash);
		
		int money = 78278728;
		short new_money = (short) money;
		System.out.println(money);
		System.out.println(new_money);
		
		
		float num = 77373.376f;
		int my_num = (int) num;
		System.out.println(num); 
		System.out.println(my_num); 
	}

}