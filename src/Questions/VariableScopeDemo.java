package Questions;

public class VariableScopeDemo {

     String globalVar="Global";

        void printVariable(){
        System.out.println(globalVar);
         };;


    public static void main(String[] args) {
      var myObj=new VariableScopeDemo();
        String localVar ="Local";

        System.out.println("Here is local Variable : "+localVar);
       myObj.printVariable();

    }
}
