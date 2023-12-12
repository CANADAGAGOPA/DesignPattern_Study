package DP02_ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // subject 객체
        CurrentConditionsDisplay x = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay y = new StatisticsDisplay(weatherData);

        // 정보 변환이 생기는 것을 observer 들에게 알린다.
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
