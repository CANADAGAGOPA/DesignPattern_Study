package DP02_ObserverPattern;

import java.util.*;

public class CurrentConditionsDisplay implements Observer {
    double temperature;
    double humidity;
    WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        // downcasting
        // RTTI : Run Time Type Identification

        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            this.temperature = weatherData.getTemperature(); // pull 방식
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions : " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
