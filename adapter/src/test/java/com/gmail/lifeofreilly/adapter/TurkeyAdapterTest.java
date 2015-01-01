package com.gmail.lifeofreilly.adapter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TurkeyAdapterTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void myTest() throws Exception {
        testDuck(new TurkeyAdapter(new WildTurkey()));
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}