package lesson12.threads;

public class GreyCat implements Runnable {

	public void run() {
		Counter.inc();
	}

}
