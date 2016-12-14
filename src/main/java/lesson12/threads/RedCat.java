package lesson12.threads;

public class RedCat implements Runnable {

	public void run() {
		Counter.dec();
	}

}
