package lesson12.threads;

public class Main {

	// mainThread
	public static void main(String[] args) {
		Thread guiThread = new Thread(new GuiThread());
		guiThread.start();
		System.out.println("mainThread worked...");
	}

}
