package Questions.fifty;

import java.util.Scanner;

public class ReadConcatenate {
    public static void main(String[] args) {
            var input=new Scanner(System.in);
        System.out.print("Enter your first Name :");
            String firstName=input.nextLine();
        System.out.print("Enter your Last Name :");
            String lastName=input.nextLine();


            String fullName=(firstName+" " +lastName);

        System.out.println("Your Full Name is :"+fullName);



    }
}
