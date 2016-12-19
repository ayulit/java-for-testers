package lesson09.exceptions;

public class Car {
	
	private String conditions;

	public Car(String c) {
		this.conditions = c;
	}
	
	public void drive() throws NoRoadException {
			
		try {
			accelerate();
		} catch (SlipperyRoadException e) {
			enableABS();
		}
		
	}

	private void enableABS() {
		System.err.println("ABS enabled");		
	}

	private void accelerate() throws SlipperyRoadException, NoRoadException {
		System.out.println("Accelerating...");
		
		if(conditions.equals("winter")) {
			throw new SlipperyRoadException();
		}
		
		if(conditions.equals("offroad")) {
			throw new NoRoadException();
		}
		
	}

	
}
