package methodCall;
import java.util.Scanner;
public class whileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do u want to add product in your cart");
		boolean response= sc.nextBoolean();
		
		do {
			System.out.println("successful");
			System.out.println("do u want to add more?");
			response= sc.nextBoolean();
			
		}while(response);

	}

}
