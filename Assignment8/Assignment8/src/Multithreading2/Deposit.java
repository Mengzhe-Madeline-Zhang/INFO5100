package Multithreading2;

public class Deposit extends Thread{
	
	BankAccount account;
	
	public Deposit(BankAccount account) {
		this.account=account;
	}
	
	@Override
	public void run() {
		while(true) {

				
				int random = (int) (Math.random()*1000)+1;
				account.setBalance(account.getBalance()+random);

				System.out.println(account.getAccount()+": deposit "+random+"dollar, and balance is "+account.getBalance()+"dollar." );
				try {
					Thread.sleep(3000);
				} catch(InterruptedException e) {
					
			}
		}
	}
} 