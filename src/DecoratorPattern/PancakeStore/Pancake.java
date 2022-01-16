package DecoratorPattern.PancakeStore;

//原始煎饼果子
public abstract class Pancake {
    public String description = "unknnown Pancake";

    public String getDescription(){
        return description;
    }

    public abstract double cost();



}
