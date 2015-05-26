package Section3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Personality implements Comparable<Personality>{
	String name;
	
	public Personality(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Personality [name=" + name + "]";
	}
	
	@Override
	public int compareTo(Personality str) {
		int len1 = this.name.length();
		int len2 = str.name.length();
		if (len1 > len2){
			return 1;
		}
		else if (len1 < len2){
			return -1;
		}
		else {
			/* TreeSets elements the duplicates & since in this comparable, the "compareTo" checks for the length of the string
			 * the TreeSet will have no elements in it with same length though the string itself might be different.
			 * To get away with this issue either change the "equals()" methods to be in line with "compareTo()"  or
			 * change the "compareTo()" method for equality situation as done below
			 */
			//return 0
			return this.name.compareTo(str.name); // return 0 only when the two strings are the same & not just in length.
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personality other = (Personality) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class ComparableSorting {
	public static void main(String[] args){
		 List<String> list = new ArrayList<String>();
		 SortedSet<String> set = new TreeSet<String>();
		 
		 addElements(list);
		 addElements(set);
		 System.out.println("Elements of ArrayList:");
		 showElements(list);
		 
		 System.out.println("Elements of ArrayList sorted:");
		 Collections.sort(list);
		 showElements(list);
		 
		 System.out.println("\nElements of TreeSet:");
		 showElements(set);
		 
		 List<Personality> plist = new ArrayList<Personality>();
		 SortedSet<Personality> pset = new TreeSet<Personality>();
		 
		 addObjects(plist);
		 System.out.println("Objects of ArrayList:");
		 showObjects(plist);
		 
		 addObjects(pset);
		 System.out.println("\nObjects of TreeSet:");
		 showObjects(pset);
	}
	
	private static void addElements(Collection<String> c){
		c.add("joe");
		c.add("sue");
		c.add("mike");
		c.add("bill");
	}
	
	private static void showElements(Collection<String> c){
		for (String item: c){
			System.out.println(item);
		}
	}
	
	private static void addObjects(Collection<Personality> c){
		c.add(new Personality("joe"));
		c.add(new Personality("sue"));
		c.add(new Personality("mike"));
		c.add(new Personality("bill"));
	}
	
	private static void showObjects(Collection<Personality> c){
		for (Personality item: c){
			System.out.println(item);
		}
	}

}
