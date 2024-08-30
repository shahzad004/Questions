package Questions;

public class CalculateBMI {
    public static void main(String[] args) {
        double weigthInKilo=70.0;
        double heightInMeters=1.75;

        double  bmi= weigthInKilo/(heightInMeters*heightInMeters);

        System.out.println("Your BMI is : ");
        System.out.println(bmi);
    }
}
