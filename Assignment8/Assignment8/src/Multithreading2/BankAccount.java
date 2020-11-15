package Multithreading2;

public class BankAccount {

		private String account;
		private double balance;
		
		public BankAccount(String account, double balance) {
			this.account=account;
			this.balance=balance;
		}
		
		public String getAccount() {
			return account;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			this.balance=balance;
		}
		

}
