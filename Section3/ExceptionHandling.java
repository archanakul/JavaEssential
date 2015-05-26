package Section3;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args){
		int array[] = {10,20,30};
		int num = 10, res;
		String s = new String();
		Scanner input = new Scanner(System.in);
		try{
				s = input.next();
				if (s.length() < 5){
					throw new Exception("Short Password");//Explicitly throw user defined exceptions
				}
				System.out.println("Password Accepted");
		} catch(Exception e) {
			System.out.println("Exception message: " + e.getMessage());
		}
		
		try{
				int num2 = 0;
				res = num/num2;
				
				for(int i = 5; i >= 0 ; i--)
				{
					System.out.println("The value f array is " + array[i]);
				}
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e + " occured in try block");
		}
		catch(ArithmeticException e){
			System.out.println(e + " occured in try block");
		}
		finally{
			System.out.println("Done!!");
			
		}
	}

}
