package Behavioural.Decorator.example1;

import Behavioural.Decorator.example1.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
