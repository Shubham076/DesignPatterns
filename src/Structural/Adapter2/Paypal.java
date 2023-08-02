package Structural.Adapter2;

public class Paypal implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        // Code to process payment with PayPal
        System.out.println("Payment processed using paypal");
        return true;
    }
}