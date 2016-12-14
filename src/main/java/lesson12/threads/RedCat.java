package lesson12.threads;

public class RedCat implements Runnable {

	private Counter c = null;

	public RedCat(Counter counter) {
		this.c = counter;
	}
	
	public void run() {
		c.dec();
	}

}
