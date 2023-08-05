package Structural.Bridge;

public class CreditCard implements Payment{
    PaymentGateway gateway;
    public CreditCard(PaymentGateway gateway) {
        this.gateway = gateway;
    }
    @Override
    public void pay() {
        gateway.processPayment("credit card");
    }
}
