package Structural.Adapter2;

public class ShoppingCart {
    private PaymentProcessor paymentProcessor;

    public ShoppingCart(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        boolean success = paymentProcessor.processPayment(amount);
        // Handle the result of the payment
    }
}
