package lab6_mit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Instances declaration
		String[] employeeName = new String[10];
		int[] hours = new int[10];
		double[] payrate = new double[10];
		double[] grossPay = new double[10];
		double totalHours = 0, totalPayrate = 0, payroll = 0;
		
		//For accepting the value from user
		Scanner sc = new Scanner(System.in);
		
		//This for loop is for validating and calculating the required fields.
		for (int i = 0; i < employeeName.length; i++) {
			
			//This do-while is for validating employee name is empty or not
			do {
				System.out.printf("Enter the name of employee %d : ",i+1);
				employeeName[i] = sc.nextLine();
				
				if (employeeName[i].isEmpty())
				{
					System.out.println("Error -- Enter valid name again.");
				} 
				else 
				{
					//This do-while is for validating employee hours is valid or not
					do {
						System.out.printf("Enter the number of hours employee %s worked: ",employeeName[i]);
						hours[i] = Integer.parseInt(sc.nextLine());
						
						if (hours[i] > 0 && hours[i] < 40)
						{
							//This do-while is for validating employee pay rate is valid or not
							do {
								System.out.printf("Enter the pay rate of employee %s : ",employeeName[i]);
								payrate[i] = Double.parseDouble(sc.nextLine());
								
								if (payrate[i] > 15 && payrate[i] < 100)
								{
									//User entered all valid data. So now calculate the required things.
									grossPay[i] = hours[i] * payrate[i]; 		//Gross pay calculate
									totalHours = totalHours + hours[i];			//Total number of hours
									totalPayrate = totalPayrate + payrate[i];   //Total pay rate
									payroll = payroll + grossPay[i];			//Payroll is addition of gross pay of each employee
								}
								else
								{
									System.out.println("Error -- Payrate should be between 15 to 100. Enter again.");
								}
							} while(!(payrate[i] > 15 && payrate[i] < 100));     //Pay rate do-while complete
						}
						else 
						{
							System.out.println("Error -- Hours should be between 0 to 40. Enter again.");
						}
					} while(!(hours[i] > 0 && hours[i] < 40));		//Hours do-while complete
				}
				
			} while (employeeName[i].isEmpty());		//Name do-while complete
			
		}
		
		//This for loop is for printing the all fields.
		for (int i = 0; i < employeeName.length; i++) {
			System.out.printf("\nName of employee %d       : %s", i+1, employeeName[i]);
			System.out.printf("\nHours of employee %d      : %d", i+1, hours[i]);
			System.out.printf("\nPayrate of employee %d    : %.2f", i+1, payrate[i]);
			System.out.printf("\nGross pay of employee %d  : %.2f\n", i+1, grossPay[i]);
		}
		
		System.out.printf("\nAverage No of hours     : %.2f", totalHours/hours.length);
		System.out.printf("\nAverage of payrate      : $ %.2f", totalPayrate/payrate.length);
		System.out.printf("\nTotal payroll           : $ %.2f", payroll);
		
		System.exit(0);
	}
}
