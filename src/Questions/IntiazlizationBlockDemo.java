package Questions;

public class IntiazlizationBlockDemo {
    static int staticVar;
     int instanceVar;
    // this one is called static block,
    static{
        staticVar=50;
    }
    // this one is instance var as it does not need anyword before
    {
        instanceVar=25;
    }

    public static void main(String[] args) {
        var demo   =new IntiazlizationBlockDemo();

        System.out.println(staticVar);
        System.out.println(demo.instanceVar);
    }

}
