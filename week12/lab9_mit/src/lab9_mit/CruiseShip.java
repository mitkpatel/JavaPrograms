package lab9_mit;

public class CruiseShip extends Ship {
	
	int maxPassenger;

	public CruiseShip(String shipName, String yearOfBuild, int maxPassenger) {
		super(shipName, yearOfBuild);
		this.maxPassenger = maxPassenger;
	}

	@Override
	public String toString() {
		return super.toString() + "CruiseShip [maxPassenger=" + maxPassenger + "]";
	}
	

}
