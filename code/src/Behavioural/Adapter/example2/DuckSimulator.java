package Behavioural.Adapter.example2;

import Behavioural.Adapter.example1.Duck;
import Behavioural.Adapter.example1.MallardDuck;
import Behavioural.Adapter.example1.TurkeyAdapter;
import Behavioural.Adapter.example1.WildTurkey;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        testDuck(mallarDuck);

        System.out.println("===================");

        // For testing a Drone, we need to use the adapter for Drone
        testDuck(new DroneAdapter(new SuperDrone()));
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
