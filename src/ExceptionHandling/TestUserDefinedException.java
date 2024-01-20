package ExceptionHandling;

public class TestUserDefinedException {
	public static void main (String args[]) throws NotEnoughBalanceException {
		BankAccount ba = new BankAccount();
		ba.withdraw(1000);
	}

}
