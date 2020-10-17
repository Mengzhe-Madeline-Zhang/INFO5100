package info5100.assignment5.MengzheZhang;

public class Sundae extends IceCream {

	String name;
	String Tname;
	int Tprice;
	
	public Sundae(String Iname, int Icost, String Tname, int Tprice) {
		super(Iname, Icost);
		
		this.Tname=Tname;
		this.Tprice=Tprice;
		name= Tname+"Sundae with" +Iname;
	}
   
	@Override
	public int getCost() {
	    int scost = Tprice + cost;
		return scost;
	}
	
}
