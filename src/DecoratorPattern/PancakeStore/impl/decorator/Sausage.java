package DecoratorPattern.PancakeStore.impl.decorator;

import DecoratorPattern.PancakeStore.Pancake;
import DecoratorPattern.PancakeStore.CondimentDecorator;

public class Sausage extends CondimentDecorator {
    Pancake pancake;

    public Sausage(Pancake pancake){
        this.pancake = pancake;
    }

    @Override
    public double cost() {
        return 2.5 + pancake.cost();
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + ", 加火腿肠";
    }
}
