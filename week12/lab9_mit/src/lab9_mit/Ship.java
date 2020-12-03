package lab9_mit;

public abstract class Ship {
	
	String shipName, yearOfBuild;

	public Ship(String shipName, String yearOfBuild) {
		super();
		this.shipName = shipName;
		this.yearOfBuild = yearOfBuild;
	}

	@Override
	public String toString() {
		return "Ship [shipName=" + shipName + ", yearOfBuild=" + yearOfBuild + "]";
	}
	
	
}
