package com.gmail.lifeofreilly.combined.ducks;

import com.gmail.lifeofreilly.combined.observer.Observable;
import com.gmail.lifeofreilly.combined.observer.Observer;

public class DecoyDuck implements Quackable {
    Observable observable;

    public DecoyDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}

