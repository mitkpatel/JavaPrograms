package Lab4_n01415959;
public class Invoice {
	
	//instance fields
	private int numberOfPkgs;
	private double retailPrice = 99;
	private double orderAmount;
	private double discount;
	
	//Constructor for Invoice Class
	public Invoice() {
		numberOfPkgs = 0;
	}
		
	//Mutator method
	public void setNoOfPackages(int packages) {
		numberOfPkgs = packages;
	}
	
	//Accessor method
	public int getNoOfPackages() {
		return numberOfPkgs;
	}
	
	//Methods for calculating total order amount
	public double getOrderAmount() {
		orderAmount = retailPrice * numberOfPkgs;
		return orderAmount;
	}
	
	//Methods for calculating discount amount
	public double getDiscount() {
		if (numberOfPkgs < 10) {
			discount = 0 + orderAmount;
		} 
		else if (numberOfPkgs >= 10 && numberOfPkgs <= 19) {
			discount = 0.2 * orderAmount;
		}
		else if (numberOfPkgs >= 20 && numberOfPkgs <= 49) {
			discount = 0.3 * orderAmount;
		}
		else if (numberOfPkgs >= 50 && numberOfPkgs <= 99) {
			discount = 0.4 * orderAmount;
		}
		else {
			discount = 0.5 * orderAmount;
		}
		
		return discount; 
	}
	
	//Methods for calculating net payable
	public double getNetPayable() {
		double netPayable = orderAmount - discount;
		return netPayable;
	}
		
}
