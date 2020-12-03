package lab9_mit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating object of array of Ship class with 4 size.
		Ship[] ship = new Ship[4];
		
		// Passing values for CruiseShip
		ship[0] = new CruiseShip("Cruise Ship 1","15-04-2015",3);
		ship[1] = new CruiseShip("Cruise Ship 2","20-11-2017",3);
		
		// Passing values for CargoShip
		ship[2] = new CargoShip("Cargo Ship 1","31-01-2018",40.3);
		ship[3] = new CargoShip("Cargo Ship 2","22-06-2020",30);
		
		// Loop for calling toString method
		for (int i = 0; i < ship.length; i++) {
			System.out.println(ship[i] + "\n");
		}
	}
}
