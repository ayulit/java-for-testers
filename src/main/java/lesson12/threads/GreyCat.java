package lesson12.threads;

public class GreyCat implements Runnable {

	private Counter c = null;

	public GreyCat(Counter counter) {
		this.c = counter;
	}
		
	public void run() {
		c.inc();
	}

}
