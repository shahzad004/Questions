package Questions;

public class ExtraQuestions {
    public static void main(String[] args) {

        // first step
        // chaing word to uppercase
        String program="Java is more than Java, it's a platform";
        System.out.println(program.replaceAll("Java","JAVA"));

        // question 2
        // remove spaces trim function
        String say=" Hello, World! ";
        System.out.println(say.trim());

        // question 3
        // removing space and comparing value
        String word1=" Java", word2="Java ";
        word1=word1.trim();
        word2=word2.trim();

        System.out.println((word1.equals(word2))? "Equal" : "Not EQual");

        // Question 4
        String check=" ERROR ";
        System.out.println(check.trim().toLowerCase().replace("error","warning"));

        // index of e from word environment
        String weather="environment";

        int index= weather.indexOf('e');
        System.out.println("The index of e is :  "+ index );

        //  find index of any words in group
        String words="concatenation";
        System.out.println(words.indexOf("cat"));

        //
        String line="Hello, world!";
        System.out.println(line.indexOf("Java"));

    }
}
