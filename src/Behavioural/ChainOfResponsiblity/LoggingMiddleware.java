package Behavioural.ChainOfResponsiblity;

public class LoggingMiddleware extends Middleware {

    public boolean check(String email, String password) {
        System.out.println("Logging middleware executed");
        return checkNext(email, password);
    }
}
