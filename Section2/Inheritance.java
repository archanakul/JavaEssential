import Section2.*; // importing the functionalities of a package

/* Defining a MAIN CLASS */
public class Inheritance {
		public static void main(String arg[]){
			Cylinder cy = new Cylinder(3,5); // Instantiating a class
			double res1 = cy.area(); // Invoking a class method using its object
			System.out.println(res1);
			Circle cr = new Circle(3);
			double res2 = cr.area();
			System.out.println(res2);
			
		}

}
