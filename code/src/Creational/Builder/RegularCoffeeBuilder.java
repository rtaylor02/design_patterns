package Creational.Builder;

public class RegularCoffeeBuilder extends CoffeeBuilder {
    @Override
    public void addMilk() {
        getCup().getCoffeeOrder().add("Milk");
    }

    @Override
    public void addCream() {
        // No cream
    }

    @Override
    public void addSugar() {
        getCup().getCoffeeOrder().add("Sugar");
    }

    @Override
    public void addCoffee() {
        getCup().getCoffeeOrder().add("Medium roast coffee");
    }
}
