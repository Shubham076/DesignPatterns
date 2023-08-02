package Structural.Decorator.Toppings;

import Structural.Decorator.Pizza;
import Structural.Decorator.PizzaDecorator;

public class Mushrooms extends PizzaDecorator {
    Pizza p;
    public Mushrooms(Pizza p) {
        this.p = p;
    }

    @Override
    public int cost() {
        return 20 + p.cost();
    }
}
