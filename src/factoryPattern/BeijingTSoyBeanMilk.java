package factoryPattern;

public class BeijingTSoyBeanMilk extends SoyBeanMilk{

    public BeijingTSoyBeanMilk() {
        this.name = "北京";
        this.type = "甜";
    }

    @Override
    public void show() {
        System.out.println(name + type + "豆浆"+ "制作完成");
    }
}
