package week5;

public class Bill {
	
	//instance fiekds
	private double billCharge;
	//No need to have calculated fields declaration
	
	//Accssor method
	public double geBillCarge() {
		return billCharge;
	}
	
	//Mutator method
	public void seBillCharge(double newBillCharge) {
		//Set the value only if it is valid i.e. above 0 and upto 500.
		//but if more than 500 is provided then set to 500
		
		if (newBillCharge<0) {
			billCharge = 0;
		}
		else {
			if (newBillCharge > 500) {
				billCharge = 500;
			}
			else {
				billCharge = newBillCharge;
			}
		}
	}
	
	
	public double getTaxes() {
		double taxes = billCharge * 0.1;
		return taxes;
	}

	public double getTip() {
		double tip = billCharge * 0.18;
		return tip;
	}
	
	public double getNetCharges() {
		double netCharges = billCharge + getTaxes() + getTip();
		return netCharges;
	}
	
	public double getBillCharge() {
		return billCharge;
	}
	
}
