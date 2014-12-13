package com.gmail.lifeofreilly.observer;

public interface Subject {
    public void registerObsever(Observer o);
    public void removeObsever(Observer o);
    public void notifyObservers();
}
