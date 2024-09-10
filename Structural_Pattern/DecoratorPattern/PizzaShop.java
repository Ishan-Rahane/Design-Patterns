package Structural_Pattern.DecoratorPattern;

public class PizzaShop {
    public static void main(String[] args) {

        Pizza p = new PlainPizza();
        System.out.println(p.description()+" $"+p.cost());

        p = new CheeseDecorator(p);
        System.out.println(p.description()+" $"+p.cost());

        p = new MushroomDecorator(p);
        System.out.println(p.description()+" $"+p.cost());

        p = new PepperoniDecorator(p);
        System.out.println(p.description()+" $"+p.cost());

    }
}
