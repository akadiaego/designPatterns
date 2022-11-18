package factoryPattern.factoryMethod;

import factoryPattern.BeijingCrispPanCake;
import factoryPattern.PanCake;
import factoryPattern.TianjinFiredStickPanCake;

public class BeijingPancakeFactory extends AbstractPancakeFactory{
    @Override
    PanCake createPancake(String name) {
        // 工厂方法将对象的实例化推迟到了子类
        // 工厂方法模式createPancake依赖AbstractFactory
        PanCake panCake = null;
        if (name.equals("油条煎饼果子")){
            panCake = new TianjinFiredStickPanCake();
        }else if (name.equals("薄脆煎饼果子")){
            panCake = new BeijingCrispPanCake();
        }
        return panCake;
    }
}
