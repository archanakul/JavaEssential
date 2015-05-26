/** LECTURE 2: Java Definition
 * #################################################################################
 *	- Java is an OBJECT-ORIENTED programming language (Classes & objects)
 * 	- Java programs are platform independent i.e they are PORTABLE 
 * 	 	1. Programs are compiled by the compiler(JavaC) to generate converted into BYTECODE
 * 		2. Bytecode is interpreted by the interpreter(JAVA) with the help of JAVA VIRTUAL MACHINE(JVM)
 *	- JVM bytecode VERIFIER functions:
 * 		1. DATA TYPES of variables
 * 		2. Variable are always INITIALIZED & they refer to valid locations in memory
 * 		3. Ensures access controls to variables according to ACCESS MODIFIERS(public/private)
 * 		4. Check branching instructions to ensure they lead to VALID BRANCHES
 * 		5. INTERPRETS the bytecode
 * 	- Every java program must have one class which further defines a MAIN method. Such a class is called as a MAIN CLASS
 * 	- RUNNING a java program:
 * 		1. JAVA FILE(.JAVA) name is passed as an parameter to the java COMPILER. 
 * 	  	2. On successful compilation, a new file called as a CLASS FILE(.CLASS) is created with a name same as its corresponding java file. 
 * 	  	3. Name of the MAIN CLASS class file is passed as a parameter to the interpreter
 * 		4. This .class file is then interpreted by the interpreter to generate the OUTPUT of the program 	  
 */

/** LECTURE 3: Basic Java Syntax
 *  * #################################################################################
 *	- Every language needs certain amount of memory to be set aside for performing operations. This is achieved by declaring variables.
 *	- Each DATA TYPE allocates a fixed amount of memory. Basic data type supported by java are:
 *		1. byte(signed) -> 1 byte
 *		2. short(Signed) -> 2 byte
 *		3. char(Unsigned) -> 2 byte
 *		4. int(signed) -> 4 bytes
 *		5. long(signed) -> 8 bytes
 *		6. float(6-7 significant decimal points) -> 4 bytes
 *		7. double(15 significant decimal points) -> 8 bytes
 *		8. boolean -> JVM dependent
 *
 *	- Java also has complex data types known as USER DEFINED data types/CLASSES.
 *	  Each class has certain variables DECLARED & methods DEFINED	
 *	- VARIABLES hold value of a basic data type, memory is assigned to these variables on DECLARATION(attaching a data type)
 * 	- VARIABLE NAMES are the INDETIFIERS to identify the location in memory 
 *  
 *  - VARIABLE TYPES in Java:
 *  	1. INSTANCE Variables: 
 *  		- Declared with in a class
 *  		- Memory is allocated to them when an OBJECT of that class is created
 *  		- Each object of the class has its own version of such variables
 *  	2. CLASS Variables:
 *  		- Declared with in a class
 *  		- Memory is allocated to them irrespective of where an OBJECT of that class is created or not
 *  		- They are common to all instance/objects of a class
 *  	3. LOCAL Variables: 
 *  		- Declared with certain block of code like methods or conditional block of statements
 *  		- Life of such variable is limited to the block in which they are declared & used
 *  	4. PARAMETERS:
 *  		- Used as arguments to methods
 *  		- Used to pass values to a methods & retrieve values from a method
 *	
 *	- NAMING CONVENSIONS:
 *		1. Case Sensitive
 *		2. Can not be same as RESERVED/KEY words
 *		3. Must always start with a letter followed by letters/numbers/$/_
 *		4. In case of multiple word variable name
 *			-> First word need to start with a lower case letter while the subsequent words start with an upper case letter
 *			-> Subsequent words can be separated by an underscore(_)
 *	
 *	- TYPE CASTING: Process of converting one data type into another data type to avoid situations such as MEMORY OVERFLOW/
 *	  Variables of all types except BOOLEAN can be converted from one type to another.
 *		1. IMPLICIT casting: happens on two occasion
 *			-> When a memory overflow happens
 *			-> When a variable of smaller data type is assigned to a variable of larger data type
 *		2. EXPLICIT casting: Done explicitly in a program using a specific syntax
 */

/** LECTURE 4: Operators
 * #################################################################################
 * 	- OPERATORS are symbols that implies certain pre-defined operations on the operands.
 * 		1. MATHEMATICAL Operator: Are Binary operators that can perform mathematical operations on NUMERICAL variables
 * 			-> Addition(operand1 + operand2)
 * 			-> Subtraction(-)
 * 			-> Multiplcation(*)
 * 			-> Division(/)
 * 			-> Modulus(%)
 * 			-> Assignment(=)
 * 		Note: JAVA.LANG.MATH is a module in java that contains various mathematical functions defined
 * 
 * 		2. UNARY Operators: Perform operation on a single operand
 * 			-> Indicate Positive Integer(+ prefix) :  +operand
 * 			-> Indicate Negative Integer(- prefix) :  -operand
 * 			-> Increment by 1(++ prefix or suffix) :  ++operand/operand++
 * 			-> Decrement by 1(-- prefix or suffix) :  --operand//operand++
 * 			-> Binary complement(! prefix)         :  !operand
 * 
 * 		3. RELATIONAL Operators: Used to compare two different value of ANY TYPE & return a Boolean values (True/False)
 * 			-> Equal to(operand1 == operand2)
 * 			-> Not equal to(!=)
 * 			-> Greater than or equal to(>=)
 * 			-> Less than or equal to(<=)
 * 			-> Greater than(>)
 * 			-> Less than(<)
 * 
 * 		4. LOGICAL/CONDITIONAL Operators: Allows checking multiple boolean conditions(relational operations) simultaneously
 * 			-> Logical AND(condition1 && condition2)
 * 			-> Logical OR(||)
 * 			->Ternary operator(condition? when_true:when_False)
 * 
 * 		5. Bitwise Operators: They treat operands as a group of bits & operate on these operands at a bit level
 * 			-> Bitwise AND(&)
 * 			-> Bitwise OR(|)
 * 			-> Bitwise Complement(~)
 * 			-> Bitwise XOR(^) : AB' + A'B i.e True if not same
 * 			-> Signed Left shift(<<)
 * 			-> Signed Right shift(>>)
 * 			-> Unsigned Left shift(<<<)
 * 
 *	- Static and Non-Static Variables:
 *		1. STATIC Variables:
 *			-> Theses are class variables prefixed by a key word STATIC
 *			-> Value remains COMMON to all the objects of a class
 *			-> Are ACCESSED by prefixing class name to the variable name
 *		2. FINAL/NON-STATIC Variables:
 *			-> Prefixed by a key word FINAL when the value remains UNCHNAGED throughout the program 
 *			-> These variables are INITIALIZED ONLY ONCE & can never be overwritten. 
 *			   But they can be initialized later in the program.
 *		Note: A CONSTANT is defined in a class	using "STATIC FINAL" key words together 
 */

/** LECTURE 5: Statements & Blocks of code
 * #################################################################################
 * 	- A STATEMET is an instruction to be executed to accomplish a task
 * 	
 * 	- Statement Types in Java:
 * 		1. DECLARATION Statements: Used to attach a data type to a variable or function prototypes
 * 		2. CONDITIONAL Statements: Control the flow of execution based on a condition
 * 		3. LOOP Statements: Used to repeat a block of statements over & over again
 * 	
 * 	- BLOCKS are a logical group of statements enclosed within {..}. Ex: loop or conditional statements, class or method definitions
 * 	- CONTROL FLOW may change during the execution based on VARIOUS CONDITIONS or due to USER INPUTS accepted interactively
 * 	
 * 	- FLOW CONTROL structure in Java:
 * 		1. If Statements:
 * 			-> Checks for a condition or a set of conditionals to be True/False
 * 			-> if block is executed if the condition evaluates to True
 * 		2. if-else statements/if-else-if ladder:
 * 			-> if-else: when a choice has to be made based on a condition to choose between two blocks of statements
 * 			-> if-else-if ladder: When there are multiple conditions to be checked subsequently & each condition has a block attached
 * 		3. Nested if-statements:
 * 			-> When multiple conditions are to be checked one after other & there are statements to be executed at each level of condition	
 * 		4. Ternary operator(if-else):
 * 			condition ? True_block : False_Block
 * 		5. Switch Statement(if-else-if ladder): 
 * 			-> Efficient way of coding when a choice has to be made between multiple choices based on a user input or value obtained
 * 			-> Break statement in each CASE BLOCK allows the exit the switch block when any one of the condition is met.
 * 			-> When no conditions are met then the DEFAULT BLOCK in the switch block is executed.
 * 					switch(case){
 * 							case 1:
 * 									..
 * 									break;
 * 							..
 *   						case n:
 * 									..
 * 									break;
 *  						default:
 * 									..
 * 									break;
 * 		6. Loop Statements: Number of times to be repeated is either decided by a condition known as EXIT CONDITION or 
 * 		   it is EXPLICITLY SPECIFIED while defining the loop
 * 			-> FOR LOOP: Used when the exact number of time the loop needs to be executed is known
 * 					for(int i = 0; i < 10; i++) i.e initialization, exit condition & navigation
 * 			-> WHILE LOOP: Used when a block need to be executed until a condition needs to be met
 * 					while(condition){
 * 						..
 * 						}
 * 			-> DO-WHILE LOOP: Same as while but when its need to execute the block at-least once before checking the exit condition
 * 					do{
 * 						..
 * 					}while(condition)	
 * 			-> BREAK/CONTINUE statements: Used to modify the execution statements in both loop as well as non-loop statements
 * 			   On encountering BREAK statement in a block, no statements after the break statements are executed with in the block & 
 * 			   the execution continues from the next block.
 * 			   On encountering CONTINUE statement in a block, no statements after the continue statements are executed with in the block for that iteration &
 * 			   the execution proceeds to next iteration
 *	
 *	- Basic Java CONSTRUCTS: 
 *		1. All the programs in java are written in terms of CLASSES and executed by invoking the objects of the class.
 *		2. All the related class are group into a PACKAGE 
 *		3. All the essential classes(Basic Constructs) require to execute a java program are defined in a package called as  "JAVA.LANG".
 *		   It has constructs for defining Main method & some of other imp classes listed below
 *			-> MATH class : Has all methods that implement mathematical operations & functions
 *			-> STRING Class: Has all string handling methods. String is a sequence of characters
 *			-> SCANNER Class: This class is used to read inputs from key board CONSOLE and other input STREAMS
 *			-> BOOLEAN Class:
 *			-> NUMBER Class:
 *			-> THREAD Class:
 *			
 *	- ARRAYS: They are a DATA STRUCTURE used to create/define a group of data variables of same data type (group of integers or group of strings..)
 *		 	  MEMORY ALLOCATION is done by using NEW operator & specifying the size of the array(num of elements)
 *						
 *			  Memory for the elements of the array is allocated as a CONTINUOUS BLOCK on the HEEP	
 *		1. ONE-DIMENTIONAL: Traversed in a linear fashion using the index of the array which always starts with 0 being the first index
 *									data_type array_name = new data_type[size]		
 *		2. TWO-DIMENSIONAL: Extension of 1D arrays, i.e its a group of 1D arrays where each element of the group in-turn refers to another array.
 *						    Data stored on a 2D array can be visualized a TABLE where data is arranged in ROWS & COLUMNS.
 *									data_type array_name[][] = new data_type[row_size][col_size]
 *							A nested 2 FOR loops are used to traverse through the elements of the array, 
 *							OUTER LOOP traverse through the COLUMN while the INNER LOOP traverses through the ROWS 
 *
 *	- FOR-EACH LOOP: Is used to iterate over arrays & other such collections. 
 *	  Though we can use a ÒforÓ loop with the iteration operator, the code becomes much more readable with for-each loop 
 *    This loop is preferred to the ÒforÓ loop when certain task needs to be executed on each elements of the list
 *    	1. only access is desired but not assigning a value to an element
 *    	2. only for forward looping and that too in single steps. 
 *    
 *    				for (type variable: expression) { .. }
 *       "variable" -> used throughout the ÒforÓ block & will be replaced each time with the array value being processed 
 *       "expression" -> generally is either an array variable or a method that returns an array.
 *	   An important statement generally used with loops is the BREAK statement to stop the loop. 
 */

/** LECTURE 6: Java Classes & Methods
 * #################################################################################
 * 	- In Java programs, all the data are modeled in terms of CLASSES, OBJECTS & METHODS (interactions between the objects).
 * 	
 * 	- CLASS defines a STRUCRE of an object that can be created
 * 		1. Its general definition of an object like a group of people or vehicles
 * 		2. Defines certain properties(VARIABLES) & behaviors(METHODS) of the object
 * 					class class_name{
 * 								Variable DECLARATION
 * 								Method DEFINITIONS
 * 							}
 * 	
 * 	- OBJECTS are instance of a class i.e class creates a TEMPLATE while the object MATERIALIZES the template
 * 	 	 Ex: If CAR is a class if vehicles then Maruthi800 is an instance of CAR class 
 * 		1. Objects are created/INSTANTIATED by allocating memory for the objects using NEW operator
 * 				class_name object_name = new class_name()
 * 		2. When a memory is allocated for an object, it is allocated for the VARIABLES in the underlying class
 * 
 * 	- METHODS define the behavior of the objects of the class. Definition of the method is same as that of a function
 * 		1. Have a return type
 * 		2. May or may not have parameters
 * 		3. Java allows more than one methods with same name but different parameter list (METHOD OVERLOADING).
 * 		   	-> OVERLOADING: Appropriate method is invoked based on the input parameters passed to the method at COMPILE TIME.
 * 		4. Java allows child class to RE-DEFINE(Same signature but new definition) the parent class methods to suit its needs(METHOD OVERRIDDEN).  
 * 			-> OVERRIDDING:	Appropriate method is invoked at RUN TIME.  
 * 
 * 	- ACCESS MODIFIERS define the access to various members of the class & help in achieving DATA ENCAPSULATION/ DATA HIDING
 * 		1.PUBLIC: Class member is accessible to the OTHER class members i.e any object object the class
 * 		2.PRIVATE: Class member is accessible only to ITS OWN class members
 * 		3.PROTECTED: Class member is accessible to all members within a PACKAGE(logical group of classes)
 */
package Section1;