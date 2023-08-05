package Behavioural.ChainOfResponsiblity;

/*
Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler
 decides either to process the request or to pass it to the next handler in the chain.
 */
public class Main {
    public static void main(String[] args) {
        Middleware middleware = Middleware.link(new AuthMiddleware(), new LoggingMiddleware(), new MainHandler());
        middleware.check("shubham@gmail.com", "shubham@123");
    }
}
