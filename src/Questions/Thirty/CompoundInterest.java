package Questions.Thirty;

public class CompoundInterest {
    public static void main(String[] args) {
        double principalAmount=2000.0;
        double annualRate=4.5;

        int years=5;
        double power=1+annualRate/100;

        double amount= principalAmount*Math.pow((power),years);
        System.out.println("Compound Per Interest Is : "+amount);
    }
}
