package Questions.Fourty;

import java.util.Scanner;

public class MultipleTwoNumbers {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

       double num1, num2;
        System.out.println("Enter any two numbers :");

        System.out.print("1:");
        num1 =input.nextDouble();
        System.out.print("2:");
        num2=input.nextDouble();

        double product = num1*num2;

        System.out.print("The Product of two number is : ");
        System.out.println(product);
    }

}
