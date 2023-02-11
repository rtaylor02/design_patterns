package Behavioural.Decorator.example1;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
