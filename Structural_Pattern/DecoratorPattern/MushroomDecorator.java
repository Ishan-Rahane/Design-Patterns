package Structural_Pattern.DecoratorPattern;

public class MushroomDecorator extends PizzaDecorator{

    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description()+", mushroom";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost()+4.0;
    }

}
