package partC;

public class Pet {

	private String PetName;
	private String OwnerName;
	private String color;
	
	protected int sex = 0;
	public static final int MALE=1;
	public static final int FEMALE=0;
	public static final int SPAYED=2;
	public static final int NEUTERED=3;	
	
	public Pet(String name, String ownerName, String color) {
		this.PetName=name;
		this.OwnerName=ownerName;
		this.color=color;
	}
	
	public String getPetName() {
		return this.PetName;
	}
	
	public String getOwnerName() {
		return this.OwnerName;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSex(int sexid) {
		this.sex= sexid;
	}
	
	public String getSex() {
		if(sex==MALE) {
			return "Male";
		}
		if(sex==FEMALE) {
			return "Female";
		}
		if(sex==SPAYED) {
			return "Spayed";
		}
		if(sex==NEUTERED) {
			return "Neutered";
		}
		else {
			return "Undefined";
		}
		
	}
	  public String toString()
	    {
	        return this.getPetName() + " owned by " + this.getOwnerName() + 
	        		"\nColor: " + this.getColor() + 
	        		"\nSex: "+ this.getSex() ;
	    }
	    public static void main(String[] args)
	    {
	        Pet pet = new Pet("Spot", "Mary", "Black and White");
	        pet.setSex(MALE);
	        System.out.println(pet);

	    }
}

/*
 * Console Result
 
Spot owned by Mary
Color: Black and White
Sex: Male

 * */
