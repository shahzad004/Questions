package Questions;

public class DefaultValuesDemo {

        int defaultInt;
        boolean defaultboolean;

    public static void main(String[] args) {
         // to access instance varaible you have to create class object to which they belong
        /*
        Question 10: Understanding Default Values of Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named DefaultValuesDemo.
    Inside the DefaultValuesDemo class, create a main method.

Step 2: Declaring Instance Variables Without Initialization

    Inside the DefaultValuesDemo class but outside the main method, declare an int variable named defaultInt.
    Declare a boolean variable named defaultBoolean.

Step 3: Printing Default Values

    Inside the main method, create an object of DefaultValuesDemo.
    Print the default values of defaultInt and defaultBoolean using System.out.println.

         */
            var myObj=new DefaultValuesDemo();


        System.out.print("Here is  integer Instance Variale:  ");
        System.out.println(myObj.defaultInt);
        System.out.print("its boolean instance Variable:  ");
        System.out.println(myObj.defaultboolean);

    }
}
