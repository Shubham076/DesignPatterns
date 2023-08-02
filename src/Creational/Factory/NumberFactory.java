package Creational.Factory;

public class NumberFactory {
    public static Number createNumber(No number) {
        switch (number) {
            case FIRST:
                return new One();
            case SECOND:
                return new Two();
            default:return null;
        }
    }
}
