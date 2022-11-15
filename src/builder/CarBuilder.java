package builder;

public abstract class CarBuilder {
    protected Car car = new Car();
    public abstract void buildEngine();
    public abstract void buildWheel();
    public abstract void buildShell();

    public Car buildCar(){
        return car;
    }

}
