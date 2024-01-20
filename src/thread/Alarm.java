package thread;
import java.util.Date;
public class Alarm extends Thread {
	public void run() {
		System.out.println("Set alram" + new Date());
		try {
			this.currentThread().sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	System.out.println("wake up" + new Date());
	
	}
}
