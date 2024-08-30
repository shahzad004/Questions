package Questions;

public class CurrencyConversion {
    public static void main(String[] args) {
        double usdAmount=100.0;
        double conversionRate=0.85;

        double Eur= usdAmount*0.85;

        System.out.print("Your $"+usdAmount+" is equal to : ");
        System.out.println(Eur);
    }
}
