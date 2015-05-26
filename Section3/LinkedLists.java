package Section3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
	public static void main(String[] args){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		captureTiming("ArrayList",arrayList );
		captureTiming("LinkedList",linkedList );
		
	}
	/**
	 * This function is used to demonstrate when a LinkedList/ArrayList need to be chosen over the other
	 * ArrayList:  Is faster when we need to add/remove elements at the end or towards the end of the list as 
	 * 			   it works on increasing the size of the array by size ten each time to extend further
	 * LinkedList: Is faster when we need to add/remove elements at the beginning or in the middle of the list
	 * 			   In a linked list each element in the list hold reference to element of its either side(next, previous) & 
	 * hence its easier to add or remove element from anywhere close to beginning
	 * 
	 * @param type String indicating the List being passed
	 * @param list is an interface which accepts any class that implement this interface i.e ArrayList, LinkefdList, Vector
	 */
	private static void captureTiming(String type, List<Integer> list){
		
		for (int i = 0; i < 1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++){
			list.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time Taken to add element at the end " + type + ": " + (end-start) + "ms");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++){
			list.add(list.size() - 100,i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("Time Taken to add element towards the end " + type + ": " + (end-start) + "ms");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++){
			list.add(0,i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("Time Taken to add element at the beginning " + type + ": " + (end-start) + "ms");
		
	}

}
