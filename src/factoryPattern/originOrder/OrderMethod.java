package factoryPattern.originOrder;

import factoryPattern.CrispPanCake;
import factoryPattern.FiredStickPanCake;
import factoryPattern.PanCake;

public class OrderMethod {
    public static PanCake orderPanCake(String name){
        PanCake pancake = null;
        if(name.equals("油条煎饼果子")){
            pancake = new FiredStickPanCake();
        }else if(name.equals("薄脆煎饼果子")){
            pancake=new CrispPanCake();
//        }else if(type.equals("pepperoni")){
//            pizza=new PepperoniPizza();
        }
        pancake.prepare();
        pancake.bake();
        pancake.cut();
        pancake.box();
        return pancake;

    }

    public static void main(String[] args) {
        PanCake panCake = OrderMethod.orderPanCake("油条煎饼果子");
        System.out.println("有人买了" + panCake.getName());
        System.out.println("-------------------------");
        PanCake panCake2 = OrderMethod.orderPanCake("薄脆煎饼果子");
        System.out.println("有人买了" + panCake2.getName());
    }
}
