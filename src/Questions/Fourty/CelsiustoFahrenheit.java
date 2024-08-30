package Questions.Fourty;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        var input =new Scanner(System.in);

        System.out.print("Enter the Temperature :");
        double celsius=input.nextDouble();



        double fahrenheit=(celsius*9/5)+32;

        System.out.println("The temp in fahrenheit is : "+fahrenheit);



    }
}
