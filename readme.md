JDK 11 OR LATER 

Eclipse / Intelij IEAD / Spring Tools Suite 

MySQL Community Edition / MySQL Workbench / H2 database


language                        library/packages                   framework
C / C++                         stl 

Python                          numPy, panda, tensorflow            django,  
                                pytorch ...                         flask 

Java                            util, math, io, ...                 spring

GoLang                          ....

JavaScript                      react, jquery,                      Angular
                                bootstrap                           next,nest


C#                              net, ...                            .net 

 |                                  |                               |
provide                         simplify the tasks              standardize
programming capabilites                                         the process 


build tools / package managers  
    maven
    gradle 

    npm
    yarn


version control tools
git
gitlab
...

testing tools / frameworks 


ORM Tools / Framework 
    - object relational mapping 



Java SE
    - core java
    - standard libraries 
        - java.lang 
        - java.util
        - java.io
        - java.sql
        - java.math
        - ..
Java SE
When most people think of the Java programming language, they think of the Java SE API. Java SE's API provides the core functionality of the Java programming language. It defines everything from the basic types and objects of the Java programming language to high-level classes that are used for networking, security, database access, graphical user interface (GUI) development, and XML parsing.

In addition to the core API, the Java SE platform consists of a virtual machine, development tools, deployment technologies, and other class libraries and toolkits commonly used in Java technology applications.

Java EE
The Java EE platform is built on top of the Java SE platform. The Java EE platform provides an API and runtime environment for developing and running large-scale, multi-tiered, scalable, reliable, and secure network applications.

Java ME
The Java ME platform provides an API and a small-footprint virtual machine for running Java programming language applications on small devices, like mobile phones. The API is a subset of the Java SE API, along with special class libraries useful for small device application development. Java ME applications are often clients of Java EE platform services.

JavaFX
JavaFX is a platform for creating rich internet applications using a lightweight user-interface API. JavaFX applications use hardware-accelerated graphics and media engines to take advantage of higher-performance clients and a modern look-and-feel as well as high-level APIs for connecting to networked data sources. JavaFX applications may be clients of Java EE platform services.






JVM - java virtual machine 
    - responsible to execute the java code 


JRE - 
    - JVM + libraries 


JDK 
    JRE + tools 




class - 
    - encapsulates data and logic together 

    public <class-name> {

        - instance variables 
        ..
        ..

        - constructors
        ....

        - instance methods / functions
        ..  - abstract methods
            - static methods
        ..

        - inner class

    }


    public Helloworld {

            public static void main(String[] args){

            }

    }






naming conventions 
    - classes, types, function/methods, enums/ constant 





    Variable declaration in java 
    ---------------------------------------

        <TYPE> varName; 


        - local variables 
                - defined inside a method/block/or constructor 
                - cannot be unassigned before its first use 
                    - doesn't have any default value
                - the memory for local vars is allocated when the method is called and it is destroyed when the method finishes its execution

        - instance variables 
                - declared inside a class but outside a method/constructor or block
                - instance variables can have access modifiers 
                - memory for the instance variables is created when the 'object' is created
                    using 'new' keyword 
                - instance variables have default values 
                    - numbers:  0
                    - reference types: null 
                    - boolean: false 


        - static variables 
            - declared using 'static' keyword inside a class but outside a method/constructor or block
                - static variables can have access modifiers 
                - only 1 copy of static variables will be allocated per class 
                - memory will be allocated when the class is loaded


    Access Modifiers 
    --------------------------
        - default 

        - public 

        - private 

        - protected 


    DATA types in java 
    -----------------------

        - primitive data types 

                    byte        1 byte          -128 to 127

                    short       2 bytes         -32768 to 32767

                    int         4 bytes 

                    long        8 bytes 

                    float       4 bytes

                    double      8 bytes

                    char        1 byte

                    boolean     1 bit


        - reference data types 
            - every class type, interface type variables are ref types 
         

                                                      JVM
    Java code --------------------> Byte Code   ---------------> on machine 
                javac compiler      (intemediate code)
                                    JVM understandable code

    .java              ->             .class


    Memory Structure in Java 
    ------------------------------------




    Garbadge collection
    -------------------------------


    Operators 
    -------------------
        - arithmetic operators 
        - relational operators 
        - logical operators 

    Decision Making statements 
    ----------------------------
        - if statement 
        - if - else statement 
        - if - else if - else statement 
        - switch case statements 

    Looping Statements 
    --------------------------
        - While Loop 
        - For loop 

        - do-while loop 
        - enhanced for loop

    jumping statements 
    ------------------------
        - break
        - continues 


    - Array in Java 
    -------------------------------
        - collection of elements stored in a object
        - Arrays are object in java    
        - array are always fixed size group of elements 


        Declare / define an array varialbe 
        -------------
            <DataType>[] arrVarName;

            int[] values;
            int [] values;
            int []values;
            int values[];


        construct an array object 
        -------------------------------

                arrVarName = new <datatype>[size-of-elements];

                values = new int[5];

        Initialize values to the array elements 

            arrVarName[index] = value;

            values[0] = 10
            values[1] = 30;



    Arrays class 
    -----------------
        - it is a utility class present in java.util package
        - This class contains various methods for manipulating arrays (such as sorting and searching). This class also contains a static factory that allows arrays to be viewed as lists.



Arrays Class
----------------------
   static int[] copyOf(int[] original, int newLength)
        - Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.

    static int[]	copyOfRange(int[] original, int from, int to)
        - Copies the specified range of the specified array into a new array.

    static void	fill(int[] a, int val)
        - Assigns the specified int value to each element of the specified array of ints.

    static void	sort(int[] a)
        - Sorts the specified array into ascending numerical order.

    static int	binarySearch(int[] a, int key)
        - Searches the specified array of ints for the specified value using the binary search algorithm.



 Multidimention array
 ---------------------------
    - Array of arrays
    
     2022       10000
     2023       8900
     2024       12000

        int[][] recruitData = new int[3][2];

        String[][] names = new String[5][];

        names[0] = new String[5]
        names[1] = new String[3]


OOPS
----------------
    - Encapsulation 
        - bundling data and code toghether 
        - hiding the the complexity 
    - Abstraction
    - Inheritance 
    - Polymorphism 



Classes and objects 
----------------------------
    - a class in java, a user defined data type
    - it is a blueprint for an 'Object'
    - encapsulate the data and the logic together inside a single unit 

    - An Object is an instance of a class

    class <<ClassName>> {

            - instance variables 
            - static variables

            - constructor/s

            - instance methods
            - static methods 
            - abstract methods 

            - inner classes / nested classes

    }


        A Properly encapsulated class
        -----------------------------
            - all the data members / instance variables should be private, i.e. should be hidden
            - provide public getter/setter methods for the private instance variables as applicable.

        - Access Modifiers
        
        - Constructors 
            - is a special method of a class, which has same name as it's class
            - it is involked automatically when we create an object of it's class 

               public class Product {

                       public Product(){      //constructor 

                        }

                }

        - Method Overloading
            - writing multiple methods having same name but different parameters in a class 
            - the right method to be called/invoked is determined based on the arguments passed to  the  method, and the parameters defined in the method definition
            - this decision to call the right method is taken at compile time

                "Compile time polymorphism"
                "Static binding"

        - Static Methods 


        Association 
        -----------------------
            - relationship between classes through their objects

                    - one-to-one relationship 
                    - one-to-many relationship
                    - many-to-one relationship 
                    - manay-to-many relationship 


            class Product {                 class CartLineItem {
                productId                           Product product;
                productName
                price
                stock
            }                                   }


            class Student {

            }

            class ClassRoom {
                has-a student/s
            }
             

        Aggregation 
        --------------------------
                - has-a relationship
                - a relationship which can be entirely independent 


        Composition
        ------------------------------
                - the objects are dependents, an object cannot be exist without the dependent object 
                - stronger form of aggression 
                - one object has owenership over another object

                class Engine {

                }

                class Car {
                    has-a Engine
                }

    Inheritance 
    -------------------
        - reusability 
        - maintainability 
        - extendibility 

    - inheriting members (public) of the superclass in subclass 
    - inheritance creates IS-A relationship between classes 
    - using the 'extends' keyword we can inherit a class to another class 
    - in java, we can extend only 1 class at a time 

            BankAccount
                |
                |-customerID
                |-AccountNo
                |-openAcc()
                |-closeAcc()
                |-deposit()
                |-withdraw()
                |
    ------------------------------------------------------------
    SavingAcc           CurrentAcc              FixedDepositAcc
      |-                    |                       |
      |
--------------
SalaryAcc   NormalSavingAcc


    - SavingACC Is-A BankAccount
    - SalaryAcc IS-A SavingAccount
    - SalaryAcc IS-A BankAccount

    **IMP: A variable of superclass can reference to an object of subclass
    **IMP: A variable of interface can reference to an object of it's implementation class

        BankAccount bankAcc = new BankAccount();

        SavingAcc savingAcc = new SavingAcc();

        BankAccount bankACc = new SavingAcc();

         BankAccount bankACc = new SalaryAcc();





                Customer customer = new Customer();     //













    class BankAccount {
        private int accountNo;
        private double balance;

        public void setBalance(double amount){      //-200
            //logic to validate the input 
            this.balance = amount;
        }
    }




Inheritance 
-----------------------------



Abstract Classes & Abstract Methods 
-----------------------------------------
    - a class defined using 'abstract' keyword 
    - we cannot create instance of abstract class 
    - abstract classes created to act only as a superclass, with common properties/methods to be inherited by their subclasses
    - abstract class constructors are invoked by the subclass


Abstract methods
-------------------------
    - if a class has an abstract method, then the class must be marked 'abstract'
    - an abstract has no definition

        public abstract void methodA();
    - an abstract method must be overridden by its immediate child class 


Interface
------------------------
    - in interface is similar to a class
    - interface contains only public abstract methods and public final data members
    - a class can implement the interface using 'implements' keyword and can override the   methods 
    - a class can implment several interfaces 
    - an interface can extend from several interfaces

    **IMP : interfaces are used to define set of requirements a class has to implement

        interface Taxable {

            //public final variables 

            //public abstract methods
            public abstract double calculateTax(double taxRate);
        }

        interface Discountable{

            public abstract double calculateDiscount(double discountRate);
        }

        class ElectronicProduct extends Product implements Taxable, Discountable {

        }

        class HomeDeliveryService implements Taxable {

        }


Method Overrideing 
-------------------------
    - when a superclass method is re-defined in the subclass using the exact same signature, it is called method overriding 
    - we can override the methods of superclass to have child specific behavior of the same method


    *IMP: rules for method overriding 

        rule1: only inherited methods can be overridden 
                    - only public, protected and default methods of the superclass 
                            can be overridden 

                    class A {
                        
                        public void methodB(){

                        }

                        public final void methodE(){

                        }

                        void MethodC(){

                        }

                        protected void methodD(){

                        }

                        private void methodA(){

                        }
                    }

                    class B{

                    }


             Rule 2: Final and static methods cannot be overridden 

             Rule 3: the overriding method must have same signature (same arguments)
                         as the superclass 

                    class A {

                    }

                    class B {

                    }

            Rule 4: overriding method must have the same return type or subtype of the       returntype

                    class A {

                        public User getUser(String userId){

                        }
                    }

                    class B {

                        public Customer getUser(String userId){
                            
                        }

                        //public User getUser(String userId){
                            
                        }
                    }

            Rule 5: overriding method must not have more retrictive access modifier

                    class A {

                        protected void methodA(){

                        }

                    }

                    class B {

                         public void methodA(){
                            
                        }
                    }

                    default --> default, public, protected
                    public --> public
                    protected ---> protected, public 

            Rule 6: overriding method must not throw exception or broder exceptions 
                    class A {

                        protected void methodA() throws RuntimeException {

                        }

                    }

                    class B {

                         public void methodA() throws RuntimeException {
                            
                        }
                    }




inner classes / nested classes
-------------------------------------




interface Singer {

    void sing();
}

interface Dancer{

    void dance();
}

interface TalentedStudent extends Singer, Dancer {

}



class Student implements TalentedStudent {

}

String in java 
------------------
    - in java, the String class (java.lang package) is used to construct a 'string'
    - in java, String objects are 'immutable' 
        - string objects cannot modified 

        String str = "Welcome";

    - String Pool
        - separate section in the heap memory, where all the string objects are stored 
            - the string objects those are created using 'string literal'
        - whenever we create a new string literal, if the same string exists in the pool
            JVM will return the ref to that object, instead of creating new objects every time
        - ** creating a string using 'new' keyword will create the object in the heap memory

    String class methods 
    --------------------------------

            boolean equals(String str)

            boolean equalsIgnoreCase(String str)

            int compareTo(String str)
             -** compares the string with the given value and return a 'compare value' as in

                > 1         - the string is greater than the given string

                < 1         - the string is less than the given string

                0           - both values are same


            int indexOf(String st)

            char charAt(int index)

            boolean startsWith(String str)

            boolean endsWith(String str)
            
            String	concat(String str)

            String	replace(char oldChar, char newChar)     //welcome 

                    replace('x', '*')

            String	replace(CharSequence target, CharSequence replacement)
                    Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.

            String[]	split(String regex)
                    Splits this string around matches of the given regular expression.

            String	substring(int beginIndex)
                    Returns a string that is a substring of this string.

            String	substring(int beginIndex, int endIndex)
                    Returns a string that is a substring of this string.

            String	toLowerCase()
                    Converts all of the characters in this String to lower case using the rules of the default locale.

            String	toUpperCase()
                    Converts all of the characters in this String to upper case using the rules of the default locale.

            String	trim()
                    Returns a string whose value is this string, with any leading and trailing whitespace removed.


        StringBuilder and StringBuffer 
        ----------------------------------
            - both the classes are used to construct a 'mutable' string 

                StringBuilder sb = new StringBuilder("Welcome");

                StringBuffer sb = new StringBuffer("Welcome");


       Handling Dates in Java 
       ------------------------------

            using java.util.Date class 
            ----------------------------


            


            using Date and Time API (Java 8)
            -----------------------------------


        Regular Expression
        --------------------------
              REF:   https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

            - A regular expression (regex) defines a search pattern for strings

            [abc]  - 

            [a-z] - 

            [A-Z] - 

            [0-9]   - 

            [0-9]{9} - 

            [^abc] 

            [^0-5] 





            



 String data = "Participant ID: 12345, Age: 29, Gender: M, Result: Positive\n" +
                      "Participant ID: 67890, Age: 35, Gender: F, Result: Negative\n" +
                      "Participant ID: 54321, Age: 41, Gender: M, Result: Positive";


        String participantPattern = "Participant ID: (\\d+), Age: (\\d+), Gender: (\\w), Result: (\\w+)";



//locate specific log information based on a pattern.
 String logData = "2023-11-01 10:12:34 INFO User JohnDoe logged in\n" +
                         "2023-11-01 10:15:40 ERROR Database connection failed\n" +
                         "2023-11-01 10:18:12 INFO User JaneSmith logged out";

        String logPattern = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) (INFO|ERROR) (.+)";
        Pattern pattern = Pattern.compile(logPattern);
        Matcher matcher = pattern.matcher(logData);

        while (matcher.find()) {
            System.out.println("Date: " + matcher.group(1));
            System.out.println("Level: " + matcher.group(2));
            System.out.println("Message: " + matcher.group(3));
            System.out.println();
        }




//pattern matching to validate the format of a phone number.
String phoneNumber = "(123) 456-7890";
        String phonePattern = "\\(\\d{3}\\) \\d{3}-\\d{4}";

        if (Pattern.matches(phonePattern, phoneNumber)) {
            System.out.println("Valid phone number format.");
        } else {
            System.out.println("Invalid phone number format.");
        }

//locate email addresses in a text using regular expressions.
String text = "Contact us at support@example.com or sales@company.org.";
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found Email: " + matcher.group());
        }

String data = "Participant ID: 12345, Age: 29, Gender: M, Result: Positive\n" +
                      "Participant ID: 67890, Age: 35, Gender: F, Result: Negative\n" +
                      "Participant ID: 54321, Age: 41, Gender: M, Result: Positive";

    print count of participants having age beween 25-30, 30-35, and above 35
    print count of participants by gender 
    print count of positive and negative results 


PostIncrement 

    int i = 10;
    int j = i++;        //use the value of i first in the expression, then increment

    sysout("i = " + i);     //11
    sysout("j = " + j);     //10

PreIncrement 

    int i = 10;
    int j = ++i;        //first increment the value of i, then use it in the expression

    sysout("i = " + i);     //11
    sysout("j = " + j);     //11



    class Car {
        brand
        seatingCapacity
        tpye
        ..
        ..

        public abstract move();
    }

    class BMWCar extend Car {
        public move(){
            ..
            ..
            "this car moves fast"
        }
    }

    class MercedesCar extends Car{
        public move(){
            ..
            ..
            "this car moves fast and smooth"
        }
    }

        Car car = null;
        
        
        car =  new BMWCar()
        car.move();


        car = new MercedesCar()
        car.move();


interface <InterfaceName>{
    method1();
    method2();
    method3();
}




Wrapper classes
-----------------------
    - in java, for each primitive type i.e. int, byte, char etc there is a 
        corresponding Refernce type (Class) avaialble  i.e. Integer, Byte, Character etc
    - wrapper classes are used to represent a primitive as an object

        byte            Byte 
        short           Short 
        int             Integer
        long            Long 
        float           Float
        double          Double 
        char            Character 
        boolean         Boolean


        Integer integer = 23;

        **Auto-boxing 

        **un-boxing 


Object class
----------------
    - it is implicitely superclass for all the classes in java

class Object {

    boolean equals(Object o)
   
    int hashCode()

    String toString()

    wait()
    notify()
    notifyAll()

}

class String {

    //String class has already overridden the methods of the object class

}

class Employee {
     String toString(){

     }
}


    **IMP: overriding the 'toString()' 
    -----------------------------------------
        - to return a string representation of the object
        - Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object

    **IMP: overriding the 'equals(Object o)' method
    --------------------------------------------
        - to compare two objects of the same type   
        - while overriding the equals() you must satisfy the guidelies as per the 'equals() contract' 

        - The equals() contract in Java is a set of rules that the equals() method must follow to ensure that objects are compared correctly. These rules are:
            Reflexive: For any reference value x, x.equals(x) must return true
            Symmetric: For any reference values x and y, x.equals(y) must return the same value as y.equals(x)
            Transitive: For any reference values x, y, and z, if x.equals(y) and y.equals(z), then x.equals(z)
            Consistent: For any reference values x and y, the results of x.equals(y) must remain the same as long as the equals method is not modified
            Null Handling: For any non-null reference value x, x.equals(null) must return false 


    What is hashCode?
    ------------------------
        - hashCode is a number used to identify an object during it's execution
        - If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.
    - 

  **IMP: equals() and hashCode() contract
    ---------------------------------------------
        - when equals() method is overriden in a class, hashCode() must also be overriden
        



Collection Framework in java
------------------------------------
    - collections are used to create group of "objects"
    - **IMP: we cannot store primitive values in collection

                interface Iterable<E>
                        |-> Iterator<T>	iterator()
                        |
                interface Collection<E> 
                        |
                        | -> boolean add(E e)
                        | -> boolean	addAll(Collection<? extends E> c)
                        | -> void clear()
                        | -> boolean contains(Object o)
                        | -> boolean isEmpty()
                        | -> boolean remove(Object o)
                        | -> int size()
                        | -> 
                        |
        ---------------------------------------------------------------------------------
 List<E> interface                       Set<E> interface                Queue<E> interface
| void	add(int index, E element)                                                   |
| E	remove(int index)                                                       ----------        
| ListIterator<E>	listIterator()                                Deque<E>  BlockingQueue<E>
| Iterator<E>	iterator()                                                          |
                                                                        BlockingDeque<E> 


    Collection<T> interface 
        -- super interface for all the sub interfaces like List, Set, and Queue
        - The root interface in the collection hierarchy.

    List<E> interface
        - sub interface of Collection<E>, which models An ordered collection (also known as a sequence) of  objects

        - List allows duplicate elements 

                    List<E> interface
                        |
                        |
                    ArrayList<E>
                    LinkedList<E>
                    Stack<E>
                    Vector<E>
                    CopyOnWriteArrayList<E>


    - below are the List implementation classes 

            ArrayList<E>
                - internally uses 'resizable-array' as a data structure 
                - default capacity of arraylist is 10
                    
            LinkedList<E>    
                - internally uses 'double linked list' data structure 
                - faster than ArrayList, because it doesn't require shifting of elements while inserting/removing elements from the collection   
                    
            Vector<E>
                - internally uses 'resizable-array' as a data structure
                - Vector is thread-safe / synchronized 

            Stack<E>
                - internally uses 'resizable-array' as a data structure
                - uses LIFO approach
                - The Stack class represents a last-in-first-out (LIFO) stack of objects

            
            CopyOnWriteArrayList<E>



        - how to create a list 
        -----------------------

            ArrayList list = new ArrayList();       //non-generic list, allows to store 
                                                        //any type of elements 

            LinkedList list = new LinkedList();

            ArrayList<Integer> numsList = new ArrayList<>();        //generic list

            ArrayList<Student> studList = new ArrayList<>();

            List<Student> studList = new ArrayList<>();

        - basic operations on lists
        -----------------------------
                - adding an element 

                            boolean add(E e)
                            void add(int index, E e);
                            void addAll(Collection c);

                - removing an element from a list 

                            - boolean remove(Object o)
                            - E	remove(int index)

                - iterate over a list 
                    - using a classic for loop
                    - using enhaned for loop
                    - using iterator

                - search / find the given element 

                        boolean contains(Object o)

            **IMP: the contains() method internally uses the 'equals()' method to compare the given object with all other objects in the list


    Set<E> interface 
        - sub interface of Collection<E>, which model collection of unique objects 

                 
                 Set<E> interface
                        |
                        |
             ----------------------------------------------------
             HashSet<E>                     SortedSet<E> interface
                |                                   |
            LinkedHashSet<E>                   NavigableSet<E> interface 
                                                    |
                                                TreeSet<E>

        - Below are the Set implementation classes 

            HashSet<E>  
                - internal data structure = hashtable
                - doesn't gurantee the order of insersion 

            LinkedHashSet<E> 
                - internal data structure = hashtable + double linked list
                - maintains insertion order

            TreeSet<E>
                - internal data structure = balanced tree
                - maintains sorted order of elements 




    Queue<E> interface
        - - sub interface of Collection<E>, which models a collection where objects are stored in the form of a queue, with FIFO approach



    Map<K,V> interface
    ------------------------
        - Map<k, V> inteface is used to model a collection of objects stored using
                key-value pairs 




Object class {

    int hashCode()
    boolean equals(Object obj)
}

class Movie{

    int hashCode(){
        return movie.name.length()
    }

    boolean equals(Object obj){

    }
}


    Gujarish        Andhadhundh         DeadPool        Raw     War   Gajni
    Mummy   Daddy       Mummy


        3       -> Raw      -> War 

        5       -> Gajni  -> Mummy -> Daddy  

        8       -> Gujarish -> DeadPool

        11



   interface Comparable<T>
   --------------------------
    - describes a method, which should be overridden by a class to provide the logic for sorting objects
    - the compareTo() should return an integer representing the 'compare value' which is used while sorting


            interface Comparable<T>{

                int compareTo(T t);
            }

    interface Comparator<T> 
    -----------------------------
        - it is used to create multiple external comparators 

              interface Comparator<T>{

                int compare(T t1, T t2);
            }


     Map<K,V> interface
    ------------------------
        - Map<k, V> inteface is used to model a collection of objects stored using
                key-value pairs 

        - implementation classes of Map interface

            - HashTable<K,V>
                - doesn't allow null keys

            - HashMap<K,V>
                - doesn't gurantee order of insertion
                - allows one null key

            - LinkedHashMap<K,V>
                - maintains order of insertion by keys

            - TreeMap<K,V>
                - maintains sorted order of 'keys'


            Map map = new HashMap();

            Map<Integer, String> map = new HashMap<>();

            Map<Integer, Employee> map = new HashMap<>();

            Map<Manager, List<Employee>>map = new HashMap<>();



        iterate over a map
        ------------------------

                1. Collection<V> values()

                2. Set<K> keySet()

                3. entrySet()


    Functional Programming in Java
    -----------------------------------


        **IMP: Functional Interfaces in java 
        -----------------------------------------
                - an interface that has only 1 abstract method is called as functional
                    interface 


                - pre-defined functional interfaces 

                    -> Comparator<T> interface

                    -> Predicate<T> interface 
                        - Represents a predicate (boolean-valued function) of one argument.

                        interface Predicate<T>{
                            boolean test(T t);
                        }

                    -> Function<T, R> interface
                        - Represents a function that accepts one argument and produces a result
                        
                        interface Function<T, R>{
                            R apply(T t)
                        }

                    -> Interface Consumer<T>
                            - Represents an operation that accepts a single input argument and returns no result.

                            void accept(T t)

                    -> Interface Supplier<T>
                            - represents a method that returns a value of type T, no arguments
                           
                            T	get()

                    - Interface Collector


        **IMP: Lambda Expressions in Java
        ------------------------------------------



        Stream API
        ---------------------
            - stream api is used to perform processing / operations on Strings, arrays
                and collections 
            - allows us to perform functional-style operations on collections, arrrays, strings
            - Streams are sequences of data processed in a pipeline, and operations are performed lazily to optimize performance.

            - a stream represents a sequence of elements supporting sequntial 
                    or parallel operations 

            Map<String, Integer> carMap = ....


            String name = "amaze";

            for(iterate over each entry in the map){

                if(entry.getKey().equalsIgnorecase(name)){
                    return true;
                }
            }

            false;

           Set<String> keySet = carMap.keySet();

            Predicate<Integer> predicate = value -> value > 10;

            Predicate<String> predicate = 

           keySet.stream()
                    .anyMatch(carName -> carName.equalsIgnoreCase(name))
                     


        Create Stream
        ---------------------------

                a. obtaining a stream from an array
            
                        int[] array = {23,32,23,54,45,45};

                        Arrays.stream(array)

                        Stream.of(array)

                b. obtaining a stream from a file



                c. obtaining a stream from a string 

                         String str = "Wecome";
		 
		                 Stream.of(str);


                d. obtaining a stream from a collection

                        List<String> names = ....

                        names.stream()


        Stream Pipeline
        --------------------------
            - a stream is a pipeline of aggregate operations that can be evaluated 

            - a source : can be a collection, an array, I/O channel, or string 

            - zero/more intermedicate operations: produce a new stream i.e. filter, map, sorted etc.

            - a terminal operation: produces a non-stream result such as 
                    primitive value, a collection or void 


        Types of operations performed on streams
        -------------------------------------------

            1. intermediate operations 
                    - produces a new stream, 

                    a. Stream filter(Predicate)
                            The filter() operation returns a new stream that consists elements matching a given condition which is typically a boolean test in form of a Lambda expression.

                    b. Stream map(Function)
                        - The map operation returns a new stream consisting of elements which are the results of applying a given function to the elements of the current stream. 

                        •	mapToInt(): transforms a stream of objects to a stream of int primitives.
                        •	mapToLong(): transforms a stream of objects to a stream of long primitives.
                        •	mapToDouble(): transforms a stream of objects to a stream of double primitives.


                    c.Stream sorted(): sorts by default natural ordering
                        •	Stream sorted(comparator): sorts by a comparator


                    d. Stream limit()
                        - The limit() operation returns a stream containing only a specified number of elements

                    e. Stream distinct()
                            - The distinct() operation returns a stream consisting of the distinct elements (no duplicates) by comparing objects via their equals() method.

                    f. Stream skip()
                        -  The skip() operation returns a stream containing the remaining elements after discarding the first n elements of the stream.

            2. terminal operations 

                    - produces a non-stream value, primitive, a collection or void
                    - a stream pipeline always ends with a terminal operation which 
                        returns a concrete value

                    a. boolean allMatch(Predicate)

                    b. boolean anyMatch(Predicate)

                    c. boolean noneMatch(Predicate)

                    d. long count()
                         - The count() operation simply returns total number of elements in the stream. 

                    e. void forEach(Consumer)

                    f. R collect(Collector) 
                        - The collect() operation accumulates elements in a stream into a container such as a collection. 

                        Collectors  class
                        -----------------------

                            - groupingBy
                                    - Returns a Collector implementing a "group by" operation on input elements of type T, grouping elements according to a classification function, and returning the results in a Map.

                                    groupingBy(Function)

                                    Counting elements in each group:
                                    
                                    Map<String, Long> countByDepartment = people.stream()
                                            .collect(Collectors.groupingBy(Person::getDepartment, Collectors.counting()));

                                    Finding the highest-paid employee in each department:
                                        Map<String, Optional<Person>> highestPaidByDepartment = people.stream()
                                            .collect(Collectors.groupingBy(Person::getDepartment, 
                                                                        Collectors.maxBy(Comparator.comparing(Person::getSalary))));

                            - partitionBy
                                    The partitioningBy collector is similar to groupingBy, but it divides elements into two groups based on a predicate. It produces a Map<Boolean, List<T>>, with keys true and false.

                                Suppose you want to partition people based on whether their salary is above 50,000:
                                        Map<Boolean, List<Person>> partitionedBySalary = people.stream()
                                            .collect(Collectors.partitioningBy(person -> person.getSalary() > 50000));
                                            

                            - counting 

                                    long count = people.stream().collect(Collectors.counting());

                            - mapping 

                                - The mapping collector transforms the elements before collecting them, often used as a downstream collector for groupingBy.
                                - Suppose you want to group people by department and get a list of names in each department:

                                Map<String, List<String>> namesByDepartment = people.stream()
                                    .collect(Collectors.groupingBy(Person::getDepartment, 
                                                                Collectors.mapping(Person::getName, Collectors.toList())));


                            - joining
                                - The joining collector concatenates strings. It is especially useful for joining values with delimiters.

                                String names = people.stream()
                                                .map(Person::getName)
                                                .collect(Collectors.joining(", "));

                            - comparing 

                            - maxBy(comparator)

                            - minBy(comparator)

                            - toMap
                                - The toMap collector collects elements into a Map and allows you to specify keys and values.

                                    Map<String, Person> personMap = people.stream()
                                         .collect(Collectors.toMap(Person::getName, person -> person));

                            - toSet

                            - toList

                    g. Optional  min(comparator) 
                            The min(comparator) is a special reduction operation that returns the minimum element in the stream according to the provided comparator. 

                    h. Optional max(comparator)

                    i. reduce()

        Method References in java
        -----------------------------------
            - Method references in Java provide a shorthand syntax for calling a method by referring to it directly, rather than invoking it explicitly. 

        1.	Reference to a static method

                class A {

                    

                    public static int square(int number){ 
                        return number * number;
                    }

                    number -> number * number;
                    
                   

                    psvm(){
                        Function<Integer, Integer> function =    A::square;
                    }
                }


        2.	Reference to an instance method of a particular object

                    public class Greeting {
                        
                        public String sayHello() {
                            return "Hello!";
                        }

                     public static void main(String[] args) {
                            Greeting greeting = new Greeting();

                            Supplier<String> supplier = greeting :: sayHello
                            supplier.get()

                     }


                    }


        3.	Reference to an instance method of an arbitrary object of a particular type

                public class MethodReferenceExample {
                    public static void main(String[] args) {
                        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

                        // Method reference to an instance method of an arbitrary object of a particular type
                        names.forEach(String::toUpperCase);
                        names.forEach(System.out::println)
                    }
                }
In this example, String::toUpperCase is a method reference to the toUpperCase method of each String object in the list. It’s equivalent to (name) -> name.toUpperCase().

        4.	Reference to a constructor


                class Employee {
                    public Employee() {
                        System.out.println("Employee created!");
                    }
                }

                public class MethodReferenceExample {
                    public static void main(String[] args) {
                        // Using method reference to refer to a constructor
                        Supplier<Employee> employeeSupplier = Employee::new;
                        
                        Employee emp = employeeSupplier.get();
                    }


    Exception Handling 
    -----------------------


            a. problem occurs 
            b. inform the error has occured - new object of exception and throw it
            c. receive the error information - catch the exception in the 'catch' block
            d. take corrective actions - handle the exception 



                Throwable (superclass)
                    |
    --------------------------------------------------------------------
    Exception class                                             Error class
        |                                                        - represents serious problems
        |                                                                |
        |                                                            OutOfMemoryError
        |                                                       StackOverflowError
        |                                                       VirtualMachineError
        |
        |
---------------------------------------------------------------------------------------------
RuntimeExpcetion                IOException             SQLException           InvalidAgeException     ..      ..
   |
   |->ArrayIndexOutofBoundsExpcetion
   |->NullPointerException
   |->InputMismatchException
   |->ArithmeticException
   |->IllegalArgumentException
   |->...


   **IMP: Checked Expcetions 
            - all the checked exceptions must be handled using try-catch block or declared to be thrown

   **IMP Unchecked exceptions 
            - are not necessarily be handled using try-catch block, they can be handled by the "default exception handler"
            - all the RuntimeExpcetions are unchecked


    "default exception handler"
    ----------------------------------
        - the default exception handler is a part of the runtime system that handles exceptions that are not caught by any other exception handler
        - How it works
            When an exception occurs in a method, the method creates an exception object that contains information about the exception, such as its name, description, and location. The method then passes the exception object to the Java Virtual Machine (JVM). 
        - What happens next
            The JVM searches the call stack for a method that contains an exception handler. If it finds a handler, the exception is moved to that handler. If no handler is found, the JVM continues searching up the call stack, moving to the caller method, and so on. 
        - What happens if no handler is found
            If no handler is found by the time the main() method is reached, the JVM delegates the exception to the default exception handler. The default exception handler prints the exception information to the console and stops the program abnormally


    try-catch block 
    -----------------------
        - used to handle the exeption 
        - use the 'try' block for the code to be monitored 
        - use the 'catch' block for handling the exception and take corrective actions

    throw keyword
    -----------------
        - used to create and throw an object of exception, in case something goes wrong based on the business logic 


    throws keyword
    --------------------
        - it declars the exception to be handled either by developer (try-catch) or the default exception handler


    finally 
    --------



    Comparator<Employee> comparator = new Comparator<Employee>(){

        public int compare(Employee e1, Employee e2){
            //..
            //..
        }

    };
    
    Comparator<Employee> comparator = (Employee e1, Employee e2){
            //..
            //..
        };

    class EmployeeComparator implements Comparator<Employee>{
        public int compare(Employee e1, Employee e2){
            //..
            //..
        } 
    }




   interface Runnable 
   ------------------------
    - Runnable interface is used to represent a 'task' that can be executed inside  a thread

    Runnable runnable = new Runnable(){
        @override
        public void run(){
            //code that could be executed inside a thread
        }
    };

    class MyTask implemenets Runnable{
        @override
        public void run(){
            //code that could be executed inside a thread
        }
    }

    Thraead thread = new Tread(new MyTask())

    Thread thread = new Thread(new Runnable(){
        @override
        public void run(){
            //code that could be executed inside a thread
        }
    });

    Thread thread = new Thread(()- > {
            //code that could be executed inside a thread
        })

    Thread
    ---------
        - sub process


    Thread class 
    ---------------



    Thread class methods 
    -----------------------------
        static sleep();



    How to create a thread in java
    ---------------------------------------

            Thread thread1 = new Thread(Runnable)

            class MyThread extends Thraed{

                //override run
                public void run(){

                }
            }

            Thread thread1 = new MyThread();

    start a thread
    ------------------------
        thread.start();

    * How to pause a thread:
        You can make the currently running thread pauses its execution by invoking the static method sleep(milliseconds) of the Thread class. Then the current thread is put into sleeping state. Here’s how to pause the current thread:

    * How to interrupt a thread:
        Interrupting a thread can be used to stop or resume the execution of that thread from another thread. 


    * How to make a thread waits other threads?
        This is called joining and is useful in case you want the current thread to wait for other threads to complete. After that the current thread continues running. For example:
                        t1.join();
        This statement causes the current thread to wait for the thread t1 to complete before it continues. In the following program, the current thread (main) waits for the thread t1 to complete:



SQL - structured query language 
    - it is language to interact with the "relational" database i.e. mysql, oracle, postgresql, etc.

    1. DDL (data definition language) operations
        - define and modify the structure of the database objects (i.e. tables, indexes, views, etc.)
        - i.e create table, alter table, drop table, truncate table

    2. DML (data manipulation language) operations  
        - manipulate data withing the database tables
        - i.e. INSERT, UPDATE, DELETE records

    3. DQL (data query operations) operations
        - retrieve data from the database 
        - i.e. SELECT, WHERE, ORDER BY, GROUP BY

    4. DCL (data control language) operations
        - manage access to the database, such as granting and revoking permissions 
        - i.e. GRANT, REVOKE 

    5. TCL (Transaction control language) operations
        - control transactions to maintain data integrity and consistency 
        - i.e. BEGIN/START TRANSACTION, ROLLBACK, SAVEPOINT, COMMIT

    6. Indexing and optimization operations 
        - improve database performance, particularly data retrieval operations
        - speed up the search we can create indexes
        - i.e. CREATE INDEX, DROP INDEX

    7. Operations related Views, stored procedures, functions

    
    8. Contraints and Schema management operations
        - common constraints 
            - PRIMARY KEY - ensure each row in a table is unique, 
                            - it is used to represent a unique identifier for a row
                            - each table can have only 1 primary key, (which can be single column or combination of columns)
                                - simple primary key
                                - composite primary key

            - FOREIGN KEY - link two tables, represent relationship between tables
            - UNIQUE - ensure unique values in a column
                        - a table can have multiple unique columns
            - CHECK     - validate data based on condition
            - DEFAULT  - provides a default value for a column



    product table
----------------------
    PK                             UNIQUE
    id      prodname    price       sku     QRCODE      attributes      description
    1                           
    2
    3




            Iterable 
                 |
            Collection interface 
                |
    --------------------------------------------
    Queue<E> interface                  List                Set
        |
    -----------------------------------------------------------------
    Deque<E> interface           BlockingQueue<E> interface        PriorityQueue<E> class
       |
    --------------------------
    BlockingDeque<E> interfaces


    Queue<E> interface implementation classes 
    ------------------------------------------------

       ▪+ LinkedList: this class implements both List and Deque interface, thus having hybrid characteristics and behaviors of list and queue. Consider using a  LinkedList when you want fast adding and fast removing elements at both ends, plus accessing elements by index. 
 
        ▪	+ PriorityQueue: this queue orders elements according to their natural ordering, or by a Comparator provided at construction time. Consider using a PriorityQueue when you want to take advantages of natural ordering and fast adding elements to the tail and fast removing elements at the head of the queue. 
 
        ▪	+ ArrayDeque: a simple implementation of the Deque interface. Consider using an ArrayDeque when you want to utilize features of a double ended queue without list-based ones (simpler than a LinkedList). 


        Concurrent Queue implementations: 
            ▪	+ ArrayBlockingQueue: this is a blocking queue backed by an array. Consider using an ArrayBlockingQu0eue when you want to use a simple blocking queue that has limited capacity (bounded). 
 
            ▪	+ PriorityBlockingQueue: Use this class when you want to take advantages of both PriorityQueue and BlockingQueue. 
 
            ▪	+ DelayQueue: a time-based scheduling blocking queue. Elements added to this queue must implement the Delayed interface. That means an element can only be taken from the head of the queue when its delay has expired. 




    Queue interface’s Methods
    -----------------------------
        insert operations           : add(e)                    offer(e)

        remove operation            : remove()                  peek()

        examine operations          : element()


    Deque<E> interface methods
    ------------------------------
        insert operations           : add(e)                    offer(e)
                                      addFirst(e)               offerFirst(e)
                                      addLast(e)                offerLast(e)

        remove operation            : remove()                  peek()
                                      removeFirst()             pollFirst()
                                      removeLast()              pollLast()

        examine operations          : element()                 getLast() peekLast() 
                                      getFirst() 
                                      peekFirst() 

    BlockingQueue interface’s methods
    ----------------------------------------
        insert operations           : add(e)                    offer(e)                put(e)

        remove operation            : remove()                  peek()                  take()

        examine operations          : element()                 poll()


    BlockingDeque interface’s method
    ----------------------------------------
     insert operations           : add(e)                    offer(e)                put(e) 
                                     addFirst(e)               offerFirst(e)
                                      addLast(e)                offerLast(e)

        remove operation            : remove()                  peek()                  take()
                                      removeFirst()              pollFirst()
                                      removeLast()              pollLast()

        examine operations          : element()                 poll()





            Set<E> interface
                |
                |
            -------------------------------------------
            HashSet<E> class                    SortedSet<E> interface
                |                                   |
                |                                   |-> SortedSet subSet(E fromElement, E toElement); 
               |                                    |-> SortedSet headSet(E toElement); 
                 |                                  |-> SortedSet tailSet(E fromElement); 

            LinkedHashset<E> class                  |
                                                NavigableSet<E> interface
                                                    |-> lower(e)
                                                    |-> floor(e)
                                                    |-> ceiling(e)
                                                    |-> higher(e)
                                                    |-> descendingSet(): 
                                                    |-> descendingIterator()
                                                    |
                                                TreeSet<E> class



    JDBC 
    -------
     - java database connectivity 
     - JDBC is just a specification / standard for the DB Systems
     - jdbc is a standardized api for db operations
     - supports multiple db through drivers


    - jdbc architecture 
        - API Layer
        - Driver Manager
        - Database specific drivers 
        - Database engine i.e. mysql, postgresql, h2, ms sql server, oracle etc.

    

     - Driver interface 
        - - **IMP: Every DB system implements these specifications and provide 'Driver' class which is actually responsible to communicate with the db 

    - There are 4 types of drivers

        TYPE 1 DRIVER 
            - JDBC-ODBC Bridge Driver)


        TYPE 2 DRIVER 
            - (Native-API, mostly c/c++ libraries)


        TYPE 3 DRIVER 
            - network driver / (JDBC-Net, Pure Java driver)

        **TYPE 4 DRIVER
        -------------------
            - Thin Driver / (NATIVE-PROTOCOL, Pure Java driver)


- database systems 
    - RDBMS databases 
        Here are some relational database management systems (RDBMSs):
        - MySQL: An open source RDBMS that's known for its speed, reliability, and usability 
        - PostgreSQL: A popular RDBMS 
        - MariaDB: A popular RDBMS 
        - Microsoft SQL Server: A complex RDBMS that offers full control 
        - Oracle Database: An RDBMS that's known for its scalability, security, and varied feature set 
        - Azure SQL: A cloud-based RDBMS from Microsoft that's used for small database applications 
        - IBM Db2: An RDBMS from IBM that supports object-relational and non-relational structures 
        - SQLite: A public domain database engine that belongs to the embedded, relational database management - systems family 
        - Redis: An open source, NoSQL, key-value database management system 
        - Elasticsearch: A distributed, RESTful search and analytics engine

    - NON-RDBMS databases / NO-SQL databases 
        - mongoDB
        - dynamoDB
        - couchDB
    

        DriverManager class 
        ----------------------
            - manages the driver classes 

        Connection class 
        ------------------------
            - represents the connection with the db

        Driver Class 
        -------------
            - responsible to communicate with the db

        
        Statement class 
        -----------------
            - represent a sql command  / sql instructions and execute the commands




        Database url patterns and drive classes 
        ----------------------------------------------

        postgreSQL          jdbc:postgresql://localhost:5432/<<dbname>>             org.postgresql.Driver

        h2 database         jdbc:h2:~/test                                          org.h2.Driver

        mysql database      jdbc:mysql://localhost:3306/<<dbname>>                  com.mysql.cj.jdbc.Driver

       

       Steps to connect with the database
       -----------------------------------------

        1. load the driver class 

                Class.forName("DRIVER CLASS NAME");

        2. establish / create connection with the database 

                    DriverManager.getConnection("URL","USERNAME","PASSWORD");    
            
        3. create a Statement object to represent sql commands 

             Statement statement =   connection.createStatement();


        4. execute the statement 

                int executeUpdate(String sql)
                    - INSERT, UPDATE OR DELETE operations
                    - it performs the INSERT/UPDATE/DELETE operation and returns an int representing the number of rows affected

                ResultSet executeQuery(String sql)
                    - SELECT

                boolean execute(String sql)

        5. close the connection



            Statement  
                |-> 
                |-> int executeUpdate(String sql)
                |-> ResultSet executeQuery(String sql)
                |-> boolean execute(String sql)
                |
                |
            PreparedStatement  
                | -> it represents pre-compiled and parameterized query
                |
                |-> int executeUpdate()
                |-> ResultSet executeQuery()
                |-> boolean execute()
                |
                |
            CallableStatment 
                |
                |-> boolean execute(String str)



    
    BO - business objects 


    DAO - Data access objects 


    DTO - data transfer objects 


    SO - service objects 


    VO - value objects 

    

    JDBC Classes and interfaces
    ---------------------------------
        - DriverManager  class - manages the driver and connection
        - Connection interface - represent a 'connection' with the db 
        - Statement interface - represents a 'statement object'
        - PreparedStatement - represents 'statement' that has a pre-compiled / parameterised query
        - CallableStatement - it used to invoke functions/procedures
        - ResultSet - represents set of table of data retrieved from the db
                   ResultSet rs =         statement.executeQuery("selectcommand")

        - ResultSetMetaData - represents data about the resultset

        - DatabaseMetaData - represents info about the db

            "Select a, b, c, d, from XYZ where someconditionmeets"

            "Select a, b, c from XYZ where someconditionmeets"


    CRUD Operations
    ------------------------------
        - INSERT 

        - UPDATE 

        - DELETE

        - SELECT 


    Handling ResultSet
    --------------------------------
        - getter methods - i.e. rs.getString("columnname"), rs.getInt("columnname"), ... : read data from resultset  

        - boolean .next() - advances the cursor to the next row, return true if row is available 


    ORM Frameworks - 
    --------------------------
        - Hibernate 
        - TopLink
        - iBatis


    JPA - Java persistence API
    ----------------------------------------
        - JPA is standard/specification for managing "relational data" in java applications
        - it provides the standard for ORM (Object Relation mapping) frameworks 

        - Maps java objects to database tables
        - uses annotations for configurations
        - supports queuries using JPQL (Java persistence query language)

        - in java,                                      in database

            @Entity
            class Employee {                            employee_table

            }


    Why JPA
    ---------
        - reduces the boilerplace/low level JDBC code 
        - provides an abstraction layer for db interaction
        - works with mulitple databases

    JPA Implementations / JPA Providers 
    -------------------------
        - Hibernate JPA
        - EclipseLink
        - MyBatis 
        - OpenJPA


    Key Concepts in JPA
    ------------------------------
        - Entity : is a class mapped to a database table (is an object managed by JPA)
        - how to create Entity class
            - the class must be configured with the annotation @Entity
            - the class must define an identifier column using @Id annotation   
            - the class must have a no-arg constructor 

                    @Entity
                    class <<ClassName>> {

                            @Id
                            int id;

                            no-arg constructor

                    }
        - persistence.xml
        --------------------
            - this is a configuration file for JPA Provider

        - Define "Persistence Unit"
            - congiration for managing jpa entities


        - EntityManager
        -------------------------
            - manages the persistence


    **Reflection API
    ---------------------

    **Proxy Instances / objects
    -----------------------------


    Spring Framework
    ---------------------------
        - standardizes the process of developing the application s
        - spring framework is widely used framework for "enterprise java development".
            - it supports robust,scalable and "loosely coupled application"
        - key features of spring 
            - "DI - Dependecy injection" - enables loose coupling by injecting object dependencies into other objects 
            - "IOC" - shifts the control of object creation and life cycle management to Spring container
    
        - Spring Core 
            -> provides fundamental features of spring framework 
                - IOC - inversion of control
                - Depedency injection

        - Spring WEB 
            -> Spring MVC - used to develop  web applications 
            -> Spring REST - used to develop  REST APIs
            

        - Spring Data 
            -> provides tools to interact with the database and it simplifies data access layers 
            -> Spring Data JPA
            -> Spring Data MongoDB
            -> Spring Data Redis
            -> Spring Data REST

        - Spring Cloud 
            -> supports building cloud native, distributed applications like service discovery, 
                config management services, load balancing services, api gateway services
            -> Spring Cloud Config
            -> Spring cloud Gateway
            -> Spring Cloud Netflix
            -> Spring Cloud OpenFeign
            -> Spring Cloud Circuit Breaker

        - Spring AOP 
            -> aspect oriented programming for cross-cutting concerns 
                - logging, transactino management etc.

        - Spring Boot 
            -> simplifies the configuration of your application
            -> auto-configuration

        - Spring Security 
            -> implement authentication and authorization

        - Spring Integration 

        - Spring Batch

        - Spring GraphQL



- Spring Core 
-----------------------
            -> provides fundamental features of spring framework 
            -> IoC Container, Events, Resources, i18n, Validation, Data Binding, Type Conversion, SpEL, AOP, AOT.
                
                - IOC - inversion of control
                    -> process of delegating the responsibility of creating objects to someone else 
                        i.e "IOC Container"

                    -> IoC container
                        Manages the instantiation and wiring of objects, also known as beans, and their dependencies. 
                        The IoC container uses configuration metadata, such as XML or annotations, to create, configure, 
                        and manage objects. 
                        
                        The two types of IoC containers in Spring are BeanFactory and ApplicationContext. 
                            1. Spring core container
                                Creates an extra layer to store beans and their relationships. 
                                This layer is created by scanning code and establishing hierarchical levels. 

                                BeanFactory 
                                    - XMLBeanFactory

                                ApplicationContext (interface)
                                    - ClassPathXmlApplicationContext
                                    - AnnotationConfigApplicationContext
                                    - FileSystemXmlApplicationContext
                                    - 

                            2. Web container
                                    Manages the lifecycle of servlets, maps URLs to servlets, and ensures that the requester has the correct access rights. The web container handles requests to servlets, JSP files, and other files with server-side code

                       

                                 WebApplicationContext



                - Depedency injection
                    - Dependency injection (DI) is a specialized form of IoC,


                    EmailService            
                    
                    class BankService{

                        EmailService emailService;

                        public BankService(EmailService emailService){
                            this.EmailService = EmailService;
                        }
                    }

    **IMP: POJO: Plain old java object - any class
    **IMP: Java Bean - java object that follows certain coding conventions
    **IMP: Spring Bean - java "object" managed by the IOC/Spring Container


            -> Spring Bean
            ------------------
                -> java "object" managed by the IOC/Spring Container
                -> spring beans can be configured using xml/java based/annotation based configuration


            
            - Spring Bean Configuration 
            -----------------------------
                -> definition for object creation, initialization, and removal


                1. using xml configuration 

                           <beans xmlns="http://www.springframework.org/schema/beans"
                                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                                xsi:schemaLocation="
                                    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

                                <!-- bean definitions here -->
                                <bean id="employeeDAO" class="com.demo.dao.EmployeeDAO" />
                                    
                                <bean id="employeeService1" class="com.demo.services.EmployeeService">
                                    <constructor-arg name="employeeDAO" ref="employeeDAO" />
                                </bean>

                                 <bean id="employeeService2" class="com.demo.services.EmployeeService">
                                    //different values to intialize
                                 
                                </bean>
                        </beans>


                        ApplicationContext context = new ClasspathXmlApplicationContext("spring-beans.xml");

                2. using java configuration 

                    @Configuration
                    public class ApplicationConfig {
                            
                            @Bean
                            public EmployeeService employeeService(){

                                //create a new object of EmployeeService and return
                                return new EmployeeService();
                            }
                    }

                    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

                3. annotation based configuration

                        @Component 




            Bean Life Cycle
            -----------------------



            Bean Scopes
            -----------------------


            Construction Injection 
            ---------------------------



            Setter Injection
            --------------------------




What is Dependency Injection?
Definition: DI is a design pattern where an object's dependencies are provided externally by a container, rather than the object creating them itself.
Why DI?
Promotes loose coupling between components.
Makes code easier to test and maintain.
Example: Constructor and Setter Injection
Classes and Dependencies


package com.example;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}


package com.example;

public class Car {
    private Engine engine;

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getCarDetails() {
        return "Car with engine type: " + engine.getType();
    }
}
XML Configuration


<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="engine" class="com.example.Engine">
        <constructor-arg value="V8 Engine" />
    </bean>

    <bean id="car" class="com.example.Car">
        <constructor-arg ref="engine" />
    </bean>
</beans>


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car.getCarDetails());
    }
}

2. Difference Between Inversion of Control (IoC) and Dependency Injection (DI)

IoC (Inversion of Control)
Definition: The container takes control of creating and managing objects, rather than the application managing them.

How It Works: IoC can be achieved through mechanisms like Dependency Injection and Service Locator.
DI (Dependency Injection)
Definition: A pattern where dependencies are injected into an object by a container.
How It Works: DI is one way to implement IoC.

Feature	IoC	DI
Focus	Manages control over the application's flow.	Focuses on injecting dependencies.
Implementation	Achieved using DI or Service Locator pattern.	A design pattern under IoC.
Container's Role	Manages object lifecycle and relationships.	Provides dependencies.

3. Injecting Objects by Constructor Injection
Definition
Constructor Injection is the process of passing dependencies through the constructor during object creation.
Example

XML Configuration


<bean id="engine" class="com.example.Engine">
    <constructor-arg value="Diesel Engine" />
</bean>

<bean id="car" class="com.example.Car">
    <constructor-arg ref="engine" />
</bean>


public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void display() {
        System.out.println("Car Engine: " + engine.getType());
    }
}

4. Dependency Injection by Setter Method
Definition
Setter Injection involves injecting dependencies using setter methods after the object is constructed.
Example


public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void display() {
        System.out.println("Car Engine: " + engine.getType());
    }
}
XML Configuration

<bean id="engine" class="com.example.Engine">
    <property name="type" value="Petrol Engine" />
</bean>

<bean id="car" class="com.example.Car">
    <property name="engine" ref="engine" />
</bean>

5. Bean Scopes
        Definition
        Bean scope defines the lifecycle and visibility of a bean in the Spring container.
       
        Types of Bean Scopes
           1. Singleton (Default): Single instance per Spring container.
           2. Prototype: New instance for each request i.e. when we use the getBean() method
           3. Request: Scoped to an HTTP request (web applications).
           4. Session: Scoped to an HTTP session (web applications).
           5. Global Session: Scoped to a global HTTP session (web applications).
            Example

        Singleton Scope

            <bean id="singletonBean" class="com.example.SingletonClass" scope="singleton" />

            @Scope("singleton")

        Prototype Scope

            <bean id="prototypeBean" class="com.example.PrototypeClass" scope="prototype" />


6. Bean Lifecycle in Spring
        Definition
        The lifecycle of a bean includes creation, initialization, use, and destruction.
        Lifecycle Phases

        1. Instantiation: Spring creates the bean.
        2. Dependency Injection: Dependencies are injected.
        3. Initialization: Custom initialization logic i.e init method
        4. Destruction: Custom destruction logic - i.e. destroy method
        
        Using init-method and destroy-method
        Example

        class    EmployeeDAO {

        }

        class EmployeeService {

            private EmployeeDAO DAo;
            private String xyz;
            private int abc;

            public void setAbc(int value){
                
            }

        }


public class MyBean {
    public void init() {
        System.out.println("Bean is going through initialization.");
    }

    public void destroy() {
        System.out.println("Bean will be destroyed.");
    }
}

XML Configuration
    <bean id="myBean" class="com.example.MyBean" init-method="init" destroy-method="destroy" />

JAVA Configuration 

    Class EmployeeDAO implements InitializingBean, DisposableBean {

        @Override
	    public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	    }

        @Override
        public void destroy() throws Exception {
            // TODO Auto-generated method stub
            
        }
    }

Annotation based configuration  

    Using @PostConstruct and @PreDestroy

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean {
    @PostConstruct
    public void init() {
        System.out.println("Bean initialized with @PostConstruct.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean destroyed with @PreDestroy.");
    }
}


REFERENCES for Spring
https://www.geeksforgeeks.org/spring/
https://github.com/onsever/spring-framework-notes


Spring Boot 
--------------------
    - framework built on top of the spring framework
    - it simplifies the development of spring based applications 
    - it provides "Auto Configuration" which eliminate the need for extensive configuration 


    How Auto Configuration works in spring boot
    ----------------------------------------------


    *IMP: Features of Spring Boot
        1. auto configuration 

        2. embedded server 

        3. starter depedencies 

        4. spring boot cli 

        5. Spring boot actuator 



Spring Data JPA
----------------------------

        - ORM Framework (Object relation mapping) - maps a java object to a relational table
            - hibernate
            - iBatis
            - TopLink

        - JPA - Java persistence api - JPA is the standard /specification for ORM framework
        
        - JPA Providers
            - Hibernate JPA
            - EclipseLink
            - MyBatis

        - Spring Data JPa
            - wrapper aroung JPA and JPA Provider 
            - by default it uses 'hibernate' as a jpa provider
            - provides "Repository" pattern to persist the data
            - provides support for creating JPA repositories by extending the Spring Data repository interfaces.

            interface Repository<T, ID>
                    |
                    |
            interface CrudRepository<T, ID>
                    |
                    |-> long count()
                    |-> void delete(T entity)
                    |-> void deleteAll()
                    |-> void deleteById(ID id)
                    |-> Iterable<T> findAll()
                    |-> Optional<T> findById(ID id)
                    |-> <S extends T> S save(S entity)
                    |
            interface PagingAndSortingRepository<T, ID>
                    |
                    |-> Page<T> findAll(Pageable pageable)
                    |-> Iterable<T> findAll(Sort sort)
                    |
                    |
            inteface JpaRepository<T, ID>       
                    |
                    |-> List<S> findAll(Example<S> example) 
                    |-> List<T> findAll()
                    |-> <S extends T> S saveAndFlush(S entity) 

 
    Spring Data JPA Relationships
    ------------------------------------

    class Department {                          class Employee {

        int deptId;                                     int empId;  
        String deptName;                                String empName;
        
        @OneToMany(mappedBy="department")               String city;
        List<Employee> employees;                       double salary;

                                                        @ManyToOne
                                                        Department department;

    }                                            }

    
        deptTable                       employeeTable                                           FK
        deptId      deptName           empId       empName         city            salary       FK_deptId



        department_employee
        ---------------------
        deptId      empId






    class Product  {                                    class Catogory {

            int productid                                       int catId;
            String productname;                                 String catName;

            @OneToOne(mappedBy="category")                       @OneToOne 
            Category category;                                  Product product;


    }                                                      }

    productTable                                       categorytable
    productid   productname     FK_catid                catid       catName         FK_productId



    @OneToOne               JoinColumn
    @ManyToOne              JoinColumn 

    @OneToMany              JoinTable
    @ManyToMany             JoinTable




OneToOne BiDirectional Relationship
---------------------------------------------
    - Each entiry is related to exactly other entity 
    - there should be one owning side and other inverse side 
    - the foriegn key will be maintained by the owning side 


        class User {                                        class Profile {

            id                                                          id
            name                                                        bio 
                                                                        dob
                                                                        .   ..
            @OneToOne(cascade = {CascadeType.PERSIST, 
            CascadeType.REMOVE}, fetch="FetchType.LAZY)                @OneToOne(mappedBy="profile")
            Profile profile;                                            User user;
        }                                                               }

        user-table                              profile-table
        id name profile_id                      id bio dob user_id      


        User user = new User();
        user.setName("Harsh");

        Profile profile = new Profile();
        profile.setBio("somebio");

        user.setProfile(profile);

        profileRepo.save(profile);
        userRepo.save(user);



    Default Fetch Policy
    ----------------------------

        @OneToOne               EAGER



    OneToMany and ManyToOne BiDirectional Relationship
    ---------------------------------------------------------
            - a parent entity has a collection of child entities (OneToMany)
            - a child entity is related to a single parent entity (ManyToOne)
            - the foreign key should be maintained by the child table


        class Department {                                class Employee {

                int `id`;                                       int id;
                String name;                                    String name;
                                                                ....

                @OneToMany(mappedBy="department")               @ManyToOne            
                List<Employee> employees;                       Department department;                       

        }                                                   }

                                                        employee_table
                                                                    FK
                                                        id   name   department_id
      

      ManyToMany BiDirectional Relation
      ---------------------------------

        class Student {                                 class Course {


            @ManyToMany                                     @ManyToMany
            List<Course> courses;                           List<Student> students;


        }                                                  }



    - ManyToMany Self Relationship

        Class InstaUser {

            int id;
            String name;
            ...
            ..
            ..

            @ManyToMany
            List<InstaUser> followers = new ArrayList();

            @ManyToMany
            List<InstaUser> following = new ArrayList();

        }



In Spring Data JPA, relationships between entities map to database associations. They are modeled using JPA annotations.

Key Types of Relationships:
@OneToOne: One entity is associated with exactly one other entity.
@OneToMany: One entity is associated with multiple entities.
@ManyToOne: Many entities are associated with one entity.
@ManyToMany: Many entities are associated with many other entities.

Default Strategies for Relationships in Tables

Relationship	Foreign Key Placement	    Join Table Default	        Cascade Default
@OneToOne	    Owning side holds FK	    @JoinTable if configured	No cascading by default.
@OneToMany	    Owning side holds FK	    Not applicable	            No cascading by default.
@ManyToOne	    Owning side holds FK        Not applicable	            No cascading by default.
@ManyToMany	    Join table for both	        @JoinTable required	        No cascading by default.

3.Relationships
    - @OneToOne
        Definition: One entity is associated with exactly one other entity.
    
        Mapping Strategy:
         Default: Foreign key in the owning side's table.
    
        Optional: Use @JoinColumn to specify the foreign key column.
    
     Example:
        @Entity
        public class Address {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String city;

            @OneToOne(mappedBy = "address")
            private User user;

            // Getters and Setters
        }

        @Entity
        public class User {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String name;

            @OneToOne(cascade = CascadeType.ALL)
            @JoinColumn(name = "address_id", referencedColumnName = "id")
            private Address address;

            // Getters and Setters
        }

        SQL Generated:
        users table: address_id column holds the foreign key.
        addresses table: Independent table with no foreign key back to users.

    - @OneToMany
        Definition: One entity is associated with multiple entities.
        
        Mapping Strategy:
        Default: Foreign key in the child (many-side) table.
        Use mappedBy to specify the relationship owner.
        
        Example:
            @Entity
            public class Department {
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private Long id;
                private String name;

                @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
                private List<Employee> employees;

                // Getters and Setters
            }

            @Entity
            public class Employee {
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private Long id;
                private String name;

                @ManyToOne
                @JoinColumn(name = "department_id")
                private Department department;

                // Getters and Setters
            }

            SQL Generated:
            employees table: department_id column holds the foreign key.

    - @ManyToOne
        Definition: Many entities are associated with one entity.
        
        Mapping Strategy:
        Default: Foreign key in the child (many-side) table.
        
        Example:
        @Entity
        public class Order {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;

            @ManyToOne
            @JoinColumn(name = "customer_id")
            private Customer customer;

            // Getters and Setters
        }

        @Entity
        public class Customer {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String name;

            // Getters and Setters
        }

        SQL Generated:
        orders table: customer_id column holds the foreign key.

    - @ManyToMany
        Definition: Many entities are associated with many others.
        
        Mapping Strategy:
        Default: A join table is created to maintain associations.
        
        Example:
        @Entity
        public class Author {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String name;

            @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(
                name = "author_book",
                joinColumns = @JoinColumn(name = "author_id"),
                inverseJoinColumns = @JoinColumn(name = "book_id")
            )
            private List<Book> books;

            // Getters and Setters
        }

        @Entity
        public class Book {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String title;

            @ManyToMany(mappedBy = "books")
            private List<Author> authors;

            // Getters and Setters
        }

        SQL Generated:
        author_book table: Holds author_id and book_id as foreign keys.


        Cascading
        ----------
        Allows operations (persist, merge, remove, etc.) performed on a parent entity to cascade to its child entities.
        
        Cascade Types:
            PERSIST: Propagate persist operation.
            MERGE: Propagate merge operation.
            REMOVE: Propagate remove operation.
            REFRESH: Refresh entities.
            DETACH: Detach entities from persistence context.
            ALL: Apply all operations.
        
        Example:

        @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
        private List<Employee> employees;
        Adding or removing employees in Department will automatically persist changes in the database.

    Entity Inheritance
    ------------------
        Strategies:
            SINGLE_TABLE (Default): A single table is used for all entity types.
                                    Discriminator column differentiates between types.
        
            TABLE_PER_CLASS: A separate table is created for each entity type.
       
            JOINED: A base table is created for the parent entity, with joined tables for child entities.

        Example:
        @Entity
        @Inheritance(strategy = InheritanceType.JOINED)
        public class Vehicle {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String name;

            // Getters and Setters
        }

        @Entity
        public class Car extends Vehicle {
            private int seatingCapacity;

            // Getters and Setters
        }

        @Entity
        public class Bike extends Vehicle {
            private boolean hasGear;

            // Getters and Setters
        }

        SQL Generated:
            vehicle table: Contains common fields (id, name).
            car table: Contains specific fields (seatingCapacity).
            bike table: Contains specific fields (hasGear).



**IMP: Marker interface in java
--------------------------------------------
    - interface which has no methods defined in it

Spring DATA JPA REFERECE
https://www.petrikainulainen.net/spring-data-jpa-tutorial/#:~:text=Creating%20repositories%20that%20use%20the,CRUD%20operations%20for%20our%20entities.

Entity Inheritance
https://medium.com/@iampraveenkumar/mastering-jpa-inheritance-strategies-hibernate-6-x-jpa-3-x-spring-boot-3-x-06eecac1147a

Relationships
https://blog.stackademic.com/the-complete-guide-to-spring-data-jpa-building-a-bookstore-application-from-scratch-part-iii-8a1de3bc9949


Query Methods in Spring Data JPA
-----------------------------------------

Query methods are predefined methods in Spring Data JPA repositories that allow you to derive queries based on method names.

Spring parses method names and generates SQL queries automatically.

Syntax Rules:
    Method names must follow the pattern findBy, readBy, or queryBy.
    Use logical keywords like And, Or, Between, etc., to combine clauses.

    Example:
       - Single Property Query
        List<Employee> findByDepartmentName(String departmentName);

        Generated Query: SELECT * FROM employee WHERE department_name = ?

       - Multiple Conditions
        List<Employee> findByDepartmentNameAndAgeGreaterThan(String departmentName, int age);

        Generated Query: SELECT * FROM employee WHERE department_name = ? AND age > ?

        - Sorting
        List<Employee> findByDepartmentNameOrderByAgeDesc(String departmentName);

        Generated Query: SELECT * FROM employee WHERE department_name = ? ORDER BY age DESC

        - Pagination
        Page<Employee> findByAgeGreaterThan(int age, Pageable pageable);

        Generated Query: Includes LIMIT and OFFSET clauses for pagination.


     Custom Queries
     --------------------
        Custom queries allow you to define SQL or JPQL (Java Persistence Query Language) directly in repository methods using @Query.

        JPQL Query
        @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
        List<Employee> findEmployeesByDepartment(@Param("departmentName") String departmentName);

        Native SQL Query
        @Query(value = "SELECT * FROM employee e WHERE e.department_id = ?1", nativeQuery = true)
        List<Employee> findEmployeesByDepartmentId(Long departmentId);

        Modifying Queries
        Use @Modifying for update or delete operations.

        @Modifying
        @Query("UPDATE Employee e SET e.salary = :salary WHERE e.id = :id")
        int updateEmployeeSalary(@Param("id") Long id, @Param("salary") Double salary);

        Note: This Requires a transactional context, so annotate the service method with @Transactional.

   Named Queries
   ----------------
      -  Named queries are pre-defined queries with unique names declared at the entity level.
      - Useful for reusable and optimized queries.     

      @Entity
        @NamedQuery(
            name = "Employee.findByDepartmentName",
            query = "SELECT e FROM Employee e WHERE e.department.name = :departmentName"
        )
        public class Employee {
            // Fields, Getters, Setters
        }

        Repository:
        @Query(name = "Employee.findByDepartmentName")
        List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);



REST - represetational state transfer 
-------------------------------------------------


REST API - 
-----------------------

    REST (Representational State Transfer) is an architectural style for designing networked applications. It relies on stateless, client-server communication, where resources are identified by URIs (Uniform Resource Identifiers).

    Key Principles:
     - Stateless: No client state is stored on the server.
     - Uniform Interface: Use standard HTTP methods like GET, POST, PUT, DELETE.
     - Layered System: Decouples client and server implementations.
     - Cacheable: Responses can be cached for better performance.

    Spring Boot for REST APIs
        Spring Boot simplifies REST API development by providing an opinionated framework that reduces boilerplate code and facilitates quick application setup.

        Key Features:
            - Embedded servers like Tomcat, Jetty.
            - Built-in support for JSON and XML.
            - Auto-configuration and starter dependencies.
            - Spring Data JPA integration for database operations.

    Key Annotations:
        @SpringBootApplication: Entry point for the application, which creates the container, performs the componentscan and enables auto configurtion.

        @RestController: Combines @Controller and @ResponseBody for RESTful APIs.
        @RequestMapping: Maps HTTP requests to handler methods.
        @PathVariable and @RequestParam: Extract variables and parameters from URLs.
        @RequestBody: Maps request body to a Java object.
        @ResponseBody: Maps Java object to the HTTP response body.
    
    @Controller vs @RestController 

            @Controller
                Used in Spring MVC to define a controller that processes HTTP requests and returns "view" templates (like JSP, Thymeleaf, etc.) or other non-RESTful responses.

                Methods in a @Controller typically return a view name that maps to a template for rendering a response (e.g., HTML).

            @RestController
                A specialization of @Controller designed for building RESTful web services. It simplifies development by automatically serializing Java objects into JSON (or XML) responses.

                Combines @Controller and @ResponseBody, so all methods in a @RestController return "JSON or XML" directly, and you don’t need to annotate methods with @ResponseBody explicitly.

                It is ideal for APIs that serve data to clients (e.g., frontend apps, mobile apps).

        ResponseEntity
        -----------------------
            - ResponseEntity is a generic class used to customize and build HTTP responses. It allows you to:

                   - Set HTTP status codes (e.g., 200 OK, 404 NOT FOUND).
                   - Include custom headers in the response.
                   - Send a response body containing data (e.g., JSON, XML, plain text).

            You can customize the HTTP status code, headers, and response body based on the business logic.
            Helps conform to REST standards by sending appropriate status codes and response data.
            Easy to add additional headers, such as Content-Type, Authorization, or custom headers.





            class Category {
                id
                name

            
                Category parentCat;
            }



            obj: PackagedFood

            obj: xyz




    class Category {

            int id;
            String name;
            String description;

            @ManyToOne
            Category parentCategory;

            @OneToMany(mappedBy="parentCategory")
            List<Category> subCategories;

    }


    Books

    Fiction     Non-Fiction     xx          xx




    Product Relationships
    Product and ProductType:

    ManyToOne Relationship:
    Each Product belongs to a single ProductType.
    The ProductType defines shared attributes (e.g., "Shirt" may have attributes like size, color).
    Use Case: Helps standardize attribute definitions across products of the same type.
    Product and ProductVariant:

    OneToMany Relationship:
    A Product can have multiple variants.
    Variants represent specific configurations of a product (e.g., size, color).
    Use Case: A "Shirt" can have variants like "Size: M, Color: Red" and "Size: L, Color: Blue."
    Product and Category:

    ManyToMany Relationship:
    A Product can belong to multiple categories.
    Categories can have multiple products.
    Use Case: A phone can belong to "Electronics," "Smartphones," and "Best Sellers."


ProductVariant Relationships
    ProductVariant and Product:

    ManyToOne Relationship:
    Each ProductVariant belongs to a single Product.
    Use Case: Variants are tied to a specific product, ensuring proper grouping.
    Variant Attributes:

    Each variant has a Map<String, String> to define specific attribute values (e.g., Size: M, Color: Red).
    These values are validated against the AttributeDefinition of the parent ProductType.


ProductType Relationships
    ProductType and Product:

    OneToMany Relationship:
    A ProductType can define multiple products.
    Use Case: The ProductType ensures that all products of the same type (e.g., "Shirt") share consistent attributes.
    ProductType and AttributeDefinition:

    OneToMany Relationship:
    Each ProductType defines a list of attributes (AttributeDefinition).
    Use Case: Provides a reusable template for products, defining attributes like size, color, or material.

AttributeDefinition Relationships
    Attributes in ProductType:
    Each AttributeDefinition belongs to a ProductType.
    Attributes can specify:
    Name (e.g., "Size").
    Type (e.g., ENUM, TEXT).
    Allowed values (e.g., ENUM: ["S", "M", "L"]).
    Use Case: Ensures consistent validation and structure for product variants.


        **IMP: DEfault strategies to represent the in RElationships in the database tables
        ------------------------------------------------
        @OneToOne 
        @ManyToOne
            - the default strategy to represent the relationship in the table 
                is "joincolumn"
            - in joincolumn strategy, it uses a foreign key column
            - a foreign key column is created in the table that contains the 
                relationship
            - @JoinColumn annotation is used to specify the foreign key column in the relationship
                - you can specifiy name of the FK column
                - @JoinColumn(name="", nullable="", unique="", insertable="", columnDefinition="")


           class Employee {                     class EmployeeDetails {
                int id;                                 int id';
                String name;                            String address, city, phonenumber;
             
                @OneToOne
                EmployeeDetail detail;
            }                                   }

            employee table
            id   name       FK:employeeDetails_id    


        @OneToMany
            - by default, @OneToMany uses "jointable" strategy if the relationship is "bidirectional"
                -*otherwise, it uses @joincolumn

            - @JoinTable annotation 
                - to define the join table configuration 

                   
                   class Department {                   class Employee {

                            @OneToMany
                            @JoinTable(
                                name="department_employee",
                                joinColumns= @JoinColumn(name="department_id")
                                inverseJoinColumns=@JoinColumn(name="employee_id")
                                )
                            )
                            List<Employee> employees

                   }                                    }

                    department_employee table
                    ----------------------------
                      department_id         employee_id

        @ManyToMany
            - be default, @ManyToMany always uses "jointable" strategy 


          
    **IMP: @JsonManagedReference and @JsonBackReference 
    -------------------------------------------------------
        - these annotations belong to "Jackson library" which are used for  JSON serialization
            and deserilization
        - when a parent-child relationship (bidirectional relationship) exists where both entities reference to each other, JSON serialization may enter into an infinite loop

         @JsonManagedReference
            - applied on the parent side of the relationship

         @JsonBackReference 
            - applied on the child side of the relationship



            class Department{                   class Employee {

                @JsonManagedReference               @JSONBackReference
                List<Employee> employees;           Department department;
            }                                   }


                @Entity
                public class Category {
                    
                    @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
                    private Long id;
                    private String name;
                    private String description;
                

                    @ManyToOne
                    @JsonBackReference
                    private Category parentCategory;

                    @OneToMany(mappedBy = "parentCategory")
                    @JsonManagedReference
                    private List<Category> subcategories;
                }


        orphanRemoval
        ------------------------
            - when a child entity is removed from it's parent entity's collection
                
              class Category {

                @OneToMany(orphanRemoval=true)
                List<Category> subCategories;           //10 subcategories
              }  
                


        class ProductType {

            @OneToMany(cascase=CascaseType.All, orphanRemoval=true)
            List<AttributeDefinition> attributes;

        }


        PT1 - Clothing-Product-Type
                |->Size:"large"
                |->Color:"blue"
                


        producttype table                       attributeDefin
        id   ptname   ..  ..                    id  




application.properties file
-------------------------------------
    - to externilise the configuration required for the project



https://www.ignek.com/blog/various-approaches-of-api-integration-in-spring-boot/

Spring Framework
------------------------
    - Spring Core
    - Spring Data 
        - spring data jpa
        - spring data jdbc
        - spring data mongodb
    - Spring Web
    - Spring Cloud
        - Spring Cloud Config
        - Spring Cloud OpenFeign
        - Spring Cloud Gateway
        - Spring Cloud Netflix





Spring Cloud Config
------------------------------
    
    Spring Cloud Config provides server-side and client-side support for managing externalized configuration in a distributed system. It enables centralized management of configuration files across multiple applications and environments.

    Key Features
        - Centralized Configuration:
             Store configuration files in a central repository (e.g., Git, SVN).
            Access shared and environment-specific configurations across multiple microservices.
    
        - Dynamic Updates:
            Supports runtime refresh of configurations using @RefreshScope.
    
        - Environment-Specific Configurations:
            Config files can be specific to environments (e.g., application-dev.properties, application-prod.properties).
    
        - Version Control:
            Integrates with Git, allowing versioning of configuration files.
        
        - Secure Configurations:
            Use Spring Cloud Config encryption/decryption features for sensitive data.
    
     Architecture

        - Config Server:
            A central server that serves configuration files to client applications.
            Uses a backend repository (e.g., Git) to store configurations.
        
        - Config Clients:
            Applications that fetch configuration from the Config Server at startup or runtime.
    
     Steps to Set Up Spring Cloud Config
        1. Setting Up the Config Server

        Add dependencies to pom.xml:
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-config-server</artifactId>
            </dependency>
    
        Enable Config Server:

        @SpringBootApplication
        @EnableConfigServer
        public class ConfigServerApplication {
            public static void main(String[] args) {
                SpringApplication.run(ConfigServerApplication.class, args);
            }
        }
    
        Configure application.properties:

        server.port=8888
        spring.application.name=config-server
        spring.cloud.config.server.git.uri=https://github.com/your-repo/config-repo
        
        Start the Config Server.

    2. Setting Up the Config Client
    
        Add dependencies to pom.xml:

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>

    Create bootstrap.properties / application.properties:

        spring.application.name=client-service
        spring.cloud.config.uri=http://localhost:8888

    Use @Value or @ConfigurationProperties to access configuration values:


    @Value("${example.property}")
    private String exampleProperty;
    
    Common Configuration Files
        application.properties: Common configuration shared by all services.
        service-name.properties: Service-specific configurations.
        application-{profile}.properties: Environment-specific configurations (e.g., application-dev.properties).
    
    Dynamic Refresh of Configurations
        Annotate beans with @RefreshScope to refresh configuration without restarting the application.
        Use the /actuator/refresh endpoint (requires Spring Boot Actuator).
    
    Best Practices
        - Secure Sensitive Data:
                Use Spring Cloud Config encryption for properties like passwords or API keys.
        -  Version Control for Config Files:
                Use Git for tracking changes to configurations.
        
        - Environment-Specific Configurations:
            Maintain separate configurations for development, staging, and production environments.

        - Fall Back to Local Properties:
            Always provide default configurations in case the Config Server is unreachable.



Profiles
--------------
    Spring Profiles provide a way to segregate parts of your application configuration and make it be available only in certain environments i.e. dev, prod, test

    application.properties 
    application-dev.properties
    application-prod.properties 

    <servicename>-dev.properties
     <servicename>-prod.properties
      <servicename>-test.properties

Service-to-Service Communication
------------------------------------------
    Service-to-service communication is a fundamental aspect of microservices architecture, enabling different services to interact with each other. It can be achieved through synchronous or asynchronous methods based on the use case.

    Communication Types
    1. Synchronous Communication
        Involves direct communication between services.
        The caller waits for the response from the called service.

        Commonly implemented using:
         - HTTP/REST (e.g., RestTemplate or WebClient)
         - gRPC (Google's Remote Procedure Call framework)

                String userDetails = restTemplate.getForObject("http://USER-SERVICE/users/" + id, String.class);

    
    2. Asynchronous Communication
        Involves communication where the caller does not wait for the response.
       
        Commonly implemented using:
            - Message Queues (e.g., RabbitMQ, Kafka, AWS SQS, GCP Pub/sub)
            - Event-Driven Architecture (e.g., using Spring Cloud Stream)


Spring Cloud OpenFeign
------------------------------
    OpenFeign is a declarative REST client in Spring Cloud that simplifies communication between microservices by providing a higher-level abstraction for making HTTP requests. 
    
    It eliminates the need for manual HTTP client code like RestTemplate or WebClient by using annotations to define HTTP requests.

    Key Features of OpenFeign
        - Declarative Approach: Define REST client interfaces with annotations.
        - Integration with Spring Cloud: Supports service discovery (e.g., Eureka) for dynamic URLs.
        - Load Balancing: Works with Ribbon or Spring Cloud LoadBalancer for client-side load balancing.
        - Resilience: Can integrate with Resilience4j for retries and circuit breakers.
        - Customizable: Allows custom headers, interceptors, and configurations.
    
    Steps to Use OpenFeign

        1. Add Dependencies
        Add the following dependencies in your pom.xml:
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-starter-openfeign</artifactId>
            </dependency>
        </dependencies>

        2. Enable Feign Clients
        Annotate your main Spring Boot application class with @EnableFeignClients:

        @SpringBootApplication
        @EnableFeignClients
        public class Application {
            public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
            }
        }

    3. Define a Feign Client
        Create an interface for the external service you want to communicate with.

        For example, let's say you want the Order Service to call the User Service.

        User Service API:

        @RestController
        @RequestMapping("/users")
        public class UserController {

            @GetMapping("/{id}")
            public String getUser(@PathVariable String id) {
                return "User details for ID: " + id;
            }
        }


    Feign Client in Order Service:

        @FeignClient(name = "user-service", url = "http://localhost:8081")
        public interface UserClient {

            @GetMapping("/users/{id}")
            String getUserById(@PathVariable("id") String id);
        }

    4. Use the Feign Client
    
        Inject the Feign client into your service or controller and call its methods:

        @RestController
        @RequestMapping("/orders")
        public class OrderController {

            @Autowired
            private UserClient userClient;

            @GetMapping("/{id}")
            public String getOrderWithUser(@PathVariable String id) {
                String userDetails = userClient.getUserById(id);
                return "Order details for ID: " + id + " with " + userDetails;
            }
        }


    Spring Cloud Netflix
    ----------------------------------

            - Spring Cloud Netflix Eureka
                - used for service discovery & registry

            - Implementing a Eureka Server for service registry is as easy as:

                    1. adding spring-cloud-starter-netflix-eureka-server to the dependencies
                    2. enabling the Eureka Server in a @SpringBootApplication by annotating it with @EnableEurekaServer
                    3. configuring some properties


What Are Microservices?
    Microservices are a software architectural style where an application is divided into a collection of loosely coupled services, each performing a specific business function. Each service can be developed, deployed, and scaled independently.

    Microservices communicate over standard protocols like HTTP or messaging queues (e.g., Kafka, RabbitMQ) and often utilize RESTful APIs or event-driven mechanisms for inter-service communication.

Key Characteristics of Microservices
       - Independent Deployment: Each microservice can be deployed independently of the others, allowing faster releases.
        
        - Loose Coupling: Services are loosely coupled, meaning changes in one service don’t heavily impact others.
        
        - Scalability: Microservices can be scaled individually based on their load or performance requirements.

        - Technology Agnostic: Each microservice can use different technologies or programming languages suitable for its functionality.

        - Failure Isolation: If one microservice fails, it doesn’t bring down the entire application.

Microservices with Spring Boot
Spring Boot simplifies the development of microservices by providing a ready-to-use framework for building and deploying services.

Spring Boot Overview
----------------------------
    Spring Boot is a framework that allows you to build production-ready, stand-alone Spring applications with minimal configuration.

    It provides embedded servers like Tomcat, Jetty, and Undertow, eliminating the need to deploy applications to external web servers.

    Creating Microservices with Spring Boot

        Spring Boot Starter Projects: These pre-configured starter packs, such as spring-boot-starter-web and spring-boot-starter-data-jpa, make it easy to add common functionality to a microservice.

        Embedded Servers: By default, Spring Boot uses embedded Tomcat or Jetty servers, so you don’t need to install or configure an external web server.
        Spring Boot Autoconfiguration: This feature automatically configures various components of Spring applications based on the libraries in the classpath.
        Core Components for Building Microservices

        Spring Web: Provides support for building RESTful web services using Spring MVC.
        Spring Data: Simplifies database operations, making it easier to manage database connections and CRUD operations.

        Spring Cloud: A collection of tools that helps build and manage microservices at scale, offering features like service discovery, configuration management, and fault tolerance.

            - Spring Cloud Config
            - Spring Cloud Netflix (Eureka)
            - Spring Cloud Gateway (Reactive Gateway) / Zuul
            - ...
            - ..
            - ..

        Key Concepts in Microservices with Spring Boot
        RESTful APIs

Each microservice typically exposes a REST API to communicate with other services or clients.
Spring Boot’s @RestController and @RequestMapping annotations are used to build REST APIs.
Service Discovery

In a microservices architecture, services must find each other to communicate.
Spring Cloud Netflix Eureka is a popular service discovery tool where services register themselves and discover other services at runtime.
API Gateway

An API Gateway handles routing and load balancing between microservices.
Spring Cloud Gateway or Zuul can be used as the API Gateway to handle all incoming traffic to microservices.
Circuit Breaker Pattern

This pattern is used to handle service failures gracefully.
Resilience4j or Hystrix are popular libraries used with Spring Boot for implementing circuit breakers to prevent cascading failures.
Database Per Service

Each microservice has its own database or data storage, allowing them to be completely decoupled.
Spring Data provides repositories and integrates easily with various databases (SQL/NoSQL).
Messaging and Event-driven Architecture

Microservices often use messaging systems like RabbitMQ, Kafka, or ActiveMQ for asynchronous communication between services.
Spring Boot integrates seamlessly with these messaging systems using the spring-boot-starter-amqp and spring-boot-starter-kafka.