package Structural_Pattern.DecoratorPattern;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description()+", cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost()+5.0;
    }
}
