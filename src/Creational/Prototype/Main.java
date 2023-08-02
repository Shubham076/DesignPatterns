package Creational.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c = new Car("Audi", "2022");
        Car d = (Car)c.clone();
    }
}
