package staticExample;

public class chaseBank {
	static String BankName = "JP morgan";
	String CustomerName;
	int accountNumber;
	
	public chaseBank(String c, int ac) {
		CustomerName = c;
		accountNumber = ac;
	}
	
	


public static void main(String[] args) {
	chaseBank cb = new chaseBank("Nikita", 88);
	chaseBank cb1 = new chaseBank("Suresh", 99);
	
	System.out.println(cb.CustomerName);
	cb.CustomerName = "John";
	System.out.println(cb.CustomerName);
	System.out.println(cb.BankName);
	cb.BankName= "Bank of america";
	System.out.println(cb.BankName);
	chaseBank.BankName= "Chase";
	System.out.println(cb.BankName);
	
	
}
}