package Questions.Thirty;

public class MonthlyPayment {
    public static void main(String[] args) {

        double loanAmount=15000.0;
        double annualInterest=3.5;

        int lonnTermYears =5;

        double monthlyPayment= (loanAmount*(annualInterest/100)*12);


        System.out.println("your Monthly Payment is : "+monthlyPayment);
    }
}
