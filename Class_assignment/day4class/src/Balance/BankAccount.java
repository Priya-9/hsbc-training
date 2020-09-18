package Balance;

public class BankAccount {
	private double balance;
	
	public BankAccount(double b) {
		balance = b;
	} 
	public double withdraw(double amount) {
		double x = balance;
		try {
			if(balance < amount) {
				throw new LowBalanceException();
			}
			else
				balance = balance-amount;
		}
		catch(LowBalanceException e) {
			throw new RuntimeException( e);
		}
		return balance;
	}
}
