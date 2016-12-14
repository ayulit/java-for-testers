package lesson12.threads;

public class BigtimeBeagle implements Runnable {

	private Safe safe;
	
	public BigtimeBeagle(Safe safe) {
		this.safe = safe;
	}

	public void run() {
		safe.clockwiseLeftWheel();
		safe.counterlockwiseLeftWheel();
	}

}
