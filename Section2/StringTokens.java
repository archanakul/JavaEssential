package Section2;

import java.io.IOException;
import java.util.StringTokenizer;

public class StringTokens {
	public static void main(String[] args) throws IOException {
		String s = "1,2,3,4,5";
		int product = 1;
		/*
		 * StringTokenizer(String str,String Delim) -> Constructs a string tokenizer for the specified string. 
		 * The characters in the "delim" are the delimiters for separating tokens.
		 * Delimiter characters themselves will not be treated as tokens.
		 */
		StringTokenizer st = new StringTokenizer(s,",");
		while(st.hasMoreTokens()){
			String tok = st.nextToken();
			System.out.println(tok);
			product = product * Integer.parseInt(tok); // parseInt() of Integer class parses the string argument as a signed decimal integer
		}
		System.out.println("The Product is " + product);		
	}

}
