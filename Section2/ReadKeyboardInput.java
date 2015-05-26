package Section2;

import java.io.IOException;

public class ReadKeyboardInput {
	public static void main(String[] arg) throws IOException{
		int c;
		System.out.print("Enter a Charater: ");
		c = System.in.read(); // Returns the read byte value in integer (0-255)
		System.out.println("You entered " + c);	
	}
}