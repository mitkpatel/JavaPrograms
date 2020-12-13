package assignment4_mit;

public class NonFictionBook extends Book {

	public NonFictionBook(String title) {
		super(title);
		setPrice();
	}

	// implementing abstract method
	@Override
	public void setPrice() {
		price = 37.99;
	}

	@Override
	public String toString() {
		return "Type of Book = Non Fiction Book \n" + super.toString(); 
	}
	
}
