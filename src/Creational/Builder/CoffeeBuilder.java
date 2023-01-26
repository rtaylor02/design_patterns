package Creational.Builder;

public abstract class CoffeeBuilder {
    public abstract void addMilk();
    public abstract void addCream();
    public abstract void addSugar();
    public abstract void addCoffee();

    private CoffeeCup cup;

    public CoffeeBuilder() {
        cup = new CoffeeCup();
    }

    public CoffeeCup getCup() {
        return cup;
    }
}
