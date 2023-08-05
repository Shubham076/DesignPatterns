package Structural.Bridge;

public class Upi implements Payment {
    PaymentGateway gateway;
    public Upi(PaymentGateway gateway) {
        this.gateway = gateway;
    }
    @Override
    public void pay() {
        gateway.processPayment("upi");
    }
}
