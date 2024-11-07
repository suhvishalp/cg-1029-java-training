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