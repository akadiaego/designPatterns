package DecoratorPattern.PancakeStore.impl.Compoent;

import DecoratorPattern.PancakeStore.Pancake;

public class OriginPancake extends Pancake {
    public OriginPancake() {
        description = "纯煎饼果子";
    }

    @Override
    public double cost() {
        return 1;
    }
}
