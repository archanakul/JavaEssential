package Section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLists {
	public static void main(String[] args){
		/**
		 * Create an empty ArrayList by calling the default constructor
		 * Type(s) of the object that the class can hold is specified with in the angular brackets<>
		 * Note that the objects cannot have primitive data types & this is where the Wrappers come in handy
		 */
		ArrayList<String> alist = new ArrayList<String>();
		
		/**
		 * ADD(Object o): 
		 * 					adds the object to the end of the ArrayList
		 * ADD(int index, Object o): 
		 * 					add the object at the specified index location ( which must be <= current size of the ArrayList
		 */
		alist.add("Item1");
		alist.add("Item2");
		alist.add("Item3");
		alist.add("Item5");
		alist.add(3,"Item4");
		//alist.add(6,"Item6"); Note: index in ADD() must be <= current size of the array
		System.out.println("Element of the Array list 'alist' :" + alist); // [Item1, Item2, Item3, Item4, Item5]
		
		/**
		 * REMOVE(Object o): 
		 * 			Delete the object from the list if present & leave the ArrayList unchanged if the object is not found 
		 * 			Deletes the first occurrence(default) of the element if there are multiple similar objects in the ArrayList
		 */
		alist.remove("Item6");
		System.out.println("Element of the Array list 'alist' :" + alist); // [Item1, Item2, Item3, Item4, Item5]
		
		alist.add(1,"ToRemove");
		alist.add("ToRemove");
		System.out.println("Element of the Array list 'alist' :" + alist); // [Item1, ToRemove, Item2, Item3, Item4, Item5, ToRemove]
		
		/**
		 * CONTAINS(Object o): Returns a boolean flag indicating the present/absence of object in the ArrayList
		 */
		if (alist.contains("ToRemove")){
			alist.remove("ToRemove"); 
			System.out.println("Element of the Array list 'alist' :" + alist); // [Item1, Item2, Item3, Item4, Item5, ToRemove]	
		}
		alist.add("ToRemove");
		
		/**
		 * SIZE(): return the size of the ArrayList i.enumber of objects in the list.
		 * LASTINDEXOF(Object o): Return the index of the last occurrence of object o in ArrayList
		 * INDEXOF(Object o): Return the index of the first occurrence of object o in ArrayList
		 */
		alist.add(alist.size()-1,"ToRemoveLast");//Add an element before the last element of the ArrayList
		System.out.println("Element of the Array list 'alist' :" + alist); // [Item1, Item2, Item3, Item4, Item5, ToRemove,ToRemoveLast, ToRemove]
		if (alist.contains("ToRemove")){
			alist.remove(alist.lastIndexOf("ToRemove"));
			System.out.println("Element of the Array list 'alist' :" + alist); // [Item1, Item2, Item3, Item4, Item5, ToRemove, ToRemoveLast]	
		}
		alist.remove(alist.indexOf("ToRemove"));
		System.out.println("Element of the Array list 'alist' :" + alist); // [Item1, Item2, Item3, Item4, Item5, ToRemoveLast]	
		
		/**
		 * SET(Object old, Object new): Replaces the Occurrence of old object with new object.
		 */
		alist.set(alist.indexOf("ToRemoveLast"), "ReplacedItem");
		System.out.println("Element of the Array list 'alist' :" + alist); //[Item1, Item2, Item3, Item4, Item5,ReplacedItem]
		
		/**
		 * GET(int index): Return an object of ArryList at the index specified.
		 */
		for (int i = 0; i < alist.size(); i++){
			System.out.println("ArrayList element at index " + i + ":" + alist.get(i)); 
		}
		/**
		 * TOARRAY(): Returns an array containing all the elements of the list
		 */
		Object[] simArray = alist.toArray();// simArray is an array of objects
		System.out.println("Element of the Array list 'alist' :" + Arrays.toString(simArray)); //[Item1, Item2, Item3, Item4, Item5, ReplacedItem]
		
		//FOR-EACH loop demo
		System.out.println("Item in For-Each Loop:");
		for(String item : alist){
			System.out.println(item);
		}
		
		//Iterator Loop demo
		for(Iterator<String> itr = alist.iterator(); itr.hasNext();){ // loops over if there are any more elements available
					System.out.println("Item in Iterator Loop: " + itr.next());// advance the control to next element
		}
		
		//ListIterator Loop demo
		for(ListIterator <String> litr = alist.listIterator(); litr.hasNext(); ){ // loops over if there are any more elements available
							System.out.println("Item in ListIterator Loop: " + litr.next());// advance the control to next element
		}
		
		/**
		 * CLEAR(): Deletes all the objects/element of the ArrayList
		 * ISEMPTY(): Returns a boolean flag indicating if or not the ArrayList is empty
		 */
		alist.clear();
		if(alist.isEmpty()){
				System.out.println("ArrayList 'alist' is Empty");
		}
		else
		{
			System.out.println("Element of the Array list 'alist' :" + alist);
		}
		
	}

}
