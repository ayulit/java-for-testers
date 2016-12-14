package lesson12.threads;

public class Counter {
	
	private int c = 0;
	
	public void inc() {
		synchronized(this) {
			c++;
			System.out.println("inc c=" + c);			
		}

	}
	
	public void dec() {
		synchronized(this) {
			c--;
			System.out.println("dec c=" + c);			
		}
	}
	
	private synchronized int getC() {
		return c;
	}

}
