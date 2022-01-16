package DecoratorPattern.PancakeStore.impl.decorator;

import DecoratorPattern.PancakeStore.Pancake;
import DecoratorPattern.PancakeStore.CondimentDecorator;

public class Egg extends CondimentDecorator {
    Pancake pancake;

    public Egg(Pancake beverage){
        this.pancake = beverage;
    }

    @Override
    public double cost() {
        return 1.5 + pancake.cost();
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + ", 加蛋";
    }
}

