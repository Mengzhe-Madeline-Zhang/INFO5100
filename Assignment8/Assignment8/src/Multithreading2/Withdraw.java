package Multithreading2;


	public class Withdraw extends Thread{
		
		BankAccount account;
		
		public Withdraw(BankAccount account) {
			this.account=account;
		}
		
		@Override
		public void run() {
			while(true){
					int random = (int) (Math.random()*1000)+1;
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					if(random>account.getBalance()) {

							System.out.println(account.getAccount()+": Can't withdraw! try to withdraw "+random+"dollar, but current balance is "+account.getBalance()+"dollar.");

					}else {
						account.setBalance(account.getBalance()-random);
						System.out.println(account.getAccount()+": withdraw "+random+"dollar, and balance is "+account.getBalance()+"dollar.");
				}
			}
		}
	}
	








