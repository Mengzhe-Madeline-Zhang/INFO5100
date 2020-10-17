package info5100.assignment5.MengzheZhang;

public class Cookie extends DessertItem {

	int number;
	int price;
	
	
	public Cookie(String name, int number, int price) {
		super(name);
		
		this.number=number;
		this.price=price;
	}
		

	public int getCost() {
		double dcost = price/(12/number);
		int cost = (int) Math.round(dcost);
		return cost;
	}
}
