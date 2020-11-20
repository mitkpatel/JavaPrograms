package week5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double bCharge;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter bill charge:");
		bCharge = sc.nextDouble();
		
		Bill bill = new Bill();
		bill.seBillCharge(bCharge);
		System.out.printf("Bill Charge: %.2f\n", bill.getBillCharge());
		System.out.printf("Tax Charge: %.2f\n", bill.getTaxes());
		System.out.printf("Tip Charge: %.2f\n", bill.getTip());
		System.out.printf("Net Charge: %.2f\n", bill.getNetCharges());
	}

}
