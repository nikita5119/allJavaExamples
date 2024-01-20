package constructor;

public class Jeep {

	public static void main(String[] args) {
		Car c = new Car(10);
		Car c1 = new Car("purple");
		Car c2 = new Car("orange", 100);
		
		System.out.println(c.door + c.color);
		System.out.println(c1.door + c1.color);
		System.out.println(c2.door + c2.color);
		
		

	}

}
