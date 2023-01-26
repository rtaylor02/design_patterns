package Creational.Builder;

public class DoubleDoubleCoffeeBuilder extends CoffeeBuilder {
    @Override
    public void addMilk() {
        // No milk
    }

    @Override
    public void addCream() {
        getCup().getCoffeeOrder().add("Cream");
        getCup().getCoffeeOrder().add("Cream");
    }

    @Override
    public void addSugar() {
        getCup().getCoffeeOrder().add("Sugar");
        getCup().getCoffeeOrder().add("Sugar");
    }

    @Override
    public void addCoffee() {
        getCup().getCoffeeOrder().add("Dark roast coffee");
    }
}
