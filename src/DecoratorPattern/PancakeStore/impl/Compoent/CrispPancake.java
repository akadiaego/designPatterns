package DecoratorPattern.PancakeStore.impl.Compoent;

import DecoratorPattern.PancakeStore.Pancake;

//薄脆煎饼果子
public class CrispPancake extends Pancake {
    public CrispPancake() {
        description = "薄脆煎饼果子";
    }

    @Override
    public double cost() {
        return 1;
    }
}
