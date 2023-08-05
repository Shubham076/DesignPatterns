package Structural.Bridge;

//decouples abstractions from its implementations so that two can vary independently
/*
You want to avoid a permanent binding between an abstraction and its implementation. In simpler words, if you have two layers in your software and you don't want changes in one layer to affect the other, you can use the Bridge pattern.

Both the abstractions and their implementations should be extensible by subclassing. This means when you want to extend your software in two independent directions, the Bridge pattern comes in handy. For instance, if you're creating a drawing app and want to be able to add new shapes (circles, squares, etc.) and new drawing methods (pencil, brush, etc.) independently, the Bridge pattern would be a good choice.

Changes in the implementation of an abstraction should have no impact on the clients that use it. In simple terms, if you're creating a system where multiple parts rely on a common component, and you want to be able to change the common component without affecting the other parts, the Bridge pattern would be useful.
 */
public class Main {
    public static void main(String[] args) {
        PaymentGateway stripe = new Stripe();
        PaymentGateway paypal = new Paypal();

        Payment upi = new Upi(stripe);
        Payment creditCard = new CreditCard(paypal);

        upi.pay();
        creditCard.pay();
    }
}
