package Lab1;  //Package name is Lab1

public class Lab1_N01415959 {          //class name is Lab1_N01415959
	
	public static void main(String[] args) {
		
		//Declaration of variables
		String name = "Mitkumar Kalpeshbhai Patel";
		int age = 22;
		double annualPay = 45.66;
		
		//printing the values of all local variables
		System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per hour.\n");
		
		//Second way to print with print only, which don't move cursor into next line	
		System.out.println("Second way to print message->");
		System.out.print("\nMy name is " + name);
		System.out.print(", my age is " + age);
		System.out.print(" and I hope to earn $" + annualPay + " per hour.");

		System.exit(0); 			//Use to indicate successful termination 	
	}

}
