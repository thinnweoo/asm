package felix;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.00);
		
		System.out.println("Opening Balance: $" + account.getBalance());
		
		account.deposit(500.00);
		System.out.println("Depositing $500.00...");
		System.out.println("New balance: $" + account.getBalance());
		
		account.withdraw(200.00);
		System.out.println("Withdrawing $200.00...");
		System.out.println("New balance: $" + account.getBalance());
	}
}
