package com.gmail.lifeofreilly.nativeobserver;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    public Observable observable;
    public float temperature;
    public float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            this.temperature = ((WeatherData) obs).getTemperature();
            this.humidity = ((WeatherData) obs).getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "
                + temperature + "F degrees and "
                + humidity + "% humidity");
    }


}
