package lab9_mit;

public abstract class Ship {   // Abstract keyword convert the class into abstract
	
	// Instant variables
	String shipName, yearOfBuild;

	/*
	 * Here I don't created Getter and Setter because we are passing value into constructor.
	 * Constructor with 2 parameters
	 */
	public Ship(String shipName, String yearOfBuild) {
		super();
		this.shipName = shipName;
		this.yearOfBuild = yearOfBuild;
	}

	// Overriding toString method to return Ship details
	@Override
	public String toString() {
		return "Ship details.\nName of ship = " + shipName + "\nYear Of Build = " + yearOfBuild + "\n";
	}
	
}
