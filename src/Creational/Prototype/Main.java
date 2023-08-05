package Creational.Prototype;

/*
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c = new Car("Audi", "2022");
        Car d = (Car)c.clone();
    }
}
