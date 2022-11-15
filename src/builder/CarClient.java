package builder;

public class CarClient {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector(new GermanCarBuilder());
        Car car = carDirector.buildCar();
        System.out.println(car.toString());

        CarDirector carDirector2 = new CarDirector(new JapanCarBuilder());
        Car car2 = carDirector2.buildCar();
        System.out.println(car2.toString());
    }
}
