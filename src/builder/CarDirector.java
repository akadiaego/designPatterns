package builder;

public class CarDirector {
    //在这控制生产过程
    CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public Car buildCar(){
        //实现顺序控制创建过程
        carBuilder.buildEngine();
        carBuilder.buildWheel();
        carBuilder.buildShell();
        return carBuilder.buildCar();
    }
}
