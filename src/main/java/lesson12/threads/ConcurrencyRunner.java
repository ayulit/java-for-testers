package lesson12.threads;

public class ConcurrencyRunner {

	public static void main(String[] args) {

		Thread greyCat = new Thread(new GreyCat()); 
		Thread redCat = new Thread(new RedCat());
		
		greyCat.start();
		redCat.start();

	}

}
