package Structural_Pattern.DecoratorPattern;

public class PizzaDecorator implements Pizza{

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String description() {
        return decoratedPizza.description();
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();
    }
}
