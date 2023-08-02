package Creational.Prototype;

public class Car implements Cloneable{
    public String name;
    public String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
