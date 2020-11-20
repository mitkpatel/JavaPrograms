package n01415959_mit;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		// Instant fields or variables
		String choice;                    //to take user input
		
		Scanner sc = new Scanner(System.in);
		//creating an object of account interface class
		AccountInterface accountInterface = new AccountInterface();      
		
		accountInterface.setCustomerName();
		
		do {
			System.out.print("\nDo you have more customer (yes -- to continue)? ");
			choice = sc.nextLine();
			if(choice.equalsIgnoreCase("yes")) {
				accountInterface.setCustomerName();
			}				
			else {
				System.out.println("Goodbye!");
				break; 			//Closing while loop if user don't have any item 
			}
		} while (true);
		
	}
}