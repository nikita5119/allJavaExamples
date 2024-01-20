package thread;
import java.util.*;
public class consumer implements Runnable{
	stock demand;

	public consumer(stock shareProd) {
		demand=shareProd;
	}

	public void run() {
		try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter the quantity to order: ");
                int quantityToOrder = scanner.nextInt();

                synchronized (demand) {
                    while (demand.quantity < quantityToOrder) {
                        System.out.println("Notify Producer OUT OF STOCK : Total stocks :" + demand.quantity + " orders placed :" + quantityToOrder);
                        demand.notify(); // notify producer thread to start producing
                        demand.wait(); // wait until producer thread notifies new stock
                    }
                    demand.quantity = demand.quantity - quantityToOrder;
                    demand.updateStock(-quantityToOrder);  // Call updateStock to update stock quantity
                    System.out.println("Consumer ordered: " + quantityToOrder + " , total stock is :" + demand.quantity);
                }
            }
        }catch(Exception e) {
			e.printStackTrace();
			
		}
		
			
		}
}
