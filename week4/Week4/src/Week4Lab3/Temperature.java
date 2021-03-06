package Week4Lab3;
public class Temperature {
		
		private double celsius, fahrenheit, kalvin;   //Define variables
	
		//Method which get the temperature value from Main class and set into celsius variable
		public void setCelsius(double newCelsius) { 
			celsius = newCelsius;
		}
		
		//Method which convert celsius to fahrenheit and return value in Main class
		public double getFahrenheit() {
			
			fahrenheit = (celsius * 1.8) + 32;
			return fahrenheit;
		}

		//Method which convert celsius to kalvin and return value in Main class
		public double getKalvin() {
			
			kalvin = (celsius +  273.15);
			return kalvin;
		}
		
		//Method which display all Temperature values
		public void displayTemperature() {
			System.out.printf("Temperature in Celsius    : %.2f\n", celsius );
			System.out.printf("Temperature in Fahrenheit : %.2f\n", fahrenheit );
			System.out.printf("Temperature in Kalvin 	  : %.2f\n", kalvin );
		}
}
