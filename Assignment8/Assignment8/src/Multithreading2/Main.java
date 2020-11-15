package Multithreading2;

public class Main {
	public static void main(String[] args) {
		
		BankAccount account= new BankAccount("Rich", 500);
		
		Thread deposit = new Deposit(account);
		Thread withdraw = new Withdraw(account);
		
		deposit.start();
		withdraw.start();
	

	}
}
