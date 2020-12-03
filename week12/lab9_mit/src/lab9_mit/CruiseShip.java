package lab9_mit;

public class CruiseShip extends Ship {  	//Extending Ship class
	
	// Instant variables
	int maxPassenger;

	/*
	 * Constructor with 3 parameters, 
	 * Where first 2 parameters is going to pass into Ship class.
	 */
	public CruiseShip(String shipName, String yearOfBuild, int maxPassenger) {
		super(shipName, yearOfBuild);
		this.maxPassenger = maxPassenger;
	}

	// Overriding toString method to return Ship details + passenger capacity
	@Override
	public String toString() {
		return super.toString() + "Cruise Ship Passenger Capacity = " + maxPassenger + "\n";
	}
	

}
