package info5100.assignment5.MengzheZhang;

import java.util.ArrayList;
import java.util.Vector;

public class Checkout {
	Vector <DessertItem> items;
	DessertShoppe ds = new DessertShoppe(0.065, "M & M Dessert Shoppe");
	
	public Checkout() {
		items= new Vector<>();
	}
	
	public int numberOfItems() {
		int number = items.size();
		return number;
	}
	
	public void enterItem(DessertItem item) {
		items.add(item);
		
		
	}
	
	public void clear() {
		items.clear();
	}
	
	public int totalCost() {
		int totalCost=0;
		
		for(int i=0; i< items.size(); i++) {
			totalCost += items.get(i).getCost();
		}

		
		return totalCost;
	}
	
	public int totalTax() {
	
		int cwt= this.totalCost();
		int totalTax = (int) Math.round (cwt * ds.TaxRate);
		return totalTax;
	}
	
	@Override
	public String toString() {
		    String receipt = ds.StoreName+"\n-------------------------";
		    System.out.println();
		    for (int i=0; i< items.size(); i++) {
				
				System.out.println(items.get(i).getName()+"      "+ds.cents2dollarsAndCents(items.get(i).getCost()));
				
			};
		
		return receipt;
	}
	

}
