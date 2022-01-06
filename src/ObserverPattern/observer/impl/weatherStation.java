package ObserverPattern.observer.impl;

public class weatherStation {
    public static void main(String[] args) {
        weather weather = new weather();
        currentConditionsDisplay currentConditionsDisplay = new currentConditionsDisplay(weather);
        forecastDisplay forecast = new forecastDisplay(weather);
        weather.setParams(10,20,1000);
        weather.setParams(25,60,1000);
        weather.setParams(39,60,1000);
    }
}
