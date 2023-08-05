package Behavioural.ChainOfResponsiblity;

public class MainHandler extends Middleware {
    public boolean check(String email, String password) {
        System.out.println("Executing main handler");
        return checkNext(email, password);
    }
}
