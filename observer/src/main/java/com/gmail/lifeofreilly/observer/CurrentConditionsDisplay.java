package com.gmail.lifeofreilly.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    public float temperature;
    public float humidity;
    public Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObsever(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    @Override
    public void display() {
        System.out.println("Current conditions: "
                + temperature  + "F degrees and "
                + humidity + "% humidity");
    }
}
