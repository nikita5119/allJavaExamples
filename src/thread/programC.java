package thread;

public class programC extends Thread {
	public void run() {
		System.out.println("Inside program C");
		for(int i=0; i<=1000; i++) {
			
		}
		System.out.println("program C counted to 1 billion");
		System.out.println("exit program C");
	}
}
