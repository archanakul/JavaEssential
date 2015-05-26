package Section3;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;			
	}
	
	public String toString(){
		return "{ID is: " + id + "; Name is: " + name + "}";
	}

	/**
	 * When ever we need to add user defined objects as elements into SETS or use them as KEYS in MAP then 
	 * we need to override the EQUALS() & HASHCODE() functions of the "Object" class so that the 
	 * 		-> SETS have UNIQUE ELEMENTS(as per their behavior) & 
	 * 		-> MAPS have UNIQUE KEYS(as per their behavior)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class Equals_HashCodes {
	public static void main(String[] args){
		Person p1 = new Person(1,"Bob");
		Person p2 = new Person(2,"Sue");
		Person p3 = new Person(3,"Dan");
		Person p4 = new Person(1,"Bob");
		
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);//Without overloaded equals() & hashcode(), MAPs allow us to add an objects whose elements are the same
		
		
		for(Person key: map.keySet()){
			System.out.println(key + " : " + map.get(key)); 
		}
		
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);//Without overloaded equals() & hashcode(), LinkedHashSets allows us to add an objects whose elements are the same
		System.out.println("Elements of LinkedHashSet :" + set);
		
	}

}
