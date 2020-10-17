package info5100.assignment5.MengzheZhang;

public class IceCream extends DessertItem{


	int cost;
	public IceCream(String name, int cost) {
		super(name);
		
		this.cost=cost;
	}

	@Override
	public int getCost() {
	
		return cost;
	}

}
