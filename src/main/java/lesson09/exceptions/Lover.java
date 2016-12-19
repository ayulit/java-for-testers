package lesson09.exceptions;

public class Lover {

	public static void main(String[] args) {
		User angelinaJolie = new User();
		User someGirl = null;
		
		makeLove(angelinaJolie);
		
		try {
			makeLove(someGirl);
		} catch (NullPointerException e) {
			System.err.println("No user for love");
		}
		
	}
	
	private static void makeLove (User u) throws NullPointerException {
		if (null == u) {
			// no user for love
			throw new NullPointerException();
		}
		System.out.println("Making love");
	}

}
