package Questions;

public class ShadowingDemo {
    String name="Class leve";

    public static void main(String[] args) {
       var Shadowing =new ShadowingDemo();

        String name="Local level";

        System.out.print("The shadowing Variable is:");
        System.out.println(Shadowing.name);
    }

}
