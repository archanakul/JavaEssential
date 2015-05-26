package Section3;

public enum EnumDemo {
	/* Set of CONSTANT value that a variable of this enum type can have */
	MERCURY (3.303e+23, 2.4397e6), // Invokes CONSTRUTOR
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7); /* Ends with a ; as there are other fields in the enum */
	
	private final double mass;   // in kilograms
	private final double radius; // in meters
	
	/* CONSTRUCTOR for the CLASS as enum types in Java are special kind of classes */
	EnumDemo(double mass, double radius){
		this.mass = mass;
		this.radius = radius;		
	}

	public static final double G = 6.67300E-11;
	/* Other Fields of the enum class which in this case is also a MAIN CLASS */
	double surfaceGravity() {
	        return G * mass / (radius * radius);
	}
	double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
	
	public static void main(String[] args){
		if (args.length != 1) {
	            System.err.println("Usage: java Planet <earth_weight>");
	            System.exit(-1);
	     }
		double earthWeight = Double.parseDouble(args[0]); //WARPPER Class Double
        double mass = earthWeight/EARTH.surfaceGravity();
        /* VALUE()->Default STATIC method added by the compiler that return an array of all the enum CONSTANTS
         * 
         */
        for (EnumDemo p : EnumDemo.values())// Iterates over each constant in the enum p
           System.out.printf("Your weight on %s is %f", p, p.surfaceWeight(mass));	
	}

}
