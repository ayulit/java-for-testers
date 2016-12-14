package lesson12.threads;

public class DataProcessingThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("dataProcessingThread worked...");
	} 
}
