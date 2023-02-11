package Behavioural.Decorator.example1;

public class Milk extends CondimentDecorator {
    Beverage beverage; // Composition

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
