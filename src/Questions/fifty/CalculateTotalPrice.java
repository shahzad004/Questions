package Questions.fifty;

import java.util.Scanner;

public class CalculateTotalPrice {
    public static void main(String[] args) {
     var input=new Scanner(System.in);

        System.out.print("Enter quantity of items :");
        int quantity=input.nextInt();
        System.out.print("Enter the Price per item :");
        double pricePerItem=input.nextDouble();

        double totalPrice= quantity*pricePerItem;
        System.out.println("The total Price is: ");
        System.out.println(totalPrice);
    }
    }

