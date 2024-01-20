package thread;
import java.util.*;
public class producer extends Thread {
	stock supply;

	public producer(stock shareProd) {
		supply=shareProd;
	}

	public void run() {
		try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (supply) {
                    System.out.print("Enter the quantity to add: ");
                    int quantityToAdd = scanner.nextInt();
                    supply.quantity = supply.quantity + quantityToAdd;
                    System.out.println("Notify Consumers NEW STOCK ARRIVAL: Total stocks :" + supply.quantity);
                    supply.updateStock(quantityToAdd);  // Call updateStock to update stock quantity
                    supply.notify(); // notify the consumers for new stock arrival
                    supply.wait(); // wait until the product runs out of stock and consumer notifies
                }
            }
        }catch(Exception e){
				
			}
		
	}
}
