package Creational.Builder;

public class Director {
    public void prepareCoffee(CoffeeBuilder coffeeBuilder) {
        coffeeBuilder.addMilk();
        coffeeBuilder.addCream();
        coffeeBuilder.addSugar();
        coffeeBuilder.addCoffee();
    }
}
