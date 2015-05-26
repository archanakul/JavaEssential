package Section2;

public class AbstractClasses {
	public static void main(String arg[]){
		//First f = new First(); // CAN'T INSTANTIATE an Abstract class
		Second s = new Second();
		s.defined_method();
		s.undefined_method(); // abstract method of the  base class that is defined in the child class
	}
}

/* Below are a list of private classes , cannot have more than one public class in a class file */

/* Definition of a Abstract Class */
abstract class First{
	public void defined_method(){
		System.out.println("Defined in Base Class");
	}
	
	abstract void undefined_method(); // Declaration of a Abstract method, prefixed with keyword 'abstract'
}

class Second extends First{
  void undefined_method(){ // Declaration of a Abstract method, not 'abstract' key word prefixed
		System.out.println("Not defined in Based Class but defined in Child Class");
	}
}
