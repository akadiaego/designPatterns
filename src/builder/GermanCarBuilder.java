package builder;

public class GermanCarBuilder extends CarBuilder{
    @Override
    public void buildEngine() {
        car.setEngine("GermanEngine");
        System.out.println("--建造德系车引擎，耗油");

    }

    @Override
    public void buildWheel() {
        car.setWheel("GermanWheel");
        System.out.println("--建造德系车轮胎");
    }

    @Override
    public void buildShell() {
        car.setShell("GermanShell");
        System.out.println("--建造德系车外壳，偏重");
    }
}
