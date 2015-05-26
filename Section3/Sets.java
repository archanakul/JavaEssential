package Section3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args){
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		/* No particular order */
		addElements(hashSet);
		if(!hashSet.isEmpty()){
			System.out.println("Your HashSet contains: " + hashSet);
		}
		
		/* Insertion order is maintained */
		addElements(linkedHashSet);
		if(!linkedHashSet.isEmpty()){
			System.out.println("Your LinkedHashSet contains: " + linkedHashSet);
		}
		
		/* Natural Sorted order -> Alphabetical */
		addElements(treeSet);
		if(!treeSet.isEmpty()){
			System.out.println("Your TreeSet contains: " + treeSet);
		}	
		
		/* Iteration usinf Foreach loop */
		System.out.println("Your HashSet iteration:") ;
		for(String element: hashSet){
			System.out.println(element);
		}
		
		if(hashSet.contains("cow")){
			System.out.println("Cow is in the HashSet");
		}
		if(hashSet.contains("donkey")){
			System.out.println("Donkey is in the HashSet");
		}
		
		/* Add all elements from one set into another */
		Set<String> hSet = new HashSet<String>();
		hSet.addAll(hashSet);
		System.out.println(hSet);
		
		hSet.remove("donkey");
		hSet.remove("mouse");
		hSet.add("cow");
		System.out.println(hSet);
		
		/* Intersection - elements common to interSet & hashSet*/
		Set<String> interSet = new HashSet<String>(hSet);
		interSet.retainAll(hashSet);
		System.out.println("Intersection Elements: " + interSet );
		
		/* Difference - elements in diffSet that are not found in hashSet */
		Set<String> diffSet = new HashSet<String>(hSet);
		diffSet.removeAll(hashSet);
		System.out.println("Difference Elements: " + diffSet);
		
	}
	
	private static void addElements(Set<String> set){
		set.add("cat");
		set.add("dog");
		set.add("mouse");
		set.add("rat");
		set.add("donkey");	
		set.add("mouse"); // Adding a duplicate item does nothing
	}

}
