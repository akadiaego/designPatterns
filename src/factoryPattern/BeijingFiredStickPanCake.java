package factoryPattern;

public class BeijingFiredStickPanCake extends PanCake{
    public BeijingFiredStickPanCake() {
        this.name = "北京油条煎饼果子";
        this.fillings.add("油条");

    }

    @Override
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

    @Override
    public void bake() {
        System.out.println("烧开油摊面粉糊");
        System.out.print("加配菜：");
        for (String filling : fillings) {
            System.out.println(filling);
        }
        System.out.println("翻面烙煎饼");
    }

    @Override
    public void cut() {
        System.out.println("切成两块");
    }

    @Override
    public void box(){
        System.out.println("包装煎饼给顾客");
    }

    @Override
    public String getName() {
        return name;
    }
}
