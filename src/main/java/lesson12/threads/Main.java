package lesson12.threads;

public class Main {

	// mainThread
	public static void main(String[] args) {
		
		Thread guiThread = new Thread(new GuiThread());
		Thread dataProcessingThread = new DataProcessingThread();
		
		System.out.println("mainThread worked...");
		
		// creating thread using anonymous class
		Thread httpThread = new Thread(new Runnable(){
											  public void run() {
												  System.out.println("httpThread worked...");
											  }
										   }
		                        );
		
		guiThread.start();
		dataProcessingThread.start();
		httpThread.start();
		
		// mainThread waits this threads to die		
		try {
			guiThread.join();
			dataProcessingThread.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} 
		 
		
	}

}
