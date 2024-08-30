package Questions.fifty;

import java.util.Scanner;

public class KiloToMiles {
    public static void main(String[] args) {

        var input=new Scanner(System.in);

        double distanceInKm;
        System.out.println("Enter Distance in Kilo Meter :");
        distanceInKm=input.nextDouble();

        double miles=distanceInKm*0.621371;

        System.out.print("Distance in Miles is : ");
        System.out.println(miles);

    }
}
