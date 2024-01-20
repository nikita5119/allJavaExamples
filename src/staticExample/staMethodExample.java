package staticExample;

public class staMethodExample {
	static String BankName = "JP morgan";
	String CustomerName;
	int accountNumber;
	
	public static void method1() {
		System.out.println(BankName);
	
	}
	
	public void method2()
	{
		System.out.println(CustomerName);
		System.out.println(BankName);
	}
	
	public static void method3() {
		method1();
		System.out.println("hello");
		
	}
	
	public void method4() {
		System.out.println(BankName);
		
	}
}
