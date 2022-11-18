package factoryPattern.AbstractFactory;

import factoryPattern.*;

public class TianjinFactory extends AbstractFactory {
    @Override
    PanCake createPancake(String name) {
        PanCake panCake = null;
        if (name.equals("油条煎饼果子")){
            panCake = new TianjinFiredStickPanCake();
        }else if (name.equals("薄脆煎饼果子")){
            panCake = new BeijingCrispPanCake();
        }
        return panCake;
    }

    @Override
    SoyBeanMilk createSoyBeanMilk(String name) {
        SoyBeanMilk soyBeanMilk = null;
        if (name.equals("甜豆浆")){
            soyBeanMilk = new TianjinTSoyBeanMilk();
        }else if (name.equals("咸豆浆")){
            soyBeanMilk = new TianjinXSoyMilk();
        }
        return soyBeanMilk;
    }
}
