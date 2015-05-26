package Section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationClasses {
	public static void main(String[] args){
		ArrayList<Integer> alist = new ArrayList<Integer>(5);

		alist.add(1);
		alist.add(5);
		alist.add(10);
		alist.add(15);
		alist.add(100);
		
		Enumeration e = Collections.enumeration(alist);
		while(e.hasMoreElements()){
			System.out.println("Current enumeration element:" + e.nextElement());
		}
		
		
		
	}

}
