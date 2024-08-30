package Questions.Fourty;

import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter any two numbers :");

        System.out.print("1:");num1 =input.nextInt();
        System.out.print("2:");num2=input.nextInt();

        int sum = num1+num2;

        System.out.print("The sum of two number is : ");
        System.out.println(sum);








    }
}
