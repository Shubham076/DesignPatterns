package Structural.Bridge;

public class Stripe implements PaymentGateway{
    @Override
    public void processPayment(String paymentType) {
        System.out.println(paymentType + " payment processed by stripe");
    }
}
