package lesson09.exceptions;

public class Driver {

	public static void main(String[] args) {
		Car jeep = new Car("winter");
		Car ferrari = new Car("offroad");
		
		try {
			jeep.drive();			
		} catch (NoRoadException e) {
			System.err.println("Time to walk");
		}
		
		try {
			ferrari.drive();			
		} catch (NoRoadException e) {
			System.err.println("Time to walk");
		}

	}

}
