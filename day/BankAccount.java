package felix;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("Insufficient balance!");
		}
	}
	


}

