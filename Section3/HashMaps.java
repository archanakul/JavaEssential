package Section3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {
	public static void main(String[] args) {

		      /* Create HashMap */
		      HashMap<Integer, String> hmap = new HashMap<Integer, String>(); // KEYS->ints & VALUES->Strings here
		      HashMap<Integer, String> hmap1 = new HashMap<Integer,String>(8,(float)0.7);
		      
		      /**
		       * PUT(): adds a key value map to the map if the key is already not present in the Map else it just overwrites the existing value for the key
		       * AUTOBOXING: automatic CONVERSION that the Java compiler makes between primitive types & their corresponding object wrapper classes
		       * UNBOXING: Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value
		       */
		      hmap.put(12, "Chaitanya");
		      hmap.put(2, "Rahul");
		      hmap.put(7, "Singh");
		      hmap.put(49, "Ajeet");
		      hmap.put(3, "Anuj");
		      	
		      /* Display content using Iterator*/
		      System.out.print("HashMap KEYS : " + hmap.keySet() + "\n"); // [49, 2, 3, 7, 12]
		      System.out.print("HashMap VALUES : " + hmap.values() + "\n"); //[Ajeet, Rahul, Anuj, Singh, Chaitanya]
		      
		      /* The Map.entrySet method returns a collection-view of the map, whose elements are of class MAP.ENTRY
		       * The only way to obtain a reference to a map entry is from the iterator of this collection-view.
		       * These Map.Entry objects are valid only for the duration of the iteration;
		       */
		      Set set = hmap.entrySet(); //Returns a Set view of the mappings contained in this map.
		      System.out.print("Set view of HashMaps: " + set + "\n\n");// [49=Ajeet, 2=Rahul, 3=Anuj, 7=Singh, 12=Chaitanya]
		      
		      Iterator iterator = set.iterator(); //Returns an iterator over the elements in this set.
		      while(iterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.print("Map entry of HashMaps: " + mentry + ", ");
		         System.out.print("Key is: "+ mentry.getKey() + " & Value is: " + mentry.getValue() + "\n");
		      }
		      
		      hmap1.putAll(hmap);
		      System.out.print("\nExecution of putAll method: " + hmap1 + "\n");//{2=Rahul, 49=Ajeet, 3=Anuj, 12=Chaitanya, 7=Singh}
		      
		      /**
		       * Get(): Returns value for a specified key in the Map if the key is present else return NULL
		       */
		      String var = hmap.get(3);
		      System.out.println("\nData value for Key 3 is: "+ var);
		      System.out.println("Data value for Key 4 is: "+ hmap.get(4));

		      /* For Each Loop */
		      hmap.remove(3);
		      System.out.println("\nMap Keys & Values after removal:");
		      for (Map.Entry<Integer,String> entry: hmap.entrySet()) {
		          System.out.print("Key is: "+ entry.getKey() + " & Value is: " +  entry.getValue() + "\n");
		       }

		   }
}
