package info5100.assignment5.MengzheZhang;

public class DessertShoppe {
    
	public double TaxRate=0.0625;
	public String StoreName ="M & M Dessert Shoppe";
	public int MaxItem;
	public double CostWidth;
	
	public DessertShoppe(double tax, String name) {
		this.TaxRate=tax;
		this.StoreName=name;
			
	}

	  String cents2dollarsAndCents(int cents) {
		 double dollars;
		 dollars=cents/100;
	     String dandc=Double.toString(dollars);
	     return dandc;
		
	}
	


}
