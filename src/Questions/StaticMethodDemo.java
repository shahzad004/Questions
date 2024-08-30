package Questions;

public class StaticMethodDemo {
     static int counter;
     static void incrementCounter(){
         counter=counter+1;
         System.out.println("Print out the method: "+ counter);

     }

    public static void main(String[] args) {

        incrementCounter();
        incrementCounter();
    }
}
