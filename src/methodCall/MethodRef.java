package methodCall;

public class MethodRef {
	
	public void method1(Person p1) {
		p1.name = "Suresh";
		method2(p1);
		
		
	}
	
	public void method2(Person p2) {
		//p2 = new Person();
		p2.name = "mike";
		
		
	}
}
