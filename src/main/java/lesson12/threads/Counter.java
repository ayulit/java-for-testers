package lesson12.threads;

public class Counter {
	
	private static int c = 0;
	
	public static void inc() {
		c++;
		System.out.println("inc c=" + getC());
	}
	
	public static void dec() {
		c--;
		System.out.println("dec c=" + getC());
	}
	
	public static int getC() {
		return c;
	}

}
