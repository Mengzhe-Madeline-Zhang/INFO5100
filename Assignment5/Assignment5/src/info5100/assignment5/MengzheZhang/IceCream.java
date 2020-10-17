package info5100.assignment5.MengzheZhang;

public class IceCream extends DessertItem{

	String name;
	int cost;
	public IceCream(String name, int cost) {
		this.name=name;
		this.cost=cost;
	}

	@Override
	public int getCost() {
	
		return cost;
	}

}
