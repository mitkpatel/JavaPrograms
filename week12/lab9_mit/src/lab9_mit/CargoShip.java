package lab9_mit;

public class CargoShip extends Ship {

	double maxWeight;

	public CargoShip(String shipName, String yearOfBuild, double maxWeight) {
		super(shipName, yearOfBuild);
		this.maxWeight = maxWeight;
	}

	@Override
	public String toString() {
		return super.toString() + "CargoShip [maxWeight=" + maxWeight + "]";
	}
	
}
