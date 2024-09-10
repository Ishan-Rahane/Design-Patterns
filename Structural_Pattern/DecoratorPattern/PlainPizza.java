package Structural_Pattern.DecoratorPattern;

public class PlainPizza implements Pizza{
    @Override
    public String description() {
        return "Plain Pizza";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
