package thread;

public class programB extends Thread  {
	public void run() {
		System.out.println("Inside program B");
		for(int i=0; i<=1000; i++) {
			
		}
		System.out.println("program B counted to 1 billion");
		System.out.println("exit program B");
	}
}
