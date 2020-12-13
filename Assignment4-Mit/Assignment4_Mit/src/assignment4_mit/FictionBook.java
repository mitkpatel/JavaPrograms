package assignment4_mit;

public class FictionBook extends Book {
	
	// Overloaded constructor
	public FictionBook(String title) {
		super(title);      				 // Calling  overloaded constructor of Book class
		setPrice();
	}

	// implementing abstract method
	@Override
	public void setPrice() {
		price = 24.99;
	}

	@Override
	public String toString() {
		return "Type of Book = Fiction Book \n" + super.toString(); 
	}

}
