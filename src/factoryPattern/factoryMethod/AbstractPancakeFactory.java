package factoryPattern.factoryMethod;

import factoryPattern.PanCake;

public abstract class AbstractPancakeFactory {
    abstract PanCake createPancake(String name);
}
