package ObserverPattern.observer.impl;

import ObserverPattern.observer.Observer;
import ObserverPattern.observer.Subject;

import java.util.ArrayList;

public class weather implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

//    public weather() {
//
//    }

    public weather() {
        this.observers = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer o) {//注册观察者
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {//取消注册
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }

    }

    @Override
    public void notifyObservers() {
        //状态告诉每一个观察者，观察者实现了update
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }

    }
    public void paramChange(){
        notifyObservers();
    }
    public void setParams(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        paramChange();
    }
}
