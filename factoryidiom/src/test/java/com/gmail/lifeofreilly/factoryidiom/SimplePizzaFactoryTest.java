package com.gmail.lifeofreilly.factoryidiom;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.*;


public class SimplePizzaFactoryTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void testPizzaGetDescription() throws Exception {

        SimplePizzaFactory simpleFactory = new SimplePizzaFactory();
        PizzaStore simpleStore = new PizzaStore(simpleFactory);
        Pizza myPizza = simpleStore.orderPizza("cheese");
        assertEquals("Cheese Pizza", myPizza.getDescription());

    }

}
