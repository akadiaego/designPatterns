package DecoratorPattern.PancakeStore.impl.Compoent;

import DecoratorPattern.PancakeStore.Pancake;

public class FiredBreadStickPancake extends Pancake {
    public FiredBreadStickPancake() {
        description = "油条煎饼果子";
    }

    @Override
    public double cost() {
        return 1;
    }
}
