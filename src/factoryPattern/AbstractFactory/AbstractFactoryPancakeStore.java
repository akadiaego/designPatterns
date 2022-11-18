package factoryPattern.AbstractFactory;

import factoryPattern.PanCake;
import factoryPattern.SoyBeanMilk;
import factoryPattern.factoryMethod.AbstractPancakeFactory;
import factoryPattern.factoryMethod.BeijingPancakeFactory;
import factoryPattern.factoryMethod.TianjinPancakeFactory;
import factoryPattern.factoryMethod.factoryMethodPanCakeStore;

public class AbstractFactoryPancakeStore {
    AbstractFactory factory;

    public AbstractFactoryPancakeStore(AbstractFactory factory){
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

    public SoyBeanMilk orderSoyBeanMilk(String name){
        SoyBeanMilk soyBeanMilk;
        soyBeanMilk = factory.createSoyBeanMilk(name);
        soyBeanMilk.show();
        return soyBeanMilk;
    }
    public static void main(String[] args) {
        // 需要天津煎饼馃子豆浆
        TianjinFactory tFactory = new TianjinFactory();
        AbstractFactoryPancakeStore tjStore = new AbstractFactoryPancakeStore(tFactory);
        tjStore.orderPancake("薄脆煎饼果子");
        tjStore.orderSoyBeanMilk("咸豆浆");

        // 需要北京煎饼馃子豆浆
        BeijingFactory bFactory = new BeijingFactory();
        AbstractFactoryPancakeStore bjStore = new AbstractFactoryPancakeStore(bFactory);
        bjStore.orderPancake("薄脆煎饼果子");
        tjStore.orderSoyBeanMilk("甜豆浆");

    }
}
