package ObserverPattern.noObserver;

class currentCondutionDisplay {
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public currentCondutionDisplay(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    protected static void update(float temperature, float humidity, float pressure){

        display(temperature,humidity,pressure);

    }


    private static void display(float temperature, float humidity, float pressure){
        System.out.println("当前天气 温度  "+temperature + "湿度"+humidity+"气压 "+pressure);
    }
}
