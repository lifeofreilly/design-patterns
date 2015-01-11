package com.gmail.lifeofreilly.combined.observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
