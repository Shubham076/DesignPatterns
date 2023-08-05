package Behavioural.ChainOfResponsiblity;

public class AuthMiddleware extends Middleware {
    public boolean check(String email, String password) {
        System.out.println("Auth middleware executed");
        return checkNext(email, password);
    }
}
