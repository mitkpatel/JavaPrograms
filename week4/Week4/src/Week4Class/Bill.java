package Week4Class;

public class Bill {

	private double mCharge, taxCharge, tipCharhe, netCharge;
		
	public void setMealCharges(double newMealCharge) {

		mCharge = newMealCharge;
	}

	//Type 2
	
	public double getTaxCharge() {
		taxCharge = mCharge * 0.075;
		return taxCharge;
	}
	
	public double getTipCharge() {
		tipCharhe = mCharge * 0.18;
		return tipCharhe;
	}
	
	public double getNetCharge() {
		netCharge = mCharge + taxCharge + tipCharhe;
		return netCharge;
	}
	
	public void display() {
		System.out.printf("Meal Charges: %.2f\n", mCharge );
		System.out.printf("Tax Charges : %.2f\n", taxCharge );
		System.out.printf("Tip Charges : %.2f\n", tipCharhe );
		System.out.printf("Net Charges : %.2f\n", netCharge );
	}
}
