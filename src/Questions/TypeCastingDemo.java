package Questions;

public class TypeCastingDemo {
    public static void main(String[] args) {
        double doubleVar = 5000.5;
        int intVar= (int) doubleVar;
        short shortVar=(short) doubleVar;
/*
Perform implicit casting by declaring an int variable named intVar and assigning it the value of doubleVar.
    Perform explicit casting by declaring a short variable named shortVar and explicitly casting doubleVar to short.

 */
        // Type casting
        System.out.println(doubleVar);
        System.out.println(intVar);
        System.out.println(shortVar);
    }
}
