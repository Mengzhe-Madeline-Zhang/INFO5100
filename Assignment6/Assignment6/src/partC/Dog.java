package partC;

public class Dog extends Pet implements Boardable {

	private  int BoardStartYear;
	private int BoardStartMonth;
	private int BoardStartDay;
	private  int BoardEndYear;
	private int BoardEndMonth;
	private int BoardEndDay;
	
	private String size;
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size=size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public String toString() {
		return "DOG:\n"+super.toString()+"\nSize: "+ this.getSize();
		
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		this.BoardStartMonth=month;
		this.BoardStartDay=day;
		this.BoardStartYear=year;

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		this.BoardEndMonth=month;
		this.BoardEndDay=day;
		this.BoardEndYear=year;

	}

	@Override
	public boolean boarding(int month, int day, int year) {
		
		if(BoardStartYear< BoardEndYear) {
			
			if(year>BoardStartYear && year< BoardEndYear ) {
				return true;
			} 
			
			
		   if(year == BoardStartYear) {
			if (month == BoardStartMonth) {
				if(day>= BoardStartDay) {
					return true;
				}
			} else if(month > BoardStartMonth) {
				return true;
			}
		}
		
		   else if(year == BoardEndYear) {
			if (month == BoardEndMonth) {
				if(day<= BoardEndDay) {
					return true;
				}
			} else if(month < BoardStartMonth) {
				return true;
			}
		}
		}
		
		else if(year==BoardStartYear&& year==BoardEndYear) {
			
			if (BoardStartMonth<BoardEndMonth) {
			
				if (month>BoardStartMonth&& month<BoardEndMonth) {
				return true;
			}
			else if (month==BoardStartMonth) {
				if(day>=BoardStartDay) {
					return true;
				}
			}
			else if(month == BoardEndMonth) {
				if(day<=BoardEndDay) {
					return true;
				}
			}
			}
			
			else if(month ==BoardStartMonth && month==BoardEndMonth) {
				if (day>=BoardStartDay&&day<=BoardEndDay) {
					return true;
				}
				
			}
		}
		
		return false;
	}

	  public static void main(String[] args)
	    {
	        Dog dog = new Dog("Spot", "Susan", "White", "medium");
	        dog.setSex(SPAYED);
	        System.out.println(dog);

	    }
	
}
/**
 * Console Result
DOG:
Spot owned by Susan
Color: White
Sex: Spayed
Size: medium
 * 
 * **/
