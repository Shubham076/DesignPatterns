package Structural.Adapter;

public class ConsoleLogger implements NewLogger {
    @Override
    public void Info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void Error(String msg) {
        System.err.println(msg);
    }
}
