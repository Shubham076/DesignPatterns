package Structural.Decorator.Pizzas;

import Structural.Decorator.Pizza;

public class VeggieDelight implements Pizza {
    @Override
    public int cost() {
        return 150;
    }
}
