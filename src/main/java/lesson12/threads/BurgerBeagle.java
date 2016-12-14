package lesson12.threads;

public class BurgerBeagle implements Runnable {

	private Safe safe;
	
	public BurgerBeagle(Safe safe) {
		this.safe = safe;
	}

	public void run() {
		safe.clockwiseRightWheel();
		safe.clockwiseRightWheel();
	}

}
