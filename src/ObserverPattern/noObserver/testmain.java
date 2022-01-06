package ObserverPattern.noObserver;

public class testmain {
    public static void main(String[] args) {
        weather weatherdata = new weather(38,60,1000);
        weatherdata.paramChanged();

    }
}
