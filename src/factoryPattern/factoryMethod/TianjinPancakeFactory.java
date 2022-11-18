package factoryPattern.factoryMethod;

import factoryPattern.BeijingCrispPanCake;
import factoryPattern.PanCake;
import factoryPattern.TianjinFiredStickPanCake;

public class TianjinPancakeFactory extends AbstractPancakeFactory{
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
}
