package Questions.Thirty;

public class GroceryShoppingCal {
    public static void main(String[] args) {

             int apples=3,
                bananas =6;

        double pricePerApple=0.50,
                pricePerBanana=0.30;


        double totalCost= (apples*pricePerApple)+(bananas*pricePerBanana);

        System.out.print("Your total price is : ");
        System.out.println(totalCost);
    }
}
