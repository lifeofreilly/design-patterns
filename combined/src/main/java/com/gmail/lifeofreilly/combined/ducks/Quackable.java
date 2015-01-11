package com.gmail.lifeofreilly.combined.ducks;

import com.gmail.lifeofreilly.combined.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
