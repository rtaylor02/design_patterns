package Behavioural.Observer.example1;

public class TestDrive {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        simpleSubject.setValue(3);

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(4);
        System.out.println("printing observers");
        simpleSubject.printObservers();

        SimpleObserver simpleObserver2 = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(55);
        System.out.println("printing observers");
        simpleSubject.printObservers();

        simpleObserver2.stopObserving();
        System.out.println("printing observers");
        simpleSubject.printObservers();
    }
}
