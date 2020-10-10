package info5100.assignment4.MengzheZhang;

public class TestCylinder {

	public static void main(String[] args) {
		//Constructed a Circle with Circle()
		Circle circle= new Circle();
		circle.radius=2.0;
		circle.color="yellow";
		System.out.println("Radius is "+circle.radius+", Color is "+circle.color+
				", Base area is "+circle.getArea());
        
	   //Constructed a Cylinder with Cylinder()
		Cylinder cylinder1 = new Cylinder();
		cylinder1.radius=1.0;
		cylinder1.height=1.0;
		cylinder1.color="red";
		System.out.println("Radius is "+cylinder1.radius+ ", Height is "+cylinder1.height+
				", Color is "+cylinder1.color+", Base area is "+cylinder1.getArea()+", Volume is "+cylinder1.getVolume());
		
	  //Constructed a Cylinder with Cylinder(height, radius)
		Cylinder cylinder2 = new Cylinder(5.0, 2.0);
		cylinder2.color="red";
		System.out.println("Radius is "+cylinder2.radius+ ", Height is "+cylinder2.height+
				", Color is "+cylinder2.color+", Base area is "+cylinder2.getArea()+", Volume is "+cylinder2.getVolume());

	}

}


/**
 * Console Result (before override getArea())
Radius is 2.0, Color is yellow, Base area is 12.566370614359172
Radius is 1.0, Height is 1.0, Color is red, Base area is 3.141592653589793, Volume is 3.141592653589793
Radius is 2.0, Height is 5.0, Color is red, Base area is 12.566370614359172, Volume is 62.83185307179586

 * 
 * 
 * 
 * **/
