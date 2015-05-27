#----------Java Definition----------
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

