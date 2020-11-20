package Week4Class;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Meal Charges:");
		Scanner sc = new Scanner(System.in);
		double mealCharges = sc.nextDouble();
		
		Bill bill = new Bill();
		
		bill.setMealCharges(mealCharges);
		bill.getTaxCharge();
		bill.getTipCharge();
		bill.getNetCharge();
		bill.display();
	}

}
