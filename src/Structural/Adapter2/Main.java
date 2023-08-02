package Structural.Adapter2;
import java.util.*;

/*
consider a real-world scenario where the Adapter Pattern can be quite useful: integrating with a third-party payment gateway API.

In this scenario, let's say your e-commerce application was originally designed to work with the PayPal payment gateway. Your application uses a PaymentProcessor interface that the PaypalProcessor class implements:

Now, let's say you want to add support for Stripe, another payment gateway. However, the Stripe SDK provides a StripeClient class with a different method for processing payments:
 */
public class Main {
    public static void main(String[] args) {
        // Using PayPal
        String x = "fjjfjf";
        ShoppingCart cart1 = new ShoppingCart(new Paypal());
        cart1.checkout(100.0);

        // Using Stripe
        ShoppingCart cart2 = new ShoppingCart(new StripeAdapter("1234567812345678"));
        cart2.checkout(100.0);
    }
}
