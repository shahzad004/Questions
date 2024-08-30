package Questions.Fourty;
import java.util.Scanner;


public class ReadingPrintingUsername {
    public static void main(String[] args) {
        var input =new Scanner(System.in);

        System.out.print("Enter your first Name : ");
        String firstName= input.nextLine();
        System.out.print("Enter your last Name: ");
        String lastName= input.nextLine();

        System.out.println("Hello "+ firstName +" "+lastName);




    }
}
