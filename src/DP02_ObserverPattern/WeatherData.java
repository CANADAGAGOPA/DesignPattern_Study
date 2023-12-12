package DP02_ObserverPattern;

import java.util.*;

public class WeatherData extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    double getTemperature() {
        return temperature;
    }

    double getHumidity() {
        return humidity;
    }

    double getPressure() {
        return pressure;
    }

    WeatherData() {
    }

    void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    void setMeasurements(double temperature, double humidity, double pressure) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;

            measurementsChanged();
    }
}
