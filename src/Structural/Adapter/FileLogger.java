package Structural.Adapter;

public class FileLogger implements OldLogger{
    @Override
    public void info(String msg) {
        System.out.println("OldLogger: " + msg);
    }

    @Override
    public void error(String msg) {
        System.out.println("Old Logger: " + msg);
    }
}
