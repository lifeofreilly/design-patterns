package com.gmail.lifeofreilly.strategy;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class DuckTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void testPerformFly() throws Exception {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        System.out.print("Mallard Duck: ");
        mallardDuck.performFly();

        System.out.print("Rubber Duck: ");
        rubberDuck.performFly();
    }

    @Test
    public void testPerformQuack() throws Exception {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        System.out.print("Mallard Duck: ");
        mallardDuck.performQuack();

        System.out.print("Rubber Duck: ");
        rubberDuck.performQuack();
    }

    @Test
    public void testSetFlyBehavior() throws Exception {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyWithWings());

        System.out.print("Rubber Duck: ");
        rubberDuck.performFly();
    }

    @Test
    public void testSetQuackBehavior() throws Exception {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehavior(new Quack());

        System.out.print("Rubber Duck: ");
        rubberDuck.performQuack();
    }
}