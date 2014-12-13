package com.gmail.lifeofreilly.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber ducky");
    }
}
