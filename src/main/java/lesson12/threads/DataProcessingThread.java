package lesson12.threads;

public class DataProcessingThread extends Thread {
	
	@Override
	public void run() {
		
		long time = 1000; // seconds
		
		System.out.println("dataProcessingThread started...");
		
		try {
			Thread.sleep(time); // THIS thread will sleep
		} catch (InterruptedException e) {
			// occures if thread will be interrupted before time will have came 
			System.out.println("dataProcessingThread: wake up!");
		}
		
		System.out.println("dataProcessingThread: good morning!");
	} 
}
