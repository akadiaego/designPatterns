package ObserverPattern.observer.impl;

import ObserverPattern.observer.DisplayElement;
import ObserverPattern.observer.Observer;
import ObserverPattern.observer.Subject;

public class forecastDisplay implements Observer, DisplayElement {
    //实现了observer接口，可从weather获得改变
    private float temperature;
    private float humidity;
    private Subject weatherData;
    private  String status;
    public forecastDisplay(Subject weatherData) {//注册，联系subject
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {


        if (this.temperature>37){
            this.status = "too hot";
        }
        if(this.temperature<38 & this.temperature>20 & this.humidity>45){
            this.status = "warm";
        }if(this.temperature<=10){
            this.status = "too cold";
        }

        System.out.println("today weather: "+ this.status);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;//将温度湿度保存起来，调用display
        display();


    }
}
