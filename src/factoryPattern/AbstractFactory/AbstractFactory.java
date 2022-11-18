package factoryPattern.AbstractFactory;

import factoryPattern.PanCake;
import factoryPattern.SoyBeanMilk;

public abstract class AbstractFactory {
    abstract PanCake createPancake(String name);
    // 创建豆浆
    abstract SoyBeanMilk createSoyBeanMilk(String name);
}
