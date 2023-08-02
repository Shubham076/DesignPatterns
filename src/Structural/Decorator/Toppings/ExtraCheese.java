package Structural.Decorator.Toppings;

import Structural.Decorator.Pizza;
import Structural.Decorator.PizzaDecorator;

public class ExtraCheese extends PizzaDecorator {
    Pizza p;
    public ExtraCheese(Pizza p) {
        this.p = p;
    }

    @Override
    public int cost() {
        return 50 + p.cost();
    }
}
