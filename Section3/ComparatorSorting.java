package Section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Personal{
	private int id;
	private String name;
	
	public Personal(int id, String name){
		this.id = id;
		this.name = name;			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
/* Sorting the strings according to their lengths */
class ByLengthComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 > len2){
			return 1; //str1 must come AFTER str2 in the order
		}
		else if (len1 < len2){
			return -1; //str1 must come BEFORE str2 in the order
		}	
		return 0;
	}
}

/* Sorting the strings in reverse alphabetical order */
class ReverseAlphabaticalComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return -str1.compareTo(str2);// reversing the sign changes the order
	}
}

/* Sorting the numbers in Descending order */
class ReverseNumericalComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		return -num1.compareTo(num2); //reversing the sign changes the order to DESCENDING
	}
}

public class ComparatorSorting {
	public static void main(String[] args){
		
		/////////////////////////////// Sorting Strings ///////////////////////////////
		List<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("lion");
		animals.add("bear");
		animals.add("elephant");
		animals.add("dog");
		
		//Collections.sort(animals); // Sorts in natural order -> alphabetical [bear, dog, elephant, lion, tiger]
		//Collections.sort(animals,new ByLengthComparator());  //[dog, lion, bear, tiger, elephant]
		Collections.sort(animals,new ReverseAlphabaticalComparator()); //[tiger, lion, elephant, dog, bear]
		System.out.println("Sorted Animal List: ");
		for(String animal: animals){
			System.out.println(animal);
		}

		/////////////////////////////// Sorting Numbers ///////////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(50);
		numbers.add(1);
		numbers.add(78);
		numbers.add(36);
		numbers.add(20);
		numbers.add(5);
		
		//Collections.sort(numbers); // Sorts in natural order -> ascending numerical order [1,5,20,36,50,78]
		Collections.sort(numbers, new ReverseNumericalComparator()); //[78, 50, 36, 20, 5, 1]
		System.out.println("Sorted Number List: ");
		for(Integer number: numbers){
			System.out.println(number);
		}

		/////////////////////////////// Sorting arbitrary objects ///////////////////////////////
		List<Personal> people = new ArrayList<Personal>();
		people.add(new Personal(4,"Tirian"));
		people.add(new Personal(1,"Bob"));
		people.add(new Personal(3,"John"));
		people.add(new Personal(2,"Sue"));
		
		// Sort by ID
		Collections.sort(people, new Comparator<Personal>(){

			@Override
			public int compare(Personal p1, Personal p2) {
				if(p1.getId() > p2.getId()){
					return 1;
				}
				else if (p1.getId() < p2.getId()){
					return -1;
				}
				return 0;
			}
		});
		
		System.out.println("People List sorted by ID: ");
		for(Personal person: people){
			System.out.println(person);
		}
		
		Collections.sort(people, new Comparator<Personal>(){

			@Override
			public int compare(Personal p1, Personal p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		System.out.println("\nPeople List sorted by Names: ");
		for(Personal person: people){
			System.out.println(person);
		}
		
		
	}

}
