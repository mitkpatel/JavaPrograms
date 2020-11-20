package Lab4_n01415959;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Get Name, ContactNumber and NumberOfPackages from Customer(User)
		String customerName;
		int numberOfPackages;
		long contactNumber;
		char x = 'a';
		if ('a' == ('f' + 9))
			System.out.println(x);
		
		
		
		Scanner sc = new Scanner(System.in); 		//Get data from User
		System.out.print("Enter your name: ");
		customerName = sc.nextLine();
		
		System.out.print("\nEnter your number: ");
		contactNumber = sc.nextLong();
	
		//Validation of Mobile Number digits(It should be 10)
		if((Long.toString(contactNumber).length() != 10)) {
			System.out.println("Enter Valid mobile number");
			System.exit(0);
		}
		else {
			System.out.print("\nEnter number of packages you want to order: ");
			numberOfPackages = sc.nextInt();
			
			if(numberOfPackages < 0) {
				System.out.println("Enter positive number");
				System.exit(0);
			}
			
			else {
				Invoice invoice = new Invoice();	//passing packages values in constructor and creating object
				invoice.setNoOfPackages(numberOfPackages);
				
				System.out.printf("\nCustomer Name             : %s\n", customerName);
				System.out.printf("Phone                     : %d\n", contactNumber);
				System.out.printf("Number of packages ordered: %d\n", invoice.getNoOfPackages());
				System.out.printf("Total order amount        : %.2f\n", invoice.getOrderAmount());
				System.out.printf("Discount                  : %.2f\n" ,invoice.getDiscount());
				System.out.printf("Net payable               : %.2f\n" ,invoice.getNetPayable());
			}
		}
		
		System.exit(0);
	}

}
