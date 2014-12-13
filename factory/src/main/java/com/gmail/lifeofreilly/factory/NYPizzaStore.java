package com.gmail.lifeofreilly.factory;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Pepperoni Pizza");
        }

        return pizza;

    }
}
