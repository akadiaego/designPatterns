package factoryPattern.simpleFactory;

import factoryPattern.CrispPanCake;
import factoryPattern.FiredStickPanCake;
import factoryPattern.PanCake;

public class SimplePancakeFactory {
    public PanCake createPancake(String name){
        // 增加一个类就要在这里写，违背开闭原则
        // 全部创建逻辑集中到了一个工厂类
        // 当系统中的具体产品类不断增多时候，可能会出现要求工厂类根据不同条件创建不同实例的需求．
        // 这种对条件的判断和对具体产品类型的判断交错在一起，很难避免模块功能的蔓延，对系统的维护和扩展非常不利；
        PanCake panCake = null;
        if(name.equals("油条煎饼果子")){
            panCake = new FiredStickPanCake();
        }else if(name.equals("薄脆煎饼果子")) {
            panCake = new CrispPanCake();
        }
        return panCake;
    }
}
