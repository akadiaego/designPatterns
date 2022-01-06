package ObserverPattern.noObserver;

/**
 * 利用weather 数据更新3个信息版，当前数据，气象统计值，天气预报
 */
public class weather {
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public float getTemperature() {
        return temperature;
    }

    public weather(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public void paramChanged(){
        float temp = getTemperature();
        float hum = getHumidity();
        float pressure = getPressure();
        currentCondutionDisplay.update(temp,hum,pressure);


    }
}
