package Structural.Adapter2;

public class Stripe {
    public boolean chargeCreditCard(String cardNumber, double amount) {
        // Code to process payment with Stripe
        System.out.println("Payment processed using stripe");
        return true;
    }
}