package Section2;

/* Definition of the Child Class that extends the behaviors of parent class 'Circle' */
public class Cylinder extends Circle{
	double radius;
	double height;
	public Cylinder(double rad, double ht){
		radius =  rad;
		height = ht;
		
	}
	/* Base class method overriding */ 
	public double area(){ // signature must match that of base class
		return (super.area()*height); //SUPER prefix refers to method of the Base class 
	}
}
