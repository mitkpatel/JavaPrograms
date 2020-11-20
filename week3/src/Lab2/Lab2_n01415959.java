package Lab2;    									 //Lab2 work
import java.util.Scanner;

public class Lab2_n01415959 {
	
	public static void main(String[] args) {
		
		Double mealCharge, tax, tip, totalBill; 	//Declaration of variables
		
		//Get data from user
		Scanner sc = new Scanner(System.in);		//Declared a reference variable sc of class Scanner, which takes input from user
		
		System.out.print("Enter the charge for the meal: ");
		mealCharge = sc.nextDouble();      			//Read meal charge from keyboard(sc object)
		
		tax = mealCharge * 0.075;               	//Calculating the tax amount; tax = mealCharge*(7.5/100)
		tip = mealCharge * 0.18;					//Calculating the tip amount; tip = mealCharge*(18/100) 
		totalBill = mealCharge + tax + tip;			//Calculating the net bill by summing up the all values
	
		System.out.printf("Amount of meal charge : %6.2f\n", mealCharge);    //Maximum up to 6 digit with 2 decimal precision
		System.out.printf("Amount of tax         : %6.2f\n", tax);
		System.out.printf("Amount of tip         : %6.2f\n", tip);
		System.out.printf("Amount of total bill  : %6.2f\n", totalBill);
		
		System.exit(0);								//Use to indicate successful termination 	
	}
}