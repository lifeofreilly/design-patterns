package com.gmail.lifeofreilly.factoryidiom;

class Pizza {
    String description = "Unknown Pizza";

    public void prepare() {
        System.out.println("Pizza prepared.");
    }

    String getDescription() {
        return description;
    }
}
