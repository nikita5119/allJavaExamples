package polymorphism;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("which typeof car you want 1(econmic), 2(better), 3(fastest)");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			nisaan n = new nisaan();
			n.drive();
			break;
			
		case 2:
			toyota t = new toyota();
			t.drive();
			break;
			
		case 3:
			ferrari f = new ferrari();
			f.drive();
			break;
		}
		
	}	// this is overridding
		/*public static void TestDrive(car c) {
			c.drive();
			
		}*/
	

}
