package Behavioural.Strategy;

/*
he Strategy pattern is a behavioral pattern that allows you to change the behavior or algorithm used by an object at runtime. It involves encapsulating an algorithm inside a type and using delegation to decide which algorithm to run. You'd use the Strategy pattern when you have multiple algorithms for a task, and you want to choose between them at runtime.

For example, you might have different sorting algorithms (like quicksort, mergesort, bubblesort) encapsulated by Strategy objects. A client object would delegate the task of sorting a list to a Strategy object, which could be selected at runtime.

 */

class CarTravelStrategy implements TravelStrategy {
    public void travelTo(String destination) {
        System.out.println("Driving a car to " + destination);
    }
}

class TrainTravelStrategy implements TravelStrategy {
    public void travelTo(String destination) {
        System.out.println("Taking a train to " + destination);
    }
}

class AirTravelStrategy implements TravelStrategy {
    public void travelTo(String destination) {
        System.out.println("Flying to " + destination);
    }
}

public class Main {
    public static void main(String[] args) {
        TravelPlanner planner = new TravelPlanner();

        planner.setTravelStrategy(new CarTravelStrategy());
        planner.travel("New York");

        planner.setTravelStrategy(new TrainTravelStrategy());
        planner.travel("Los Angeles");

        planner.setTravelStrategy(new AirTravelStrategy());
        planner.travel("London");
    }
}
