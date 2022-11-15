package factoryPattern.simpleFactory;

import factoryPattern.PanCake;

public class PancakeStore {
    //添加工厂引用
    SimplePancakeFactory factory;

    public PancakeStore(SimplePancakeFactory factory){
        this.factory = factory;
    }

    public PanCake orderPancake(String name){
        PanCake panCake;
        panCake = factory.createPancake(name);
        panCake.prepare();
        panCake.bake();
        panCake.cut();
        panCake.box();
        return panCake;
    }
}
