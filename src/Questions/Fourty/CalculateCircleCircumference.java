package Questions.Fourty;

import java.util.Scanner;

public class CalculateCircleCircumference {
    public static void main(String[] args) {
        var input =new Scanner(System.in);

        System.out.print("Enter the Radius of Circle :");
        double radius=input.nextDouble();

        double cicumference=2*Math.PI*radius;

        System.out.println("Circumference of the Circle is: " +cicumference);

    }
}
