package factoryPattern.simpleFactory;

import factoryPattern.CrispPanCake;
import factoryPattern.FiredStickPanCake;
import factoryPattern.PanCake;

public class SimplePancakeFactory {
    public PanCake createPancake(String name){
        PanCake panCake = null;
        if(name.equals("油条煎饼果子")){
            panCake = new FiredStickPanCake();
        }else if(name.equals("薄脆煎饼果子")) {
            panCake = new CrispPanCake();
        }
        return panCake;
    }
}
