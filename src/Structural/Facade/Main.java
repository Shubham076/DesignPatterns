package Structural.Facade;

// The Facade design pattern is a structural design pattern that provides a simplified interface to a complex system of classes, library or framework. It provides a single, unified interface that hides the complexity of the underlying system, thus making it easier for the client to interact with the system.
//whenever we want to hide system complexity from client
//Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
public class Main {
    public static void main(String[] args) {
        MoviePlayerFascade player = new MoviePlayerFascade();
        player.playMovie();
    }
}
