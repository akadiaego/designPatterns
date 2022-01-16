package DecoratorPattern.PancakeStore.impl.decorator;

import DecoratorPattern.PancakeStore.Pancake;
import DecoratorPattern.PancakeStore.CondimentDecorator;

public class ChickenFillet extends CondimentDecorator {
    Pancake pancake;

    public ChickenFillet(Pancake pancake){
        this.pancake = pancake;
    }

    @Override
    public double cost() {
        return 3 + pancake.cost();
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + ", 加鸡柳";
    }
}
