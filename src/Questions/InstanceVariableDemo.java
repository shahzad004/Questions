package Questions;

public class InstanceVariableDemo {
    int instanceCounter=0;

    public static void main(String[] args) {
        // first Object of Class InstanceVariableDEMo
         var myObj   = new InstanceVariableDemo();
        // second object of same class
        var myObj2 =new InstanceVariableDemo();


        int show = myObj.instanceCounter +1;
        int show2= myObj2.instanceCounter +1;

        System.out.println("first Object increment : "+show);

        System.out.println("Second Object increment : "+show2);
    }
}
