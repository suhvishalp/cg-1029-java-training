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
