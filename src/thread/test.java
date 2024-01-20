package thread;

public class test {

	public static void main(String[] args) {
		/*System.out.println("Main Program");
		programA pa = new programA();
		Thread t = new Thread(pa);
		programB pb = new programB();
		programC pc = new programC();
		t.start();
		pb.start();
		pc.start();*/
		
		Alarm a = new Alarm();
		a.start();

	}

}
