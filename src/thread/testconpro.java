package thread;

public class testconpro {
public static void main(String args[]) {
		
		stock Iphone=new stock();
		// extends thread
		producer Apple= new producer(Iphone);
		// implements runabble
		consumer Users= new consumer (Iphone);
		Thread t=new Thread(Users);
		
		Apple.start();
		t.start();
	}
}
