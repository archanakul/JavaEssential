/** LECTURE 19: Enum in Java
 * #################################################################################
 * 	- ENUM is USER-DEFINED data type that enables its variable to be a FIXED set of PREDEFINED constants.
 * 		1. Java enum types are actually a special kind of CLASSES that have methods & other fields too. 
 * 		2. ENUM keyword in used in place of CLASS/INTERFACE:
 * 					public enum Level { HIGH,MEDIUM,LOW }
 * 					Level level = Level.LOW;
 * 			-> Since the values are constants, the names of an enum type's fields are in UPPERCASE letters
 * 			-> Enum variable(level) must be equal to one of the values that have been predefined for it.
 * 		
 * 		3. Compiler automatically adds some SPECIAL STATIC METHODS when it creates an enum:
 * 		   		-> VALUE() method: Returns an array containing all of the values of the enum in the order they are declared
 * 				   This methods aids in the ENUM ITERATION when coupled with FOR-EACH LOOP
 * 							for (Level level : Level.values()) 
 * 								{
 *								 	System.out.println(level);
 *							 	}
 * 		4. Enum class defines constants before fields/methods & constants MUST END with a semicolon when there are fields
 * 		   Each constant enum value gets these fields.
 *  	5. Enum classes are an IMPLICITLY FINAL CLASSES & hence can not be INHERITED
 *  	6. Enums can also be a part of other classes in which case they would be STATIC
 *  
 *	- ENUMERATION CLASS is similar to enum type(class with a object constants) is used to represent a set of objects
 *	  Objects of ArrayList can be converted to a Enumeration by using the static method(enumeration) of COLLECTION INTERFACE
 *					Enumeration e = Collection.enumeration(ArrayList_object)   
 *  	1. HSMOREELEMENTS() : When implemented, it returns True if there are more elements to extract, & false otherwise
 *  	2. NEXTELEMENT(): Returns the next object in the enumeration as a generic Object reference.
 */

/** LECTURE: Collection Framework
 * #################################################################################
 *  - "collection"(lowercase c) represent a DATA STRUCTURE in which group of objects known as its elements are stored & iterated over.
 *
 *	- java.util.Collections(capital C & ends with s): Is a CLASS that holds a pile of STATIC UTILITY METHODS for use with collections.
 *		1. Have POLYMORPHIC ALGORITHMS that operate on collections, "wrappers" & return a new collection backed by a specified collection.
 *		2. All class methods throw a NULLPOINTEXCEPTION if the collections or class objects provided to them are null.
 *
 *	- POLLYMORPHISM: capability of a method to do different things based on the object that it is acting upon. 
 *                   In other words, polymorphism allows us to define one interface & have multiple implementations
 *    There are 2 types of polymorphism in java
 *  	1. DYNAMIC/Runtime polymorphism: Method OVERRIDING is a perfect example 
 *		2. STATIC/Compile time polymorphism: Method OVERLOADING is a perfect example                
 *
 *	- java.util.Collection(capital C) INTERFACE: 
 *		1. Is used to pass around collections of objects where maximum generality is desired.
 *		2. BASIC operations normally used with Collection are :
 *			-> Add objects to the collection : add()
 *			-> Remove objects from the collection: remove()
 *			-> Update object in a collection: set()
 *			-> Retrieve object from the collection: get()
 *			-> Find out if an object (or group of objects) is in the collection: contains()
 *			-> Find the size of the collection(number of elements): Size
 *			-> Iterate through the collection, looking at each element (object) one after another: iterator()
 *		3. Interface & class hierarchy for collections (<<INTERFACE>>, (Extends), (Implements))
 *
 * 
 *												 		        <<Collection>>
 *
 *									      /					            |				    \	
 *								 	  	 /						        |			  		 \
 *									 <<Set(E)>>				       <<Queue(E)>>		       <<List(E)>> 
 *									/       \					   /            \		/	   |	     \
 *							  HashSet(I)   <<SortedSet(E)>>  PriorityQueue(I) LinkedList(I)  ArrayList(I)  Vector(I)
 *							     |			       |
 *							LinkedHashSet(E) <<NavigableSet(E)>>
 *											       |
 *										       TreeSet(I)
 *					    =================================================================================================						
 *
 *
 *												  		 <<Map>>
 *											   /      		|		      \
 *										 Hashtable(I)	HashMap(I)	    <<SortedMap(E)>>
 *													  		|			     |
 *													LinkedHashMap(E)   <<NavigableMap(E)>>
 *																			 |
 *																 		TreeMap(I)
 * 					                  ========================================================	
 *
 *													Object
 *													/    \
 *												Array	Collections(Class)
 *										   ===================================		
 *
 *  
 * -  Four basic flavors of Collections are:
 *		1. LISTS (extends SUPERINTERFACE Collection) : Lists of things
 *			-> Maintain INSERTION ORDER of element & are INDEXED collection that may contain DUPLICATES(can have MANY NULL objects) 	
 *		
 *		2. SETS(extends SUPERINTERFACE Collection): Unique things 
 *				-> Maintain NO insertion ORDER of elements & can only have UNIQUE objects(can have ONLY ONE NULL element)	
 *		
 *		3. MAPS(extended by the SUBINTERFACE SortedMap): Things with a unique ID
 *				-> DATA STRUTURE based on key value pair & HASHING.
 *				-> Can have MANY null values but ONLY ONE NULL key(Unique ID)
 *		
 *		4. QUEUES(extends SUPERINTERFACE Collection): 
 *				-> Things arranged by the order in which they are to be processed.
 *		
 *		5. Sub-flavors within the above 4 flavors of collections:		
 *			-> Ordered: If a collection is ordered, it means we can iterate through the collection in a specific(not-random) order.
 *					# ArrayList based on the index of the elements & can insert an element at a specific index position
 *					# LinkedHashSet based on the insertion order i.e last element inserted is the last element in the collection
 *			-> Sorted: A sorted collection means that the order in the collection is determined according to some rule(s), known as SORT ORDER.	
 *			   A collection that keeps an order (like a List) is not really considered sorted unless it sorts using some kind of sort order.
 *					# COMPARABLE Interface: They specify the natural order of sorting
 *						Natural order for a collection of String objects->alphabetical
 *						Natural order for Integer objects -> by numeric value
 *					# COMPARATOR Interface: They define different sort orders other than natural order
 *			-> Unsorted:
 *			-> Unordered:
 *
 *	- LIST Interface: They are ordered by index position
 *		1. Position determined by either setting an object at a specific index or 
 *         by adding it without specifying position, in which case the object is added to the end
 *         
 *      2. A set of key methods related to the index which no other collection have are:
 *      	-> get(int index)
 *      	-> indexOf(Object o)
 *      	-> add(int index, Object obj)
 *      
 *      3. The three implementations of List Interface are:
 *      	->ArrayList: Is a GROWABLE array. It gives you fast iteration & fast random access
 *      	
 *      	->Vector: Is basically same as an ArrayList, but Vector methods are SYNCHRONIZED for THREAD SAFETY.
 *      		      Vector is the only class other than ArrayList to implement RandomAccess	
 *      	
 *      	->LinkedList: Is also ORDERED by index position like a ArrayList except that the elements are DOUBLY-LINKED to one another. 
 *                        This linkage gives new methods(beyond what we get from List interface) for adding & removing from the beginning or end, 
 *                        which makes it an easy choice for implementing a STACK or QUEUE.
 *         			They iterate slower than a ArrayList but it's a good choice when we need FAST INSERTION & DELETION.
 *         			It also implements java.util.Queue interface & supports common queue methods: peek(), poll(), offer().
 *      
 *	- SET Interface: Are a collection that CANNOT contain DUPLICATE elements as they care about UNIQUENESS. It models the mathematical set abstraction. 
 *		1. Contain only methods inherited from Collection & adds the restriction so that duplicate elements are prohibited. 
 *		2. Can be compared meaningfully even if their implementation types differ. Set instances are equal if they contain same elements.
 *		
 *		3. It contains methods that perform BASIC operations:
 *			-> add(E element), remove(Object element)
 *			-> isEmpty(), contains(Object element)
 *			-> size()
 *			-> Iterator<E> iterator()
 *
 *		4. It contains methods that perform BULK operations:
 *			-> addAll(Collection<? extends E> c), retainAll(Collection<?> c)
 *			-> removeAll(Collection<?> c), clear()
 *			-> containsAll(Collection<?> c)
 *
 *		5. The three implementations of List Interface are:
 *			-> HashSet:	A HashSet is an UNSORTED, UNORDERED Set.
 *					It uses the hashcode of the object being inserted, so the more efficient is our hashCode() implementation the better access performance we get.
 *					Ideal when we need a collection with no duplicates & we don't care about order when we iterate through it.
 *			-> LinkedHashSet: Is an ORDERED version(Insertion order) of HashSet that maintains a doubly-linked List across all elements.
 *					When we iterate through a HashSet, order is unpredictable but a 
 *					LinkedHashSet lets us iterate through the elements in the order in which they were inserted.
 *			-> TreeSet: The TreeSet is one of two SORTED collections (sorted by the NATURAL ORDER of the elements)
 *					It uses RED-BLACK tree structure & guarantees that the elements are in ASCENDING order, according to natural order .
 *					We can construct a TreeSet with a constructor that lets us give the collection our own rules for what the order should be using Comparator or comparable.
 *
 * 	- MAP Interface: A Map cares about unique identifiers. We map a unique keys to a value where both key & value are objects 
 *			1. A map CANNOT CONTAIN duplicate keys: Each key can map to at most one value. It models the mathematical SET ABSTRACTION. 
 *  		2. Like Sets, Maps rely on the EQUALS() method to determine whether two keys are the same or not.
 *  		3. The Map interface includes methods for 
 *  			-> BASIC operations: put, get, remove, containsKey, containsValue, size, & empty
 *   			-> BULK operations: putAll & clear
 *   			-> COLLECTION: keySet, entrySet, & values 
 *   		4. Implementation of Map Interface are:
 *   			-> HashMap: The HashMap gives you an UNSORTED, UNORDERDE Map.
 *   					Keys land in the Map is based on the key's hashcode, so, more efficient is the hashCode() implementation, the better access performance we get
 *   			-> HashTable: Hashtable is the SYNCHRONIZED counterpart to HashMap
 *   					Synchronization in case of Vector & Hashtable means that the  key methods of the class are synchronized not the classes itself.
 *   					Hashtable doesn't let us have anything that's NULL
 *   			-> LinkedHashMap: It maintains insertion order or last access order(ORDERED map)
 *   					Though it is slower than HashMap for adding & removing elements, iteration is faster with a LinkedHashMap
 *   			-> TreeMap: It is a SORTED map (sorted by the NATURAL ORDER of the elements)
 *   					It lets us define a custom sort order (via Comparable/Comparator) when we construct a TreeMap,
 *   				    that specifies how the elements should be compared to one another when they're being ordered
 *   
 *   - QUEUE Interface: A Queue is designed to hold a list of "to-dos," or things to be processed in some way(FIFO typically)
 *   		1. LinkedList: This class is enhanced to implement the Queue interface, hence, basic queues can be handled with a LinkedList
 *   		2. PriorityQueue: Are used to create a "priority-in, priority out" queue as opposed to a typical FIFO queue
 *   				They are ORDRED either by natural ordering or according to a Comparator
 */

/** LECTURE 20: ArrayList
 * #################################################################################	
 * - ArrayList is a list of HETEROGENEOUS objects
 * 		1. In Java ArrayList is a CLASS defined under JAVA.UTIL package that IMPLEMENTS the List INTERFACE
 * 		2. It is a DYNAMIC data structure, hence can be used when there is no UPPER BOUND on the number of elements
 * 		   i.e items can be added & removed from list with no EXCEPTIONS (Arrays are STATIC data Structure -> fixed size)
 *  
 *  - ArrayList has OVERLOADED CONSTRUCTORS:
 *		1. ArrayListy(): Builds an Empty list, Size by default is 10.
 * 				ArrayList<String> list = new ArrayList<String>();
 * 		2. ArrayList(int capacity): creates an empty list with the specified initial capacity.
 * 	  			ArrayList<Integer> list = new ArrayList<Integer>(7);
 * 		3. ArrayList(Collection c ): Creates a list containing the elements of the specified collection. 
 * 	  			ArrayList<Integer> list = new ArrayList<Integer>(7);
 * 		Note: ArrayList only accepts objects as data type & not primitive data.(Situation where WRAPPER classes are needed)
 *  
 *  - Common methods of ArrayList are :
 *  	1. ADD(Object o) : Adds an object o to the end of ArrayList
 *  	2. ADD(int index, Object o): Adds the object o to ArrayList at the given index.
 *  
 *  	3. REMOVE(Object o):  Removes the object o from the ArrayList
 *  	4. REMOVE(int index): Removes element at a given index from the ArrayList.
 *  	5. CLEAR(): Removes all the elements of the ArrayList in one go
 * 
 *     	6. ADDALL(Collection c): Appends all of the elements in the specified collection to the end of ArrayList	
 *  	7. REMOVEALL(Collection c): Removes all the elements that are contained in the specified collection from the ArrayList.
 *  	8. RETAINALL(Collection c): Retains only the elements in ArrayList that are contained in the specified collection.
 *  
 *  	9. GET(int index): Returns the object of ArrayList present at the specified index.
 *  	10. TOARRAY(): Returns an array containing all the elements of the ArrayList in proper sequence.
 *  
 *  	11. SET(int index, Object o): Replaces the element present at the specified index in the ArrayList with the object o.
 *  
 *  	12. CONTAINS(Object o): Checks for the presence of the given object o in the ArrayList & returns true when present else returns false.
 *  	13. INDEXOF(Object o): If the element is found in the ArrayList then it returns the index of object o else returns -1.
 *  	14. LASTINDEXOF(Object o): Returns the index of the last occurrence of the specified element in the list. 
 *  							   If this element is not in the list, the method returns -1
 *  
 *  	15. ISEMPTY(): Returns True if the list does not contain any element else returns False
 *  	16. SIZE(): Returns the size(Number of elements of the list) of the ArrayList.
 *  
 *   	17. ITERATOR(): Returns an iterator over the elements in the list.
 *   		ITERATOR CLASS is part of JAVA.UTIL package that helps in traversing through the elements of a list with below methods:
 *				-> HASNEXT(): Return True when there is a object following the current value in the list else return False
 *				-> NEXT(): Refers to next object in the list
 *				-> REMOVE(): Removes the last object returned by the iterator of a list
 *  	
 *  	18. LISTITERATOR(): Returns a list iterator over the elements in this list.
 *			LISTITERATOR CLASS extends ITERATOR CLASS with functionality to access elements of a list in certain order
 *				-> ADD(object o): Adds an element at the end of the list
 *				-> HASNEXT(): Returns True if this list iterator has more elements when traversing the list in the forward direction.
 *				-> HASPREVIOUS(): Returns true if this list iterator has more elements when traversing the list in the reverse direction.
 *				-> NEXT(): Returns the next element in the list and advances the cursor position.
 *				-> NEXTINDEX(): Returns the index of the element that would be returned by a subsequent call to next().
 *				-> PREVIOUS(): Returns the previous element in the list and moves the cursor position backwards.
 *				-> PREVIOUSINDEX(): Returns the index of the element that would be returned by a subsequent call to previous().
 *				-> REMOVE(): Removes from the list the last element that was returned by next() or previous().
 *				-> SET(Object o): Replaces the last element returned by next() or previous() with the specified element 
 *   Note: Use FORECAH loop in case we need some specific action on each element of the list. 
 *   	   Use ITERATOR() in case when we need to remove/delete elements of the  the list while traversing though it.
 *   	   USE LISTITERATOR() when we need to modify(add/delete the elements) the list while traversing throigh it.	
 *      	
 *   
 *  - ArrayList vs Vectors: Internally both the ArrayList & Vector hold onto their contents using an ARRAYS but GROWABLE array of objects
 *    Both are good for retrieving elements at a SPECIFIC INDEX or for adding & removing elements at the END OF a LIST-> Constant time<0/1> 
 *    However, adding & removing elements from any other position proves more expensive -> linear to be exact<0/(n-i)>.LINKEDLISTS are used in such cases.
 *      1. ARRAYLIST:
 *      	-> Are UNSYNCHRONIZED therefore, not thread safe. 
 *             If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector
 *      	-> ArrayList object will expand its internal array if it runs out of room by increases its array size by 50% (ALWAYS)
 *      	   Vector does possess a slight ADVANTAGE since we can set the increment value
 *      2. VECTORS:
 *      	-> Are SYNCHRONIZED(synchronization will incur a performance hit). Any method that touches the Vector's contents is thread safe.
 *      	-> Vector object will expand its internal array if it runs out of room by doubling the size of its array(default)
 *      
 *      It's always best to set the object's initial capacity to the largest capacity that the program will need. 
 *      By carefully setting the capacity, you can avoid paying the penalty needed to resize the internal array later 
 *  
 *  - ArrayList vs LinkedList: Both implements List interface and their methods and results are almost identical with few exceptions
 *  	1. Search: ArrayList search operation is pretty fast compared to the LinkedList search operation  
 *  	2. Addition/Deletion: LinkedList element addition/deletion is faster compared to ArrayList   
 *  			LinkedList elements maintains 2 pointers which points to both neighbor elements in the list. 
 *              Hence addition/removal only requires change in the pointer location in the two neighbor nodes of the node which is going to be removed. 
 *              While in ArrayList all the elements need to be shifted to fill out the space created by added/removed element					 
 *  	3. Memory Overhead: ArrayList maintains indexes & element data while LinkedList maintains element data & 2 pointers for neighbor nodes 
 *                          hence the memory consumption is high in LinkedList comparatively.  
 */

/** LECTURE 22: HashMaps
 * #################################################################################
 *	- HashMaps: DATA STRUCTURES which uses implicit HASH FUNCTIONS to map all the values pertaining to a key on to a memory location
 *		1. Each entry in a HashMap is KEY/VALUE pair & often denoted as HashMap<Key,Value> or HashMap<K,V> where 
 *	  		-> KEY is a DATA SEARCH/RETRIEVABLE attribute 
 * 			-> VALUE is a REFERENCE to a location of the DATA associated with the KEY in the pair
 *  		Data is stored in a memory location based on the value returned by applying Hash Function on the key  
 *		2. It is NOT an ORDER COLLECTION i.e does not return keys & values in the same order in which they are inserted into.
 *		3. HashMap IMPLEMENTS map INTREFACE
 *		4. HashMaps are used to build LARGE DATA INDEXES or DATA RETRIEVAL OPTIMIZATION technique	 
 *
 *	- An instance of HashMap has two parameters that affect its PERFORMANCE: 
 *		1. INITIAL CAPACITY: Capacity is the number of BUCKETS in the hash table & 
 *							 initial capacity is the capacity at the time the hash table is created
 *		2. LOAD FACTOR: Measure of HOW FULL the hash table is allowed to get before its capacity is automatically increased.
 *		   When number of entries in the hash table exceeds (load_factor * current_capacity),hash table is REHASHED
 *         (internal data structures are rebuilt) so that hash table has approximately twice the number of buckets	
 * 	   	As a general rule, default load factor(.75) offers a good tradeoff between time & space costs. 
 * 		Higher load factor decrease the space overhead but increase the lookup cost.
 * 
 * 	- HashMap CONSTRUCTORS:
 * 		1. HashMap(): Creates an empty HashMap with the default initial capacity (16) & default load factor (0.75).
 *		2. HashMap(int initCap): Creates an empty HashMap with specified initial capacity & default load factor (0.75).
 *		3. HashMap(int initCap, float loadFactor): Creates an empty HashMap with specified initial capacity & load factor.
 *		4. HashMap(HashMap h) : Initialized with another HashMap
 *
 *	- HashMap METHODS:
 *		1. PUT(K key, V value): Associates the specified value with the specified key in this map.
 *		2. PUTALL(HashMap m): Copies all of the mappings from the specified map to this map.
 *		3. REMOVE(Object key): Removes the mapping for the specified key from this map if present.
 *
 *		4. SIZE(): Returns the number of key-value mappings in this map.
 *
 *		5. VALUES(): Returns a Collection view of the values contained in this map.
 *		6. KEYSET(): Returns a SET view of the keys contained in this map.
 *		7. ENTRYSET(): Returns a SET view of the mappings contained in this map.
 *
 *		8. GET(Object key): Returns the value to which the specified key is mapped or NULL if HashMap contains no mapping for the key.
 *		
 *		9. CONSTAINSVALUE(Object value): Returns true if HashMap one or more keys to the specified value.
 *		10. CONTAINSKEY(Object key): Returns true if HashMap contains a mapping for the specified key.
 *		
 *		11. ISEMPTY(): Returns true if HashMap contains no key-value mappings.
 *		12. CLEAR(): Removes all of the mappings from HashMap
 *		13. CLONE(): Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
 *		
 * 
 *   - SERIALIZATION/DESERIALIZATION process:
 *     Classes ObjectInputStream & ObjectOutputStream are high-level streams that contain the methods for serializing/de-serializing an object
 *   		1. SERIALIZATION: It is the process of making the object's state persistent i.e 
 *             the state of the object(object's data, object's type & types of data stored in object) is converted into a stream of bytes & stored in a file. 
 *   		2. DESERIALIZATION: Is used to bring back the object's state from bytes i.e used to recreate the object in memory. 
 *     Serialization is mostly used in NETWORK PROGRAMMING. Objects that need to be transmitted over the network have to be converted into bytes. 
 *     Hence, every class or interface must implement the Serialization INTERFACE. It is a MARKER INTERFACE without any methods.
 *	
 *	- TRANSIENT Variables:
 *		1. By default, all of object's variables get converted into a  persistent State. But a TRANSIENT variable will NOT BE PERSISTED.
 *     	2. The TRANSIENT keyword in Java is used to indicate that a field should NOT BE SERIALIZED.
 */

/** LECTURE 23: Hashtables 
 * #################################################################################
 * 	- Hashtables: Like HashMas store key-value pairs.
 * 				  When using a Hashtable, we specify an object to be used as a key, & a value that must be linked to that key. 
 *                The key is then hashed, & the resulting HASH CODE is used as the index at which the value is stored within the table. 
 * 				  They are SYNCHRONIZED object & hence can be used in MULTI-THREADED Environment.
 * 	
 * 	- Hashtable CONSTRUCTORS:
 * 		1. Hashtable(): Creates an empty Hashtable with the default initial capacity (11) & default load factor (0.75).
 *		2. Hashtable(int initCap): Creates an empty Hashtable with specified initial capacity & default load factor (0.75).
 *		3. Hashtable(int initCap, float loadFactor): Creates an empty Hashtable with specified initial capacity & load factor.
 *		4. Hashtable(Hashtable h) : Initialized with another Hashtable
 *
 * 	- Hashtable METHODS:
 *		1. PUT(K key, V value): Inserts a key & a value into the hash table. Returns null if key isn't already in the hash table; 
 *                              returns the previous value associated with key if key is already in the hash table
 *      2. REMOVE(Object key): Removes key & its value. Returns the value associated with key. 
 *                             If key is not in the hash table, a null object is returned.                        
 *		3. REHASH(): Increases the size of the hash table and rehashes all of its keys.
 *		4. SIZE(): Returns the number of entries in the hash table.
 *		5. ISEMPTY(): Returns true if the hash table is empty; returns false if it contains at least one key.
 *		
 *		6. GET(Object key): Returns the object that contains the value associated with key. If key is not in the hash table, a null object is returned.
 *		7. ELEMENTS(): Creates a enumeration out of the entries in the hashtable & return it.
 *		8. KEYS(): Returns all the key values in the hashtable as an enumeration
 *		
 *		9. CONTAINS(object key/value): Tests if some key maps into the specified value in this hashtable. 
 *									   This method is identical in functionality to containsValue() provide by MAP interface
 *		10. CONTAINSKEY(Object key): Returns true if some key equal to key exists within the hash table. 
 *                                   Returns false if the key isn't found.
 *      11. CONTAINSVALUES(Object value): Returns true if some value equal to value exists within the hash table. 
 *                                        Returns false if the value isn't found. 
 *      12. CLEAR( ): Resets & empties the hash table.  
 *      13. CLONE( ): Returns a duplicate of the invoking object.
 *      
 *  - HashMap vs Hashtable:
 *  	1. SYNCHRONIZATION/Thread Safe: HashMap is non synchronized & not thread safe(i.e can not share them between MULTIPLE THREADS without external synchronization)
 *                                      but HashTable is thread safe & synchronized 
 *      2. NULL keys & null values: Hashmap allows ONE null key & any number of null values, while Hashtable DO NOT ALLOW null keys & null values in the HashTable object.
 *    	3. INTERATION: Hashmap object values are iterated by using iterator. HashTable is the only class other than vector which uses ENUMERATOR to iterate the values of HashTable object.                                                             
 *		4. PERFORMANCE: Unsynchronized objects are often much better in performance in compare to synchronized objects
 *
 *	- HashMap vs LinkedHashMap:
 *		1. ORDER: HashMap doesn't maintain any order while LinkedHashMap maintains insertion order of elements
 *		2. MEMORY: LinkedHashMap uses doubly LinkedList to keep order of elements like the LinkedList & hence need more memory
 *
 *	- HashMap vs TreeMap:
 *		1. ORDER: HashMap returns unordered values. TreeMap returns the elements in ascending order (known as natural order) of keys by default
 *                TreeMap order can be customized using COMPARATOR & COMPARABLE interfaces.
 *      2. PERFORMANCE: The performance of HashMap is higher than TreeMap because TreeMap requires minimum execution of 
 *                      two method calls to create a tree structure and to print the elements in natural order.
 */

/** LECTURE : SETS
 * #################################################################################
 * 	- HashSet:
 * 	- LinkedHashSet:
 * 	- TreeSet: 
 */

/** LECTURE : QUEUES
 * #################################################################################
 * 	- QUEUE: Represents an ordered list of objects just like a List, but its intended use is slightly different. 
 *           Queue is designed to have elements inserted at the end of queue & removed from the beginning of queue(FIFO) 
 *  - Queue has two set of method for doing the same job:
 *  	1. Throws Exception:
 *  		-> ADD(Object o): Add elements to the Trail of the Queue (throws IllegalStateException)
 *  		-> REMOVE(): Removes/deletes element from the Head of the Queue(throws NoSuchElementException)
 *  		-> ELEMENT(): Retrieves element from the Head of the Queue(throws NoSuchElementException)
 *  	2. Returns Special Value(Null):
 *  		-> OFFER(Object o): Add elements to the Trail of the Queue (return false if cannot add)
 *  		-> POLL(): Removes/deletes element from the Head of the Queue(return Null if cannot remove)
 *  		-> PEEK(): Retrieves element from the Head of the Queue(return Null if cannot Retrieve)       
 *           
 * 	- PriorityQueue:
 * 	- LinkedList
 */

/** LECTURE: hashcode() & equal() methods
 * #################################################################################
 * 	- EQUALS() method: In class "Object" uses only the == operator for comparisons, so unless we override equals(), 
 *                     two objects are considered equal only if the two references refer to the same object
 *  - HASHCODE(): HASHCODE can be thought of as an object ID number, it isn't necessarily unique. 
 *  			  Collections such as HashMap,LinkedHashMap & HashSet use the hashcode value of an object to determine
 *                how the object should be stored in the collection & hashcode is also used to locate the object in the collection. 
 *      The hashcode tells us only which bucket to go into, but not how to locate the name once we're in that bucket.
 *  
 *  - HASHING: In real-life hashing, it’s not uncommon to have more than one entry in a bucket. 
 *             Hashing retrieval is a two-step process.
 * 					1. Find the right bucket -> using hashCode()
 * 					2. Search the bucket for the right element -> using equals()     
 *   It doesn't matter how equal the objects are if their hashcodes don't reflect that i.e 
 *   if two objects are equal, their hashcodes must be equal as well.    
 *   
 *  - When ever we need to add USER DEFINED OBJECTS as elements into SETS or use them as KEYS in MAP then override the 
 *    EQUALS() & HASHCODE() functions of the "Object" class so that: 
 * 		-> SETS have UNIQUE ELEMENTS(as per their behavior) & 
 * 		-> MAPS have UNIQUE KEYS(as per their behavior)                       
 */

/** LECTURE: COMPARATOR & COMPARABLE Interfaces for SORTING
 * #################################################################################
 * 	- COMPARABLE Interface: 
 * 		1. Used to order the objects of user-defined in only single sorting sequence  as it uses natural order of sorting i.e
 * 		   We can sort the elements based on single data member only.Ex: may be either rollno, name, age or anything else.
 *				-> Natural order for a collection of String objects -> alphabetical
 *				-> Natural order for a collection of Integer objects -> by numeric value
 *		2. Contains only one method named COMPARETO(Object): used to compare the current object with the specified object
 *
 *	- COMPARATOR Interface: 
 *		1. Used to order the objects of user-defined class as they allow us to define different sort orders other than natural order 
 *		2. Contains 2 methods COMPARE(Object obj1,Object obj2) & EQUALS(Object element).
 *		   COMPARE(),Compares its two arguments for order & returns below:
 *			-> Negative integer : first argument is less than the second
 *			-> zero: both are equal
 *			-> Positive integer: first argument is greater than the second
 * 		3. Comparators could be used under below scenarios:
 * 			-> Is passed to a sort method(Collections.sort or Arrays.sort) to allow precise control over the sort order or 
 *        	-> Is used to control the order of certain data structures (TreeSet or TreeMap), or 
 *         	-> Is used to provide an ordering for collections of objects that don't have a natural ordering.
 */

/** LECTURE 24: Exception
 * #################################################################################
 * 	- EXCEPTION is an EVENT that occurs during the execution of a program, that DISRUPTS normal flow of program's instructions
 *  
 *  - THROWING an Exceptions: Is the process of creating an exception object & handing it to the runtime system
 *  	If an error occurs in a method, the method creates an object(EXCEPTION OBJECT) & sends to the RUNTIME SYSTEM.
 *  	This object contains information about the exception such as
 *  		-> TYPE of Exception
 *  		-> STATE of the program when the error occurred
 *  
 *  - CATCHING Exceptions: Once a method throws an exception, runtime system attempts to find something to HANDLE it.
 *  	A set of possible "somethings" to handle the exception is the ordered LIST OF METHODS that had been 
 *      called to get to the method where the error occurred. This list of methods is known as the CALL STACK.
 *      Runtime system searches the call stack for a method that contains a block of code that can handle the exception. 
 *      This block of code is called an EXCEPTION HANDLER.
 *      The search begins with the method in which the error occurred & proceeds through the call stack in the REVERSE order 
 *      in which the methods were called. When an appropriate handler is found, the runtime system passes the exception 
 *      to the handler. An exception handler is considered appropriate if the TYPE of the exception object thrown 
 *      MATCHES the type that can be handled by the handler. 
 *      
 *      The exception handler chosen is said to CATCH THE EXCEPTION.
 *      If the runtime system exhaustively searches all the methods on the call stack without finding an appropriate 
 *      exception handler, the runtime system (and, consequently, the program) TERMINATES.
 *  
 *  - Exception Class Hierarchy:
 *  								Object
 *  								  |
 *  							   Throwable
 *  							/			\
 *  						Errors 	    	Exceptions
 *  										/	     \
 *  							Checked Exceptions	 RunTimeExceptions
 *  													|
 *  				1.IllegalArgumentException		1. NullPointerException	
 *                  2. IllegalStateException        2. ArithmeticException
 *                  3. NumberFormatException        3. ArryaIndexOutOfBoundsException
 *                                               	4. ClassCastException
 *                                               	5. IOException ->EOFException, FileNotFoundException
 *  												6. ClassNotFound
 *  												7. NoClassDefFoundError
 *  												8. StackOverflowError
 *	- Types of Exceptions:
 *		1. CHECKED exception: Are exceptional conditions that a well-written application should anticipate & recover from.
 *				Ex: FileNotFoundException -> when the program tries to read a file which does not exist. 
 *		
 *		2. RUNTIME/UNCHECKED exception: Are exceptional conditions that are INTERNAL to the application & 
 *              that the application usually cannot anticipate or recover from  
 *              These usually indicate programming bugs, such as logic errors or improper use of an API.
 *              	Ex: NullPointerException -> An application passes a file name to the constructor for FileReader. 
 *                      But a logic error causes a NULL to be passed to the constructor then such error occur.
 *
 *		3. ERROR: Are exceptional conditions that are EXTERNAL to the application & 
 *                that the application usually cannot anticipate or recover from.
 *              Ex: IOError -> suppose the application successfully opens a file for I/P but is unable to
 *                  read the file because of a hardware or system MALFUNCTION.
 *	
 *- Exception Handling program Constructs:
 *		1. TRY-CATCH Block:
 *			-> TRY: is used to define a block of code(GUARDED REGION) in which exceptions may occur.   
 *			-> CATCH: One or more CATCH clauses match a specific exception(or group of exceptions) to a block of code that handles it.
 *     		-> FINALLY(Garbage Collection): this block encloses code that is always executed at some point after try block, whether an exception was thrown or not. 
 *             Even if there is a RETURN STATEMENT in the try block, the finally block executes right after the return statement is encountered.
 *             This is the right place to CLOSE your FILEs, RELEASE your network SOCKETS & perform any other CLEANUP needed.
 *       			
 *       				try{
 *       						...
 *       						// Put code here that might cause some kind of exception.
 *       					} 
 *       				catch(MyFirstException) {
 *       						...
 *       						// Put code here that handles this exception
 *       					} 
 *       				catch(MySecondException) {
 *       						...
 *       						// Put code here that handles this exception
 *       					} 
 *       				finally{
 *       						...
 *       						 // Put code here to release any resource allocated in the try clause.
 *       					}
 *   		  Note: It is ILLEGAL to use a try clause without either a catch or a finally clause.
 *          		A try clause by itself will result in a compiler error. 
 *          		Any catch clauses must immediately follow the try block.
 *          		Any finally clause must immediately follow the last catch clause(or immediately follow try block if there is no catch). 
 *          		It is LEGAL to omit either the catch clause or the finally clause, but not both.   	
 *          		You can’t SNEAK any code in between the try, catch, or finally blocks.  
 *		
 *		2. THROW Statement: All methods use "throw" statement to throw an exception. It just needs a single argument: a THROWABLE OBJECT. 
 *         		Throwable objects are instances of any subclass of the Throwable class. 
 *           				Ex: throw new EmptyStackException();
 *      3. THROWS statements: Is used to explicitly mention that a certain block of statement will throw an exception.
 *         		Exception handling can be defined in a child class of the current class.					     
 *           
 *	- DUCKING:  If a method doesn't provide a catch clause for a particular exception, that method is said to be "ducking" the exception.                                                                 
 *  
 *  - EXCEPTION PROPOGATION: When a method that throws the exception does not provide a catch clause for the exception.
 *       Run time system will move down the CALL stack to look for a method that can handle the exception until it 
 *       reaches the bottom of the stack(main()). If the Exception is not handled even by the main(); the exception 
 *       is thrown out of main() as well which resulting in halting the JVM & STACK TRACE trace will be printed as output
 *
 *	- EXCEPTION MATCHING: When an exception is thrown, Java will try to find(available catch clauses from TOP DOWN) a catch clause for the exception type.
 *        If it doesn't find one, it will search for a handler for a SUPERTYPE of the exception. 
 *        If it does not find a catch clause that matches a supertype for the exception, then the exception is propagated down the call stack.
 *		  The handlers for the most SPECIFIC EXCEPTIONS must always be PLACED ABOVE those for more GENERAL EXCEPTIONS.
 *
 *	- Handle or Declare Req: Each method must either HANDLE ALL CHECKED EXCEPTIONS by supplying a catch clause or
 *    list each unhandled checked exception as a THROWN EXCEPTION. This is also known as "catch or declare" requirement.
 *    
 *	- USER-DEFINED EXCEPTIONS: User can also create exception classes specific to the application by extending the "Exception" class.
 *				class NewException extends Exception{ ... }
 *	
 *	- Useful methods of Exception class are:
 *		1. getMessage() - Returns a STRING, giving information about the exception
 *		2. getCause() - Returns an OBJECT of Throwable type which helps to find the cause of the exception.
 *		3. printStackTraceTree() - prints STACKTRACE information to the error stream. 
 *
 */
package Section3;