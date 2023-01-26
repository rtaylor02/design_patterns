package Creational.Builder;

public class TestDrive {
    public static void main(String[] args) {
        // Make Double Double Coffee
        Director d = new Director();
        CoffeeBuilder coffeeBuilder = new DoubleDoubleCoffeeBuilder();
        d.prepareCoffee(coffeeBuilder);
        CoffeeCup cupOfCoffee = coffeeBuilder.getCup();
        System.out.println(cupOfCoffee.getCoffeeOrder());

        // Make Regular Coffee
        coffeeBuilder = new RegularCoffeeBuilder();
        d.prepareCoffee(coffeeBuilder);
        cupOfCoffee = coffeeBuilder.getCup();
        System.out.println(cupOfCoffee.getCoffeeOrder());

    }
}
