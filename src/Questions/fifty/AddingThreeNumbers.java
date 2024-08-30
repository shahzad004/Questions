package Questions.fifty;

import java.util.Scanner;

public class AddingThreeNumbers {
    public static void main(String[] args) {

        var input=new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Enter any three numbers :");

        System.out.print("1:");num1 =input.nextInt();
        System.out.print("2:");num2=input.nextInt();
        System.out.print("3:");num3=input.nextInt();

        int sum = num1+num2+num3;

        System.out.print("The sum of two number is : ");
        System.out.println(sum);


    }
}
