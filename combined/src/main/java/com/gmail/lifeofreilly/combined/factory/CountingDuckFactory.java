package com.gmail.lifeofreilly.combined.factory;

import com.gmail.lifeofreilly.combined.decorator.QuackCounter;
import com.gmail.lifeofreilly.combined.ducks.MallardDuck;
import com.gmail.lifeofreilly.combined.ducks.*;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
