package assignment1_mit;  //Id - N01415959 

public class Item {
	
	//Instance Fields or variables
	private String itemName;
	private int quantity;
	private double unitPrice, charges;
	
	//variables for sub-calculation and storing strings/double values
	private int totalItems = 0;
	private String strTemp, strMain = "";
	private double totalCharges = 0, subTotal = 0, tax = 0, netTotal = 0;
	
	//Define constants 
	public final int MIN_QUANTITY = 1, MAX_QUANTITY = 10;
	
	//Mutator methods
	//setItemName will check the item name is empty or not
	public boolean setItemName(String itemName) {
		boolean successful = false;
		if (!(itemName.isEmpty())) {
			this.itemName = itemName;
			successful = true;
			totalItems++;
		}
		return successful;
	}
	
	//setQuantity will check the item quantity should satisfied the required condition
	public int setQuantity(int quantity) {
		if (quantity <= 0) {
			return 0;
		}
		else {
			if ((quantity < MIN_QUANTITY) || (quantity > MAX_QUANTITY))
				return 1;
			else {
				this.quantity = quantity;
				return 2;
			}	
		}
	}
	
	//setUnitPrice will check the item unit price is greater than 0
	public boolean setUnitPrice(double unitPrice) {
		boolean successful = false;
		if (unitPrice > 0) {
			this.unitPrice = unitPrice;
			successful = true;
		}
		return successful;
	}
	
	//Accessor Methods
	public String getItemName() {
		return itemName;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	//Constructor
	public Item() {
		itemName = "TBA";
		quantity = MIN_QUANTITY;
		unitPrice = 1;	
	}
	
	//Calculation methods
		public void itemsPrint() {
			strTemp = "Name of item               : " + getItemName() + "\n" +
		    "Quantity of " + getItemName() + "          : " + getQuantity() + "\n" +
		    "Unit price for " + getItemName() + "       : " +  String.format("%.2f", getUnitPrice()) + "\n" +
		    "Order chargers for " + getItemName() + "   : " +  String.format("%.2f", getOrderChargers()) + "\n\n";
		
			strMain = strMain.concat(strTemp);	
	}
		
	//This method will calculate individual item charges and store value in total charges.
	//It will also call itemPrint method to store string, which we needed at the end in invoice.
	public void addOrderChargers() {
		charges = getQuantity() * getUnitPrice();
		totalCharges += charges;
		itemsPrint();
	}
	
	public double getOrderChargers() {
		return charges;
	}
	
	public double getSubTotal() {
		subTotal += totalCharges;
		return subTotal;
	}
	
	public double getTax() {
		tax = subTotal * 0.13;
		return tax;
	}
	
	public double getNetTotal() {
		netTotal = subTotal + tax;
		return netTotal;
	}
	
	//Every item details with overall tax, gross pay and net pay
	public void printInvoice() {
		System.out.printf("\nDetails of each item.\n");
		System.out.printf(strMain);						//Individual item details will print here
		System.out.printf("Number of items you order  : %d\n", totalItems);
		System.out.printf("Sub total of all items     : %.2f\n", getSubTotal());
		System.out.printf("Total tax                  : %.2f\n", getTax());
		System.out.printf("Net total (Including Tax)  : %.2f\n", getNetTotal());
	}

}
