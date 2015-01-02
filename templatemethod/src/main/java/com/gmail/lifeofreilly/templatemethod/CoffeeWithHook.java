package com.gmail.lifeofreilly.templatemethod;

public class CoffeeWithHook extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee though filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        System.out.println("We only serve black coffee here");
        return false;
    }
}
