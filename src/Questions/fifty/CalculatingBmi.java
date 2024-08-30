package Questions.fifty;
import java.util.Scanner;


public class CalculatingBmi {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Enter Weigth in Kilo Gram :");
        double weigthInKilo=input.nextDouble();
        System.out.print("Enter heightInMeters : ");
        double heightInMeters=input.nextDouble();


        double  bmi= weigthInKilo/(heightInMeters*heightInMeters);

        System.out.println("Your BMI is : " +bmi);

    }
}
