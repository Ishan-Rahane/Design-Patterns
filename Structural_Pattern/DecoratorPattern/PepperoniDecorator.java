package Structural_Pattern.DecoratorPattern;

public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description()+", pepperoni";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost()+8.0;
    }

}
