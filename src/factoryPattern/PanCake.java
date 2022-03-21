package factoryPattern;

import java.util.ArrayList;

public abstract class PanCake {
    String name;

//    String dough;

    String type;

    ArrayList<String> fillings = new ArrayList<String>();

    public void prepare() {
        System.out.println("准备 " + name);
        System.out.println("加鸡蛋液...");
        System.out.println("加面粉糊...");
        System.out.println("打散");
//        System.out.println("准备配菜: ");
//        for (int i = 0; i < fillings.size(); i++) {
//            System.out.println("   " + fillings.get(i));
//        }
    }

    public void bake() {
        System.out.println("烧开油摊面粉糊");
        System.out.println("加配菜：");
        for (int i = 0; i < fillings.size(); i++) {
            System.out.println("   " + fillings.get(i));
        }
        System.out.println("翻面烙煎饼");
    }

    public void cut() {
        System.out.println("切成两块");
    }
    public void box(){
        System.out.println("包装煎饼给顾客");
    }
    public String getName() {
        return name;
    }



}