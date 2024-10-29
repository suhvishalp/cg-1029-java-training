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