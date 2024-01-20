package thread;

public class programA extends person implements Runnable {
	public void run() {
		System.out.println("Inside program A");
		for(int i=0; i<=1000; i++) {
			
		}
		System.out.println("program A counted to 1 billion");
		System.out.println("exit program A");
	}

}
