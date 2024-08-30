package Questions;

public class StaticVariableDemo {

    static int counter;

    public static void main(String[] args) {
        var myObj   =new StaticVariableDemo();

        int show=myObj.counter +1;
        System.out.println(show);
    }
}
