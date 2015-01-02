package com.gmail.lifeofreilly.templatemethod;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class CaffeineBeverageTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void testPrepareRecipeTea() throws Exception {
        Tea myTea = new Tea();
        myTea.prepareRecipe();
    }

    @Test
    public void testPrepareRecipeCoffee() throws Exception {
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }

    @Test
    public void testPrepareRecipeCoffeeWithHook() throws Exception {
        CoffeeWithHook blackCoffee = new CoffeeWithHook();
        blackCoffee.prepareRecipe();
    }

}