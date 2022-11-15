package builder;

public class JapanCarBuilder extends CarBuilder{
    @Override
    public void buildEngine() {
        car.setEngine("JapanEngine");
        System.out.println("--建造日系车引擎--经济");
    }

    @Override
    public void buildWheel() {
        car.setWheel("JapanWheel");
        System.out.println("--建造日系车车轮--");
    }

    @Override
    public void buildShell() {
        car.setShell("JapanShell");
        System.out.println("--建造日系车外壳--偏轻");
    }
}
