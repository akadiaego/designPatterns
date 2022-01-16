package DecoratorPattern.PancakeStore;

import DecoratorPattern.PancakeStore.impl.Compoent.CrispPancake;
import DecoratorPattern.PancakeStore.impl.Compoent.FiredBreadStickPancake;
import DecoratorPattern.PancakeStore.impl.Compoent.OriginPancake;
import DecoratorPattern.PancakeStore.impl.decorator.ChickenFillet;
import DecoratorPattern.PancakeStore.impl.decorator.Egg;
import DecoratorPattern.PancakeStore.impl.decorator.Sausage;

public class PancakeStore {
    public static void main(String[] args) {
        //装饰者模式测试
        System.out.println("煎饼果子铺开张");
        System.out.println("------------油条煎饼----------------");
        Pancake firedStickPancake = new FiredBreadStickPancake();
        System.out.println(firedStickPancake.getDescription() + " ￥"+firedStickPancake.cost());
        System.out.println("------------薄脆煎饼----------------");
        Pancake crispPancke = new CrispPancake();
        System.out.println(firedStickPancake.getDescription() + " ￥"+firedStickPancake.cost());
        System.out.println("------------油条煎饼加双蛋----------------");
        Pancake doubleEggPancke = new FiredBreadStickPancake();
        doubleEggPancke = new Egg(doubleEggPancke);
        doubleEggPancke = new Egg(doubleEggPancke);
        System.out.println(doubleEggPancke.getDescription() + " ￥"+doubleEggPancke.cost());
        System.out.println("------------薄脆煎饼加蛋加鸡柳-------------");
        Pancake eggSausagePancake = new CrispPancake();
        eggSausagePancake = new Egg(eggSausagePancake);
        eggSausagePancake = new ChickenFillet(eggSausagePancake);
        System.out.println(eggSausagePancake.getDescription() + " ￥"+eggSausagePancake.cost());
        System.out.println("------------油条煎饼加双蛋加鸡柳加烤肠-------------");
        Pancake eggChickenSausagePancake = new FiredBreadStickPancake();
        eggChickenSausagePancake = new Egg(eggChickenSausagePancake);
        eggChickenSausagePancake = new Egg(eggChickenSausagePancake);
        eggChickenSausagePancake = new ChickenFillet(eggChickenSausagePancake);
        eggChickenSausagePancake = new Sausage(eggChickenSausagePancake);
        System.out.println(eggChickenSausagePancake.getDescription() + " ￥"+eggChickenSausagePancake.cost());
    }
}
