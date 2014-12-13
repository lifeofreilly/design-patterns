package com.gmail.lifeofreilly.decorator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.*;

public class BeverageTest {
    private static final double DELTA = 0.001;

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void testEspressoGetDescription() throws Exception {
        Beverage beverage = new Espresso();
        assertEquals("Espresso", beverage.getDescription());
    }

    @Test
    public void testEspressoCost() throws Exception {
        Beverage beverage = new Espresso();
        assertEquals(1.99, beverage.cost(), DELTA);
    }

    @Test
    public void testHouseBlendWithMocha() throws Exception {
        Beverage beverage = new Mocha(new HouseBlend());
        assertEquals(1.09, beverage.cost(), DELTA);
        assertEquals("House Blend Coffee, Mocha", beverage.getDescription());
    }

}
