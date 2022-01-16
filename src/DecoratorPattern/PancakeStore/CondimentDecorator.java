package DecoratorPattern.PancakeStore;

//调料
public abstract class CondimentDecorator extends Pancake {
    @Override
    //父类方法抽象化
    public abstract String getDescription();
}
