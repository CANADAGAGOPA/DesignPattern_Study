package DP02_ObserverPattern;

import java.util.*;

public class StatisticsDisplay implements Observer {
    double maxTemp = 0.0f;
    double minTemp = 200;
    double tempSum = 0.0f;
    int numReadings;

    WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void  update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            double temp = weatherData.getTemperature();

            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + " / " + maxTemp + " / " + minTemp);
    }
}
