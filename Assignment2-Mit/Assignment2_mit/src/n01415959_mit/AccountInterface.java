package n01415959_mit;

import java.util.Scanner;

public class AccountInterface {

	// Instance Fields or variables
	protected String customerName;
	protected int accountNumber;
	boolean quit, result;
	double amount, balance;
	int userChoice, withdrawCheck;

	Scanner sc = new Scanner(System.in);
	BankAccount bankAccount;              // Declaring the object of class BankAccount

	// Default constructor
	public AccountInterface() {	
		customerName = "TBA";
		accountNumber = 5000;
	}
	
	// Mutator methods
	// setCustomerName will check the name is empty or not and set account number
	public void setCustomerName() {
		do {
			System.out.print("Enter the name of customer(user): ");
			customerName = sc.nextLine();
			
			if (!(customerName.isEmpty())) {
				accountNumber = accountNumber + 1;
				performOperation();
				break;
			} else
				System.out.printf("Error -- Please enter your name first!\n");

		} while (true);
	}
	
	//Accessor method
	public String getCustomerName() {
		return customerName;
	}
	
	//Method for menu driven for user
	public void performOperation() {
		quit = false;
		bankAccount = new BankAccount(customerName, accountNumber); 
		
		//We have to declare object here. So, every time function called, values will reset.
		System.out.printf("\nWelcome %s, your account is created and account number is %d.\n",
				getCustomerName(), accountNumber);
		
		do {
			System.out.println("\nChoose operation you want to perform. (Press between 0 to 4).");
			System.out.println("1. Deposit money");
			System.out.println("2. Withdraw money");
			System.out.println("3. Check balance");
			System.out.println("4. Account summary");
			System.out.print("Enter your choice, press 0 to quit: ");

			userChoice = Integer.parseInt(sc.nextLine());

			switch (userChoice) {

			case 1:        // Case 1 is for deposit amount into account 
				do {
					System.out.print("\nAmount you want to deposit: ");
					amount = Double.parseDouble(sc.nextLine());
					result = bankAccount.setDepositAmount(amount);
					if (!result) {
						System.out.printf("Error -- Amount should be grather than zero!\n");
					} else {
						System.out.printf("Hey %s. Successfully $ %.2f is deposited in account %d.\n", getCustomerName(), bankAccount.depositAmount, accountNumber);
					}
				} while (!result);

				break;

			case 2:			// Case 2 is for withdraw amount into account
				do {
					System.out.print("\nAmount you want to withdraw: ");
					amount = Double.parseDouble(sc.nextLine());
					withdrawCheck = bankAccount.setWithdrawAmount(amount);
					if (withdrawCheck == 0) {			// If user enter less than zero value
						System.out.printf("Error -- Withdraw amount should be grather than 0 !\n");
					} else {
						if (withdrawCheck == 1) {		// If user has zero balance
							System.out.printf(
									"Error -- Your current balance is %.2f. Please deposit some amount first.\n", bankAccount.balance);
							break;
						} else if (withdrawCheck == 2) {		// If user enter value greater then balance
							System.out.printf(
									"Error -- Your withdraw amount is exceeding current balance which is %.2f!\n", bankAccount.balance);
						} else {						// If transaction is done successfully
							withdrawCheck = 2;
							System.out.printf("$ %.2f is deducted from account %d, %s.\n", amount, accountNumber, getCustomerName());
						}
					}
				} while (withdrawCheck != 2);			//Terminate the loop if transaction is done successfully
				break;

			case 3:			// Case 3 is for checking the current balance into account
				System.out.printf("\nHello %s ! Your current balance is : $ %.2f\n", getCustomerName(), bankAccount.getBalance());
				break;
				
			case 4:			// Case 4 is to display the account summary(Mini-statement) 
				System.out.println(bankAccount);			//passing the object so toString method will call
				break;
				
			case 0:			// Case 0 is for exit from the menu 
				quit = true;
				System.out.println("All transaction done!");
				break;

			default:		// Default value is for validating the user choice
				System.out.println("\nWrong choice. Please enter between 0 to 4.");
				break;
			}
		} while (!quit);	// Terminate the switch-case option
	}

}
