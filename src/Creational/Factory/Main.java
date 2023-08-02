package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        Number n = NumberFactory.createNumber(No.SECOND);
        n.print();
    }
}
