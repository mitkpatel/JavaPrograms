package lab9_mit;

public class CargoShip extends Ship {		//Extending Ship class

	// Instant variables
	double maxWeight;

	/*
	 * Constructor with 3 parameters, 
	 * Where first 2 parameters is going to pass into Ship class.
	 */
	public CargoShip(String shipName, String yearOfBuild, double maxWeight) {
		super(shipName, yearOfBuild);
		this.maxWeight = maxWeight;
	}

	// Overriding toString method to return Ship details + weight capacity
	@Override
	public String toString() {
		return super.toString() + "Cargo Ship Weight Capacity = " + maxWeight + "\n";
	}
	
}
