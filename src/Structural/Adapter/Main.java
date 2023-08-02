package Structural.Adapter;
/*
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.ˀ
You can create an adapter. This is a special object that converts the interface of one object so that another object can understand it.

An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes. The wrapped object isn’t even aware of the adapter. For example, you can wrap an object that operates in meters and kilometers with an adapter that converts all of the data to imperial units such as feet and miles.

Adapters can not only convert data into various formats but can also help objects with different interfaces collaborate. Here’s how it works:

The adapter implements an interface, compatible with one of the existing objects.
Using this interface, the existing object can safely call the adapter’s methods.
Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.
 */

/*
in this example you want to use new Logger in your system but your system uses old logger
interface. That why we created an adapter which converts new logger to old logger

In this way we made 2 incompatible interfaces work together without modifying their existing code.
 */
public class Main {
    public static void main(String[] args) {
        //here new logger is converted to oldlogger
        NewLogger nl = new ConsoleLogger();
        OldLogger ol = new LoggerAdapter(nl);
        ol.info("message");
        ol.error("error");
    }
}
