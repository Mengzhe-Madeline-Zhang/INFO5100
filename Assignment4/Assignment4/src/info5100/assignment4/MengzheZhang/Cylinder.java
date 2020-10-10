package info5100.assignment4.MengzheZhang;

public class Cylinder extends Circle {
    double height=1.0;
 
     public Cylinder() {}
 
      Cylinder(double height) {
	     this.height=height;
     }
	
      Cylinder(double height, double radius) {
    	 this.height=height;
    	 this.radius=radius;
     }
     
      Cylinder(double height, double radius, String color) {
    	 this.height=height;
    	 this.radius=radius;
    	 this.color=color;
     }
     
     public double getHeight() {
    	 return height;
     }
     
     public void setHeight(double height) {
    	 this.height=height;
     }
     
     public double getVolume(){
    	 double volume;
    	 volume = height*getArea();
    	 return volume;
     }
     
     // Override the getArea() method inherited from superclass Circle
     @Override
     public double getArea() {
        double area;
        area=2*Math.PI*radius*(radius+height);
        return area;
     }
}
