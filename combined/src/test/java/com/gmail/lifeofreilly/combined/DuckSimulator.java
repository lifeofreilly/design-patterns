package com.gmail.lifeofreilly.combined;

import com.gmail.lifeofreilly.combined.composite.Flock;
import com.gmail.lifeofreilly.combined.decorator.QuackCounter;
import com.gmail.lifeofreilly.combined.ducks.*;
import com.gmail.lifeofreilly.combined.adapter.*;
import com.gmail.lifeofreilly.combined.factory.AbstractDuckFactory;
import com.gmail.lifeofreilly.combined.factory.CountingDuckFactory;
import com.gmail.lifeofreilly.combined.observer.Quackologist;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class DuckSimulator {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void duckTest() throws Exception {
        Quackable duck = new MallardDuck();
        duck.quack();
    }

    @Test
    public void gooseAdapterTest() throws Exception {
        Quackable gooseDuck = new GooseAdapter(new Goose());
        gooseDuck.quack();
    }

    @Test
    public void duckDecoratorTest() throws Exception {

        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        mallardDuck.quack();
        mallardDuck.quack();
        mallardDuck.quack();
        System.out.println("Total quacks: " + QuackCounter.getQuacks() + " times");
    }

    @Test
    public void duckFactoryTest() throws Exception {

        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        Quackable duckCall = duckFactory.createDuckCall();
        duckCall.quack();
        System.out.println("Total quacks: " + QuackCounter.getQuacks() + " times");
    }

    @Test
    public void duckCompositeTest() throws Exception {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        Flock flockOfDucks = new Flock();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        flockOfDucks.quack();

        System.out.println("Total quacks: " + QuackCounter.getQuacks() + " times");
    }

    @Test
    public void observerTest() throws Exception {
        Quackable duck = new MallardDuck();

        Quackologist quackologist = new Quackologist();
        duck.registerObserver(quackologist);

        duck.quack();
    }


}