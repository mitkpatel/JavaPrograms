package lab9_mit;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ship[] ship = new Ship[4];
		
		ship[0] = new CruiseShip("ship1","02-03-2002",3);
		ship[1] = new CruiseShip("ship2","02-03-2002",3);
		ship[2] = new CargoShip("ship3","02-03-2002",40.3);
		ship[3] = new CargoShip("ship4","02-03-2002",30);
		
		for (int i = 0; i < ship.length; i++) {
			System.out.println(ship[i] + "\n");
		}
	}
}
