package Structural.Decorator.Pizzas;

import Structural.Decorator.Pizza;

public class Farmhouse implements Pizza {
    @Override
    public int cost() {
        return 120;
    }
}
