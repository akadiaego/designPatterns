package factoryPattern;

public class TianjinXSoyMilk extends SoyBeanMilk{
    public TianjinXSoyMilk() {
        this.name = "天津";
        this.type = "咸";
    }

    @Override
    public void show() {
        System.out.println(name + type + "豆浆" + "制作完成");
    }
}
