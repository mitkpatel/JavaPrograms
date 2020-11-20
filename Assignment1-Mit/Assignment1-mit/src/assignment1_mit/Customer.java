package assignment1_mit;   //Id - N01415959 

public class Customer {
	
	//Instance Fields or variables
	private String customerName, email;
	private long phone;

	//Mutator methods
	//setCustomerName will check the customer name is empty or not
	public boolean setCustomerName(String customerName) {
		boolean successful = false;
		if (!(customerName.isEmpty())) {
			this.customerName = customerName;
			successful = true;
		}
		return successful;
	}
	
	//Validation of phone number
	public boolean setPhone(long phone) {
		boolean successful = false;
		if ((Long.toString(phone).length() == 10) && (phone > 0)) {
			this.phone = phone;
			successful = true;
		}
		return successful;
	}

	//Validation of email address
	public boolean setEmail(String email) {
		boolean successful = false;
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if (email.matches(regex)) {
			this.email = email;
			successful = true;
		}
		return successful;
	}
	
	//Accessor Methods
	public String getCustomerName() {
		return customerName;
	}
	
	public long getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
	
	//Constructor
	public Customer() {
		customerName = "TBA";
		email = "TBA@gmail.com";
		phone= 1111111111;
	}
	
	//Store-name, date of sale and customer details  
	public void printCustomerDetails() {
		System.out.printf("\nHere is your invoice, %s.\n",getCustomerName());
		System.out.printf("Name of store              : %s\n", "Walmart");
		System.out.printf("Date of sale               : %s\n", java.time.LocalDate.now());   //System.out.println(java.time.Clock.systemUTC().instant());  
		System.out.printf("Name of customer           : %s\n", getCustomerName());
		System.out.printf("Contact number of %s: %d\n", getCustomerName(), getPhone());
		System.out.printf("Email address of %s : %s\n", getCustomerName(), getEmail());
	}
	
}
