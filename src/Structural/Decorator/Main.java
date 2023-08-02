package Structural.Decorator;

import Structural.Decorator.Pizzas.VeggieDelight;
import Structural.Decorator.Toppings.ExtraCheese;
import Structural.Decorator.Toppings.Mushrooms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static  class ToppingsDecoratorFactory {
        public static Pizza getPizza(String input, Pizza pizza) {
            switch (input) {
                case "MUSHROOMS" :
                    return new Mushrooms(pizza);

                case "EXTRACHEESE":
                    return new ExtraCheese(pizza);
                default: return null;
            }
        }
    }
    public static void main(String[] args) {
        List<String> toppings = new ArrayList<>();
        toppings.add("MUSHROOMS");
        toppings.add("EXTRACHEESE");
        Pizza pizza = new VeggieDelight();
        for(String topping: toppings) {
            pizza = ToppingsDecoratorFactory.getPizza(topping, pizza);
        }
//      Pizza pizza = new Mushrooms(new ExtraCheese(new FarmHouse()));
        System.out.println(pizza.cost());
    }
}
