package factoryPattern;

public class TianjinTSoyBeanMilk extends SoyBeanMilk{

    public TianjinTSoyBeanMilk() {
        this.name = "天津";
        this.type = "甜";
    }

    @Override
    public void show() {
        System.out.println(name + type + "豆浆" + "制作完成");
    }
}
