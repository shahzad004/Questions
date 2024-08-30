package Questions.Fourty;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        var input =new Scanner(System.in);
        System.out.print("Enter the length of Rectangle :");
        double length=input.nextDouble();
        System.out.print("Enter the with of Rectangle :");
        double width=input.nextDouble();


        double area=length*width;

        System.out.println("Area of the Rectangle is : "+area);



    }
}
