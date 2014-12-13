package com.gmail.lifeofreilly.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayTest {

    @Test
    public void testDisplay() throws Exception {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.3f);
    }
}