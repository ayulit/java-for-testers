package lesson09.exceptions;

public class Dummy {

	public static void main(String[] args) {
		
		try {
			throw new NullPointerException("blah");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
