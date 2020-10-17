package info5100.assignment5.MengzheZhang;

public class Candy extends DessertItem {
    
	String name;
	double weight;
	int price;
	
	public Candy(String name, double weight, int price) {
		this.name=name;
		this.weight=weight;
		this.price=price;
	}
	
	

	@Override
	public int getCost() {
		double dcost=weight*price;
		int cost = (int) Math.round(dcost);
		return cost;
	}

}
