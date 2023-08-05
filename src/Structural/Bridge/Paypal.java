package Structural.Bridge;

public class Paypal implements PaymentGateway{
    @Override
    public void processPayment(String paymentType) {
        System.out.println(paymentType + " payment processed by paypal");
    }
}
