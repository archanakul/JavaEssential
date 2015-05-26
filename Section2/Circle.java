package Section2; // Name of the associated package

/* Defining a Base/Parent/Super class */
public class Circle {
		double radius; // Class property
		
		/* Constructors must have PUBLIC access modifier so that it can be globally used */
		public Circle(){ // Default constructor
			radius = 5.0;
		}
		
		public Circle(double rad){ // COnstructor Overloading
				radius = rad;
			
		}
		
		/* Behaviors of the class */
		public double area(){ 
			return (3.14 * this.radius * this.radius);
		}
		
		public double circuference(){
			return (2*3.14 * this.radius);
		}

}
