package com.gmail.lifeofreilly.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", false, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", true, 2.99);
        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
