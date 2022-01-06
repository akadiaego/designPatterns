package ObserverPattern.observer.impl;

import ObserverPattern.observer.DisplayElement;
import ObserverPattern.observer.Observer;
import ObserverPattern.observer.Subject;

public class currentConditionsDisplay implements Observer, DisplayElement {
    //实现了observer接口，可从weather获得改变
    private float temperature;
    private float humidity;
    private Subject weather;

    public currentConditionsDisplay(Subject weather) {//注册，联系subject
        this.weather = weather;
        weather.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature +" degrees and "+ humidity+ " %humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;//将温度湿度保存起来，调用display
        display();


    }
}
