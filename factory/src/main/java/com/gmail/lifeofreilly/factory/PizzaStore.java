package com.gmail.lifeofreilly.factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        //Note that we are calling an abstract method here.
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //factory method
    protected abstract Pizza createPizza(String pizza);
}
