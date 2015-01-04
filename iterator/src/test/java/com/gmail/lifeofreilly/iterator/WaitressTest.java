package com.gmail.lifeofreilly.iterator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.ArrayList;

public class WaitressTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void WaitressPrintMenuTest() throws Exception {
        Menu breakfastMenu = new PancakeHouseMenu();
        Menu lunchMenu = new CafeMenu();
        Menu dinnerMenu = new DinnerMenu();

        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(breakfastMenu);
        menus.add(lunchMenu);
        menus.add(dinnerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }

}