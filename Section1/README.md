#---------- Java Definition ----------
#### Java is an OBJECT-ORIENTED programming language (Classes & objects)

#### Java programs are platform independent i.e they are PORTABLE 
  1. Programs are compiled by the compiler(JavaC) to generate converted into BYTECODE
  2. Bytecode is interpreted by the interpreter(JAVA) with the help of JAVA VIRTUAL MACHINE(JVM)

#### JVM bytecode VERIFIER functions:
  1. DATA TYPES of variables
  2. Variable are always INITIALIZED & they refer to valid locations in memory
  3. Ensures access controls to variables according to ACCESS MODIFIERS(public/private)
  4. Check branching instructions to ensure they lead to VALID BRANCHES
  5. INTERPRETS the bytecode

#### RUNNING a Java program:
  1. JAVA FILE(.JAVA) name is passed as an parameter to the java COMPILER
  2. On successful compilation, a new file called as a CLASS FILE(.CLASS) is created with a name same as its corresponding java file 
  3. Name of the MAIN CLASS class file is passed as a parameter to the interpreter [Every java program must have one class which further defines a MAIN method. Such a class is called as a MAIN CLASS]
  4. This .class file is then interpreted by the interpreter to generate the OUTPUT of the program

#---------- Basic Java Syntax ----------
#### Every language needs certain amount of memory to be set aside for performing operations. This is achieved by DECLARING VARIABLES.

#### Each DATA TYPE allocates a fixed amount of memory. BASIC/PRIMITIVE data type supported by Java are:
  1. byte(signed) -> 1 byte
  2. short(Signed) -> 2 byte
  3. char(Unsigned) -> 2 byte
  4. int(signed) -> 4 bytes
  5. long(signed) -> 8 bytes
  6. float(6-7 significant decimal points) -> 4 bytes
  7. double(15 significant decimal points) -> 8 bytes
  8. boolean -> JVM dependent

#### Java also has complex data types known as USER DEFINED data types/CLASSES.
  1. Each class has certain variables DECLARED & methods DEFINED	
  2. VARIABLES hold value of a basic data type, memory is assigned to these variables on DECLARATION(attaching a data type) 

#### VARIABLE TYPES in Java:
  1. INSTANCE Variables: 
   		  - Declared with in a class
    		- Memory is allocated to them when an OBJECT of that class is created
    		- Each object of the class has its own version of such variables
  2. CLASS Variables:
    		- Declared with in a class
    		- Memory is allocated to them irrespective of whether an OBJECT of that class is created or not
    		- They are common to all instance/objects of a class
  3. LOCAL Variables: 
    		- Declared within certain block of code like methods or conditional block of statements
    		- Life of such variable is limited to the block in which they are declared
  4. PARAMETERS:
    		- Used as arguments to methods
    		- Used to pass values to methods & retrieve values from the methods

#### VARIABLE NAMING CONVENSIONS - Names are INDETIFIERS to identify the location in memory:
  1. Case Sensitive
  2. Can not be same as RESERVED/KEY words
  3. Must always start with a letter followed by letters/numbers/$/_
  4. In case of multiple word variable name
      	- First word need to start with a lower case letter while the subsequent words start with an upper case letter
        - Subsequent words can be separated by an underscore(_)

#### TYPE CASTING: Process of converting one data type into another data type to avoid situations such as MEMORY OVERFLOW.     
  Variables of all types except BOOLEAN can be converted from one type to another.
  1. IMPLICIT casting: happens on two occasion
        - When a memory overflow happens
        - When a variable of smaller data type is assigned to a variable of larger data type
  2. EXPLICIT casting: Done explicitly in a program using a specific syntax
