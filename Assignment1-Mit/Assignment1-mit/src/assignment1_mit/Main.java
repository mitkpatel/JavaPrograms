package assignment1_mit;     //Id - N01415959

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Instance Fields or variables
		String customerName, email, itemName;
		int quantity, quantityCheck;
		double unitPrice;
		long phone;                       //Int limit - 2147483647
		boolean result;
		String choice;
		
		Scanner sc = new Scanner(System.in);
		
		Customer customer = new Customer();         //Creating object of Customer class
		
		do {
			System.out.print("Enter the name of customer: ");
			customerName = sc.nextLine();
			result = customer.setCustomerName(customerName);         //Calling setCustomerName method of Customer class
			if (!result) {
				System.out.printf("Error -- Please enter your name!\n");
			}
		}while (!result);
		
		do {
			System.out.print("Enter the phone number of customer: ");
			phone = Long.parseLong(sc.nextLine()); 
			result = customer.setPhone(phone); 			 //Calling setPhone method of Customer class
			if (!result) {
				System.out.printf("Error -- Phone number should be 10 digit!\n");
			}
		}while (!result);
		
		do {
			System.out.print("Enter the email address of customer: ");
			email = sc.nextLine();
			result = customer.setEmail(email);				//Calling setPhone method of Customer class
			if (!result) {
				System.out.printf("Error -- Please enter valid email address !\n");
			}
			
		}while (!result);
		
		Item item = new Item();         //Creating object of Item class
		
		do {
			System.out.println("\nDetails of item.");
			
			do {
				System.out.print("Enter the name of item: ");
				itemName = sc.nextLine();
				result = item.setItemName(itemName);      //Calling setItemName method of Customer class
				if (!result) {
					System.out.printf("Error -- Please enter item name!\n");
				}
			}while (!result);
			
			
			do {
				System.out.printf("Enter the quantity of '%s' you want to buy: ", itemName);
				quantity = Integer.parseInt(sc.nextLine());
				quantityCheck = item.setQuantity(quantity);			//Calling setQuantity method of Item class
				if (quantityCheck == 0) {							//Return 0 means quantity is less than or equal to zero.
					System.out.printf("Error -- Quantity should be grather than 0 !\n");
				}
				else {
	 				if (quantityCheck == 1) {						//Return 1 means quantity is greater than 10.
						System.out.printf("Error -- Quantity should be between %d and %d!\n", item.MIN_QUANTITY, item.MAX_QUANTITY);
					}
	 				else {
	 					quantityCheck = 2;							//Return 2 means quantity is satisfied the condition.
	 				}
				}
			}while (quantityCheck != 2);
			
			do {
				System.out.printf("Enter the unit price of product '%s': ", itemName);
				unitPrice = Double.parseDouble(sc.nextLine());
				result = item.setUnitPrice(unitPrice);					//Calling setUnitPrice method of Item class
				if (!result) {
					System.out.printf("Error -- Item price should be grather than zero !\n");
				}
			}while (!result);
			
			item.addOrderChargers();
			
			System.out.print("Do you have more items to order (yes -- to continue)? ");
			choice = sc.nextLine();
			if(!choice.equalsIgnoreCase("yes")) {
				customer.printCustomerDetails();		//Calling printCustomerDetails method of Customer class
				item.printInvoice();				 	//Calling printInvoice method of Item class
				break;									//Closing while loop if user don't have any item 
			}
		}while (true);					 
		
		System.exit(0);									//Terminate the program
		
	}
}