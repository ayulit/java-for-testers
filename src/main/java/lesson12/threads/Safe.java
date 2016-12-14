package lesson12.threads;

public class Safe {
	private int leftWheel;
	private int rightWheel;
	
	// Two objects of synchronization - 2 stethoscopes
	private Object firstStethoscope = new Object();
	private Object secondStethoscope = new Object();
		
	public void clockwiseLeftWheel(){
		synchronized (firstStethoscope) {
			leftWheel++;
			System.out.println("clockwiseLeftWheel=" + leftWheel);	
		}		
	}
	
	public void counterlockwiseLeftWheel(){
		synchronized (firstStethoscope) {
			leftWheel--;
			System.out.println("counterlockwiseLeftWheel=" + leftWheel);	
		}	
	}
	
	public void clockwiseRightWheel(){
		synchronized (secondStethoscope) {
			rightWheel++;
			System.out.println("clockwiseRightWheel=" + rightWheel);	
		}		
	}
	
	public void counterlockwiseRightWheel(){
		synchronized (secondStethoscope) {
			rightWheel--;
			System.out.println("counterlockwiseRightWheel=" + rightWheel);
		}		
	}

}
