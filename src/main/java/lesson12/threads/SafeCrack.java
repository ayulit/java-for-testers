package lesson12.threads;


/*
 * 		Beagle boys are cracking a safe with 2 wheels,
 *      the can roll wheels independently from each other
 *      and parallel
 * */
public class SafeCrack {

	public static void main(String[] args) {
		
		Safe safe = new Safe();
		
		Thread bigtime = new Thread(new BigtimeBeagle(safe));
		Thread burger  = new Thread(new BurgerBeagle(safe));
		
		bigtime.start();
		burger.start();

	}

}
