package ExceptionHandling;

public class BankAccount {
	float balance = 100.0f;
	
	public float withdraw(float amt) throws NotEnoughBalanceException {
		if (balance > amt) {
			balance = balance-amt;
			System.out.println("collect cash");
		}
		else { //fail on purpose
			NotEnoughBalanceException neb = new NotEnoughBalanceException("Insufficient Balance");
			throw neb;
		}
		return balance;
	}

}
