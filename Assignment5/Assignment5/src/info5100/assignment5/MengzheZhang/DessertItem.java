package info5100.assignment5.MengzheZhang;

public abstract class DessertItem {

	String name;
	public DessertItem() {
		
	}
	
	public DessertItem(String name) {
		this.name=name;
	}
	
	public final String getName() {
		return name;
	}
	
	public abstract int getCost();
}
