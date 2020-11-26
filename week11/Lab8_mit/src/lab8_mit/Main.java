package lab8_mit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length, width, height;
		Scanner sc = new Scanner(System.in);
		
		RectangularPrism rp = new RectangularPrism();
		
		// Loop for checking valid length
		do {
			System.out.print("Enter the length: ");
			length = Double.parseDouble(sc.nextLine());
			
			if (rp.setLength(length))
				break;
			else
				System.out.println("Error -- length should be grather then 0!\n");
		} while (true);
		
		// Loop for checking valid width
		do {
			System.out.print("Enter the width: ");
			width = Double.parseDouble(sc.nextLine());
			
			if (rp.setWidth(width))
				break;
			else
				System.out.println("Error -- width should be grather then 0!\n");
		} while (true);
		
		// Loop for checking valid height
		do {
			System.out.print("Enter the height: ");
			height = Double.parseDouble(sc.nextLine());
			
			if (rp.setHeight(height))
				break;
			else
				System.out.println("Error -- height should be grather then 0!\n");
		} while (true);
		
		System.out.println(rp);		// Calling the toSting method of RectanglePrism class

	}

}
