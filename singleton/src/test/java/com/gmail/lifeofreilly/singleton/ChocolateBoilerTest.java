package com.gmail.lifeofreilly.singleton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.*;

public class ChocolateBoilerTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void testFill() throws Exception {

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        assertEquals(false, boiler.isEmpty());

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        assertEquals(false, boiler2.isEmpty()); //should already be full

    }
}
