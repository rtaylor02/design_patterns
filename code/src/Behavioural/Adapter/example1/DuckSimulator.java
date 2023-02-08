package Behavioural.Adapter.example1;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        testDuck(mallarDuck);

        System.out.println("===================");

        // For testing a Turkey, we need to use the adapter for Turkey
        TurkeyAdapter adapter = new TurkeyAdapter(new WildTurkey());
        testDuck(adapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
