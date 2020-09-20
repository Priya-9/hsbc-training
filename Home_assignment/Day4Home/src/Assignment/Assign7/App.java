package Assignment.Assign7;

public class App {
	public int id, bal;
	public App(int id, int bal) {
		this.id = id;
		this.bal = bal;
	}
	
	public void deposit(int x, int amt) {
		try {
			if(x != id)
					throw new AccountBlockedException();
			else
			{	this.bal += amt;
				System.out.println("Current balance : "+ bal);
			}
		}
		catch(AccountBlockedException e) {
			System.out.println(e);
		}
	}
	
	public void withdraw(int id, int amt) {
		try {
			if(id != this.id) {
				throw new AccountBlockedException();
			}
			else {
				if(bal < amt)
					throw new InsufficientBalanceException();
				else
				{	bal = bal-amt;
					System.out.println("Current balance : " + bal);
				}
			}
		}
		catch(AccountBlockedException e) {
			System.out.println(e);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
	
	public void getBalance(int id) {
		try {
			if(id != this.id) {
				throw new AccountBlockedException();
			}
			else
				System.out.println("current balance : " + bal);
		}
		catch(AccountBlockedException e) {
			System.out.println(e);
		}
	}
	
	public void blockAccount(int id){
		try {
			if(id != this.id) {
				throw new AccountBlockedException();
			}
			else {
				this.id = 0;
				this.bal = 0;
			}
		}
		catch(AccountBlockedException e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		App obj = new App(3, 1000);
		
			obj.deposit(23, 500);
			obj.withdraw(23,  200000);
			obj.withdraw(3,  200000);
		
	}
	
}
