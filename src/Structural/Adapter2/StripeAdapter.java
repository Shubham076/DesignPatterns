package Structural.Adapter2;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripeClient;
    private String cardNumber;

    public StripeAdapter(String cardNumber) {
        this.stripeClient = new Stripe();
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
       return stripeClient.chargeCreditCard(cardNumber, amount);
    }
}
