package Structural.Composite;
import java.util.List;
import java.util.ArrayList;
/*
The Composite Design Pattern is a structural design pattern that allows you to treat individual objects and compositions of objects uniformly. It creates a tree-like structure of objects, and it's especially useful when dealing with hierarchies.

The pattern suggests that you work with objects through a common interface, which enables you to support simple leaf components as well as complex, inner components (composites) that may contain multiple sub-components.
 */


// Leaf
class Product implements Item {
    private double price;

    public Product(double price){
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}

// Composite
class Box implements Item {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class Main {

    public static void main(String[] args) {
        Product book = new Product(20);  // A book costs 20
        Product pen = new Product(5);    // A pen costs 5

        Box smallBox = new Box();
        smallBox.addItem(book);
        smallBox.addItem(pen);           // The small box contains a book and a pen

        Box bigBox = new Box();
        bigBox.addItem(smallBox);
        bigBox.addItem(new Product(100));  // The big box contains the small box and another

        System.out.println(bigBox.getPrice());  // Outputs 125
    }
}
