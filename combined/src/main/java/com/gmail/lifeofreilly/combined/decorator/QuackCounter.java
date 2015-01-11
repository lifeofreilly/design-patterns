package com.gmail.lifeofreilly.combined.decorator;

import com.gmail.lifeofreilly.combined.ducks.Quackable;
import com.gmail.lifeofreilly.combined.observer.Observer;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public String toString() {
        return duck.toString();
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
