package factoryPattern;

public class BeijingXSoyMilk extends SoyBeanMilk{
    public BeijingXSoyMilk() {
        this.name = "北京";
        this.type = "咸";
    }

    @Override
    public void show() {
        System.out.println(name + type + "豆浆"+ "制作完成");
    }
}
