package Questions.Fourty;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        var input =new Scanner(System.in);

        System.out.print("Enter the Principal Amount :");
        double principalAmount=input.nextDouble();
        System.out.print("Enter the Rate of Interest :");
        double rateOfInterest=input.nextDouble();
        System.out.print("Enter the Time in Year :");
        int timeInYears=input.nextInt();

        double simpleInterest= (principalAmount*rateOfInterest*timeInYears)/100;

        System.out.println("Simple Interest is: " +simpleInterest);


    }
}
