package Behavioural.Observer.example1;

public class TestDrive {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        simpleSubject.setValue(3);

        Observer simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(4);
    }
}
