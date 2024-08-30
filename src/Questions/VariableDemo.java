package Questions;


public class VariableDemo {

        // Class varibale
    static int classLevelVar = 10;
        // Here is Instance variable
        String instanceVar= "Hello";

    public static void main(String[] args){
         // in order to access the instacne variable we have to create  its class object (must)
            var myObj=new VariableDemo();
/*
Question 1: Understanding Variables in Java

Step 1: Creating a Class and Main Method

    Create a new Java class named VariableDemo.
    Inside the VariableDemo class, create a main method.

Step 2: Declaring and Initializing Class-Level (Static) Variables

    Inside the VariableDemo class but outside the main method, declare a static variable classLevelVar of type int and initialize it with the value 10.

Step 3: Declaring and Initializing Instance Variables

    Inside the VariableDemo class but outside the main method, declare an instance variable instanceVar of type String and initialize it with the value "Hello".

Step 4: Declaring and Initializing Local Variables

    Inside the main method, declare a local variable localVar of type double and initialize it with the value 20.5.

Step 5: Modifying and Printing Variables

    Inside the main method, modify the value of localVar to 30.5.
    Print the value of localVar using System.out.println.
    Print the value of classLevelVar using System.out.println.
    To access the instance variable instanceVar, create an object of the VariableDemo class and print instanceVar using System.out.println.
 */
            // Instance variable
        System.out.print("instance variable:  ") ;
        System.out.println(myObj.instanceVar);

            // Class varibale
        System.out.print( "Class Variable :  ");
        System.out.println(classLevelVar);


    // Here is local variable
        double localVar=20.5;
        localVar=30.5;
        System.out.print("Local Variable:  ");
        System.out.println(localVar);



    }
}
