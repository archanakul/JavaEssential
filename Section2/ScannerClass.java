package Section2;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args){
		// Constructs a new Scanner that produces values scanned from the specified input stream. 
		Scanner s = new Scanner(System.in); //Scanner class is wrapped over the InputStream System.in
		Integer i = new Integer(1);
		int product = 1;
		System.out.print("Loop entery");
		while(i!=0){
			product = product * i;
			i = s.nextInt();
		}
		System.out.print("Loop Ends\n");
		System.out.println("Product of keyboard entries is " + product);	
		
	}

}
