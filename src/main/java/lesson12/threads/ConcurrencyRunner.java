package lesson12.threads;

public class ConcurrencyRunner {

	public static void main(String[] args) {

		Counter cup = new Counter();
		
		Thread greyCat = new Thread(new GreyCat(cup)); 
		Thread redCat = new Thread(new RedCat(cup));
		
		greyCat.start();
		redCat.start();

	}

}
