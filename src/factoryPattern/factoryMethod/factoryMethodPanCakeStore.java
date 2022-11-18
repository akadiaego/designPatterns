package factoryPattern.factoryMethod;

import factoryPattern.PanCake;
import factoryPattern.simpleFactory.SimplePancakeFactory;

public class factoryMethodPanCakeStore {
    AbstractPancakeFactory factory;

    public factoryMethodPanCakeStore(AbstractPancakeFactory factory){
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
    public static void main(String[] args) {
        // 需要天津煎饼馃子
        TianjinPancakeFactory tFactory = new TianjinPancakeFactory();
        factoryMethodPanCakeStore tjStore = new factoryMethodPanCakeStore(tFactory);
        tjStore.orderPancake("薄脆煎饼果子");

        // 需要北京煎饼馃子
        BeijingPancakeFactory bFactory = new BeijingPancakeFactory();
        factoryMethodPanCakeStore bjStore = new factoryMethodPanCakeStore(bFactory);
        bjStore.orderPancake("薄脆煎饼果子");
    }

}
