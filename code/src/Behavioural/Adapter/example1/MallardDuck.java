package Behavioural.Adapter.example1;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("MallardDuck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck flies...");
    }
}
