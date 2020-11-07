package Question3;

public class ReverseHello extends Thread{

	private int num;
	public ReverseHello(int num) {
		super("Thread "+num);
		this.num=num;
	}
	
	public void run() {
		num++;
		if(num<=51) {
			ReverseHello rev=new ReverseHello(num);
			rev.start();
			try {
				rev.join();
				System.out.println("Hello from " + getName()+"!");
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		ReverseHello rh1= new ReverseHello(1);
		rh1.start();
	}

}
