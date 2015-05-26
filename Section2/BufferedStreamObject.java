package Section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedStreamObject {
	public static void main(String[] args) throws IOException {
		String name;
		
		/* 
		 * BufferedReader(Reader in) -> Creates a buffering character-input stream that uses a default-sized input buffer. 
		 * InputStreamReader(InputStream in) -> Creates an InputStreamReader that uses the default charset.
		 * System.in -> The "standard" input stream. This stream is already open & ready to supply input data. 
		 *              Typically this stream corresponds to keyboard input         
		 */
		BufferedReader read; //Creates an object but no memory is yet assigned
		read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		// Reads a line of text. A line is considered to be terminated by any one of 
		//a line feed ('\n'),a carriage return ('\r'), or a carriage return followed immediately by a linefeed.
		name = read.readLine();
		System.out.println(" Your name is " + name);
	}

}
